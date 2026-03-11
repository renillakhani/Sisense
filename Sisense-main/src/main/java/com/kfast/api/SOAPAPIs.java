 package com.kfast.api;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.IOUtils;

import com.kfast.payload.UserPayload;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

/**
 * This class contains APIs for User module
 * 
 * @author Badal Shah
 */
public class SOAPAPIs extends SOAPURLGenerator  {

	/**
	 * Creates the user.
	 *
	 * @param payload the payload
	 * @return the response
	 * @throws IOException 
	 */

	public static Response divideOperation() throws IOException {
		FileInputStream fis= new FileInputStream(".\\SOAP request\\Divide.xml");

		return given().log().all()
				.header("Content-Type","text/xml")
				.body(IOUtils.toString(fis,"UTF-8"))
			 .when()
				.post(POST_URL);
	}

	public static Response multiplyOperation() throws IOException {
		FileInputStream fis= new FileInputStream(".\\SOAP request\\multiply.xml");

		return given()
				.header("Content-Type","text/xml")
				.body(IOUtils.toString(fis,"UTF-8"))
			 .when()
				.post(POST_URL);
	}
	
	public static Response subtractOperation() throws IOException {
		FileInputStream fis= new FileInputStream(".\\SOAP request\\subtract.xml");

		return given()
				.header("Content-Type","text/xml")
				.body(IOUtils.toString(fis,"UTF-8"))
			 .when()
				.post(POST_URL);
	}
}
