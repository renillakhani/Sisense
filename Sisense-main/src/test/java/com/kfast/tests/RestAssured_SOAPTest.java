package com.kfast.tests;

import static com.kfast.api.SOAPAPIs.divideOperation;
import static com.kfast.api.SOAPAPIs.multiplyOperation;
import static com.kfast.api.SOAPAPIs.subtractOperation;
import java.io.IOException;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.kfast.api.APILogger;
import com.kfast.api.BaseAPI;

import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class RestAssured_SOAPTest extends BaseAPI{
	@Test
	public void divTest(Map<String, String> testData) throws IOException {
		System.out.println("Division Method");
		Response response = divideOperation();
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);
		
		XmlPath xmlpath=new XmlPath(response.asString());
		 String result=xmlpath.getString("DivideResult");
		 System.out.println("Division result is :"+result);
		
	}
	@Test
	public void mulTest(Map<String, String> testData) throws IOException {
		System.out.println("Multiplication Method");
		Response response = multiplyOperation();
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);
		
		XmlPath xmlpath=new XmlPath(response.asString());
		 String result=xmlpath.getString("MultiplyResult");
		 System.out.println("Multiply Result is :"+result);
		
	}
	@Test
	public void subTest(Map<String, String> testData) throws IOException {
		System.out.println("Subtraction Method");
		Response response = subtractOperation();
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);
		
		XmlPath xmlpath=new XmlPath(response.asString());
		 String result=xmlpath.getString("SubtractResult");
		 System.out.println("Subtraction Result is :"+result);
		
	}

}
