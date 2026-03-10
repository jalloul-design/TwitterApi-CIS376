package com.mira.twitterapi.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mira.twitterapi.Tweets;
import com.mira.twitterapi.TwitterUsersProfile;
import com.mira.twitterapi.service.TweetServices;

@RestController
public class TwitterController 
	{
	 private TweetServices tweetService; 
	
	public TwitterController(TweetServices tweetService) 
	{
	    this.tweetService = tweetService;
	}
	 
	// Loads the Json File
	@GetMapping("/load") 
	public String loadTweets() 
			throws IOException 
	{
		tweetService.loadTweets();
		return "Json File Has Loaded"; 
	}
	
	// Returns all the tweets 
	@GetMapping("/Tweets")
	public List<Tweets> getallTweets()
	{
		return tweetService.getallTweets();
	}
	
	// Returns all the links by tweet Id
	@GetMapping("/Tweets/Links")
	public Map<Long, List<String>> getLinks()
	{
		return tweetService.extractLinks();
	}
	
	//Returns the tweets by user Id
	@GetMapping("/Tweets/{id}")
	public Tweets getTweetId(@PathVariable Long id)
	{
		return tweetService.getTweetId(id);
	}
	
	//Returns a user by their screen name
	@GetMapping("/screen_name/{screen_name}")
	public TwitterUsersProfile getUser(@PathVariable String screen_name)
	{
		return tweetService.getUserScreenName(screen_name);
	}
	
	}

