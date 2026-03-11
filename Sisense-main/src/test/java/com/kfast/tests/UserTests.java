package com.kfast.tests;

import static com.kfast.api.UserAPIs.createUser;
import static com.kfast.api.UserAPIs.deleteUser;
import static com.kfast.api.UserAPIs.readUser;
import static com.kfast.api.UserAPIs.updateUser;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import com.kfast.payload.UserPayload;

import io.restassured.response.Response;

public class UserTests {

	Faker faker;
	UserPayload userPayload;

	@BeforeClass
	public void setupData() {
		faker = new Faker();
		userPayload = new UserPayload();

		userPayload.setId(faker.idNumber().hashCode());
		userPayload.setUsername(faker.name().username());
		userPayload.setFirstname(faker.name().firstName());
		userPayload.setLastname(faker.name().lastName());
		userPayload.setEmail(faker.internet().safeEmailAddress());
		userPayload.setPassword(faker.internet().password(5, 10));
		userPayload.setPhone(faker.phoneNumber().cellPhone());
	}

	@Test(priority = 1)
	public void testPostUser() {
		Response response = createUser(userPayload);
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);
	}

	@Test(priority = 2)
	public void testGetUserByName() {
		Response response = readUser(this.userPayload.getUsername());
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);
	}

	@Test(priority = 3)
	public void testUpdateUserByName() {
		userPayload.setFirstname(faker.name().firstName());
		userPayload.setLastname(faker.name().lastName());
		userPayload.setEmail(faker.internet().safeEmailAddress());

		Response response = updateUser(this.userPayload.getUsername(), userPayload);
		response.then().log().body();

		Assert.assertEquals(response.getStatusCode(), 200);
		// checking data after update

		testGetUserByName();
	}

	@Test(priority = 4)
	public void testDeleteUserByName() {
		Response response = deleteUser(this.userPayload.getUsername());
		Assert.assertEquals(response.getStatusCode(), 200);
	}
}
