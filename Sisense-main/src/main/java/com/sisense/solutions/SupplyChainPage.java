package com.sisense.solutions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.kfast.constants.FrameworkConstants;
import com.kfast.init.AbstractPage;
import com.kfast.init.Common;

public class SupplyChainPage extends AbstractPage {

	public SupplyChainPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	// =============================== Supply Chain Menu
	// ===============================

	@FindBy(xpath = "//a[text()='Supply chain']")
	private WebElement supplyChainMenu;

	/**
	 * Click on 'Supply Chain' menu under the Solutions tab.
	 */
	public void clickOnSupplyChainMenuUnderSolutionsTab() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, supplyChainMenu);
		Common.jsClick(driver,supplyChainMenu);
		log("Click on Supply Chain menu under Solutions tab successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	// =============================== Page Title Verification
	// ===============================

	/**
	 * Verify the title of the Supply Chain page.
	 */
	public void verifySupplyChainPageTitle() {
		Assert.assertEquals("Supply Chain Page Title Not Matched", driver.getTitle(),
				FrameworkConstants.SUPPLY_CHAIN_TITLE);
		log("Supply Chain page title matched successfully.");
	}

	// ========== Transform your supply chain analytics for competitive advantage
	// ==========

	@FindBy(xpath = "//h2[normalize-space()='Transform your supply chain analytics for competitive advantage']")
	private WebElement transformSupplyChainAnalyticsSection;

	/**
	 * Scroll to 'Transform your supply chain analytics for competitive advantage'
	 * section.
	 */
	public void scrollToTransformSupplyChainAnalyticsSection() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, transformSupplyChainAnalyticsSection);
		Common.scrollUpToElement(driver, transformSupplyChainAnalyticsSection);
		log("Scroll to 'Transform your supply chain analytics for competitive advantage' section.");
	}

	@FindBy(xpath = "//h2[contains(text(),'Transform your supply chain analytics for competitive advantage')]/following-sibling::div//child::a[text()='Learn more']")
	private WebElement learnMoreButtonUnderTransformSection;

	/**
	 * Click on 'Learn More' button under the Transform section.
	 */
	public void clickOnLearnMoreButtonUnderTransformSupplyChainAnalyticsSection() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, learnMoreButtonUnderTransformSection);
		Common.jsClick(driver,learnMoreButtonUnderTransformSection);
		log("Click on 'Learn More' button under Transform Supply Chain Analytics section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	// ========== Integrate all data for end-to-end supply chain data analytics
	// ==========

	@FindBy(xpath = "//h2[normalize-space()='Integrate all data for end-to-end supply chain data analytics']")
	private WebElement integrateAllDataSection;

	/**
	 * Scroll to 'Integrate all data for end-to-end supply chain data analytics'
	 * section.
	 */
	public void scrollToIntegrateAllDataSection() throws InterruptedException {
		Common.waitForPageToLoad(driver, 10);
		Common.waitForElementToBeVisible(driver, integrateAllDataSection);
		Common.scrollUpToElement(driver, integrateAllDataSection);
		log("Scroll to 'Integrate all data for end-to-end supply chain data analytics' section.");
		Common.waitForPageToLoad(driver, 10);
	}

	@FindBy(xpath = "//h2[contains(text(),'Integrate all data for end-to-end supply chain data analytics')]/following-sibling::div//child::a[text()='Schedule a demo']")
	private WebElement scheduleADemoButtonUnderIntegrateSection;

	/**
	 * Click on 'Schedule a Demo' button under the Integrate section.
	 */
	public void clickOnScheduleADemoButtonUnderIntegrateAllDataSection() throws InterruptedException {
		try {
			Common.waitForElementToBeVisible(driver, scheduleADemoButtonUnderIntegrateSection);
			Common.jsClick(driver,scheduleADemoButtonUnderIntegrateSection);
		} catch (Exception e) {
			Common.waitForElementToBeVisible(driver, integrateAllDataSection);
			Common.scrollUpToElement(driver, integrateAllDataSection);
			Common.waitForElementToBeVisible(driver, scheduleADemoButtonUnderIntegrateSection);
			Common.scrollUpToElement(driver, scheduleADemoButtonUnderIntegrateSection);
			Common.jsClick(driver,scheduleADemoButtonUnderIntegrateSection);
		}
		log("Click on 'Schedule a Demo' button under Integrate Supply Chain Analytics section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	// =============================== Build Supply Chain Analytics Section
	// ===============================

	@FindBy(xpath = "//h2[contains(text(),'Build supply chain analytics software better, fast')]")
	private WebElement buildSupplyChainAnalyticsSection;

	/**
	 * Scroll to 'Build supply chain analytics software' section.
	 */
	public void scrollToBuildSupplyChainAnalyticsSection() throws InterruptedException {
		Common.waitForPageToLoad(driver, 10);
		Common.waitForElementToBeVisible(driver, buildSupplyChainAnalyticsSection);
		Common.scrollToVertical(driver, buildSupplyChainAnalyticsSection);
		Common.scrollUpToElement(driver, buildSupplyChainAnalyticsSection);
		log("Scroll to 'Build Supply Chain Analytics' section.");
		Common.waitForPageToLoad(driver, 10);
	}

	@FindBy(xpath = "//a[normalize-space()='composable development technology']")
	private WebElement composableDevelopmentTechnologyLink;

	/**
	 * Click on 'Composable Development Technology' link under the Build section.
	 */
	public void clickOnComposableDevelopmentTechnologyLinkUnderBuildSupplyChainAnalyticsSection()
			throws InterruptedException {

		Common.waitForElementToBeVisible(driver, buildSupplyChainAnalyticsSection);
		Common.scrollToVertical(driver, buildSupplyChainAnalyticsSection);
		Common.scrollUpToElement(driver, buildSupplyChainAnalyticsSection);
		try {
			Common.waitForElementToBeVisible(driver, composableDevelopmentTechnologyLink);
			Common.jsClick(driver,composableDevelopmentTechnologyLink);
		} catch (Exception e) {
			Common.waitForElementToBeVisible(driver, buildSupplyChainAnalyticsSection);
			Common.scrollToVertical(driver, buildSupplyChainAnalyticsSection);
			Common.scrollUpToElement(driver, buildSupplyChainAnalyticsSection);
			Common.waitForElementToBeVisible(driver, composableDevelopmentTechnologyLink);
			Common.scrollUpToElement(driver, composableDevelopmentTechnologyLink);
			Common.jsClick(driver,composableDevelopmentTechnologyLink);
		}
		log("Click on 'Composable Development Technology' link under Build Supply Chain Analytics section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

}
