package com.kfast.init;

import static com.kfast.constants.FrameworkConstants.BROWSER;
import static com.kfast.constants.FrameworkConstants.URL;
import static com.kfast.constants.FrameworkConstants.VERSION;
import static com.kfast.init.Common.makeScreenshot;
import static com.kfast.init.DriverManager.getDriver;
import static com.kfast.init.DriverManager.initDriver;
import static com.kfast.init.DriverManager.quitDriver;
import static com.kfast.reports.ExtentReport.fail;
import static com.kfast.reports.ExtentReport.getExtentTest;
import static com.kfast.reports.ExtentReport.info;
import static com.kfast.reports.ExtentReport.pass;
import static com.kfast.reports.ExtentReport.skip;
import static com.kfast.utils.DateUtils.getCurrentTimeStampString;
import static com.kfast.utils.PropertyUtils.getProperty;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.google.api.client.util.Data;
import com.sisense.about.AboutPage;
import com.sisense.about.CompanyPage;
import com.sisense.about.NewsroomPage;
import com.sisense.about.PartnersPage;
import com.sisense.common.CommonMethods;
import com.sisense.common.SisenseHomePage;
import com.sisense.common.TestDriveSignUpPage;
import com.sisense.developers.DevelopersPage;
import com.sisense.developers.DocumentationPage;
import com.sisense.developers.GitIntegrationPage;
import com.sisense.developers.GithubPage;
import com.sisense.developers.PlaygroundPage;
import com.sisense.footer.BrandPortalPage;
import com.sisense.footer.CareersPage;
import com.sisense.footer.SisenseFooterPage;
import com.sisense.header.DemoPage;
import com.sisense.header.SisenseHeaderPage;
import com.sisense.platform.CloudPage;
import com.sisense.platform.ComposablePage;
import com.sisense.platform.ConnectivityPage;
import com.sisense.platform.DataModelingPage;
import com.sisense.platform.DataVisualizationPage;
import com.sisense.platform.EmbeddablePage;
import com.sisense.platform.SisenseIntelligencePage;
import com.sisense.platform.MarketplacePage;
import com.sisense.platform.PlatformPage;
import com.sisense.platform.TrustAndSecurityPage;
import com.sisense.pricing.PricingPage;
import com.sisense.resources.BlogPage;
import com.sisense.resources.CommunityPage;
import com.sisense.resources.CustomerStoriesPage;
import com.sisense.resources.EventsandWebinarsPage;
import com.sisense.resources.GlossaryPage;
import com.sisense.resources.GuidesAndReportsPage;
import com.sisense.resources.ResourcesPage;
import com.sisense.resources.SisenseAcademyPage;
import com.sisense.resources.SupportPage;
import com.sisense.resources.WhitepapersPage;
import com.sisense.solutions.AnalyticsforEveryonePage;
import com.sisense.solutions.BuildYourWayPage;
import com.sisense.solutions.FinancialservicesPage;
import com.sisense.solutions.HealthcareAndPharmaPage;
import com.sisense.solutions.InsightstoActionPage;
import com.sisense.solutions.ManufacturingPage;
import com.sisense.solutions.SolutionsPage;
import com.sisense.solutions.SupplyChainPage;
import com.sisense.solutions.TechnologyPage;

/**
 * The Class SeleniumInit.
 */
public class SeleniumInit {

	protected static SisenseHeaderPage sisenseHeaderPage;
	protected static SisenseFooterPage sisenseFooterPage;
	protected static CommonMethods commonMethods;
	protected static CloudPage cloudPage;
	protected static ComposablePage composablePage;
	protected static ConnectivityPage connectivityPage;
	protected static DataModelingPage dataModelingPage;
	protected static DataVisualizationPage dataVisualizationPage;
	protected static SisenseIntelligencePage sisenseIntelligencePage;
	protected static EmbeddablePage embeddablePage;
	protected static TrustAndSecurityPage trustAndSecurityPage;
	protected static MarketplacePage marketplacePage;
	protected static InsightstoActionPage insightstoActionPage;
	protected static BuildYourWayPage buildYourWayPage;
	protected static DemoPage demoPage;
	protected static AnalyticsforEveryonePage analyticsforEveryonePage;
	protected static PlaygroundPage playgroundPage;
	protected static HealthcareAndPharmaPage healthcareAndPharmaPage;
	protected static FinancialservicesPage financialservicesPage;
	protected static BlogPage blogPage;
	protected static SupplyChainPage supplyChainPage;
	protected static CareersPage careersPage;
	protected static TechnologyPage technologyPage;
	protected static DocumentationPage documentationPage;
	protected static ManufacturingPage manufacturingPage;
	protected static GitIntegrationPage gitIntegrationPage;
	protected static CustomerStoriesPage customerStoriesPage;
	protected static GithubPage githubPage;
	protected static GuidesAndReportsPage guidesAndReportsPage;
	protected static WhitepapersPage whitepapersPage;
	protected static CommunityPage communityPage;
	protected static SupportPage supportPage;
	protected static GlossaryPage glossaryPage;
	protected static SisenseAcademyPage sisenseAcademyPage;
	protected static EventsandWebinarsPage eventsandWebinarsPage;
	protected static PlatformPage platformPage;
	protected static CompanyPage companyPage;
	protected static SolutionsPage solutionsPage;
	protected static PartnersPage partnersPage;
	protected static NewsroomPage newsroomPage;
	protected static ResourcesPage resourcesPage;
	protected static AboutPage aboutPage;
	protected static DevelopersPage developersPage;
	protected static SisenseHomePage homePage;
	protected static TestDriveSignUpPage testDriveSignUpPage;
	protected static BrandPortalPage brandPortalPage;
	protected static  PricingPage pricingpage;
	
	/** The test url. */
	protected static String testUrl;

	/** The browser name. */
	protected static String browserName;

	/** The browser version. */
	protected static String browserVersion = "";

	/** The driver. */
	protected WebDriver driver;

	/**
	 * Fetch suite configuration.
	 */
	@BeforeTest(alwaysRun = true)
	public static void fetchSuiteConfiguration() {
		testUrl = getProperty(URL);
		browserName = getProperty(BROWSER);
		browserVersion = getProperty(VERSION);

	}

	/**
	 * SetUp.
	 *
	 * @param context the new up
	 * @throws MalformedURLException the malformed URL exception
	 * @throws InterruptedException
	 */
	@BeforeMethod(alwaysRun = true)
	public void setUp(ITestContext context) throws MalformedURLException, InterruptedException {
		initDriver(context);
		driver = getDriver();
		sisenseHeaderPage = new SisenseHeaderPage(driver);
		sisenseFooterPage = new SisenseFooterPage(driver);
		commonMethods = new CommonMethods(driver);
		cloudPage = new CloudPage(driver);
		composablePage = new ComposablePage(driver);
		connectivityPage = new ConnectivityPage(driver);
		dataModelingPage = new DataModelingPage(driver);
		dataVisualizationPage = new DataVisualizationPage(driver);
		sisenseIntelligencePage = new SisenseIntelligencePage(driver);
		embeddablePage = new EmbeddablePage(driver);
		trustAndSecurityPage = new TrustAndSecurityPage(driver);
		marketplacePage = new MarketplacePage(driver);
		insightstoActionPage = new InsightstoActionPage(driver);
		buildYourWayPage = new BuildYourWayPage(driver);
		demoPage = new DemoPage(driver);
		analyticsforEveryonePage = new AnalyticsforEveryonePage(driver);
		playgroundPage = new PlaygroundPage(driver);
		healthcareAndPharmaPage = new HealthcareAndPharmaPage(driver);
		financialservicesPage = new FinancialservicesPage(driver);
		blogPage = new BlogPage(driver);
		supplyChainPage = new SupplyChainPage(driver);
		careersPage = new CareersPage(driver);
		technologyPage = new TechnologyPage(driver);
		documentationPage = new DocumentationPage(driver);
		manufacturingPage = new ManufacturingPage(driver);
		gitIntegrationPage = new GitIntegrationPage(driver);
		customerStoriesPage = new CustomerStoriesPage(driver);
		githubPage = new GithubPage(driver);
		guidesAndReportsPage = new GuidesAndReportsPage(driver);
		whitepapersPage = new WhitepapersPage(driver);
		communityPage = new CommunityPage(driver);
		supportPage = new SupportPage(driver);
		glossaryPage = new GlossaryPage(driver);
		sisenseAcademyPage = new SisenseAcademyPage(driver);
		eventsandWebinarsPage = new EventsandWebinarsPage(driver);
		platformPage = new PlatformPage(driver);
		companyPage = new CompanyPage(driver);
		solutionsPage = new SolutionsPage(driver);
		partnersPage = new PartnersPage(driver);
		newsroomPage = new NewsroomPage(driver);
		resourcesPage = new ResourcesPage(driver);
		aboutPage = new AboutPage(driver);
		developersPage = new DevelopersPage(driver);
		homePage = new SisenseHomePage(driver);
		testDriveSignUpPage = new TestDriveSignUpPage(driver);
		brandPortalPage = new BrandPortalPage(driver);
		pricingpage = new PricingPage(driver);

	}

	/**
	 * Tear down.
	 *
	 * @param testResult  the test result
	 * @param testContext the test context
	 */
	@AfterMethod(alwaysRun = true)
	public void tearDown(ITestResult testResult, ITestContext testContext) {
		try {
			String testName = testContext.getName();
			Reporter.setCurrentTestResult(testResult);
			if (!testResult.isSuccess()) {
				System.out.println("\nTEST FAILED - " + testName);
				System.out.println("\nERROR MESSAGE: " + testResult.getThrowable());
				if (testResult.getStatus() == ITestResult.FAILURE) {
					System.out.println("1 message from tear down");
					getExtentTest().fail(MediaEntityBuilder
							.createScreenCaptureFromBase64String(Common.getBase64Image(driver)).build());
					String screenshotName = "finalScreenshot_" + getCurrentTimeStampString();
					makeScreenshot(driver, screenshotName);
					slog("<Strong><b>" + testName + " is failed.</b></font></strong>");
				}
			} else if (testResult.getStatus() == ITestResult.SUCCESS) {
				System.out.println("1 message from tear down");
				slog("<Strong><b>" + testName + " is passed.</b></font></strong>");
			}

			quitDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	@AfterSuite
	// public void closeBrowser() {
	// quitDriver();
//	}

	/**
	 * Log.
	 *
	 * @param msg the msg
	 */
	protected void log(String msg) {
		info(msg);
		slog(msg);
	}

	/**
	 * Slog.
	 *
	 * @param msg the msg
	 */
	private void slog(String msg) {
		Reporter.log(msg + "</br>");
		System.out.println(msg);
	}

	/**
	 * Log status.
	 *
	 * @param testStatus the test status
	 * @param msg        the msg
	 */
	protected void logStatus(ITestStatus testStatus, String msg) {
		switch (testStatus) {
		case PASSED:
			pass(msg);
			slog(msg + " <Strong><font color=#32cd32><b> &#10004 Pass</b></font></strong>");
			break;
		case FAILED:
			String screenshotName = getCurrentTimeStampString();
			fail(msg);
			getExtentTest().fail(
					MediaEntityBuilder.createScreenCaptureFromBase64String(Common.getBase64Image(driver)).build());
			slog(msg + " <Strong><font color=#dc3545><b> &#10008 Fail</b></font></strong>");
			Common.makeScreenshot(driver, screenshotName);
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