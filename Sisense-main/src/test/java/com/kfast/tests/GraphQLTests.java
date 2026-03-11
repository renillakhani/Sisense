package com.kfast.tests;

import java.io.IOException;
import java.util.Map;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.kfast.api.BaseAPI;
import com.kfast.payload.GraphQLPayload;
import com.kfast.payload.Variables;

import static com.kfast.api.GraphQLAPIs.getUser;
import io.restassured.response.Response;

public class GraphQLTests extends BaseAPI {
	GraphQLPayload query;
	Variables variable;
	
	
	
	@Test
	public void getUsers_withPOJOTest(Map<String, String> testData) throws IOException {
		query=new GraphQLPayload();
		query.setQuery(testData.get("query"));
		
		Variables variables = new Variables();
		// Set the values for the query variable
		variables.setLimit(Integer.parseInt(testData.get("limit"))); 
		query.setVariables(variables);
		
		Response response = getUser(query);
		response.then().log().all();
		//validating response body
		Assert.assertEquals(response.getStatusCode(), 200);
		JSONObject  jo=new JSONObject(response.asString());
		int length = jo.getJSONObject("data").getJSONArray("users").length();
		Assert.assertEquals(length, Integer.parseInt(testData.get("limit")));
		
	}
	@Test
	public void getUsers_withQueryVariables(Map<String, String> testData) throws IOException {
		query=new GraphQLPayload();
		query.setQuery(testData.get("query"));
		
		Variables variables = new Variables();
		// Set the values for the query variables
		variables.setLimit(Integer.parseInt(testData.get("limit"))); 
		variables.setName(testData.get("name"));
		query.setVariables(variables);
		
		Response response = getUser(query);
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);
		//validating response body
		Assert.assertEquals(response.jsonPath().get("data.users[0].name").toString(), testData.get("name"));

		
	}
	
	@Test
	public void getTodoswithLimitTest(Map<String, String> testData) throws IOException {
		query=new GraphQLPayload();
		query.setQuery(testData.get("query"));
		
		Variables variables = new Variables();
		// Set the values for the query variable
		variables.setLimit(Integer.parseInt(testData.get("limit"))); 
		query.setVariables(variables);
		
		Response response = getUser(query);
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);
		Assert.assertTrue(response.getBody().asString().contains("title"));
		Assert.assertEquals(response.jsonPath().get("data.todos[3].user.name").toString(),"marion.schleifer");
		
		//validate the response
		JSONObject  jo=new JSONObject(response.asString());
		int length = jo.getJSONObject("data").getJSONArray("todos").length();
		Assert.assertEquals(length, Integer.parseInt(testData.get("limit")));
}
}
