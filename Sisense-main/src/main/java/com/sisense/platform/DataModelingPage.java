package com.sisense.platform;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.kfast.constants.FrameworkConstants;
import com.kfast.init.AbstractPage;
import com.kfast.init.Common;

public class DataModelingPage extends AbstractPage {

	public DataModelingPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	// Data Modeling Menu under Platform
	@FindBy(xpath = "//a[text()='Data modeling']")
	private WebElement dataModelingMenuUnderPlatformTab;

	/**
	 * Click on the 'Data Modeling' menu under the 'Platform' tab.
	 */
	public void clickOnDataModelingMenuUnderPlatformTab() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, dataModelingMenuUnderPlatformTab);
		Common.jsClick(driver, dataModelingMenuUnderPlatformTab);
		log("Click on 'Data Modeling' menu under 'Platform' tab.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verify the title of the 'Data Modeling' page.
	 */
	public void verifyDataModelingPageTitle() {
		Assert.assertEquals("Data Modeling Page Title did not match.", driver.getTitle(),
				FrameworkConstants.DATA_MODELINGPAGE_TITLE);
		log("Data Modeling Page Title matched successfully.");
	}

	// Powerful Data Modeling section
	@FindBy(xpath = "//h1[contains(text(), 'Powerful data modeling')]")
	private WebElement powerfulDataModelingSection;

	/**
	 * Scroll to the 'Powerful Data Modeling' section.
	 */
	public void scrollToPowerfulDataModelingSection() {
		Common.waitForElementToBeVisible(driver, powerfulDataModelingSection);
		Common.scrollUpToElement(driver, powerfulDataModelingSection);
		log("Scroll to 'Powerful Data Modeling' section.");
	}

	// Tailored Views for Every User section
	@FindBy(xpath = "//h2[contains(text(), 'Tailored views for every user')]")
	private WebElement tailoredViewsForEveryUserSection;

	/**
	 * Scroll to the 'Tailored Views For Every User' section.
	 */
	public void scrollToTailoredViewsForEveryUserSection() {
		Common.waitForElementToBeVisible(driver, tailoredViewsForEveryUserSection);
		Common.scrollUpToElement(driver, tailoredViewsForEveryUserSection);
		log("Scroll to 'Tailored Views For Every User' section.");
	}

	// 'Book a Demo' button under Banner section
	@FindBy(xpath = "//a[contains(text(), 'Book a demo')]")
	private WebElement bookADemoButtonUnderBannerSection;

	/**
	 * Click on the 'Book a Demo' button under the 'Banner' section.
	 */
	public void clickOnBookADemoButtonUnderBannerSection() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, bookADemoButtonUnderBannerSection);
		Common.jsClick(driver, bookADemoButtonUnderBannerSection);
		log("Click on 'Book a Demo' button under 'Banner' section.");
		Common.waitForPageToLoad(driver, 10);
	}

	// 'Learn about Perspectives' button
	@FindBy(xpath = "//a[text()='Learn about Perspectives']")
	private WebElement learnAboutPerspectivesButton;

	/**
	 * Click on the 'Learn about Perspectives' button under the 'Tailored Views For
	 * Every User' section.
	 */
	public void clickOnLearnAboutPerspectivesButtonUnderTailoredViewsSection() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, tailoredViewsForEveryUserSection);
		Common.scrollUpToElement(driver, tailoredViewsForEveryUserSection);
		log("Scroll to 'Tailored Views For Every User' section.");
		Common.jsClick(driver, learnAboutPerspectivesButton);
		log("Click on 'Learn about Perspectives' button.");
		Common.waitForPageToLoad(driver, 10);
		Common.switchToAnotherWindow(driver, 10);
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verify the title of the 'L2023.6 Release Notes' page after clicking 'Learn
	 * about Perspectives'.
	 */
	public void verifyLearnAboutPerspectivesPageTitle() {
		Assert.assertEquals("Learn About Perspectives Page Title did not match.", driver.getTitle(),
				"L2023.6 Release Notes");
		log("Learn About Perspectives Page Title matched successfully.");
	}

	

}
