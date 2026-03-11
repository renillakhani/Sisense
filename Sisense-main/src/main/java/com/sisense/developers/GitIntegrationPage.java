package com.sisense.developers;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.kfast.constants.FrameworkConstants;
import com.kfast.init.AbstractPage;
import com.kfast.init.Common;

public class GitIntegrationPage extends AbstractPage {

	public GitIntegrationPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	/** Git Integration menu under Developers tab */
	@FindBy(xpath = "//a[normalize-space()='Git integration']")
	private WebElement gitIntegrationMenu;

	/**
	 * Clicks on the Git Integration menu under Developers tab.
	 */
	public void clickOnGitIntegrationMenuUnderDevelopersTab() {
		Common.waitForElementToBeVisible(driver, gitIntegrationMenu);
		Common.jsClick(driver, gitIntegrationMenu);
		log("Click on Git Integration menu under Developers tab successfully.");
		Common.waitForPageToLoad(driver, 20);
	}

	// "Book a live demo" button in footer
	@FindBy(xpath = "//h1[text()='Git Integration']//following-sibling::div//child::a[text()='Book a live demo']")
	private WebElement bookALiveDemoButtonSection;

	/**
	 * Clicks on the "Book a live demo" button in the Banner.
	 */
	public void clickOnBookaLiveDemoButtonUnderBannerSection() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, bookALiveDemoButtonSection);
		Common.jsClick(driver, bookALiveDemoButtonSection);
		log("Click on 'Book a live demo' button Under Banner Section");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the Git Integration page title under Developers tab.
	 */
	public void verifyGitIntegrationPageTitleUnderDevelopersTab() {
		Common.waitForPageToLoad(driver, 10);
		log("Title is: " + driver.getTitle());
		Assert.assertEquals("Git Integration Page Title Not Matched!!", driver.getTitle(),
				FrameworkConstants.GIT_INTEGRATION_TITLE);
		log("Git Integration page title under Developers tab matched successfully.");
	}

	/** “Seamless source control” link under Git Integration section */
	@FindBy(xpath = "//a[normalize-space()='Seamless source control']")
	private WebElement seamlessSourceControlLink;

	/**
	 * Clicks on the Seamless source control link under Git Integration section.
	 */
	public void clickOnSeamlessSourceControlLinkUnderGitIntegrationPage() {
		Common.waitForElementToBeVisible(driver, seamlessSourceControlLink);
		Common.scrollUpToElement(driver, seamlessSourceControlLink);
		Common.waitForElementToBeClickable(driver, seamlessSourceControlLink);
		Common.jsClick(driver, seamlessSourceControlLink);
		log("Click on Seamless source control link under Git Integration section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the Seamless source control page title under Git Integration
	 * section.
	 */
	public void verifySeamlessSourceControlPageTitleUnderGitIntegrationPage() {
		Common.waitForPageToLoad(driver, 10);
		log("Title is: " + driver.getTitle());
		Assert.assertEquals("Seamless Source Control Page Title Not Matched!!", driver.getTitle(),
				FrameworkConstants.GIT_INTEGRATION_TITLE);
		log("Seamless source control page title under Git Integration section matched successfully.");
	}

	/** “Version controlled analytics” link under Git Integration section */
	@FindBy(xpath = "//a[normalize-space()='Version controlled analytics']")
	private WebElement versionControlledAnalyticsLink;

	/**
	 * Clicks on the Version controlled analytics link under Git Integration
	 * section.
	 */
	public void clickOnVersionControlledAnalyticsLinkUnderGitIntegrationPage() {
		Common.waitForElementToBeVisible(driver, versionControlledAnalyticsLink);
		Common.scrollUpToElement(driver, versionControlledAnalyticsLink);
		Common.waitForElementToBeClickable(driver, versionControlledAnalyticsLink);
		Common.waitForPageToLoad(driver, 10);
		Common.waitForPageToLoad(driver, 10);
		Common.jsClick(driver, versionControlledAnalyticsLink);

		Common.actionsClick(driver, versionControlledAnalyticsLink);
		Common.click(versionControlledAnalyticsLink);
		// Common.jsClick(driver, versionControlledAnalyticsLink);
		log("Click on Version controlled analytics link under Git Integration section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the Version controlled analytics page title under Git Integration
	 * section.
	 */
	public void verifyVersionControlledAnalyticsPageTitleUnderGitIntegrationPage() {
		Common.waitForPageToLoad(driver, 10);
		log("Title is: " + driver.getTitle());
		Assert.assertEquals("Version Controlled Analytics Page Title Not Matched!!", driver.getTitle(),
				FrameworkConstants.GIT_INTEGRATION_TITLE);
		log("Version controlled analytics page title under Git Integration section matched successfully.");
	}

	/** “Watch now” button under Git Integration section */
	@FindBy(xpath = "//a[normalize-space()='Watch now']")
	private WebElement watchNowButton;

	/**
	 * Clicks on the Watch now button under Git Integration section.
	 */
	public void clickOnWatchNowButtonUnderVersionControlledAnalyticsSection() {
		Common.waitForElementToBeVisible(driver, watchNowButton);
		Common.scrollUpToElement(driver, watchNowButton);
		Common.jsClick(driver, watchNowButton);
		log("Click on Watch now button under Version controlled analytics section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the Watch now page title under Git Integration section.
	 */
	public void verifyWatchNowPageTitleUnderVersionControlledAnalyticsSection() {
		Common.waitForPageToLoad(driver, 10);
		log("Title is: " + driver.getTitle());
		Assert.assertEquals("Watch Now Page Title Not Matched!!", driver.getTitle(),
				FrameworkConstants.GIT_INTEGRATION_TITLE);
		log("Watch now page title under Git Integration section matched successfully.");
	}

	/** “Fluid CI/CD Processes” link under Git Integration section */
	@FindBy(xpath = "//a[normalize-space()='Fluid CI/CD Processes']")
	private WebElement fluidCICDProcessesLink;

	/**
	 * Clicks on the Fluid CI/CD Processes link under Git Integration section.
	 */
	public void clickOnFluidCICDProcessesLinkUnderGitIntegrationSection() {
		Common.waitForElementToBeVisible(driver, fluidCICDProcessesLink);
		Common.scrollUpToElement(driver, fluidCICDProcessesLink);
		Common.waitForPageToLoad(driver, 10);
		Common.waitForPageToLoad(driver, 10);
		Common.waitForElementToBeClickable(driver, fluidCICDProcessesLink);
		Common.jsClick(driver, fluidCICDProcessesLink);

		Common.actionsClick(driver, fluidCICDProcessesLink);
		Common.click(fluidCICDProcessesLink);
		log("Click on Fluid CI/CD Processes link under Git Integration section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the Fluid CI/CD Processes page title under Git Integration section.
	 */
	public void verifyFluidCICDProcessesPageTitleUnderGitIntegrationSection() {
		Common.waitForPageToLoad(driver, 10);
		log("Title is: " + driver.getTitle());
		Assert.assertEquals("Fluid CI/CD Processes Page Title Not Matched!!", driver.getTitle(),
				FrameworkConstants.GIT_INTEGRATION_TITLE);
		log("Fluid CI/CD Processes page title under Git Integration section matched successfully.");
	}

	/** “Learn more” button under Git Integration section */
	@FindBy(xpath = "//a[normalize-space()='Learn more']")
	private WebElement learnMoreButton;

	/**
	 * Clicks on the Learn more button under FluidCICDProcesses section.
	 */
	public void clickOnLearnMoreButtonUnderFluidCICDProcessesSection() {
		Common.waitForElementToBeVisible(driver, learnMoreButton);
		Common.scrollUpToElement(driver, learnMoreButton);
		Common.jsClick(driver, learnMoreButton);
		log("Click on Learn more button under FluidCICDProcesses section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the Learn more page title under Git Integration section.
	 */
	public void verifyLearnMorePageTitleUnderGitIntegrationSection() {
		Common.waitForPageToLoad(driver, 10);
		Assert.assertEquals("Learn more Page Title Not Matched!!", driver.getTitle(),
				"Git Integration");
		log("Learn more page title under Git Integration section matched successfully.");
	}

	/** “Get a 30-day free trial” button under Git Integration section */
	@FindBy(xpath = "//a[normalize-space()='Get a 30-day free trial']")
	private WebElement getA30DayFreeTrialButton;

	/** “Build better and faster with Compose SDK” section above trial button */
	@FindBy(xpath = "//h2[normalize-space()='Build better and faster with Compose SDK.']")
	private WebElement buildBetterAndFasterSection;

	/**
	 * Clicks on the Get a 30-day free trial button under Git Integration section.
	 *
	 */
	public void clickOnGetA30DayFreeTrialButtonUnderBuildBetterAndFasterSection() throws InterruptedException {
		commonMethods.scrollToFooter();
		Common.waitForElementToBeVisible(driver, buildBetterAndFasterSection);
		Common.scrollUpToElement(driver, buildBetterAndFasterSection);
		Common.waitForElementToBeVisible(driver, getA30DayFreeTrialButton);
		Common.jsClick(driver, getA30DayFreeTrialButton);
		log("Click on Get a 30-day free trial button under Git Integration section successfully.");
		Common.checkTitleNull(driver);
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the Get a 30‑day free trial page title under Git Integration
	 * section.
	 */
	public void verifyGetA30DayFreeTrialPageTitleUnderGitIntegrationSection() {
		Common.waitForPageToLoad(driver, 10);
		Assert.assertEquals("Get a 30-day free trial Page Title Not Matched!!", driver.getTitle(),
				FrameworkConstants.GETFREE_30DAY_TRAIL_TITLE);
		log("Get a 30-day free trial page title under Git Integration section matched successfully.");
	}
}
