package com.api.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.service.StoryMatesService;
import com.mongodb.DBObject;

@RestController
public class StoryMatesController {
	Logger LOGGER = LoggerFactory.getLogger(StoryMatesController.class);

	@GetMapping("/Main/{collectionName}")
	public String mainCollection(@RequestHeader Map<String, String> headerMap, @RequestParam Map<String, String> paramMap,
			@PathVariable Map<String, String> pathVariableMap) throws Exception {
		String collectionName;
		DBObject collection = null;
		try {
			collectionName = (String) pathVariableMap.get("collectionName");
			if (collectionName.trim() == "" || collectionName.isEmpty() || collectionName.equalsIgnoreCase("null")) {
				LOGGER.error("Name of collection to be retrieved is null or empty ", collection);
				throw new Exception("Name of collection to be retrieved is null");
			}
			LOGGER.debug("Collection to retieve:: {}", collectionName);
			StoryMatesService storyMatesService = new StoryMatesService();
			collection = storyMatesService.getDocuments(collectionName);
		} catch (Exception e) {
			LOGGER.error("exception while retirieving collection",e);
			return "error response from API";
		}
		return collection.toString();
	}
	
	@GetMapping("/Sports/{collectionName}")
	public String sportsMain(@RequestHeader Map<String, String> headerMap, @RequestParam Map<String, String> paramMap,
			@PathVariable Map<String, String> pathVariableMap) throws Exception {
		String collectionName;
		DBObject collection = null;
		try {
			collectionName = (String) pathVariableMap.get("collectionName");
			if (collectionName.trim() == "" || collectionName.isEmpty() || collectionName.equalsIgnoreCase("null")) {
				LOGGER.error("Name of collection to be retrieved is null or empty ", collection);
				throw new Exception("Name of collection to be retrieved is null");
			}
			LOGGER.debug("Collection to retieve:: {}", collectionName);
			StoryMatesService storyMatesService = new StoryMatesService();
			collection = storyMatesService.getDocuments(collectionName);
		} catch (Exception e) {
			LOGGER.error("exception while retirieving collection",e);
			return "error response from API";
		}
		return collection.toString();
	}
	
	@GetMapping("/Twitts/{collectionName}")
	public String twitsMain(@RequestHeader Map<String, String> headerMap, @RequestParam Map<String, String> paramMap,
			@PathVariable Map<String, String> pathVariableMap) throws Exception {
		String collectionName;
		DBObject collection = null;
		try {
			collectionName = (String) pathVariableMap.get("collectionName");
			if (collectionName.trim() == "" || collectionName.isEmpty() || collectionName.equalsIgnoreCase("null")) {
				LOGGER.error("Name of collection to be retrieved is null or empty ", collection);
				throw new Exception("Name of collection to be retrieved is null");
			}
			LOGGER.debug("Collection to retieve:: {}", collectionName);
			StoryMatesService storyMatesService = new StoryMatesService();
			collection = storyMatesService.getDocuments(collectionName);
		} catch (Exception e) {
			LOGGER.error("exception while retirieving collection",e);
			return "error response from API";
		}
		return collection.toString();
	}
	
	@GetMapping("/Politics/{collectionName}")
	public String politicsMain(@RequestHeader Map<String, String> headerMap, @RequestParam Map<String, String> paramMap,
			@PathVariable Map<String, String> pathVariableMap) throws Exception {
		String collectionName;
		DBObject collection = null;
		try {
			collectionName = (String) pathVariableMap.get("collectionName");
			if (collectionName.trim() == "" || collectionName.isEmpty() || collectionName.equalsIgnoreCase("null")) {
				LOGGER.error("Name of collection to be retrieved is null or empty ", collection);
				throw new Exception("Name of collection to be retrieved is null");
			}
			LOGGER.debug("Collection to retieve:: {}", collectionName);
			StoryMatesService storyMatesService = new StoryMatesService();
			collection = storyMatesService.getDocuments(collectionName);
		} catch (Exception e) {
			LOGGER.error("exception while retirieving collection",e);
			return "error response from API";
		}
		return collection.toString();
	}
}
