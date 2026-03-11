package com.mira.twitterapi;

import java.util.List;

// Class that represents the external links from a tweet
public class TwitterLinks {
	private Long id; // ID number that is linked to the tweet
	private List<String> links; // Creating a list of all external links that been extracted from the tweet text
	
	// Getter and Setter for Tweet ID
	public Long getId()
	{
		return id;
	}
	
	public void setId(Long id)
	{
		this.id = id;
	}
	// Getter and Setter for list of extracted links
	public List<String> getLinks()
	{
		return links;
	}
	
	public void setLinks(List<String> links)
	{
		this.links =links;
	}
	// Constructor used when creating a Twitter Link Object
	public TwitterLinks (Long id,List<String> links)
	{
		this.id = id;
		this.links =links;
	}
	

}
