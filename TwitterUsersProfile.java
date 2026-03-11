package com.mira.twitterapi;

// Creating a class that will represents the User profile information of a Twitter account 
public class TwitterUsersProfile
{
	private String location;  // User Location 
	private String description; // User Descrption or Bio
	private String screen_name; // Twitter user account handler
	private Long followers_count; // Number of followers a user has
	private Long friends_count; // Number of account a certrain user follows 
	
	// Default Constructor for the class
	  public TwitterUsersProfile() 
	  {
	  }
	  
	//Getter and setter function for location
	public String getLocation()
	{
		return location;
	}
	
	public void setLocation(String location)
	{
		this.location = location;
	}
	
	//Getter and setter function for Description 
	public String getDescription()
	{
		return description;
	}
	
	public void setDescriptions(String description)
	{
		this.description = description;
	}
	
	//Getter and setter function for User Screen Name
	public String getScreen_name()
	{
		return screen_name;
	}
	public void setScreen_name(String screen_name)
	{
		this.screen_name = screen_name;
	}
	
	//Getter and setter function for followers count
	public Long getFollowers_count()
	{
		return followers_count; 
	}
	
	public void setFollowers_count(Long followers_count)
	{
		this.followers_count = followers_count;
	}
	
	
	//Getter and setter function for friends count
	public Long getFriends_count()
	{
		return friends_count;
	}
	
	public void setFriends_count(Long friends_count)
	{
		this.friends_count = friends_count;
	}
	
	// Constructor used when createing the Twitter User Profile, Make sure all the followinf profile fields are diaplayed. 
	public TwitterUsersProfile(String location,String description,String screen_name,Long followers_count,Long friends_count)
	{
		this.location = location;
		this.description = description;
		this.screen_name = screen_name;
		this.followers_count = followers_count;
		this.friends_count = friends_count;
	}
	
}
