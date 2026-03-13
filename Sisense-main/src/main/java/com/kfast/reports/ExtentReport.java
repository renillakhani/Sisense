package com.kfast.reports;

import java.util.Objects;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.kfast.init.Common;

import io.restassured.response.Response;

/**
 * The Class ExtentReport.
 */
public class ExtentReport {

	/**
	 * Instantiates a new extent report.
	 */
	private ExtentReport() {
	}

	/** The ext test. */
	private static ThreadLocal<ExtentTest> extTest = new ThreadLocal<>();

	/** The extent. */
	private static ExtentReports extent;

	/**
	 * Inits the report.
	 */
	static void initReport() {
		if (Objects.isNull(extent)) {
			extent = new ExtentReports();
			ExtentSparkReporter spark = new ExtentSparkReporter("Sisense Automation Report.html");
			extent.attachReporter(spark);
			spark.config().setTheme(Theme.STANDARD);
			spark.config().setDocumentTitle("Sisense Report ");
			spark.config().setReportName("Functional");
			spark.config().thumbnailForBase64(true);
			spark.config().setTimelineEnabled(true);
		}
	}

	/**
	 * Flush reports.
	 */
	static void flushReports() {
		if (Objects.nonNull(extent)) {
			extent.flush();
			unload();
			Common.injectDashboardAutoOpenScript("Sisense Automation Report.html");
		}
	}

	/**
	 * Creates the test.
	 *
	 * @param testcaseName the testcase name
	 */
	static void createTest(String testcaseName) {
		setExtentTest(extent.createTest(testcaseName));
	}

	/**
	 * Sets the extent test.
	 *
	 * @param test the new extent test
	 */
	private static void setExtentTest(ExtentTest test) {
		extTest.set(test);
	}

	/**
	 * Gets the extent test.
	 *
	 * @return the extent test
	 */
	public static ExtentTest getExtentTest() {
		return extTest.get();
	}

	/**
	 * Unload.
	 */
	private static void unload() {
		extTest.remove();
	}

	/**
	 * Log.
	 *
	 * @param message the message
	 */
	public static void info(String message) {
		getExtentTest().info(message);
	}

	/**
	 * Pass.
	 *
	 * @param message the message
	 */
	public static void pass(String message) {
		getExtentTest().pass(message);
	}

	/**
	 * Fail.
	 *
	 * @param message the message
	 */
	public static void fail(String message) {
		getExtentTest().fail(message);
	}

	/**
	 * Skip.
	 *
	 * @param message the message
	 */
	public static void skip(String message) {
		getExtentTest().skip(message);
	}

	/**
	 * Pretty response.
	 *
	 * @param nodeName the node name
	 * @param response the response
	 */
	public static void prettyResponse(String nodeName, Response response) {
		getExtentTest().createNode(nodeName).pass(MarkupHelper.createCodeBlock(response.asString(), CodeLanguage.JSON));
	}
}
