package com.sisense.solutions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.kfast.constants.FrameworkConstants;
import com.kfast.init.AbstractPage;
import com.kfast.init.Common;

public class TechnologyPage extends AbstractPage {

	public TechnologyPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	// ========== Technology Menu Under Solutions Tab ==========
	@FindBy(xpath = "//a[normalize-space()='Technology']")
	private WebElement technologyMenuUnderSolutionsTab;

	public void clickOnTechnologyMenuUnderSolutionsTab() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, technologyMenuUnderSolutionsTab);
		Common.jsClick(driver,technologyMenuUnderSolutionsTab);
		log("Click on Technology Menu under Solutions tab successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	public void verifyTechnologyPageTitle() {
		Common.checkTitleNull(driver);
		Assert.assertEquals("Sisense Technology Page Title Not Matched", driver.getTitle(),
				FrameworkConstants.TECHNOLOGY_TITLE);
		log("Sisense Technology Page Title matched successfully.");
	}

	// ========== Read Customer Stories Button Under Banner Section ==========
	@FindBy(xpath = "//a[text()='Read customer stories']")
	private WebElement readCustomerStoriesButtonUnderBannerSection;

	public void clickOnReadCustomerStoriesButtonUnderBannerSection() {
		log("Button text: " + readCustomerStoriesButtonUnderBannerSection.getText());
		if (readCustomerStoriesButtonUnderBannerSection.getText().equals("")) {
			log("Read Customer Stories button text is empty.");
		} else {
			Common.jsClick(driver, readCustomerStoriesButtonUnderBannerSection);
			log("Click on Read Customer Stories button under Banner section successfully.");
			Common.waitForPageToLoad(driver, 10);
		}
	}

	public void verifyReadCustomerStoriesPageTitle() {
		Assert.assertEquals("Sisense Read Customer Stories Page Title Not Matched", driver.getTitle(),
				FrameworkConstants.TECHNOLOGY_TITLE);
		log("Sisense Read Customer Stories Page Title matched successfully.");
	}

	// ========== Learn More Button Under Delight Your Customers Section ==========
	@FindBy(xpath = "//h2[contains(text(),'A new way to delight your customers, accelerate')]//following-sibling::div//child::a[text()='Learn more']")
	private WebElement learnMoreButtonUnderDelightYourCustomersSection;

	@FindBy(xpath = "//h2[contains(text(),'A new way to delight your customers, accelerate revenue, and drive competitive advantage')]")
	private WebElement delightYourCustomersSection;

	public void clickOnLearnMoreButtonUnderDelightYourCustomersSection() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, delightYourCustomersSection);
		Common.scrollUpToElement(driver, delightYourCustomersSection);
		log("Scroll to Delight Your Customers section successfully.");

		Common.waitForElementToBeVisible(driver, learnMoreButtonUnderDelightYourCustomersSection);
		Common.jsClick(driver,learnMoreButtonUnderDelightYourCustomersSection);
		log("Click on Learn More button under Delight Your Customers section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	public void verifyLearnMorePageTitle() {
		Assert.assertEquals("Sisense Learn More Title Not Matched", driver.getTitle(),
				FrameworkConstants.EMBEDDABLEPAGE_TITLE);
		log("Sisense Learn More Page Title matched successfully.");
	}

	// ========== Schedule a Demo Button Under Engage Your End-Users Section
	// ==========
	@FindBy(xpath = "//h2[contains(text(),'Engage your end-users with the best analytics experience')]")
	private WebElement engageYourEndUsersSection;

	@FindBy(xpath = "//a[text()='Schedule a demo']")
	private WebElement scheduleADemoButtonUnderEngageYourEndUsersSection;

	public void clickOnScheduleADemoButtonUnderEngageYourEndUsersSection() throws InterruptedException {
		Common.scrollUpToBottom(driver);
		Common.checkIfElementIsDisplayedwithWait(driver, engageYourEndUsersSection, 30);
		Common.scrollUpToElement(driver, engageYourEndUsersSection);
		log("Scroll to Engage Your End-Users section successfully.");

		Common.waitForElementToBeVisible(driver, scheduleADemoButtonUnderEngageYourEndUsersSection);
		Common.jsClick(driver,scheduleADemoButtonUnderEngageYourEndUsersSection);
		log("Click on Schedule a Demo button under Engage Your End-Users section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	public void scrollToEngageYourEndUsersSection() throws InterruptedException {
		Common.scrollUpToBottom(driver);
		Common.waitForPageToLoad(driver, 10);
		Common.waitForElementToBeVisible(driver, engageYourEndUsersSection);
		Common.scrollToVertical(driver, engageYourEndUsersSection);
		Common.scrollUpToElement(driver, engageYourEndUsersSection);
		log("Scroll to Engage Your End-Users section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	// ========== Composable Development Link Under Engage Your End-Users Section
	// ==========
	@FindBy(xpath = "//a[normalize-space()='composable development']")
	private WebElement composableDevelopmentLinkUnderEngageYourEndUsersSection;

	public void clickOnComposableDevelopmentLinkUnderEngageYourEndUsersSection() throws InterruptedException {

		Common.waitForElementToBeVisible(driver, engageYourEndUsersSection);
		Common.scrollToVertical(driver, engageYourEndUsersSection);
		Common.scrollUpToElement(driver, engageYourEndUsersSection);
		try {
			Common.waitForElementToBeVisible(driver, composableDevelopmentLinkUnderEngageYourEndUsersSection);
			Common.jsClick(driver,composableDevelopmentLinkUnderEngageYourEndUsersSection);
		} catch (Exception e) {
			Common.waitForElementToBeVisible(driver, engageYourEndUsersSection);
			Common.scrollToVertical(driver, engageYourEndUsersSection);
			Common.scrollUpToElement(driver, engageYourEndUsersSection);
			log("Scroll to Engage Your End-Users section due to fallback.");
			Common.waitForElementToBeVisible(driver, composableDevelopmentLinkUnderEngageYourEndUsersSection);
			Common.scrollUpToElement(driver, composableDevelopmentLinkUnderEngageYourEndUsersSection);
			Common.jsClick(driver,composableDevelopmentLinkUnderEngageYourEndUsersSection);
		}
		log("Click on Composable Development link under Engage Your End-Users section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	public void verifyScheduleADemoPageTitle() {
		Assert.assertEquals("Sisense Schedule a Demo Title Not Matched", driver.getTitle(),
				FrameworkConstants.DEMOPAGE_TITLE);
		log("Sisense Schedule a Demo Page Title matched successfully.");
	}
}
