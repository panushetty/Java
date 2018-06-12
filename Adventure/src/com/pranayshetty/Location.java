package com.pranayshetty;
import java.util.*;

public class Location {
	private final int locationId;
	private final String description;
	private final Map<String,Integer> exits;
	
	public Location(int locationId,String description,Map<String,Integer> exits) {
		this.locationId=locationId;
		this.description=description;
		this.exits=new HashMap<>(exits);
		this.exits.put("Q", 0);
	}
	
	

	public int getLocationId() {
		return locationId;
	}

	public String getDescription() {
		return description;
	}

	public Map<String, Integer> getExits() {
		return new HashMap<String,Integer>(exits);
	}
	

}
