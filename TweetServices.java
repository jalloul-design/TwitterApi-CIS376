package com.mira.twitterapi.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import com.mira.twitterapi.Tweets;
import com.mira.twitterapi.TwitterUsersProfile;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

@Service 
public class TweetServices 
{
	// Creating a list that is capable of storing al the tweets that have been found from the json file
	private List<Tweets> tweets; 
	
	// Will load the json file once we start the service
	public void loadTweets()
	throws IOException
	{
		
		ObjectMapper mapper = new ObjectMapper();
		// Loading json file 
		tweets = mapper.readValue(new ClassPathResource("Tweets.json").getFile(),
                new TypeReference<List<Tweets>>(){});
		
	}
	// Returning all tweets in the list to the controller 
	public List<Tweets> getallTweets()
	{
		return tweets;
	}
	
	// extracting all the links from the tweets made by user(Source used: Bing- prompt: "How can i extract links using list in java springboot")
	public Map<Long, List<String>> extractLinks()
	{
		// Storing the tweet id to the list of links that are found within the tweet
		Map<Long, List<String>> linkid = new HashMap<>();
		
	// String pattern I got it from Professor videos about rest Api's
		String pattern = "https?://\\S+";
		Pattern p = Pattern.compile(pattern);
		
		// Created a for loop so that it loops each tweet that is in the link 
		for (Tweets tw : tweets)
		{
			// I did get Matcher from my bing search about regex in java
			Matcher m = p.matcher(tw.getText());
			List<String> links = new ArrayList<>(); 
			
			// Adding each link found to a list 
			while (m.find())
			{
				links.add(m.group());
			}
			// Making sure the tweets that actually contain a link is stored and they aren't empty
			if (!links.isEmpty())
			{
				linkid.put(tw.getId(), links);
			}
			
		}
		return linkid;
	}
	
	// Finding A User By Their ID
	public Tweets getTweetId(Long id)
	{
		for (Tweets tw: tweets)
		{
			if (tw.getId().equals(id))
			{
				return tw;
			}
		}
		
		return null; // system will return null if a user id is not found in the Tweets ID 
	}
	// Finding A User By Their User Screen Name
	public TwitterUsersProfile getUserScreenName(String screen_name)
	{
	    for (Tweets tw : tweets)
	    {
	    	// getting the user object from a tweet
	        TwitterUsersProfile userName = tw.getUser();

	        if (userName.getScreen_name().equalsIgnoreCase(screen_name))
	        {
	            return userName; // will return the user on twitter user name once it is found
	        }
	    }

	    return null; // system will return null if a user name DOES NOT match a user on Twitter
	}
	
}
