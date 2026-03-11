 package com.kfast.api;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import com.google.gson.Gson;
import com.kfast.payload.GraphQLPayload;
import com.kfast.payload.Variables;
import com.kfast.payload.UserPayload;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

/**
 * This class contains APIs for GraphQL
 * 
 */
public class GraphQLAPIs extends GraphQLURLGenerator  {
	

	/**
	 * gets the user.
	 *
	 * @param query the query payload
	 * @return the response
	 * @throws IOException 
	 */

	
	
	public static Response getUser(GraphQLPayload query) throws IOException {
		
		return given().log().all()
				.contentType("application/json")
				.header("Authorization",BEARERTOKEN)
				.body(query)
				.when()
				.post(POST_URL);
	}


}
