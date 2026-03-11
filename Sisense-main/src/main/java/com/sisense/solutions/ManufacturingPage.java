package com.sisense.solutions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.kfast.constants.FrameworkConstants;
import com.kfast.init.AbstractPage;
import com.kfast.init.Common;

public class ManufacturingPage extends AbstractPage {

	public ManufacturingPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	/** Manufacturing Menu under Solutions tab */
	@FindBy(xpath = "//a[normalize-space()='Manufacturing']")
	private WebElement manufacturingMenu;

	public void clickOnManufacturingMenuUnderSolutionsTab() {
		Common.waitForElementToBeVisible(driver, manufacturingMenu);
		Common.jsClick(driver,manufacturingMenu);
		log("Click on Manufacturing Menu under Solutions tab successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	public void verifyManufacturingPageTitle() {
		Assert.assertEquals("Sisense Manufacturing Page Title Not Matched", driver.getTitle(),
				FrameworkConstants.MANUFACTURING_TITLE);
		log("Sisense Manufacturing Page Title matched successfully.");
	}

	/** Read Customer Stories button under banner section */
	@FindBy(xpath = "//a[text()='Read customer stories']")
	private WebElement readCustomerStoriesButton;

	public void clickOnReadCustomerStoriesButtonUnderBannerSection() {
		log("Read Customer Stories button text: " + readCustomerStoriesButton.getText());
		if (!readCustomerStoriesButton.getText().isEmpty()) {
			Common.jsClick(driver, readCustomerStoriesButton);
			log("Click on Read Customer Stories button under banner section.");
			Common.waitForPageToLoad(driver, 10);
		} else {
			log("Read Customer Stories button text is empty.");
		}
	}

	public void verifyReadCustomerStoriesPageTitle() {
		Assert.assertEquals("Sisense Read Customer Stories Page Title Not Matched", driver.getTitle(),
				FrameworkConstants.MANUFACTURING_TITLE);
		log("Sisense Read Customer Stories Page Title matched successfully.");
	}

	/** Learn More button under API Platform section */
	@FindBy(xpath = "//a[text()='Learn more']")
	private WebElement learnMoreButton;

	/** Section heading: API-first platform */
	@FindBy(xpath = "//h2[contains(text(),'The API-first platform powering the world’s best manufacturing analytics software')]")
	private WebElement apiFirstPlatformSection;

	public void clickOnLearnMoreButtonUnderAPIPlatformSection() {
		Common.waitForElementToBeVisible(driver, apiFirstPlatformSection);
		Common.scrollUpToElement(driver, apiFirstPlatformSection);
		log("Scroll to API-first platform section.");
		Common.waitForElementToBeVisible(driver, learnMoreButton);
		Common.jsClick(driver,learnMoreButton);
		log("Click on Learn More button under API Platform section.");
		Common.waitForPageToLoad(driver, 10);
	}

	public void verifyLearnMorePageTitle() {
		Assert.assertEquals("Sisense Learn More Page Title Not Matched", driver.getTitle(),
				FrameworkConstants.CLOUDPAGE_TITLE);
		log("Sisense Learn More Page Title matched successfully.");
	}

	/** Schedule a Demo button under Production section */
	@FindBy(xpath = "//a[text()='Schedule a demo']")
	private WebElement scheduleADemoButton;

	/** Section heading: Drive production performance */
	@FindBy(xpath = "//h2[contains(text(),'Drive production performance with intuitive manufacturing analytics')]")
	private WebElement driveProductionPerformanceSection;

	public void clickOnScheduleADemoButtonUnderProductionSection() throws InterruptedException {
		Common.scrollUpToBottom(driver);
		Common.checkIfElementIsDisplayedwithWait(driver, driveProductionPerformanceSection, 30);
		Common.scrollToVertical(driver, driveProductionPerformanceSection);
		Common.scrollUpToElement(driver, driveProductionPerformanceSection);
		log("Scroll to Drive production performance section.");
		try {
			Common.scrollToVertical(driver, driveProductionPerformanceSection);
			Common.scrollUpToElement(driver, driveProductionPerformanceSection);
			Common.waitForElementToBeVisible(driver, scheduleADemoButton);
			Common.jsClick(driver,scheduleADemoButton);
			log("Click on Schedule a Demo button under Production section.");
		} catch (Exception e) {
			Common.checkIfElementIsDisplayedwithWait(driver, driveProductionPerformanceSection, 30);
			Common.scrollToVertical(driver, driveProductionPerformanceSection);
			Common.scrollUpToElement(driver, driveProductionPerformanceSection);
			Common.waitForElementToBeVisible(driver, scheduleADemoButton);
			Common.jsClick(driver,scheduleADemoButton);
			log("Click on Schedule a Demo button under Production section.");
		}
		Common.waitForPageToLoad(driver, 10);
	}

	public void verifyScheduleADemoPageTitle() {
		Assert.assertEquals("Sisense Schedule a Demo Page Title Not Matched", driver.getTitle(),
				FrameworkConstants.DEMOPAGE_TITLE);
		log("Sisense Schedule a Demo Page Title matched successfully.");
	}

	/** Book a Free Demo button under Book a Demo section */
	@FindBy(xpath = "//a[text()='Book a free demo']")
	private WebElement bookAFreeDemoButton;

	public void clickOnBookAFreeDemoButtonUnderBookADemoSection() {
		Common.waitForElementToBeVisible(driver, bookAFreeDemoButton);
		Common.jsClick(driver,bookAFreeDemoButton);
		log("Click on Book a Free Demo button under Book a Demo section.");
		Common.waitForPageToLoad(driver, 10);
	}

	/** Section heading: The fastest way to deliver */
	@FindBy(xpath = "//h2[contains(normalize-space(), 'The fastest way to deliver')]")
	private WebElement fastestWayToDeliverSection;

	public void scrollToFastestWayToDeliverSection() {
		Common.scrollUpToBottom(driver);
		Common.waitForPageToLoad(driver, 10);
		Common.waitForElementToBeVisible(driver, fastestWayToDeliverSection);
		Common.scrollUpToElement(driver, fastestWayToDeliverSection);
		log("Scroll to 'The fastest way to deliver' section.");
		Common.waitForPageToLoad(driver, 10);
	}

	/** Composable Development Technology link under Fastest Way section */
	@FindBy(xpath = "//a[normalize-space()='composable development technology']")
	private WebElement composableDevelopmentTechnologyLink;

	public void clickOnComposableDevelopmentTechnologyLinkUnderFastestWayToDeliverSection() {
		try {
			Common.waitForElementToBeVisible(driver, composableDevelopmentTechnologyLink);
			Common.jsClick(driver, composableDevelopmentTechnologyLink);
		} catch (Exception e) {
			Common.waitForElementToBeVisible(driver, fastestWayToDeliverSection);
			Common.scrollUpToElement(driver, fastestWayToDeliverSection);
			log("Scroll to 'The fastest way to deliver' section again due to fallback.");
			Common.waitForElementToBeVisible(driver, composableDevelopmentTechnologyLink);
			Common.scrollUpToElement(driver, composableDevelopmentTechnologyLink);
			Common.jsClick(driver, composableDevelopmentTechnologyLink);
		}
		log("Click on Composable Development Technology link under Fastest Way to Deliver section.");
		Common.waitForPageToLoad(driver, 10);
	}
}
