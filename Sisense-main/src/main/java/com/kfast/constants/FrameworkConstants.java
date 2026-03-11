package com.kfast.constants;

import java.io.File;
import java.nio.charset.StandardCharsets;

public final class FrameworkConstants {
	private FrameworkConstants() {
	}

	// Timeouts
	public static final long HIGH_TIMEOUT = 60;
	public static final long MID_TIMEOUT = 45;
	public static final long LOW_TIMEOUT = 30;
	public static final long LOWEST_TIMEOUT = 10;
	public static final String CONFIG_PROPERTIES = "config.properties";
	public static final String URL = "url";
	public static final String BROWSER = "browser";
	public static final String VERSION = "version";
	public static final String TEST_RESOURCES_PATH = System.getProperty("user.dir") + File.separator + "src"
			+ File.separator + "test" + File.separator + "resources";
	public static final String TEST_DATA_PATH = TEST_RESOURCES_PATH + File.separator + "data";
	public static final String FILE_DOWNLOAD_PATH = TEST_RESOURCES_PATH + File.separator + "downloads";
	public static final String HEADLESS = "headless";
	public static final String CHROME = "chrome";
	public static final String EDGE = "edge";
	public static final String FIREFOX = "firefox";
	public static final String MOBILE = "mobile";
	public static final String LAMBDAMOBILE = "LAMBDAMOBILE";
	public static final String LAMBDACHROME = "LAMBDACHROME";
	public static final String LAMBDAFIREFOX = "LAMBDAFIREFOX";
	public static final String LAMBDAEDGE = "LAMBDAEDGE";
	public static final String BROWSERCHROME = "BROWSERCHROME";
	public static final String BROWSERFIREFOX = "BROWSERFIREFOX";
	public static final String BROWSEREDGE = "BROWSEREDGE";
	public static final String PLATFORM = "platform";
	public static final String EMAIL_VERIFICATION_PATH = TEST_RESOURCES_PATH + File.separator + "email HTML files";
	public static final String BASE_URL = "baseURL";
	public static final String BEARER_TOKEN = "bearerToken";
	public static final String UTF_8 = StandardCharsets.UTF_8.toString();

	// Tab Titles
	public static final String HOMEPAGE_TITLE = "Intelligent Data Analytics Software - Sisense";
	public static final String PLATFORMPAGE_TITLE = "AI Analytics Platform - Sisense";
	public static final String SOLUTIONSPAGE_TITLE = "Data Analytics Solutions | Sisense";
	public static final String DEVELOPERSPAGE_TITLE = "Sisense Developer Portal";
	public static final String RESOURCESPAGE_TITLE = "Data Analytics Resources - Sisense";
	public static final String ABOUTPAGE_TITLE = "About Us - Learn More About Sisense and Our Mission";
	public static final String DEMOPAGE_TITLE = "Request a Demo - See Sisense Transform Your Data Analytics";

	// Platform Menu Titles
	public static final String CLOUDPAGE_TITLE = "Cloud Analytics Platform: Secure Data Solutions | Sisense";
	public static final String COMPOSABLEPAGE_TITLE = "Sisense Compose SDK: Build Custom Analytics | Sisense";
	public static final String EMBEDDABLEPAGE_TITLE = "Embedded Analytics Platform for Applications - Sisense";
	public static final String CONNECTIVITYPAGE_TITLE = "Sisense Data Connectivity: Access All Your Data in One Place";
	public static final String DATA_MODELINGPAGE_TITLE = "Data Modeling Tool & Visualization Software - Sisense";
	public static final String DATA_VISUALIZATION_PAGE_TITLE = "Data visualization | Sisense";
	public static final String SISENSE_INTELLIGENCE_PAGE_TITLE = "Generative AI Analytics by Sisense: Smarter Insights, Faster";
	public static final String TRUST_AND_SECURITY_TITLE = "Trust and Security Policy | Sisense";
	public static final String MARKETPLACEPAGE_TITLE = "Add Ons | Marketplace - Sisense";

	// solution Menu Titles
	public static final String INSIGHTS_TO_ACTION_TITLE = "How to Turn Data into Actionable Insights | Sisense";
	public static final String BUILD_YOUR_WAY_TITLE = "Embed Analytics and Build Custom Insights - Sisense";
	public static final String ANALYTICS_FOR_EVERYONE_TITLE = "Self-Service Analytics Tools - Sisense";
	public static final String FINANCIAL_SERVICES_TITLE = "Financial Services Analytics Solutions - Sisense";
	public static final String HEALTHCARE_AND_PHARMA_TITLE = "Pharma and Healthcare Analytics Software - Sisense";
	public static final String SUPPLY_CHAIN_TITLE = "Supply Chain Analytics Software - Sisense";
	public static final String TECHNOLOGY_TITLE = "Data Analytics Software for the Technology Industry";
	public static final String MANUFACTURING_TITLE = "Manufacturing Analytics Software - Sisense";

	// developers menu title
	public static final String DOCUMENTATION_TITLE = "Documentation";
	public static final String GITHUB_TITLE = "Sisense · GitHub";
	public static final String GIT_INTEGRATION_TITLE = "Git Integration | Sisense";
	public static final String PLAYGROUND_TITLE = "Sisense Developer Playground - Sisense";

	// resources menu title
	public static final String BLOG_TITLE = "AI, analytics, and the future of insights: Blog - Sisense";
	public static final String CUSTOMER_STORIES_TITLE = "Sisense Case Studies: How Businesses Thrive with Data";
	public static final String EVENTS_AND_WEBINARS_TITLE = "Master Data Analytics with Sisense Webinars";
	public static final String REPORTS_TITLE = "Data Analytics Guides and Reports - Sisense";
	public static final String WHITRPAPERS_TITLE = "Data Analytics Whitepapers - Sisense";
	public static final String COMMUNITY_HOME_TITLE = "Home | Sisense Community";
	public static final String GLOSSARY_TITLE = "Data Analytics Glossary - Sisense";
	public static final String SUPPORT_TITLE = "Support | Customer Success & Support- Sisense";
	public static final String SISENSE_ACADEMY_TITLE = "Sisense Academy Home";

	// About Menu Title
	public static final String PARTNERS_TITLE = "Join Our Partners | Sisense";
	public static final String NEWSROOM_TITLE = "Latest News & Press Coverage - Sisense Newsroom";

	// Footer section
	public static final String PRICING_TITLE = "AI Analytics Pricing | Sisense";
	public static final String PARTNER_RESOURCES_TITLE = "Partner Resources - Sisense";
	public static final String BRAND_PORTAL_TITLE = "Sisense Brand Portal | Sisense Brand Guidelines";
	public static final String LEGAL_LINK = "Sisense Legal Terms, Security, & Virtual Patent Marketing";
	public static final String PRIVACY_POLICY_LINK = "Sisense Privacy Policy: How We Protect Your Data";

	// Social Media Links
	public static final String TWITTER_TITLE = "Sisense (@Sisense) / X";
	public static final String LINKED_IN_TITLE = "Sisense | LinkedIn";

	public static final String CAREEERS_TITLE = "Careers at Sisense | Join Our Innovative Team";
	public static final String OUR_INVESTORS_TITLE = "Sisense Investors | Financial Growth & Funding Insights";
	public static final String GET_IN_TOUCH = "Contact Us - Get in Touch with Sisense";
	public static final String BECOME_A_PARTNER_TITLE = "Become a Partner";
	public static final String GETFREE_30DAY_TRAIL_TITLE = "Start your 30-day trial with Compose SDK today » Sisense";
	public static final String TAKE_A_TOUR_TITLE = "Product Tour | Watch a Live Demo - Sisense";
	public static final String LEARN_HOW_TITLE = "How Bigtincan achieved a 215% ROI with Sisense » Sisense";
	public static final String BARRIOS_TAKES_ANALYTICS_TITLE = "Barrios takes analytics to new heights | Case Studies";
	public static final String SISENSE_DEV_DOCUMENTATION_TITLE = "Sisense Documentation | Sisense Developers";
	public static final String AI_ASSISTANT_DASHBOARD_DEMO_TITLE = "Watch a demo | Sisense";
	public static final String CREATE_ALERT_TITLE = "MyGreenhouse";
	public static final String DATA_DESIGNERS_TITLE = "Data Designers";

	// Common Titles
	public static final String TRUST_CENTER_TITLE = "Sisense Trust Center | Powered by SafeBase";
	public static final String DOC_RELEASE_NOTES = "Release Notes";
	public static final String TEST_DRIVE_TITLE = "Get a Trial of Sisense by Testing our Data Analytics Software";
	public static final String TERMSOFUSE_TITLE = "Terms of Use | Sisense";
	public static final String PRIVACYPOLICY_TITLE = "Sisense Privacy Notice - Commitment to Data Protection";
	public static final String THANKSFORSUBMIT_TITLE = "Thanks for submitting your request.";
	public static final String SIGN_IN_COMMUNITY = "sisense-prod | Customer Portal";
	public static final String SIGN_UP_TITLE = "Sign Up";
	public static final String SISENSE7_DAYFREETRIAL_PAGE = "Get a Trial of Sisense by Testing our Data Analytics Software";
	public static final String SIGN_IN_COMMUNITY_PLAYPAGE = "Sign In | Sisense Community";
	public static final String SUPPORT_PORTAL_LINK = "Customer Portal Sign In";
	

}