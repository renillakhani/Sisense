package com.sisense.developers;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.kfast.constants.FrameworkConstants;
import com.kfast.init.AbstractPage;
import com.kfast.init.Common;

public class PlaygroundPage extends AbstractPage {

	public PlaygroundPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	/** Playground menu under Developers tab */
	@FindBy(xpath = "//a[text()='Playground']")
	private WebElement playgroundMenu;

	/**
	 * Clicks on the Playground menu under Developers tab.
	 */
	public void clickOnPlaygroundMenuUnderDevelopersTab() {
		Common.waitForElementToBeVisible(driver, playgroundMenu);
		Common.jsClick(driver, playgroundMenu);
		log("Click on Playground menu under Developers tab successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the Playground page title under Developers tab.
	 */
	public void verifyPlaygroundPageTitleUnderDevelopersTab() {
		Common.waitForPageToLoad(driver, 10);
		log("Title is: " + driver.getTitle());
		Assert.assertEquals("Playground Page Title Not Matched!!", driver.getTitle(),
				FrameworkConstants.PLAYGROUND_TITLE);
		log("Playground page title under Developers tab matched successfully.");
	}

	/** IFrame for Playground examples */
	@FindBy(id = "playground_frame")
	private WebElement playgroundFrame;

	/**
	 * Switches into the Playground iframe under Playground Page
	 */
	public void switchToPlaygroundPageIFrameUnderPlaygroundPage() {
		Common.waitForFrameAndSwitchToIt(driver, playgroundFrame, 10);
		log("Switched to Playground iframe under Playground Page successfully.");
	}

	/** “Compose SDK” link under Playground iframe */
	@FindBy(xpath = "//a[normalize-space()='Compose SDK']")
	private WebElement composeSDKLink;

	/**
	 * Clicks on the Compose SDK link under Playground Page
	 */
	public void clickOnComposeSDKLinkUnderPlaygroundPage() {
		Common.waitForElementToBeVisible(driver, composeSDKLink);
		Common.jsClick(driver, composeSDKLink);
		log("Click on Compose SDK link under Playground Page successfully.");
		Common.switchToDefaultContent(driver);
		Common.switchToAnotherWindow(driver, 10);
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the Compose SDK page title under Playground Page.
	 */
	public void verifyComposeSDKPageTitleUnderPlaygroundPage() {
		Common.waitForPageToLoad(driver, 10);
		log("Title is: " + driver.getTitle());
		Assert.assertEquals("Compose SDK Page Title Not Matched!!", driver.getTitle(),
				"Compose SDK | Sisense Developers");
		log("Compose SDK page title under Playground Page matched successfully.");
	}

	/** “documentation, quickstarts and guides” link under Playground iframe */
	@FindBy(xpath = "//a[normalize-space()='documentation, quickstarts and guides']")
	private WebElement documentationQuickstartsAndGuidesLink;

	/**
	 * Clicks on the documentation, quickstarts and guides link under Playground
	 * Page.
	 */
	public void clickOnDocumentationQuickstartsAndGuidesLinkUnderPlaygroundPage() {
		Common.waitForElementToBeVisible(driver, documentationQuickstartsAndGuidesLink);
		Common.scrollUpToElement(driver, documentationQuickstartsAndGuidesLink);
		log("Scroll to documentation, quickstarts and guides link under Playground Page.");
		Common.jsClick(driver, documentationQuickstartsAndGuidesLink);
		log("Click on documentation, quickstarts and guides link under Playground Page.");
		Common.switchToDefaultContent(driver);
		Common.switchToAnotherWindow(driver, 10);
		Common.waitForPageToLoad(driver, 10);
	}

	/** “Start a 30‑day free trial” link under Playground iframe */
	@FindBy(xpath = "//a[normalize-space()='Start a 30-day free trial']")
	private WebElement startA30DayFreeTrialLink;

	/**
	 * Clicks on the Start a 30‑day free trial link under Playground Page.
	 */
	public void clickOnStartA30DayFreeTrialLinkUnderPlaygroundPage() {
		Common.waitForElementToBeVisible(driver, startA30DayFreeTrialLink);
		Common.scrollUpToElement(driver, startA30DayFreeTrialLink);
		log("Scroll to Start a 30-day free trial link under Playground Page.");
		Common.jsClick(driver, startA30DayFreeTrialLink);
		log("Click on Start a 30-day free trial link under Playground Page successfully.");
		Common.switchToDefaultContent(driver);
		Common.switchToAnotherWindow(driver, 10);
		Common.checkTitleNull(driver);
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the Compose SDK free trial page title under Playground Page.
	 */
	public void verifyComposeSDKFreeTrialPageTitleUnderPlaygroundPage() {
		Common.waitForPageToLoad(driver, 10);
		log("Title is: " + driver.getTitle());
		Assert.assertEquals("Compose SDK Free Trial Page Title Not Matched!!", driver.getTitle(),
				FrameworkConstants.GETFREE_30DAY_TRAIL_TITLE);
		log("Compose SDK free trial page title under Playground Page matched successfully.");
	}

	/** “developer community” link under Playground iframe */
	@FindBy(xpath = "//a[normalize-space()='developer community']")
	private WebElement developerCommunityLink;

	/**
	 * Clicks on the Developer Community link under Playground Page.
	 */
	public void clickOnDeveloperCommunityLinkUnderPlaygroundPage() {
		Common.waitForElementToBeVisible(driver, developerCommunityLink);
		Common.scrollUpToElement(driver, developerCommunityLink);
		log("Scroll to Developer Community link under Playground Page.");
		Common.jsClick(driver, developerCommunityLink);
		log("Click on Developer Community link under Playground Page successfully.");
		Common.switchToDefaultContent(driver);
		Common.switchToAnotherWindow(driver, 10);
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the “Sign In to Sisense Community” page title under Documentation
	 * section.
	 */
	public void verifySignInToSisenseCommunityPageTitleUnderDocumentation() {
		Assert.assertEquals("Sign In to Sisense Community Page Title Not Matched!!", driver.getTitle(),
				FrameworkConstants.SIGN_IN_COMMUNITY_PLAYPAGE);
		log("Sign In to Sisense Community page title under Documentation section matched successfully.");
	}

	/** “Discord” link under Playground iframe */
	@FindBy(xpath = "//a[normalize-space()='Discord']")
	private WebElement discordLink;

	/**
	 * Clicks on the Discord link under Playground Page.
	 */
	public void clickOnDiscordLinkUnderPlaygroundPage() {
		Common.waitForElementToBeVisible(driver, discordLink);
		Common.scrollUpToElement(driver, discordLink);
		log("Scroll to Discord link under Playground Page.");
		Common.jsClick(driver, discordLink);
		log("Click on Discord link under Playground Page successfully.");
		Common.switchToDefaultContent(driver);
		Common.switchToAnotherWindow(driver, 10);
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the Discord link URL under Playground Page.
	 */
	public void verifyDiscordLinkUrlUnderPlaygroundPage() {
		Common.waitForPageToLoad(driver, 10);
		Assert.assertEquals("Discord Link URL Not Matched!!", driver.getCurrentUrl(),
				"https://discord.com/invite/bzqv8eCvJb");
		log("Discord link URL under Playground Page matched successfully.");
	}

	/** “Start your free trial” button under Playground Page */
	@FindBy(xpath = "//button[normalize-space()='Start your free trial']")
	private WebElement startYourFreeTrialButton;

	/**
	 * Clicks on the Start your free trial button under Playground Page.
	 */
	public void clickOnStartYourFreeTrialButtonUnderPlaygroundPage() {
		Common.waitForElementToBeVisible(driver, startYourFreeTrialButton);
		Common.jsClick(driver, startYourFreeTrialButton);
		log("Click on Start your free trial button under Playground Page successfully.");
		Common.switchToDefaultContent(driver);
		Common.switchToAnotherWindow(driver, 10);
		Common.waitForPageToLoad(driver, 10);
		Common.checkTitleNull(driver);
	}

	/** “Column chart” example link under Playground Page */
	@FindBy(xpath = "//span[normalize-space()='Column chart']")
	private WebElement columnChartLink;

	/**
	 * Clicks on the Column chart link under Playground Page.
	 */
	public void clickOnColumnChartLinkUnderPlaygroundPage() {
		Common.waitForElementToBeVisible(driver, columnChartLink);
		Common.scrollUpToElement(driver, columnChartLink);
		log("Scroll to Column chart link under Playground Page.");
		Common.jsClick(driver, columnChartLink);
		log("Click on Column chart link under Playground Page successfully.");
		Common.waitForTitleToChange(driver, 10);
		Common.switchToDefaultContent(driver);
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the Column chart example URL under Playground Page.
	 */
	public void verifyColumnChartLinkUrlUnderPlaygroundPage() {
		Assert.assertEquals("Column Chart Link URL Not Matched!!", driver.getCurrentUrl(),
				"https://www.sisense.com/developers/playground/?example=charts%2Fcolumn-chart");
		log("Column chart example URL under Playground Page matched successfully.");
	}

	/** “Pie chart” example link under Playground Page */
	@FindBy(xpath = "//span[normalize-space()='Pie chart']")
	private WebElement pieChartLink;

	/**
	 * Clicks on the Pie chart link under Playground Page.
	 */
	public void clickOnPieChartLinkUnderPlaygroundPage() {
		Common.waitForElementToBeVisible(driver, pieChartLink);
		Common.scrollUpToElement(driver, pieChartLink);
		log("Scroll to Pie chart link under Playground Page.");
		Common.jsClick(driver, pieChartLink);
		log("Click on Pie chart link under Playground Page successfully.");
		Common.waitForTitleToChange(driver, 10);
		Common.switchToDefaultContent(driver);
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the Pie chart example URL under Playground Page.
	 */
	public void verifyPieChartLinkUrlUnderPlaygroundPage() {
		Assert.assertEquals("Pie Chart Link URL Not Matched!!", driver.getCurrentUrl(),
				"https://www.sisense.com/developers/playground/?example=charts%2Fpie-chart");
		log("Pie chart example URL under Playground Page matched successfully.");
	}

	/** “Query API (hooks)” example link under Playground Page */
	@FindBy(xpath = "//span[normalize-space()='Query API (hooks)']")
	private WebElement queryAPILink;

	/**
	 * Clicks on the Query API (hooks) link under Playground Page.
	 */
	public void clickOnQueryAPILinkUnderPlaygroundPage() {
		Common.waitForElementToBeVisible(driver, queryAPILink);
		Common.scrollUpToElement(driver, queryAPILink);
		log("Scroll to Query API (hooks) link under Playground Page.");
		Common.jsClick(driver, queryAPILink);
		log("Click on Query API (hooks) link under Playground Page successfully.");
		Common.waitForTitleToChange(driver, 10);
		Common.switchToDefaultContent(driver);
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the Query API (hooks) example URL under Playground Page.
	 */
	public void verifyQueryAPILinkUrlUnderPlaygroundPage() {
		Assert.assertEquals("Query API (hooks) Link URL Not Matched!!", driver.getCurrentUrl(),
				"https://www.sisense.com/developers/playground/?example=queries%2Fuse-execute-query");
		log("Query API (hooks) example URL under Playground Page matched successfully.");
	}

	/** “Dashboard Layout with Filters” example link under Playground Page */
	@FindBy(xpath = "//span[normalize-space()='Dashboard Layout with Filters']")
	private WebElement dashboardLayoutWithFiltersLink;

	/**
	 * Clicks on the Dashboard Layout with Filters link under Playground Page.
	 */
	public void clickOnDashboardLayoutWithFiltersLinkUnderPlaygroundPage() {
		Common.waitForElementToBeVisible(driver, dashboardLayoutWithFiltersLink);
		Common.scrollUpToElement(driver, dashboardLayoutWithFiltersLink);
		log("Scroll to Dashboard Layout with Filters link under Playground Page.");
		Common.jsClick(driver, dashboardLayoutWithFiltersLink);
		log("Click on Dashboard Layout with Filters link under Playground Page successfully.");
		Common.waitForTitleToChange(driver, 10);
		Common.switchToDefaultContent(driver);
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the Dashboard Layout with Filters example URL under Playground Page.
	 */
	public void verifyDashboardLayoutWithFiltersLinkUrlUnderPlaygroundPage() {
		Assert.assertEquals("Dashboard Layout with Filters Link URL Not Matched!!", driver.getCurrentUrl(),
				"https://www.sisense.com/developers/playground/?example=use-cases%2Fcustom-dashboard-with-filters");
		log("Dashboard Layout with Filters example URL under Playground Page matched successfully.");
	}

	/** “Micro Analytics” example link under Playground Page */
	@FindBy(xpath = "//span[normalize-space()='Micro Analytics']")
	private WebElement microAnalyticsLink;

	/**
	 * Clicks on the Micro Analytics link under Playground Page.
	 */
	public void clickOnMicroAnalyticsLinkUnderPlaygroundPage() {
		Common.waitForElementToBeVisible(driver, microAnalyticsLink);
		Common.scrollUpToElement(driver, microAnalyticsLink);
		log("Scroll to Micro Analytics link under Playground Page.");
		Common.jsClick(driver, microAnalyticsLink);
		log("Click on Micro Analytics link under Playground Page successfully.");
		Common.waitForTitleToChange(driver, 10);
		Common.switchToDefaultContent(driver);
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the Micro Analytics example URL under Playground Page.
	 */
	public void verifyMicroAnalyticsLinkUrlUnderPlaygroundPage() {
		Assert.assertEquals("Micro Analytics Link URL Not Matched!!", driver.getCurrentUrl(),
				"https://www.sisense.com/developers/playground/?example=use-cases%2Fmicro-analytics");
		log("Micro Analytics example URL under Playground Page matched successfully.");
	}

	/** “queries and data visualizations” link under Playground iframe */
	@FindBy(xpath = "//a[normalize-space()='queries and data visualizations']")
	private WebElement queriesAndDataVisualizationsLink;

	/**
	 * Clicks on the queries and data visualizations link under Playground Page.
	 */
	public void clickOnQueriesAndDataVisualizationsLinkUnderPlaygroundPage() {
		Common.waitForElementToBeVisible(driver, queriesAndDataVisualizationsLink);
		Common.scrollUpToElement(driver, queriesAndDataVisualizationsLink);
		log("Scroll to queries and data visualizations link under Playground Page.");
		Common.jsClick(driver, queriesAndDataVisualizationsLink);
		log("Click on queries and data visualizations link under Playground Page.");
		Common.waitForTitleToChange(driver, 10);
		Common.switchToDefaultContent(driver);
		Common.waitForPageToLoad(driver, 10);

	}

	@FindBy(xpath = "//h5[text()='Execute Query API']")
	private WebElement execute_Query_API_Heading;

	/**
	 * Verifies queries and data visualizations link under Playground Page.
	 */
	public void verifyQueriesAndDataVisualizationsLinkUnderPlaygroundPage() {
		try {
			Common.waitForElementToBeVisible(driver, execute_Query_API_Heading);
		} catch (Exception e) {
			Assert.fail("Page title not matched");

		}

		Assert.assertEquals("queries and data visualizations example heading URL Not Matched!!",
				execute_Query_API_Heading.getText(), "Execute Query API");
		log("queries and data visualizations example heading under Playground Page matched successfully.");
	}

	/** “embed existing dashboards” link under Playground iframe */
	@FindBy(xpath = "//a[normalize-space()='embed existing dashboards']")
	private WebElement embedExistingDashboardsLink;

	/**
	 * Clicks on the embed existing dashboards link under Playground Page.
	 */
	public void clickOnEmbedExistingDashboardsLinkUnderPlaygroundPage() {
		Common.waitForElementToBeVisible(driver, embedExistingDashboardsLink);
		Common.scrollUpToElement(driver, embedExistingDashboardsLink);
		log("Scroll to embed existing dashboards link under Playground Page.");
		Common.jsClick(driver, embedExistingDashboardsLink);
		log("Click on embed existing dashboards link under Playground Page.");
		Common.waitForTitleToChange(driver, 10);
		Common.switchToDefaultContent(driver);
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the URL of the "embed existing dashboards" link under Playground
	 * Page.
	 */

	@FindBy(xpath = "//h5[normalize-space()='Embed Dashboard (DashboardById)']")
	private WebElement embedExistingDashboardsHeadingText;

	public void verifyEmbedExistingDashboardsLinkUnderPlaygroundPage() {
		Common.checkTitleNull(driver);
		Common.waitForPageToLoad(driver, 10);
		Common.waitForPageToLoad(driver, 10);
		Assert.assertEquals("embed existing dashboards example link URL did not match!",
				embedExistingDashboardsHeadingText.getText(), "Embed Dashboard (DashboardById)");
		log("embed existing dashboards example link URL under Playground Page matched successfully.");
	}

	/** “collaborative approach” link under Playground iframe */
	@FindBy(xpath = "//a[normalize-space()='collaborative approach']")
	private WebElement collaborativeApproachLink;

	/**
	 * Clicks on the collaborative approach link under Playground Page.
	 */
	public void clickOnCollaborativeApproachLinkUnderPlaygroundPage() {
		Common.waitForElementToBeVisible(driver, collaborativeApproachLink);
		Common.scrollUpToElement(driver, collaborativeApproachLink);
		log("Scroll to collaborative approach link under Playground Page.");
		Common.jsClick(driver, collaborativeApproachLink);
		log("Click on collaborative approach link under Playground Page.");
		Common.waitForTitleToChange(driver, 10);
		Common.switchToDefaultContent(driver);
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the URL of the "collaborative approach" link under Playground Page.
	 */

	@FindBy(xpath = "//h5[normalize-space()='Dashboard Model API: Modify Widgets']")
	private WebElement collaborativeApproachHeadingText;

	public void verifyCollaborativeApproachLinkUnderPlaygroundPage() {
		Common.checkTitleNull(driver);
		Common.waitForPageToLoad(driver, 10);
		Common.waitForPageToLoad(driver, 10);
		Assert.assertEquals("collaborative approach example link URL did not match!",
				collaborativeApproachHeadingText.getText(), "Dashboard Model API: Modify Widgets");
		log("collaborative approach example link URL under Playground Page matched successfully.");
	}

	/** “developer forum” link under Playground iframe */
	@FindBy(xpath = "//a[normalize-space()='developer forum']")
	private WebElement developerForumLink;

	/**
	 * Clicks on the developer forum link under Playground Page.
	 */
	public void clickOnDeveloperForumLinkUnderPlaygroundPage() {
		Common.waitForElementToBeVisible(driver, developerForumLink);
		Common.scrollUpToElement(driver, developerForumLink);
		log("Scroll to developer forum link under Playground Page.");
		Common.jsClick(driver, developerForumLink);
		log("Click on developer forum link under Playground Page.");
		Common.switchToDefaultContent(driver);
		Common.switchToAnotherWindow(driver, 10);
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies "developer forum" link under Playground Page.
	 */
	public void verifyDeveloperForumLinkUnderPlaygroundPage() {
		Assert.assertEquals("Developer forum page not match!!", driver.getTitle(),
				FrameworkConstants.SIGN_IN_COMMUNITY_PLAYPAGE);
		log("Developer forum page matched successfully.");
	}

}
