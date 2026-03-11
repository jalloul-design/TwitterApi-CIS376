package com.mira.twitterapi;

public class Tweets {
	private String text; // Text of the tweet
	private String created_at; // Time of when the tweet was created
	private Long id; // Id number of the tweet
	private TwitterUsersProfile user; // User name that is linked to the twitter account 
	
	// Default Constructor 
	 public Tweets() 
	 {
	 }
	// Getter and setter for Created at
	 public String getCreated_at() 
	 {
		    return created_at;
	 }

	public void setCreated_at(String created_at) 
	{
		    this.created_at = created_at;
	}
	
	// Getter and setter for Tweet ID
	public Long getId() {
	    return id;
	}

	public void setId(Long id) 
	{
	    this.id = id;
	}

	// Getter and Setter for text of a tweet
	public String getText() 
	{
	    return text;
	}

	public void setText(String text) 
	{
	    this.text = text;
	}
	
	
	
   // Getter function that will allow us to have access to the user information 
	public TwitterUsersProfile getUser() 
	{
    return user;
	}
	// My get user by screen name wasn't working in my service class so springboot suggested to add it here in the Tweets class.
	public void setUser(TwitterUsersProfile user)
	{
    this.user = user;
	}
    // Constructor used for creating tweet objects
	public Tweets(String text,String created_at,Long id)
	{
		this.created_at = created_at;
		this.id = id;
		this.text = text;
	}


	
}
