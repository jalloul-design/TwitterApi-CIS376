package com.mira.twitterapi;

// This class represents the Tweet Details of a tweet made by a user
public class TweetDetails {
	
	private String text; // Text of the tweet
	private String created_at; // Time of when the tweet was created
	private String screen_name; // Username of the person who posted the tweet
	private Long id; // Id number of the tweet
	
	//Getter and Setter Function For ID
	public Long getId()
	{
		return id;
	}
	
	public void setId(Long id)
	{
		this.id = id;
	}
	//Getter and Setter Function For User Screen Name
	public String getScreen_name()
	{
	    return screen_name; 
	}
	
	public void setScreen_name(String screen_name)
	{
		this.screen_name = screen_name;
	}
	//Getter and Setter Function For Created at
	public String getCreated_at()
	{
		return created_at;
	}
	
	public void setCreated_at(String created_at)
	{
		this.created_at = created_at;
	}
	
	//Getter and Setter Function For Tweet Text
	public String getText()
	{
		return text;
	}
	
	public void setText(String text)
	{
		this.text = text;
	}
	
	//Creating a constructor for Tweetdetails
	public TweetDetails(Long id,String screen_name,String created_at,String text )
	{
	this.id= id;
	this.screen_name = screen_name;
	this.created_at = created_at;
	this.text = text;	
	}
}
