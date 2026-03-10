package com.mira.twitterapi;

public class Tweets {
	private String text; 
	private String created_at; 
	private Long id;
	private TwitterUsersProfile user;
	
	 public Tweets() 
	 {
	 }
	
	 public String getCreated_at() 
	 {
		    return created_at;
	 }

	public void setCreated_at(String created_at) 
	{
		    this.created_at = created_at;
	}
	public Long getId() {
	    return id;
	}

	public void setId(Long id) 
	{
	    this.id = id;
	}

	
	public String getText() 
	{
	    return text;
	}

	public void setText(String text) 
	{
	    this.text = text;
	}
	// My get user by screen name wasn't working in my service class so springboot suggested to add it here in the Tweets class. 

	public TwitterUsersProfile getUser() 
	{
    return user;
	}

	public void setUser(TwitterUsersProfile user)
	{
    this.user = user;
	}

	public Tweets(String text,String created_at,Long id)
	{
		this.created_at = created_at;
		this.id = id;
		this.text = text;
	}


	
}
