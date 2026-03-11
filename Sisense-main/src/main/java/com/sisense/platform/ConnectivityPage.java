package com.sisense.platform;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.kfast.constants.FrameworkConstants;
import com.kfast.init.AbstractPage;
import com.kfast.init.Common;

public class ConnectivityPage extends AbstractPage {

	public ConnectivityPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	// Connectivity Menu under Platform tab
	@FindBy(xpath = "//a[normalize-space()='Connectivity']")
	private WebElement connectivityMenuUnderPlatformTab;

	public void clickOnConnectivityMenuUnderPlatformTab() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, connectivityMenuUnderPlatformTab);
		Common.jsClick(driver,connectivityMenuUnderPlatformTab);
		log("Click on 'Connectivity' menu under Platform tab");
		Common.waitForPageToLoad(driver, 10);
	}

	public void verifyConnectivityPageTitleUnderPlatformTab() {
		Assert.assertEquals("Sisense Connectivity Page title did not match", driver.getTitle(),
				FrameworkConstants.CONNECTIVITYPAGE_TITLE);
		log("Sisense Connectivity Page title matched successfully");
	}

	// Book a demo button under 'Connect your data' section
	@FindBy(xpath = "//a[@class='btn wow fadeIn'][normalize-space()='Book a live demo']")
	private WebElement bookADemoButtonUnderConnectYourDataSection;

	@FindBy(xpath = "//h1[text()='Connect your data']")
	private WebElement connectYourDataSection;

	public void clickOnBookADemoButtonUnderConnectYourDataSection() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, connectYourDataSection);
		Common.scrollUpToElement(driver, connectYourDataSection);
		log("Scroll to 'Connect your data' section");
		Common.jsClick(driver,bookADemoButtonUnderConnectYourDataSection);
		log("Click on 'Book a demo' button under 'Connect your data' section");
		Common.waitForPageToLoad(driver, 10);
	}

	// 'Learn about live connections' button under 'Real-time insights' section
	@FindBy(xpath = "//a[text()='Learn about live connections']")
	private WebElement learnAboutLiveConnectionsButtonUnderRealTimeInsightsSection;

	@FindBy(xpath = "//h2[contains(text(), 'Real-time insights with live connection')]")
	private WebElement realTimeInsightsWithLiveConnectionSection;

	public void clickOnLearnAboutLiveConnectionsButtonUnderRealTimeInsightsSection() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, realTimeInsightsWithLiveConnectionSection);
		Common.scrollUpToElement(driver, realTimeInsightsWithLiveConnectionSection);
		log("Scroll to 'Real-time insights with live connection' section");
		Common.jsClick(driver,learnAboutLiveConnectionsButtonUnderRealTimeInsightsSection);
		log("Click on 'Learn about live connections' button");
		Common.waitForPageToLoad(driver, 10);
	}

	public void verifyIntroducingLiveModelsPageTitleUnderRealTimeInsightsSection() {
		Assert.assertEquals("Live Models Page title did not match", driver.getTitle(), "Introducing Live Models");
		log("Live Models Page title matched successfully");
	}

	// 'Learn about Elasticube' button under 'Consolidate data' section
	@FindBy(xpath = "//a[text()='Learn about Elasticube']")
	private WebElement learnAboutElasticubeButtonUnderConsolidateDataSection;

	@FindBy(xpath = "//h2[contains(text(), 'Consolidate data using Elasticube')]")
	private WebElement consolidateDataUsingElasticubeSection;

	public void clickOnLearnAboutElasticubeButtonUnderConsolidateDataSection() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, consolidateDataUsingElasticubeSection);
		Common.scrollUpToElement(driver, consolidateDataUsingElasticubeSection);
		log("Scroll to 'Consolidate data using Elasticube' section");
		Common.jsClick(driver,learnAboutElasticubeButtonUnderConsolidateDataSection);
		log("Click on 'Learn about Elasticube' button");
		Common.waitForPageToLoad(driver, 10);
	}

	public void verifyIntroducingElastiCubesPageTitleUnderConsolidateDataSection() {
		Assert.assertEquals("Elasticube Page title did not match", driver.getTitle(), "Introducing ElastiCubes");
		log("Elasticube Page title matched successfully");
	}
}
