package com.kfast.api;

import static com.kfast.reports.ExtentReport.fail;
import static com.kfast.reports.ExtentReport.info;
import static com.kfast.reports.ExtentReport.pass;
import static com.kfast.reports.ExtentReport.skip;

import org.testng.Reporter;

import com.kfast.init.ITestStatus;

/**
 * This class contains methods required for logging.
 *
 * @author Badal Shah
 */
public class APILogger {

	/**
	 * Instantiates a new API logger.
	 */
	private APILogger() {

	}

	/**
	 * Log.
	 *
	 * @param msg the msg
	 */
	public static void log(String msg) {
		info(msg);
		slog(msg);
	}

	/**
	 * Slog.
	 *
	 * @param msg the msg
	 */
	private static void slog(String msg) {
		Reporter.log(msg + "</br>");
		System.out.println(msg);
	}

	/**
	 * Log status.
	 *
	 * @param testStatus the test status
	 * @param msg        the msg
	 */
	public static void logStatus(ITestStatus testStatus, String msg) {
		switch (testStatus) {
		case PASSED:
			pass(msg);
			slog(msg + " <Strong><font color=#32cd32><b> &#10004 Pass</b></font></strong>");
			break;
		case FAILED:
			fail(msg);
			slog(msg + " <Strong><font color=#dc3545><b> &#10008 Fail</b></font></strong>");
			break;
		case SKIPPED:
			slog(msg);
			skip(msg);
			break;
		default:
			break;
		}
	}
}