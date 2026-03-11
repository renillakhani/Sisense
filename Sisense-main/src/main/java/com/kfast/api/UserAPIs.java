package com.kfast.api;

import static io.restassured.RestAssured.given;

import java.io.File;

import com.google.gson.Gson;
import com.kfast.payload.UserPayload;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

/**
 * This class contains APIs for User module
 * 
 * @author KiwiQA
 */
public class UserAPIs extends URLGenerator {

	/**
	 * Creates the user.
	 *
	 * @param payload the payload
	 * @return the response
	 */
	public static Response createUser(UserPayload payload) {
		String requestBody = new Gson().toJson(payload);

        // Log or print the request body for debugging
        System.out.println("Request Body: " + requestBody);
        
		return given().contentType(ContentType.JSON).accept(ContentType.JSON).body(payload).when().post(POST_URL);
	}

	/**
	 * Read user.
	 *
	 * @param username the username
	 * @return the response
	 */
	public static Response readUser(String username) {
		return given().pathParam("username", username).when().get(GET_URL);
	}

	/**
	 * Update user.
	 *
	 * @param username the username
	 * @param payload  the payload
	 * @return the response
	 */
	public static Response updateUser(String username, UserPayload payload) {
		return given().contentType(ContentType.JSON).accept(ContentType.JSON).pathParam("username", username)
				.body(payload).when().put(UPDATE_URL);
	}

	/**
	 * Update user.
	 *
	 * @param username the username
	 * @param file     the file
	 * @return the response
	 */
	public static Response updateUser(String username, File file) {
		return given().contentType(ContentType.JSON).accept(ContentType.JSON).pathParam("username", username).body(file)
				.when().put(UPDATE_URL);
	}

	/**
	 * Delete user.
	 *
	 * @param username the username
	 * @return the response
	 */
	public static Response deleteUser(String username) {
		return given().pathParam("username", username).when().get(DELETE_URL);
	}

	/**
	 * Gets the users list.
	 *
	 * @return the users list
	 */
	public static Response getUsersList() {
		return given().get(LIST_USER_URL);
	}
}
