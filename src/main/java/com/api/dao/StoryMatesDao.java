package com.api.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient; 

public class StoryMatesDao {
	@Value("${databaseName}")
	private String database;
	
	@Value("${databasePort}")
	private int port;
	
	Logger LOGGER=LoggerFactory.getLogger(StoryMatesDao.class);
	public DBObject getDocument(String collectionName) throws Exception{
		LOGGER.debug("collectionName {}", collectionName);
		DB dbConnection=createConnection();
		DBCollection collection;
		if(dbConnection.collectionExists(collectionName)){
		collection = dbConnection.getCollection(collectionName);
		}else{
			LOGGER.error("collection {} doesn't exists in DB ",collectionName);
			throw new Exception("collection doesn't exists in DB");
		}
		DBObject dbo = collection.findOne();
		LOGGER.debug(dbo+" Collection retrieved from db is ::: "+dbo.toString());
		return dbo;
	}
	
	public void inserDocument(){
		
	}
  
	@SuppressWarnings({ "deprecation", "resource" })
	private DB createConnection(){
		LOGGER.debug("Creating DB connection");
		MongoClient client = new MongoClient("localhost",27017);
		DB dbConnection = client.getDB("testDB");
		LOGGER.debug("Connection ::{}",dbConnection);
		return dbConnection;
	}
}
