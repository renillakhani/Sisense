package com.kfast.init;

import static com.kfast.constants.FrameworkConstants.BROWSER;
import static com.kfast.constants.FrameworkConstants.BROWSERCHROME;
import static com.kfast.constants.FrameworkConstants.BROWSEREDGE;
import static com.kfast.constants.FrameworkConstants.BROWSERFIREFOX;
import static com.kfast.constants.FrameworkConstants.CHROME;
import static com.kfast.constants.FrameworkConstants.EDGE;
import static com.kfast.constants.FrameworkConstants.FILE_DOWNLOAD_PATH;
import static com.kfast.constants.FrameworkConstants.FIREFOX;
import static com.kfast.constants.FrameworkConstants.HEADLESS;
import static com.kfast.constants.FrameworkConstants.LAMBDACHROME;
import static com.kfast.constants.FrameworkConstants.LAMBDAEDGE;
import static com.kfast.constants.FrameworkConstants.LAMBDAFIREFOX;
import static com.kfast.constants.FrameworkConstants.MOBILE;
import static com.kfast.constants.FrameworkConstants.PLATFORM;
import static com.kfast.constants.FrameworkConstants.VERSION;
import static com.kfast.init.SeleniumInit.testUrl;
import static com.kfast.utils.PropertyUtils.getProperty;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ISuite;
import org.testng.ITestContext;
import java.util.List;

public final class DriverManager {

	private DriverManager() {
	}

	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	private static String username = "username";
	private static String accessKey = "accessKey";
	private static String build = "build";

	private static String lambdaUsername = getProperty("lambda-username");
	private static String lambdaAccessKey = getProperty("lambda-access-key");
	private static String browserStackUsername = getProperty("browserstack_username");
	private static String browserStackAccessKey = getProperty("browserstack_accessKey");

	public static String env;
	public static String browserName = "";
	public static String osName = "";
	public static String browserVersion = "";
	public static String browsernm = "";
	public static String cleanFlag = "";
	public static String datetime = "";
	public static String suiteNameBS;

	public static WebDriver getDriver() {
		return driver.get();
	}

	private static void setDriver(WebDriver driverRef) {
		driver.set(driverRef);
	}

	private static void unload() {
		driver.remove();
	}

	static void initDriver(ITestContext context) throws MalformedURLException {
		if (Objects.isNull(getDriver())) {

			String browserName = System.getProperty(BROWSER);
			if (browserName == null || browserName.isEmpty()) {
				browserName = "chrome"; // default browser
			}
			boolean isHeadless = Boolean.parseBoolean(System.getProperty("headless", "false"));

			System.out.println("Final Browser Value: " + browserName);
			System.out.println("Headless Mode: " + isHeadless);

			// set options to download files to a certain path
			Map<String, Object> prefs = new HashMap<>();
			prefs.put("download.default_directory", FILE_DOWNLOAD_PATH);

			if (StringUtils.containsIgnoreCase(browserName, FIREFOX)
					&& !StringUtils.containsIgnoreCase(browserName, LAMBDAFIREFOX)
					&& !StringUtils.containsIgnoreCase(browserName, BROWSERFIREFOX)) {

				FirefoxOptions options = new FirefoxOptions();
				options.addArguments("-private");
				options.setAcceptInsecureCerts(true);
				options.addPreference("browser.download.folderList", 2);
				options.addPreference("browser.helperApps.alwaysAsk.force", false);
				options.addPreference("browser.download.dir", new File(FILE_DOWNLOAD_PATH).getAbsolutePath());
				options.addPreference("browser.download.defaultFolder", new File(FILE_DOWNLOAD_PATH).getAbsolutePath());
				options.addPreference("browser.download.manager.showWhenStarting", false);
				options.addPreference("browser.helperApps.neverAsk.saveToDisk",
						"multipart/x-zip,application/zip,application/x-zip-compressed,application/x-compressed,application/msword,application/csv,text/csv,image/png ,image/jpeg, application/pdf, text/html,text/plain,  application/excel, application/vnd.ms-excel, application/x-excel, application/x-msexcel, application/octet-stream");
				options.addArguments(
						"user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/138.0.7204.169 Safari/537.36");
				System.out.println("Firefox");
				if (isHeadless) {
					options.addArguments("-headless");
					System.out.println("Firefox Headless Mode");
				}
				setDriver(new FirefoxDriver(options));
				if (isHeadless) {
					getDriver().manage().window().setPosition(new Point(0, 0));
					getDriver().manage().window().setSize(new Dimension(1920, 1080));
				}
			} else if (StringUtils.containsIgnoreCase(browserName, EDGE)
					&& !StringUtils.containsIgnoreCase(browserName, LAMBDAEDGE)
					&& !StringUtils.containsIgnoreCase(browserName, BROWSEREDGE)) {
				prefs.put("download.prompt_for_download", false);
				prefs.put("credentials_enable_service", false);
				prefs.put("profile.password_manager_enabled", false);
				EdgeOptions options = new EdgeOptions();
				options.setExperimentalOption("prefs", prefs);
				options.addArguments("inPrivate");
				options.addArguments("start-maximized");
				System.out.println("Edge");
				options.addArguments(
						"user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/138.0.7204.169 Safari/537.36");
				if (isHeadless) {
					options.addArguments("--headless=new");
					options.addArguments("window-size=1920,1080");
					System.out.println("Edge Headless Mode");
				}
				if (StringUtils.containsIgnoreCase(browserName, MOBILE)) {
					Map<String, Object> deviceMetrics = new HashMap<>();
					deviceMetrics.put("width", 767);
					deviceMetrics.put("height", 640);
					deviceMetrics.put("pixelRatio", 3.0);
					Map<String, Object> mobileEmulation = new HashMap<>();
					mobileEmulation.put("deviceMetrics", deviceMetrics);
					mobileEmulation.put("userAgent",
							"Mozilla/5.0 (Linux; Android 4.2.1; en-us; Nexus 5 Build/JOP40D) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.166 Mobile Safari/535.19");
					options.setExperimentalOption("mobileEmulation", mobileEmulation);
				}
				options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
				setDriver(new EdgeDriver(options));
			} else if (StringUtils.containsIgnoreCase(browserName, CHROME)
					&& !StringUtils.containsIgnoreCase(browserName, LAMBDACHROME)
					&& !StringUtils.containsIgnoreCase(browserName, BROWSERCHROME)) {
				final ChromeOptions options = new ChromeOptions();

				prefs.put("download.prompt_for_download", false);
				prefs.put("credentials_enable_service", false);
				prefs.put("profile.password_manager_enabled", false);

				options.setExperimentalOption("prefs", prefs);
				// options.addArguments("inPrivate");
				// options.addArguments("start-maximized");
				options.addArguments("incognito");
				options.addArguments("--start-maximized");
				System.out.println("Chrome");

				options.setExperimentalOption("excludeSwitches", List.of("enable-automation"));
				options.setExperimentalOption("useAutomationExtension", false);
				options.addArguments("--disable-blink-features=AutomationControlled");

				options.addArguments(
						"user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/138.0.7204.169 Safari/537.36");

				/*
				 * // ---------- 1. General Anti-Bot Flags ----------
				 * options.addArguments("disable-infobars");
				 * options.addArguments("--disable-extensions");
				 * options.addArguments("--disable-gpu");
				 * options.addArguments("--disable-dev-shm-usage");
				 * options.addArguments("--no-sandbox"); options.addArguments("incognito");
				 * options.addArguments("--start-maximized");
				 * options.addArguments("--disable-popup-blocking");
				 * 
				 * // ---------- 2. Spoof Headers and Locale ----------
				 * options.addArguments("accept-language=en-US,en;q=0.9");
				 * options.addArguments("referer=https://www.google.com/");
				 * options.addArguments(
				 * "user-agent=Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.6478.114 Safari/537.36"
				 * );
				 * 
				 * // ---------- 3. Stealth WebDriver Evasion ----------
				 * options.addArguments("--disable-blink-features=AutomationControlled");
				 * options.setExperimentalOption("excludeSwitches", new String[] {
				 * "enable-automation" });
				 * options.setExperimentalOption("useAutomationExtension", false);
				 * 
				 * // ---------- 4. Chrome Preferences to Block Fingerprints ----------
				 * 
				 * prefs.put("credentials_enable_service", false);
				 * prefs.put("profile.password_manager_enabled", false);
				 * options.setExperimentalOption("prefs", prefs);
				 * 
				 * // ---------- 5. Optional: Remote Debugging Port ----------
				 * options.addArguments("--remote-debugging-port=9222");
				 * 
				 * // ---------- 6. Optional: Disable WebRTC Leaks ----------
				 * options.addArguments("--disable-webrtc");
				 */

				// ---------- 7. Optional: Headless Mode with Proper Setup ----------
				if (isHeadless) {
					options.addArguments("--headless=new");
					options.addArguments("window-size=1920,1080");
					System.out.println("Chrome Headless Mode");
				}

				if (StringUtils.containsIgnoreCase(browserName, MOBILE)) {
					Map<String, Object> deviceMetrics = new HashMap<>();
					deviceMetrics.put("width", 767);
					deviceMetrics.put("height", 640);
					deviceMetrics.put("pixelRatio", 3.0);
					Map<String, Object> mobileEmulation = new HashMap<>();
					mobileEmulation.put("deviceMetrics", deviceMetrics);
					mobileEmulation.put("userAgent",
							"Mozilla/5.0 (Linux; Android 4.2.1; en-us; Nexus 5 Build/JOP40D) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.166 Mobile Safari/535.19");
					options.setExperimentalOption("mobileEmulation", mobileEmulation);
				}
				options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
				options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.IGNORE);
				prefs.put("credentials_enable_service", false);
				prefs.put("profile.password_manager_enabled", false);
				options.setExperimentalOption("prefs", prefs);
				setDriver(new ChromeDriver(options));

				/**
				 * This code to configure Selenium WebDriver for testing with the LambdaTest. It
				 * includes desired capabilities setup and WebDriver initialization for seamless
				 * integration with the framework.
				 */
			} else if (StringUtils.containsIgnoreCase(browserName, LAMBDACHROME)) {

				ChromeOptions options = new ChromeOptions();
				options.setPlatformName(getProperty(PLATFORM));
				options.setBrowserVersion(getProperty(VERSION));
				options.setCapability("LT:Options", "chrome");
				HashMap<String, Object> ltOptions = new HashMap<>();
				ltOptions.put(username, lambdaUsername);
				ltOptions.put(accessKey, lambdaAccessKey);
				ltOptions.put(build, context.getCurrentXmlTest().getName());
				options.setCapability("LT:Options", ltOptions);
				String url = "https://" + username + ":" + accessKey + "@hub.lambdatest.com/wd/hub";
				setDriver(new RemoteWebDriver(new URL(url), options));

			} else if (StringUtils.containsIgnoreCase(browserName, LAMBDAFIREFOX)) {
				FirefoxOptions options = new FirefoxOptions();
				options.setPlatformName(getProperty(PLATFORM));
				options.setBrowserVersion(getProperty(VERSION));
				options.setCapability("LT:Options", "firefox");

				HashMap<String, Object> ltOptions = new HashMap<>();
				ltOptions.put(username, lambdaUsername);
				ltOptions.put(accessKey, lambdaAccessKey);
				ltOptions.put(build, context.getCurrentXmlTest().getName());
				options.setCapability("LT:Options", ltOptions);

				String url = "https://" + username + ":" + accessKey + "@hub.lambdatest.com/wd/hub";
				setDriver(new RemoteWebDriver(new URL(url), options));
			} else if (StringUtils.containsIgnoreCase(browserName, LAMBDAEDGE)) {
				EdgeOptions options = new EdgeOptions();
				options.setPlatformName(getProperty(PLATFORM));
				options.setBrowserVersion(getProperty(VERSION));
				options.setCapability("LT:Options", "MicrosoftEdge");

				HashMap<String, Object> ltOptions = new HashMap<>();
				ltOptions.put(username, lambdaUsername);
				ltOptions.put(accessKey, lambdaAccessKey);
				ltOptions.put(build, context.getCurrentXmlTest().getName());
				options.setCapability("LT:Options", ltOptions);

				String url = "https://" + username + ":" + accessKey + "@hub.lambdatest.com/wd/hub";
				setDriver(new RemoteWebDriver(new URL(url), options));
			}

			/**
			 * This code to configure Selenium WebDriver for testing with the Browser Stack.
			 * It sets up desired capabilities and initializes the WebDriver session for
			 * Browser Stack.
			 */

			if (StringUtils.containsIgnoreCase(browserName, BROWSERCHROME)) {
				ChromeOptions options = new ChromeOptions();

				DesiredCapabilities caps = new DesiredCapabilities();

				caps.setCapability("browser", "Chrome");
				caps.setCapability("browser_version", "latest");
				caps.setCapability("os", "Windows");
				caps.setCapability("os_version", "10");
				caps.setCapability("name", "Test");
				caps.setCapability("buildname", "WebApp_Build"); // Specify build name
				String url = "https://" + browserStackUsername + ":" + browserStackAccessKey
						+ "@hub-cloud.browserstack.com/wd/hub";

				setDriver(new RemoteWebDriver(new URL(url), options));

			} else if (StringUtils.containsIgnoreCase(browserName, BROWSERFIREFOX)) {
				FirefoxOptions options = new FirefoxOptions();
				DesiredCapabilities caps = new DesiredCapabilities();

				caps.setCapability("browser", "Firefox");
				caps.setCapability("browser_version", "latest");
				caps.setCapability("os", "Windows");
				caps.setCapability("os_version", "10");
				caps.setCapability("name", "Test");
				caps.setCapability("buildname", "WebApp_Build");

				String url = "https://" + browserStackUsername + ":" + browserStackAccessKey
						+ "@hub-cloud.browserstack.com/wd/hub";
				;
				setDriver(new RemoteWebDriver(new URL(url), options));
			} else if (StringUtils.containsIgnoreCase(browserName, BROWSEREDGE)) {
				EdgeOptions options = new EdgeOptions();
				DesiredCapabilities caps = new DesiredCapabilities();

				caps.setCapability("browser", "Edge");
				caps.setCapability("browser_version", "latest");
				caps.setCapability("os", "Windows");
				caps.setCapability("os_version", "10");
				caps.setCapability("name", "Test");
				caps.setCapability("buildname", "WebApp_Build");

				String url = "https://" + browserStackUsername + ":" + browserStackAccessKey
						+ "@hub-cloud.browserstack.com/wd/hub";
				;
				setDriver(new RemoteWebDriver(new URL(url), options));
			}

			getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			ISuite suite = context.getSuite();
			if (suite.getParameter("env") != null) {
				env = suite.getParameter("env");
			}
			getDriver().get(testUrl);
		}

		/*
		 * if (browserName.equalsIgnoreCase("lambda")) { JSONParser parser = new
		 * JSONParser(); JSONObject config = (JSONObject) parser.parse(new
		 * FileReader("conf/" + config_file)); JSONObject envs = (JSONObject)
		 * config.get("environments"); DesiredCapabilities capabilities = new
		 * DesiredCapabilities(); Map<String, String> envCapabilities = (Map<String,
		 * String>) envs.get(environment); envCapabilities.forEach((key, value) ->
		 * capabilities.setCapability(key, value)); Map<String, String>
		 * commonCapabilities = (Map<String, String>) config.get("capabilities");
		 * commonCapabilities.forEach((key, value) -> { if
		 * (capabilities.getCapability(key) == null) { capabilities.setCapability(key,
		 * value); } }); String username = System.getenv("LAMBDATEST_USERNAME"); if
		 * (username == null) { username = (String) config.get("user"); } String
		 * accessKey = System.getenv("LAMBDATEST_ACCESS_KEY"); if (accessKey == null) {
		 * accessKey = (String) config.get("key"); } if
		 * (capabilities.getCapability("lambdatest.local") != null &&
		 * capabilities.getCapability("lambdatest.local") == "true") { l = new Local();
		 * Map<String, String> options = new HashMap<String, String>();
		 * options.put("key", accessKey); l.start(options); } driver = new
		 * RemoteWebDriver( new URL("https://" + username + ":" + accessKey + "@" +
		 * config.get("server") + "/wd/hub"), capabilities); // update testName in
		 * LambdaTest ((JavascriptExecutor) driver).executeScript("lambda-name=" +
		 * testName); System.out.println(driver); System.out.println(testName); }
		 */

		/*
		 * if (StringUtils.containsIgnoreCase(browserName, LAMBDAMOBILE)) {
		 * DesiredCapabilities capabilities = new DesiredCapabilities();
		 * capabilities.setCapability("platformName", "android");
		 * capabilities.setCapability("deviceName", "Galaxy Tab S4"); // Replace with
		 * desired device model // Remove browser name for mobile testing
		 * capabilities.setCapability("LT:Options", "chrome"); HashMap<String, Object>
		 * ltOptions = new HashMap<>(); ltOptions.put(username, lambdaUsername);
		 * ltOptions.put(accessKey, lambdaAccessKey); ltOptions.put(build,
		 * context.getCurrentXmlTest().getName());
		 * capabilities.setCapability("LT:Options", ltOptions); String url = "https://"
		 * + username + ":" + accessKey + "@mobile-hub.lambdatest.com/wd/hub";
		 * setDriver(new RemoteWebDriver(new URL(url), capabilities)); }
		 */

	}

	static void quitDriver() {
		if (Objects.nonNull(getDriver())) {
			getDriver().manage().deleteAllCookies();
//			getDriver().close();
			getDriver().quit();
			unload();
		}
	}
}