package com.api.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.api.dao.StoryMatesDao;
import com.mongodb.DBObject;

public class StoryMatesService {
public DBObject getDocuments(String collectionName) throws Exception{
	Logger LOGGER=LoggerFactory.getLogger(StoryMatesService.class);
	StoryMatesDao dao=new StoryMatesDao();
	LOGGER.debug("collectionName  {}", collectionName);
	DBObject collection=dao.getDocument(collectionName);
	
	return collection;
}
}
