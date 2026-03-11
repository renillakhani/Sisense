package com.kfast.api;

import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;

public class BaseAPI {
	public static String env;

	@BeforeTest
	public void initAPI(ITestContext context) {
		env = context.getSuite().getParameter("env");
	}
}
