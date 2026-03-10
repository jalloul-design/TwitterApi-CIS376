package com.mira.twitterapi;

public class TwitterUsersProfile
{
	private String location; 
	private String description;
	private String screen_name;
	private Long followers_count;
	private Long friends_count;
	
	
	  public TwitterUsersProfile() 
	  {
	  }
	public String getLocation()
	{
		return location;
	}
	
	public void setLocation(String location)
	{
		this.location = location;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public void setDescriptions(String description)
	{
		this.description = description;
	}
	
	public String getScreen_name()
	{
		return screen_name;
	}
	public void setScreen_name(String screen_name)
	{
		this.screen_name = screen_name;
	}
	
	public Long getFollowers_count()
	{
		return followers_count; 
	}
	
	public void setFollowers_count(Long followers_count)
	{
		this.followers_count = followers_count;
	}
	
	public Long getFriends_count()
	{
		return friends_count;
	}
	
	public void setFriends_count(Long friends_count)
	{
		this.friends_count = friends_count;
	}
	
	public TwitterUsersProfile(String location,String description,String screen_name,Long followers_count,Long friends_count)
	{
		this.location = location;
		this.description = description;
		this.screen_name = screen_name;
		this.followers_count = followers_count;
		this.friends_count = friends_count;
	}
	
}
