package com.kfast.tests;

import static com.kfast.api.APILogger.log;
import static com.kfast.api.APILogger.logStatus;
import static com.kfast.api.URLGenerator.UPDATE_URL;
import static com.kfast.api.UserAPIs.createUser;
import static com.kfast.api.UserAPIs.deleteUser;
import static com.kfast.api.UserAPIs.getUsersList;
import static com.kfast.api.UserAPIs.readUser;
import static com.kfast.constants.FrameworkConstants.TEST_DATA_PATH;
import static com.kfast.init.ITestStatus.FAILED;
import static com.kfast.init.ITestStatus.PASSED;
import static com.kfast.reports.ExtentReport.prettyResponse;
import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import com.kfast.api.BaseAPI;
import com.kfast.payload.UserPayload;
import com.kfast.utils.DataUtils;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class NewUserTests extends BaseAPI {

	Faker faker;
	UserPayload userPayload;
	String username;

	@BeforeClass
	public void setupData() throws IOException {
		faker = new Faker();
		userPayload = new UserPayload();

		List<Map<String, String>> testData = DataUtils.readSheetData("NewUserTests.xlsx", "Sheet1");
		//row header and column header means from excel sheet will fetch TestUser from column
		username = DataUtils.getValueOf(testData, "testPostUser", "username");
		userPayload.setId(faker.idNumber().hashCode());
		userPayload.setUsername(username);
		userPayload.setFirstname(faker.name().firstName());
		userPayload.setLastname(faker.name().lastName());
		userPayload.setEmail(faker.internet().safeEmailAddress());
		userPayload.setPassword(faker.internet().password(5, 10));
		userPayload.setPhone(faker.phoneNumber().cellPhone());
	}

	@Test(priority = 1)
	public void testPostUser(Map<String, String> testData) {
		int numOfFailure = 0;
		// Approach 1: Create a payload using a POJO class
		Response response = createUser(userPayload);
		prettyResponse("Post User API", response);

		if (response.getStatusCode() == HttpURLConnection.HTTP_OK) {
			logStatus(PASSED, "User created successfully");
		} else {
			logStatus(FAILED, "Failed to create user");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 2)
	public void testGetUserByName(Map<String, String> testData) {
		int numOfFailure = 0;
		Response response = readUser(username);
		prettyResponse("Get User API", response);

		if (response.getStatusCode() == HttpURLConnection.HTTP_OK) {
			logStatus(PASSED, "User details read successfully");
		} else {
			logStatus(FAILED, "Failed to read user details");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 3)
	public void testUpdateUserByName(Map<String, String> testData) {
		int numOfFailure = 0;
		// Approach 2: We can directly pass JSON file as a payload
		File updateJson = new File(TEST_DATA_PATH + File.separator + "update.json");

		Response response = given().contentType(ContentType.JSON).accept(ContentType.JSON)
				.pathParam("username", this.userPayload.getUsername()).body(updateJson).when().put(UPDATE_URL);
		prettyResponse("Update User API", response);

		if (response.getStatusCode() == HttpURLConnection.HTTP_OK) {
			logStatus(PASSED, "User Updated successfully");
		} else {
			logStatus(FAILED, "Failed to update user");
			numOfFailure++;
		}

		testGetUserByName(testData);

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 4)
	public void testDeleteUserByName(Map<String, String> testData) {
		int numOfFailure = 0;
		Response response = deleteUser(this.userPayload.getUsername());
		prettyResponse("Delete User API", response);

		if (response.getStatusCode() == HttpURLConnection.HTTP_OK) {
			logStatus(PASSED, "User deleted successfully");
		} else {
			logStatus(FAILED, "Failed to delete user");
			logStatus(FAILED, "Expected Status Code: " + HttpURLConnection.HTTP_NOT_FOUND + " Actual Status Code: "
					+ response.getStatusCode());
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 5)
	public void testPostUserUsingExcel(Map<String, String> testData) throws IOException {
		int numOfFailure = 0;
		// Approach 1: Retrieve a payload from excel

		List<Map<String, String>> testDataFromExcel = DataUtils.readSheetData("NewUserTests.xlsx", "Sheet1");
		username = DataUtils.getValueOf(testDataFromExcel, "testCase02", "payload");
		userPayload.setUsername(username);

		Response response = createUser(userPayload);
		prettyResponse("Post User API", response);

		if (response.getStatusCode() == HttpURLConnection.HTTP_OK) {
			logStatus(PASSED, "User created successfully");
		} else {
			logStatus(FAILED, "Failed to create user");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 2)
	public void testGetListUsers(Map<String, String> testData) {
		int numOfFailure = 0;
		Response response = getUsersList();
		prettyResponse("Get List User API", response);

		if (response.getStatusCode() == HttpURLConnection.HTTP_OK) {
			logStatus(PASSED, "User details read successfully");
		} else {
			logStatus(FAILED, "Failed to read user details");
			numOfFailure++;
		}

		String expectedEmail = testData.get("expectedEmail");
		List<String> dataList = response.path("data");
		for (int i = 0; i < dataList.size(); i++) {
			if (response.path("data[" + i + "].email").toString().equals(expectedEmail)) {
				log("First Name for user with email " + expectedEmail + " is "
						+ response.path("data[" + i + "].first_name"));
				log("Last Name for user with email " + expectedEmail + " is "
						+ response.path("data[" + i + "].last_name"));

				if (response.path("data[" + i + "].first_name").equals(testData.get("expectedFirstName"))) {
					logStatus(PASSED, "First Name is as expected");
				} else {
					logStatus(FAILED, "First Name mismatch");
					numOfFailure++;
				}

				if (response.path("data[" + i + "].last_name").equals(testData.get("expectedLastName"))) {
					logStatus(PASSED, "Last Name is as expected");
				} else {
					logStatus(FAILED, "Last Name mismatch");
					numOfFailure++;
				}
			}
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}
	}

}
