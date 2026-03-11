package com.sisense.solutions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.kfast.constants.FrameworkConstants;
import com.kfast.init.AbstractPage;
import com.kfast.init.Common;

public class FinancialservicesPage extends AbstractPage {

	public FinancialservicesPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	// Financial Services Menu under Solutions tab
	@FindBy(xpath = "//a[text()='Financial services']")
	private WebElement financialServicesMenu;

	public void clickOnFinancialServicesMenuUnderSolutionsTab() {
		Common.waitForElementToBeVisible(driver, financialServicesMenu);
		Common.jsClick(driver,financialServicesMenu);
		log("Click on Financial Services Menu under Solutions Tab successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	public void verifyFinancialServicesPageTitle() {
		Assert.assertEquals("Sisense Financial Services Page Title Not Matched", driver.getTitle(),
				FrameworkConstants.FINANCIAL_SERVICES_TITLE);
		log("Sisense Financial Services Page Title Matched!");
	}

	// Read Customer Stories Button
	@FindBy(xpath = "//a[text()='Read customer stories']")
	private WebElement readCustomerStoriesButton;

	public void clickOnReadCustomerStoriesButtonUnderBannerSection() {
		Common.jsClick(driver, readCustomerStoriesButton);
		log("Click on Read Customer Stories Button under Header Section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	public void verifyReadCustomerStoriesPageTitle() {
		Assert.assertEquals("Sisense Read Customer Stories Page Title Not Matched", driver.getTitle(),
				FrameworkConstants.FINANCIAL_SERVICES_TITLE);
		log("Sisense Read Customer Stories Page Title Matched!");
	}

	// Learn More Button under Revolutionize financial analytics Section
	@FindBy(xpath = "//a[text()='Learn more']")
	private WebElement learnMoreButton;

	// Revolutionize Financial Analytics with Revolutionize financial analytics
	@FindBy(xpath = "//h2[contains(text(),'Revolutionize financial analytics with AI-driven insights')]")
	private WebElement revolutionizeFinancialAnalyticsSection;

	public void clickOnLearnMoreButtonUnderRevolutionizeFinancialAnalyticsSection() {
		Common.waitForElementToBeVisible(driver, revolutionizeFinancialAnalyticsSection);
		Common.scrollUpToElement(driver, revolutionizeFinancialAnalyticsSection);
		log("Scroll to Revolutionize financial analytics Section successfully.");
		Common.waitForElementToBeVisible(driver, learnMoreButton);
		Common.jsClick(driver,learnMoreButton);
		log("Click on Learn More Button under Revolutionize financial analytics Section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	public void verifyLearnMorePageTitle() {
		Assert.assertEquals("Sisense Learn More Title Not Matched", driver.getTitle(),
				FrameworkConstants.COMPOSABLEPAGE_TITLE);
		log("Sisense Learn More Page Title under AI-Driven Insights Section Matched!");
	}

	// Schedule a Demo Button under Reduce financial services fraud Section
	@FindBy(xpath = "//a[text()='Schedule a demo']")
	private WebElement scheduleADemoButton;

	// Reduce Financial Services Fraud Section
	@FindBy(xpath = "//h2[contains(text(),'Reduce financial services fraud')]")
	private WebElement reduceFinancialSection;

	public void clickOnScheduleADemoButtonUnderReduceFinancialSection() {
		Common.checkIfElementIsDisplayedwithWait(driver, reduceFinancialSection, 30);
		Common.scrollUpToElement(driver, reduceFinancialSection);
		log("Scroll to Reduce Financial Services Fraud Section successfully.");
		try {
			Common.waitForElementToBeVisible(driver, scheduleADemoButton);
			Common.jsClick(driver,scheduleADemoButton);
			log("Click on Schedule a Demo Button under Reduce financial services fraud successfully.");
		} catch (Exception e) {
			Common.checkIfElementIsDisplayedwithWait(driver, reduceFinancialSection, 30);
			Common.scrollUpToElement(driver, reduceFinancialSection);
			Common.waitForElementToBeVisible(driver, scheduleADemoButton);
			Common.jsClick(driver,scheduleADemoButton);
			log("Click on Schedule a Demo Button under Reduce financial services fraud successfully.");
		}
		Common.waitForPageToLoad(driver, 10);
	}

	public void verifyScheduleADemoPageTitle() {
		Assert.assertEquals("Sisense Schedule a Demo Title Not Matched", driver.getTitle(),
				FrameworkConstants.DEMOPAGE_TITLE);
		log("Sisense Schedule a Demo Page Title under Reduce financial services Fraud Section Matched!");
	}

	// Book a Demo Button under Book a Demo Section
	@FindBy(xpath = "//a[text()='Book a demo' and @class='btn blue_btn']")
	private WebElement bookADemoButton;

	// Book a Demo Section
	@FindBy(xpath = "//h2[contains(text(),'Book a demo')]")
	private WebElement bookADemoSection;

	public void clickOnBookADemoButtonUnderBookADemoSection() {
		Common.scrollUpToBottom(driver);
		Common.checkIfElementIsDisplayedwithWait(driver, bookADemoSection, 30);
		Common.scrollUpToElement(driver, bookADemoSection);
		try {
			Common.waitForElementToBeClickable(driver, bookADemoSection);
		} catch (Exception e) {
			Common.checkIfElementIsDisplayedwithWait(driver, bookADemoSection, 30);
			Common.scrollUpToElement(driver, bookADemoSection);
		}
		log("Scroll to Book a Demo Section successfully.");
		Common.waitForElementToBeVisible(driver, bookADemoButton);
		Common.jsClick(driver,bookADemoButton);
		log("Click on Book a Demo Button under Book a Demo Section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	public void verifyBookADemoPageTitleUnderBookADemoSection() {
		Assert.assertEquals("Sisense Book a Demo Title Not Matched", driver.getTitle(),
				"Request a Demo - See Sisense Transform Your Data Analytics");
		log("Sisense Book a Demo Page Title under Book a Demo Section Matched!");
	}
}
