package com.mira.twitterapi;

import java.util.List;


public class TwitterLinks {
	private Long id;
	private List<String> links;
	
	public Long getId()
	{
		return id;
	}
	
	public void setId(Long id)
	{
		this.id = id;
	}
	
	public List<String> getLinks()
	{
		return links;
	}
	
	public void setLinks(List<String> links)
	{
		this.links =links;
	}
	
	public TwitterLinks (Long id,List<String> links)
	{
		this.id = id;
		this.links =links;
	}
	

}
