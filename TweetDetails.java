package com.mira.twitterapi;

public class TweetDetails {
	
	private String text; 
	private String created_at; 
	private String screen_name;
	private Long id;
	
	public Long getId()
	{
		return id;
	}
	
	public void setId(Long id)
	{
		this.id = id;
	}
	public String getScreen_name()
	{
	    return screen_name; 
	}
	
	public void setScreen_name(String screen_name)
	{
		this.screen_name = screen_name;
	}
	
	public String getCreated_at()
	{
		return created_at;
	}
	
	public void setCreated_at(String created_at)
	{
		this.created_at = created_at;
	}
	
	public String getText()
	{
		return text;
	}
	
	public void setText(String text)
	{
		this.text = text;
	}
	
	
	public TweetDetails(Long id,String screen_name,String created_at,String text )
	{
	this.id= id;
	this.screen_name = screen_name;
	this.created_at = created_at;
	this.text = text;	
	}
}

