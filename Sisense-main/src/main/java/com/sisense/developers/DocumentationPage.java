package com.sisense.developers;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.kfast.constants.FrameworkConstants;
import com.kfast.init.AbstractPage;
import com.kfast.init.Common;

public class DocumentationPage extends AbstractPage {

	public DocumentationPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	/** Documentation menu under Developers tab */
	@FindBy(xpath = "//a[text()='Documentation']")
	private WebElement documentationMenu;

	/**
	 * Clicks on the Documentation Menu under Developers tab
	 */
	public void clickOnDocumentationMenuUnderDevelopersTab() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, documentationMenu);
		Common.jsClick(driver,documentationMenu);
		log("Click on Documentation Menu under Developers tab successfully.");
		Common.waitForPageToLoad(driver, 10);
		Common.switchToAnotherWindow(driver, 10);
		Common.waitForPageToLoad(driver, 10);
		Common.checkTitleNull(driver);
	}

	/**
	 * Verifies the Documentation Page title
	 */
	public void verifyDocumentationPageTitle() {
		Common.checkTitleNull(driver);
		log("Title is: " + driver.getTitle());
		Assert.assertEquals("Documentation Page Title Not Matched!!", driver.getTitle(),
				FrameworkConstants.DOCUMENTATION_TITLE);
		log("Documentation Page Title matched successfully.");
	}

	/** Getting Started link under Documentation section */
	@FindBy(xpath = "//p[normalize-space()='Getting Started']")
	private WebElement gettingStartedLink;

	/**
	 * Clicks on the Getting Started link under Documentation
	 */
	public void clickOnGettingStartedLinkUnderDocumentationPage() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, gettingStartedLink);
		Common.scrollUpToElement(driver, gettingStartedLink);
		Common.jsClick(driver,gettingStartedLink);
		log("Click on Getting Started link under Documentation section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the Introduction Page title under Documentation
	 */
	public void verifyIntroductionPageTitle() {
		log("Title is: " + driver.getTitle());
		Assert.assertEquals("Introduction Page Title Not Matched!!", driver.getTitle(), "Introduction");
		log("Introduction Page Title matched successfully.");
	}

	/** Release Notes link under Documentation section */
	@FindBy(xpath = "//p[normalize-space()='Release Notes']")
	private WebElement releaseNotesLink;

	/**
	 * Clicks on the Release Notes link under Documentation
	 */
	public void clickOnReleaseNotesLinkUnderDocumentationPage() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, releaseNotesLink);
		Common.scrollUpToElement(driver, releaseNotesLink);
		Common.jsClick(driver,releaseNotesLink);
		log("Click on Release Notes link under Documentation section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the Release Notes Page title under Documentation
	 */
	public void verifyReleaseNotesPageTitle() {
		Assert.assertEquals("Release Notes Page Title Not Matched!!", driver.getTitle(),
				FrameworkConstants.DOC_RELEASE_NOTES);
		log("Release Notes Page Title matched successfully.");
	}

	/** Security link under Documentation section */
	@FindBy(xpath = "//p[normalize-space()='Security']")
	private WebElement securityLink;

	/**
	 * Clicks on the Security link under Documentation
	 */
	public void clickOnSecurityLinkUnderDocumentationPage() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, securityLink);
		Common.scrollUpToElement(driver, securityLink);
		Common.jsClick(driver,securityLink);
		log("Click on Security link under Documentation section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the Security Page title under Documentation
	 */
	public void verifySecurityPageTitle() {
		log("Title is: " + driver.getTitle());
		Assert.assertEquals("Security Page Title Not Matched!!", driver.getTitle(), "Security at Sisense");
		log("Security Page Title matched successfully.");
	}

	/** Deployment link under Documentation section */
	@FindBy(xpath = "//p[normalize-space()='Deployment']")
	private WebElement deploymentLink;

	/**
	 * Clicks on the Deployment link under Documentation
	 */
	public void clickOnDeploymentLinkUnderDocumentationPage() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, deploymentLink);
		Common.scrollUpToElement(driver, deploymentLink);
		Common.jsClick(driver,deploymentLink);
		log("Click on Deployment link under Documentation section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the Deployment Page title under Documentation
	 */
	public void verifyDeploymentPageTitle() {
		Assert.assertEquals("Deployment Page Title Not Matched!!", driver.getTitle(),
				"Minimum Requirements for Sisense in Linux Environments");
		log("Deployment Page Title matched successfully.");
	}

	/** Administration link under Documentation section */
	@FindBy(xpath = "//p[normalize-space()='Administration']")
	private WebElement administrationLink;

	/**
	 * Clicks on the Administration link under Documentation
	 */
	public void clickOnAdministrationLinkUnderDocumentationPage() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, administrationLink);
		Common.scrollUpToElement(driver, administrationLink);
		Common.jsClick(driver,administrationLink);
		log("Click on Administration link under Documentation section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the Administration Page title under Documentation
	 */
	public void verifyAdministrationPageTitle() {
		Assert.assertEquals("Administration Page Title Not Matched!!", driver.getTitle(), "Administration Overview");
		log("Administration Page Title matched successfully.");
	}

	/** Git Integration link under Documentation section */
	@FindBy(xpath = "//p[normalize-space()='Git Integration']")
	private WebElement gitIntegrationLink;

	/**
	 * Clicks on the Git Integration link under Documentation
	 */
	public void clickOnGitIntegrationLinkUnderDocumentationPage() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, gitIntegrationLink);
		Common.scrollUpToElement(driver, gitIntegrationLink);
		Common.jsClick(driver,gitIntegrationLink);
		log("Click on Git Integration link under Documentation section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the Git Integration Page title under Documentation
	 */
	public void verifyGitIntegrationPageTitle() {
		Assert.assertEquals("Git Integration Page Title Not Matched!!", driver.getTitle(),
				"Git Integration");
		log("Git Integration Page Title matched successfully.");
	}

	/** Data Sources link under Documentation section */
	@FindBy(xpath = "//p[normalize-space()='Data Sources']")
	private WebElement dataSourcesLink;

	/**
	 * Clicks on the Data Sources link under Documentation
	 */
	public void clickOnDataSourcesLinkUnderDocumentationPage() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, dataSourcesLink);
		Common.scrollUpToElement(driver, dataSourcesLink);
		Common.jsClick(driver,dataSourcesLink);
		log("Click on Data Sources link under Documentation section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the Data Sources Page title under Documentation
	 */
	public void verifyDataSourcesPageTitle() {
		Assert.assertEquals("Data Sources Page Title Not Matched!!", driver.getTitle(), "Data Sources");
		log("Data Sources Page Title matched successfully.");
	}

	/** Modeling Data link under Documentation section */
	@FindBy(xpath = "//p[normalize-space()='Modeling Data']")
	private WebElement modelingDataLink;

	/**
	 * Clicks on the Modeling Data link under Documentation
	 */
	public void clickOnModelingDataLinkUnderDocumentationPage() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, modelingDataLink);
		Common.scrollUpToElement(driver, modelingDataLink);
		Common.jsClick(driver,modelingDataLink);
		log("Click on Modeling Data link under Documentation section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the Modeling Data Page title under Documentation
	 */
	public void verifyModelingDataPageTitle() {
		Assert.assertEquals("Modeling Data Page Title Not Matched!!", driver.getTitle(), "Introduction to Data Models");
		log("Modeling Data Page Title matched successfully.");
	}

	/** Dashboards link under Documentation section */
	@FindBy(xpath = "//p[normalize-space()='Dashboards']")
	private WebElement dashboardsLink;

	/**
	 * Clicks on the Dashboards link under Documentation
	 */
	public void clickOnDashboardsLinkUnderDocumentationPage() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, dashboardsLink);
		Common.scrollUpToElement(driver, dashboardsLink);
		Common.jsClick(driver,dashboardsLink);
		log("Click on Dashboards link under Documentation section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the Dashboards Page title under Documentation
	 */
	public void verifyDashboardsPageTitle() {
		Assert.assertEquals("Dashboards Page Title Not Matched!!", driver.getTitle(), "Introduction to Dashboards");
		log("Dashboards Page Title matched successfully.");
	}

	/** Sisense Intelligence (AI) link under Documentation section */
	@FindBy(xpath = "//p[normalize-space()='Sisense Intelligence']")
	private WebElement sisenseIntelligenceLink;

	/**
	 * Clicks on the Sisense Intelligence (AI) link under Documentation section.
	 */
	public void clickOnSisenseIntelligenceLinkUnderDocumentation() {
		Common.waitForElementToBeVisible(driver, sisenseIntelligenceLink);
		Common.scrollUpToElement(driver, sisenseIntelligenceLink);
		Common.jsClick(driver,sisenseIntelligenceLink);
		log("Click on Sisense Intelligence (AI) link under Documentation section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the Sisense Intelligence (AI) page title under Documentation
	 * section.
	 */
	public void verifySisenseIntelligencePageTitleUnderDocumentation() {
		Assert.assertEquals("Sisense Intelligence (AI) Page Title Not Matched!!", driver.getTitle(),
				"Sisense Intelligence");
		log("Sisense Intelligence (AI) page title under Documentation section matched successfully.");
	}

	/** Embed & Infuse Analytics link under Documentation section */
	@FindBy(xpath = "//p[normalize-space()='Embed & Infuse Analytics']")
	private WebElement embedAndInfuseAnalyticsLink;

	/**
	 * Clicks on the Embed & Infuse Analytics link under Documentation section.
	 */
	public void clickOnEmbedAndInfuseAnalyticsLinkUnderDocumentation() {
		Common.waitForElementToBeVisible(driver, embedAndInfuseAnalyticsLink);
		Common.scrollUpToElement(driver, embedAndInfuseAnalyticsLink);
		Common.jsClick(driver,embedAndInfuseAnalyticsLink);
		log("Click on Embed & Infuse Analytics link under Documentation section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the Embed & Infuse Analytics page title under Documentation section.
	 */
	public void verifyEmbedAndInfuseAnalyticsPageTitleUnderDocumentation() {
		Assert.assertEquals("Embed & Infuse Analytics Page Title Not Matched!!", driver.getTitle(),
				"Embedding, White Labeling, and Rebranding OEMs");
		log("Embed & Infuse Analytics page title under Documentation section matched successfully.");
	}

	/** Cloud Managed Services link under Documentation section */
	@FindBy(xpath = "//p[normalize-space()='Cloud Managed Services']")
	private WebElement cloudManagedServicesLink;

	/**
	 * Clicks on the Cloud Managed Services link under Documentation section.
	 */
	public void clickOnCloudManagedServicesLinkUnderDocumentation() {
		Common.waitForElementToBeVisible(driver, cloudManagedServicesLink);
		Common.scrollUpToElement(driver, cloudManagedServicesLink);
		Common.jsClick(driver,cloudManagedServicesLink);
		log("Click on Cloud Managed Services link under Documentation section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the Cloud Managed Services page title under Documentation section.
	 */
	public void verifyCloudManagedServicesPageTitleUnderDocumentation() {
		Assert.assertEquals("Cloud Managed Services Page Title Not Matched!!", driver.getTitle(),
				"Sisense-Managed Cloud Services");
		log("Cloud Managed Services page title under Documentation section matched successfully.");
	}

	/** Notebooks link under Documentation section */
	@FindBy(xpath = "//p[normalize-space()='Notebooks']")
	private WebElement notebooksLink;

	/**
	 * Clicks on the Notebooks link under Documentation section.
	 */
	public void clickOnNotebooksLinkUnderDocumentation() {
		Common.waitForElementToBeVisible(driver, notebooksLink);
		Common.scrollUpToElement(driver, notebooksLink);
		Common.jsClick(driver,notebooksLink);
		log("Click on Notebooks link under Documentation section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the Notebooks page title under Documentation section.
	 */
	public void verifyNotebooksPageTitleUnderDocumentation() {
		Assert.assertEquals("Notebooks Page Title Not Matched!!", driver.getTitle(), "Notebooks");
		log("Notebooks page title under Documentation section matched successfully.");
	}

	/** Troubleshooting link under Documentation section */
	@FindBy(xpath = "//p[normalize-space()='Troubleshooting']")
	private WebElement troubleshootingLink;

	/**
	 * Clicks on the Troubleshooting link under Documentation section.
	 */
	public void clickOnTroubleshootingLinkUnderDocumentation() {
		Common.waitForElementToBeVisible(driver, troubleshootingLink);
		Common.scrollUpToElement(driver, troubleshootingLink);
		Common.jsClick(driver,troubleshootingLink);
		log("Click on Troubleshooting link under Documentation section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the Troubleshooting page title under Documentation section.
	 */
	public void verifyTroubleshootingPageTitleUnderDocumentation() {
		Assert.assertEquals("Troubleshooting Page Title Not Matched!!", driver.getTitle(),
				"Frequently Asked Questions");
		log("Troubleshooting page title under Documentation section matched successfully.");
	}

	/** Developer Docs link under Documentation section */
	@FindBy(xpath = "//p[normalize-space()='Developer Docs']")
	private WebElement developerDocsLink;

	/**
	 * Clicks on the Developer Docs link under Documentation section.
	 */
	public void clickOnDeveloperDocsLinkUnderDocumentation() {
		Common.waitForElementToBeVisible(driver, developerDocsLink);
		Common.scrollUpToElement(driver, developerDocsLink);
		Common.jsClick(driver,developerDocsLink);
		log("Click on Developer Docs link under Documentation section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the Developer Docs page title under Documentation section.
	 */
	public void verifyDeveloperDocsPageTitleUnderDocumentation() {
		Assert.assertEquals("Developer Docs Page Title Not Matched!!", driver.getTitle(),
				FrameworkConstants.SISENSE_DEV_DOCUMENTATION_TITLE);
		log("Developer Docs page title under Documentation section matched successfully.");
	}

	/** “Join and learn” heading under Documentation section */
	@FindBy(xpath = "//h2[normalize-space()='Join and learn']")
	private WebElement joinAndLearnTitle;

	/** Join the Community link under “Join and learn” section */
	@FindBy(xpath = "//a[contains(text(), 'Join the Community')]")
	private WebElement joinTheCommunityLink;

	/**
	 * Clicks on the Join the Community link under Documentation section.
	 */
	public void clickOnJoinTheCommunityLinkUnderDocumentation() {
		Common.waitForElementToBeVisible(driver, joinAndLearnTitle);
		Common.scrollUpToElement(driver, joinAndLearnTitle);
		Common.waitForElementToBeVisible(driver, joinTheCommunityLink);
		Common.jsClick(driver,joinTheCommunityLink);
		log("Click on Join the Community link under Documentation section successfully.");
		Common.waitForPageToLoad(driver, 10);
		Common.switchToLastWindow(driver);
		Common.waitForPageToLoad(driver, 10);
	}

	public void verifyCommunitySiteHomePageTitle() {
		log("Community Site Title: " + driver.getTitle());
		Assert.assertEquals("Sisense Community Home Page Title Not Matched", driver.getTitle(),
				FrameworkConstants.COMMUNITY_HOME_TITLE);
		log("Verified Community Home Page Title successfully.");
	}

	/** Go to Support Portal link under “Join and learn” section */
	@FindBy(xpath = "//a[contains(text(), 'Go to Support Portal')]")
	private WebElement goToSupportPortalLink;

	/**
	 * Clicks on the Go to Support Portal link under Documentation section.
	 */
	public void clickOnGoToSupportPortalLinkUnderDocumentation() {
		Common.waitForElementToBeVisible(driver, joinAndLearnTitle);
		Common.scrollUpToElement(driver, joinAndLearnTitle);
		Common.waitForElementToBeVisible(driver, goToSupportPortalLink);
		Common.jsClick(driver,goToSupportPortalLink);
		log("Click on Go to Support Portal link under Documentation section successfully.");
		Common.waitForPageToLoad(driver, 10);
		Common.switchToLastWindow(driver);
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the “Sign In to Sisense Community” page title under Documentation
	 * section.
	 */
	public void verifySignInToSisenseCommunityPageTitleUnderDocumentation() {
		Assert.assertEquals("Sign In to Sisense Community Page Title Not Matched!!", driver.getTitle(),
				FrameworkConstants.SIGN_IN_COMMUNITY);
		log("Sign In to Sisense Community page title under Documentation section matched successfully.");
	}

	/** Explore the Academy link under Documentation section */
	@FindBy(xpath = "//a[contains(text(), 'Explore the Academy')]")
	private WebElement exploreTheAcademyLink;

	/**
	 * Clicks on the Explore the Academy link under Documentation section.
	 */
	public void clickOnExploreTheAcademyLinkUnderDocumentation() {
		Common.waitForElementToBeVisible(driver, exploreTheAcademyLink);
		Common.scrollUpToElement(driver, exploreTheAcademyLink);
		Common.jsClick(driver,exploreTheAcademyLink);
		log("Click on Explore the Academy link under Documentation section successfully.");
		Common.waitForPageToLoad(driver, 10);
		Common.switchToLastWindow(driver);
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the Sisense Academy home page title under Documentation section.
	 */
	public void verifySisenseAcademyHomePageTitleUnderDocumentation() {
		Assert.assertEquals("Sisense Academy Home Page Title Not Matched!!", driver.getTitle(),
				FrameworkConstants.SISENSE_ACADEMY_TITLE);
		log("Sisense Academy home page title under Documentation section matched successfully.");
	}

	/** Blog tab under Documentation section */
	@FindBy(xpath = "//li[@id='docs']//following-sibling::li//child::a[text()='Blog']")
	private WebElement blogTabUnderHeaderSection;

	/**
	 * Clicks on the Blog tab under Documentation section
	 */
	public void clickOnBlogTabUnderDocumentation() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, blogTabUnderHeaderSection);
		Common.jsClick(driver,blogTabUnderHeaderSection);
		log("Click on Blog tab under Documentation section successfully.");
		Common.waitForPageToLoad(driver, 10);
		Common.switchToLastWindow(driver);
		Common.waitForPageToLoad(driver, 10);
	}

	/** Marketplace tab under Documentation section */
	@FindBy(xpath = "//li[@id='docs']//following-sibling::li//child::a[text()='Marketplace']")
	private WebElement marketplaceTabUnderHeaderSection;

	/**
	 * Clicks on the Marketplace tab under Documentation section
	 */
	public void clickOnMarketplaceTabUnderDocumentation() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, marketplaceTabUnderHeaderSection);
		Common.jsClick(driver,marketplaceTabUnderHeaderSection);
		log("Click on Marketplace tab under Documentation section successfully.");
		Common.waitForPageToLoad(driver, 10);
		Common.switchToLastWindow(driver);
		Common.waitForPageToLoad(driver, 10);
	}

	/** Developer Docs tab under Documentation section */
	@FindBy(xpath = "//li[@id='docs']//following-sibling::li//child::a[text()='Developer docs']")
	private WebElement developerDocsTabUnderHeaderSection;

	/**
	 * Clicks on the Developer Docs tab under Documentation section
	 */
	public void clickOnDeveloperDocsTabUnderDocumentation() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, developerDocsTabUnderHeaderSection);
		Common.jsClick(driver,developerDocsTabUnderHeaderSection);
		log("Click on Developer Docs tab under Documentation section successfully.");
		Common.waitForPageToLoad(driver, 10);
		Common.switchToLastWindow(driver);
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the Developer Docs tab page title under Documentation section
	 */
	public void verifyDeveloperDocsTabPageTitleUnderDocumentation() {
		Assert.assertEquals("Developer Docs Page Title Not Matched!!", driver.getTitle(),
				FrameworkConstants.SISENSE_DEV_DOCUMENTATION_TITLE);
		log("Developer Docs tab page title under Documentation section matched successfully.");
	}

	/** Footer section under Documentation page */
	@FindBy(xpath = "//footer[@class='footer-main']")
	private WebElement footerSection;

	/**
	 * Scrolls to the footer under Documentation section
	 */
	public void scrollToFooterUnderDocumentation() throws InterruptedException {
		Common.waitForPageToLoad(driver, 10);
		Common.waitForElementToBeVisible(driver, footerSection);
		Common.scrollToHorizontal(driver, footerSection);
		log("Scroll to footer under Documentation section successfully.");
	}

	/** Book a Live Demo button under Documentation section */
	@FindBy(xpath = "//a[text()='Book a live demo']")
	private WebElement bookALiveDemoButtonUnderFooterSection;

	/**
	 * Clicks on Book a Live Demo button under Documentation section
	 */
	public void clickOnBookALiveDemoButtonUnderDocumentation() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, bookALiveDemoButtonUnderFooterSection);
		Common.jsClick(driver,bookALiveDemoButtonUnderFooterSection);
		log("Click on Book a Live Demo button under Footer section successfully.");
		Common.waitForPageToLoad(driver, 10);
		Common.switchToLastWindow(driver);
		Common.waitForPageToLoad(driver, 10);
	}
}
