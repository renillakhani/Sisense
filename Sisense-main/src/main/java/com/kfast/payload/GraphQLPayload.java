package com.kfast.payload;

/**
 * This POJO class is used to create complete query and the JSON variable.
 * 
 * @author Badal Shah
 */
public class GraphQLPayload {
    private String query;
    public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	public Variables getVariables() {
		return variables;
	}
	public void setVariables(Variables variables) {
		this.variables = variables;
	}
	private Variables variables;

    // getters and setters
}


