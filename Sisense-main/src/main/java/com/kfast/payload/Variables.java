package com.kfast.payload;

/**
 * This POJO class is used to create complete query and the JSON variable.
 * 
 * @author Badal Shah
 */


public class Variables {
	
	private int limit;
	private String name;
	 public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// getters and setters
    public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	

   
}
