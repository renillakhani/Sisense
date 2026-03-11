package com.sisense.solutions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.kfast.constants.FrameworkConstants;
import com.kfast.init.AbstractPage;
import com.kfast.init.Common;

public class HealthcareAndPharmaPage extends AbstractPage {

	public HealthcareAndPharmaPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	// WebElement for Healthcare and Pharma Menu
	@FindBy(xpath = "//a[text()='Healthcare and pharma']")
	private WebElement healthcareAndPharmaMenu;

	// Click on Healthcare and Pharma Menu
	public void clickOnHealthcareAndPharmaMenuUnderSolutionsTab() {
		Common.waitForElementToBeVisible(driver, healthcareAndPharmaMenu);
		Common.jsClick(driver,healthcareAndPharmaMenu);
		log("Click on Healthcare and Pharma Menu successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	// Verify the page title for Healthcare and Pharma page
	public void verifyHealthcareAndPharmaPageTitle() {
		Assert.assertEquals("Healthcare And Pharma Page Title Not Matched", driver.getTitle(),
				FrameworkConstants.HEALTHCARE_AND_PHARMA_TITLE);
		log("Healthcare and Pharma Page Title matched successfully.");
	}

	// WebElement for 'The fastest path to healthcare analytics solutions' section
	@FindBy(xpath = "//h2[normalize-space()='The fastest path to healthcare analytics solutions']")
	private WebElement theFastestPathSection;

	// Scroll to 'The fastest path to healthcare analytics solutions' section
	public void scrollToTheFastestPathSection() {
		Common.waitForElementToBeVisible(driver, theFastestPathSection);
		Common.scrollUpToElement(driver, theFastestPathSection);
		log("Scroll to 'The fastest path to healthcare analytics solutions' section.");
	}

	// WebElement for Learn More button
	@FindBy(xpath = "//h2[contains(text(),'The fastest path to healthcare analytics solutions')]//following-sibling::div//child::a[text()='Learn more']")
	private WebElement learnMoreButton;

	// Click on Learn More button
	public void clickOnLearnMoreButtonUnderTheFastestPathSection() {
		Common.waitForElementToBeVisible(driver, learnMoreButton);
		Common.jsClick(driver,learnMoreButton);
		log("Click on Learn More button successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	// WebElement for 'Contextual healthcare analytics...' section
	@FindBy(xpath = "//h2[normalize-space()='Contextual healthcare analytics that drive margins for insurers']")
	private WebElement contextualAnalyticsSection;

	// Scroll to Contextual healthcare analytics section
	public void scrollToContextualAnalyticsSection() {
		Common.waitForElementToBeVisible(driver, contextualAnalyticsSection);
		Common.scrollUpToElement(driver, contextualAnalyticsSection);
		log("Scroll to 'Contextual healthcare analytics that drive margins for insurers' section.");
	}

	// WebElement for first Schedule a Demo button
	@FindBy(xpath = "//h2[contains(text(),'Contextual healthcare analytics that drive margins for insurers')]//following-sibling::div//child::a[text()='Schedule a demo']")
	private WebElement firstScheduleADemoButton;

	// Click on First Schedule a Demo button
	public void clickOnFirstScheduleADemoButtonUnderContextualAnalyticsSection() {
		Common.waitForElementToBeVisible(driver, firstScheduleADemoButton);
		Common.jsClick(driver,firstScheduleADemoButton);
		log("Click on First Schedule a Demo button successfully.");
		Common.waitForPageToLoad(driver, 10);
	}
	
		@FindBy(xpath = "//h2[contains(text(),'Contextual healthcare analytics that drive margins for insurers')]//following-sibling::div//child::a[text()='Free trial']")
		private WebElement freeTrialButton;

		public void clickOnFreeTrialButtonUnderContextualAnalyticsSection() {
			Common.waitForElementToBeVisible(driver, freeTrialButton);
			Common.jsClick(driver,freeTrialButton);
			log("Click on free trial button successfully.");
			Common.waitForPageToLoad(driver, 10);
		}
	// WebElement for 'Securely transform every patient interaction...' section
	@FindBy(xpath = "//h2[normalize-space()='Securely transform every patient interaction with healthcare data analytics solutions']")
	private WebElement securelyTransformPatientSection;

	// Scroll to Securely transform every patient interaction section
	public void scrollToSecurelyTransformPatientSection() {
		Common.waitForElementToBeVisible(driver, securelyTransformPatientSection);
		Common.scrollUpToElement(driver, securelyTransformPatientSection);
		log("Scroll to 'Securely transform every patient interaction with healthcare data analytics solutions' section.");
	}

	// WebElement for second Schedule a Demo button
	@FindBy(xpath = "//h2[contains(text(),'Securely transform every patient interaction with healthcare data analytics solutions')]//following-sibling::div//child::a[text()='Schedule a demo']")
	private WebElement secondScheduleADemoButton;

	// Click on Second Schedule a Demo button
	public void clickOnSecondScheduleADemoButtonUnderSecurelyTTransformPatientSection() {
		Common.waitForElementToBeVisible(driver, secondScheduleADemoButton);
		Common.jsClick(driver,secondScheduleADemoButton);
		log("Click on Second Schedule a Demo button successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	// WebElement for 'Mytonomy masters healthcare authentication challenges'
	// section
	@FindBy(xpath = "//h2[normalize-space()='Mytonomy masters healthcare authentication challenges']")
	private WebElement mytonomySection;

	// Scroll to Mytonomy masters healthcare authentication challenges section
	public void scrollToMytonomySectionUnderHealthcareAndPharmaPage() {
		Common.waitForElementToBeVisible(driver, mytonomySection);
		Common.scrollUpToElement(driver, mytonomySection);
		log("Scroll to 'Mytonomy masters healthcare authentication challenges' section.");
	}

	// WebElement for Watch Now button
	@FindBy(xpath = "//a[normalize-space()='Watch now']")
	private WebElement watchNowButton;

	// Click on Watch Now button
	public void clickOnWatchNowButtonUnderMytonomySection() {
		Common.waitForElementToBeVisible(driver, watchNowButton);
		Common.jsClick(driver,watchNowButton);
		log("Click on Watch Now button successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	// Verify title of the Revolutionizing user experience and data security page
	public void verifyRevolutionizingUserExperienceAndDataSecurityPageTitle() {
		Assert.assertEquals("Revolutionizing user experience and data security Page Title Not Matched",
				driver.getTitle(), "Webinar: Revolutionizing user experience and data security | Sisense");
		log("Revolutionizing user experience and data security Page Title matched successfully.");
	}
}
