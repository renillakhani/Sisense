package com.sisense.platform;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.kfast.init.AbstractPage;
import com.kfast.init.Common;

public class PlatformPage extends AbstractPage {

	public PlatformPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	// Banner Section
	@FindBy(xpath = "//h1[normalize-space()='The leading analytics platform']")
	private WebElement bannerSection;

	public void scrollToBannerSection() {
		Common.waitForElementToBeVisible(driver, bannerSection);
		Common.scrollUpToElement(driver, bannerSection);
		log("Scroll to Banner Section");
	}

	// Book a demo button under ' Banner ' section
	@FindBy(xpath = "//a[contains(text(), 'Book a demo')]")
	private WebElement bookADemoButtonUnderBannerSection;

	public void clickOnBookADemoButtonUnderBannerSection() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, bookADemoButtonUnderBannerSection);
		Common.jsClick(driver, bookADemoButtonUnderBannerSection);
		log("Click on 'Book a demo' button under 'Banner' section");
		Common.waitForPageToLoad(driver, 10);
	}
	
	 // AI Services Throughout Section ----> changed to AI throughout
	@FindBy(xpath = "//h2[contains(text(), 'AI throughout')]")
	private WebElement aiThroughoutSection;

	public void scrollToAIThroughoutSection() {
		Common.waitForElementToBeVisible(driver, aiThroughoutSection);
		Common.scrollUpToElement(driver, aiThroughoutSection);
		log("Scroll to AI throughout Section");
	}

	// Learn More Button Under AI Services Throughout Section ----> changed to AI throughout
	@FindBy(xpath = "//h2[contains(text(), 'AI throughout')]//following-sibling::div//a[text()='Learn more']")
	private WebElement learnMoreButtonUnderAIThroughoutSection;

	public void clickLearnMoreButtonUnderAIThroughoutSection() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, learnMoreButtonUnderAIThroughoutSection);
		Common.jsClick(driver, learnMoreButtonUnderAIThroughoutSection);
		log("Click Learn More Button Under AI throughout Section");
		Common.waitForPageToLoad(driver, 10);
	}
	
	// Data Modeling and Connectivity Section---> changed to Data modeling
	@FindBy(xpath = "//h2[contains(text(), 'Data modeling')]")
	private WebElement dataModelingSection;

	public void scrollToDataModelingSection() {
		Common.waitForElementToBeVisible(driver, dataModelingSection);
		Common.scrollUpToElement(driver, dataModelingSection);
		log("Scroll to Data modeling Section");
	}

	// Learn More Button Under Data Modeling and Connectivity Section----> changed to Data modeling
	@FindBy(xpath = "//h2[contains(text(), 'Data modeling')]//following-sibling::div//a[text()='Learn more']")
	private WebElement learnMoreButtonUnderDataModelingSection;

	public void clickLearnMoreButtonUnderDataModelingSection() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, learnMoreButtonUnderDataModelingSection);
		Common.jsClick(driver, learnMoreButtonUnderDataModelingSection);
		log("Click Learn More Button Under Data modeling Section");
		Common.waitForPageToLoad(driver, 10);
	}
		
	
	// Data Connectivity Section
	@FindBy(xpath = "//h2[contains(text(), 'Data connectivity')]")
	private WebElement dataConnectivitySection;

	public void scrollToDataConnectivitySection() {
		Common.waitForElementToBeVisible(driver, dataConnectivitySection);
		Common.scrollUpToElement(driver, dataConnectivitySection);
		log("Scroll to Data Connectivity Section");
	}

	// Learn More Button Under Data Connectivity Section
	@FindBy(xpath = "//h2[contains(text(), 'Data connectivity')]//following-sibling::div//a[text()='Learn more']")
	private WebElement learnMoreButtonUnderDataConnectivitySection;

	public void clickLearnMoreButtonUnderDataConnectivitySection() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, learnMoreButtonUnderDataConnectivitySection);
		Common.jsClick(driver, learnMoreButtonUnderDataConnectivitySection);
		log("Click Learn More Button Under Data Connectivity Section");
		Common.waitForPageToLoad(driver, 10);
	}

	// Embedding Section
	@FindBy(xpath = "//h2[contains(text(), 'Embedding')]")
	private WebElement embeddingSection;

	public void scrollToEmbeddingSection() {
		Common.waitForElementToBeVisible(driver, embeddingSection);
		Common.scrollUpToElement(driver, embeddingSection);
		log("Scroll to Embedding Section");
	}

	// Learn More Button Under Embedding Section
	@FindBy(xpath = "//h2[contains(text(), 'Embedding')]//following-sibling::div//a[text()='Learn more']")
	private WebElement learnMoreButtonUnderEmbeddingSection;

	public void clickLearnMoreButtonUnderEmbeddingSection() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, learnMoreButtonUnderEmbeddingSection);
		Common.jsClick(driver, learnMoreButtonUnderEmbeddingSection);
		log("Click Learn More Button Under Embedding Section");
		Common.waitForPageToLoad(driver, 10);
	}

	// Composability Section
	@FindBy(xpath = "//h2[contains(text(), 'Composability')]")
	private WebElement composabilitySection;

	public void scrollToComposabilitySection() {
		Common.waitForElementToBeVisible(driver, composabilitySection);
		Common.scrollUpToElement(driver, composabilitySection);
		log("Scroll to Composability Section");
	}

	// Learn More Button Under Composability Section
	@FindBy(xpath = "//h2[contains(text(), 'Composability')]//following-sibling::div//a[text()='Learn more']")
	private WebElement learnMoreButtonUnderComposabilitySection;

	public void clickLearnMoreButtonUnderComposabilitySection() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, learnMoreButtonUnderComposabilitySection);
		Common.jsClick(driver, learnMoreButtonUnderComposabilitySection);
		log("Click Learn More Button Under Composability Section");
		Common.waitForPageToLoad(driver, 10);
	}

	// Secure and Scalable Section
	@FindBy(xpath = "//h2[contains(text(), 'Secure and scalable')]")
	private WebElement secureScalableSection;

	public void scrollToSecureScalableSection() {
		Common.waitForElementToBeVisible(driver, secureScalableSection);
		Common.scrollUpToElement(driver, secureScalableSection);
		log("Scroll to Secure and Scalable Section");
	}

	// Learn More Button Under Secure and Scalable Section
	@FindBy(xpath = "//h2[contains(text(),'Secure and scalable')]//following-sibling::div//a[text()='Learn more']")
	private WebElement learnMoreButtonUnderSecureScalableSection;

	public void clickLearnMoreButtonUnderSecureScalableSection() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, learnMoreButtonUnderSecureScalableSection);
		Common.jsClick(driver, learnMoreButtonUnderSecureScalableSection);
		log("Click Learn More Button Under Secure and Scalable Section");
		Common.waitForPageToLoad(driver, 10);
	}

	// Cloud Deployment Section
	@FindBy(xpath = "//h2[contains(text(), 'Cloud deployment')]")
	private WebElement cloudDeploymentSection;

	public void scrollToCloudDeploymentSection() {
		Common.waitForElementToBeVisible(driver, cloudDeploymentSection);
		Common.scrollUpToElement(driver, cloudDeploymentSection);
		log("Scroll to Cloud Deployment Section");
	}

	// Learn More Button Under Cloud Deployment Section
	@FindBy(xpath = "//h2[contains(text(),'Cloud deployment')]//following-sibling::div//a[text()='Learn more']")
	private WebElement learnMoreButtonUnderCloudDeploymentSection;

	public void clickLearnMoreButtonUnderCloudDeploymentSection() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, learnMoreButtonUnderCloudDeploymentSection);
		Common.jsClick(driver, learnMoreButtonUnderCloudDeploymentSection);
		log("Click Learn More Button Under Cloud Deployment Section");
		Common.waitForPageToLoad(driver, 10);
	}

	// Book a Live Demo Section
	@FindBy(xpath = "//p[contains(text(),'See what modern analytics look like with a custom ')]")
	private WebElement bookLiveDemoSection;

	public void scrollToBookLiveDemoSection() throws InterruptedException {
		Common.scrollUpToBottom(driver);
		Common.waitForElementToBeVisible(driver, cloudDeploymentSection);
		Common.scrollUpToElement(driver, cloudDeploymentSection);
		Common.waitForElementToBeVisible(driver, learnMoreButtonUnderCloudDeploymentSection);
		Common.scrollUpToElement(driver, learnMoreButtonUnderCloudDeploymentSection);
		Common.waitForElementToBeVisible(driver, bookLiveDemoSection);
		Common.scrollUpToElement(driver, bookLiveDemoSection);
		log("Scroll to Book a Live Demo Section");
		Common.waitForElementToBeVisible(driver, scheduleNowButton);
		Common.scrollUpToElement(driver, scheduleNowButton);
	}

	// Schedule Now Button Under Book a Live Demo Section
	@FindBy(xpath = "//p[contains(text(),'See what modern analytics')]//following::a[text()='Schedule now']")
	private WebElement scheduleNowButton;

	public void clickScheduleNowButtonUnderBookLiveDemoSection() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, scheduleNowButton);
		try {
			Common.jsClick(driver, scheduleNowButton);
			log("Click Schedule Now Button Under Book a Live Demo Section");
		} catch (Exception e) {
			Common.waitForElementToBeVisible(driver, bookLiveDemoSection);
			Common.scrollUpToElement(driver, bookLiveDemoSection);
			log("Scroll to Book a Live Demo Section");
			Common.waitForElementToBeVisible(driver, scheduleNowButton);
			Common.scrollUpToElement(driver, scheduleNowButton);
			Common.jsClick(driver, scheduleNowButton);
			log("Click Schedule Now Button Under Book a Live Demo Section");
		}
		Common.waitForPageToLoad(driver, 10);
	}
	
}
