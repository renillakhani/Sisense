package com.sisense.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.kfast.init.AbstractPage;
import com.kfast.init.Common;

public class ResourcesPage extends AbstractPage {

	public ResourcesPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	/**
	 * WebElement for the banner section on the Resource Hub page
	 */
	@FindBy(xpath = "//h1[normalize-space()='Resource hub']")
	private WebElement bannerSection;

	/**
	 * Scrolls to the banner section on the Resource Hub page.
	 */
	public void scrollToBannerSection() {
		Common.waitForElementToBeVisible(driver, bannerSection);
		Common.scrollUpToElement(driver, bannerSection);
		log("Scroll to banner section successfully.");
	}

	/**
	 * WebElement for the 'See All Resources' button under the banner section
	 */
	@FindBy(xpath = "//a[contains(text(), 'See all resources')]")
	private WebElement seeAllResourcesButtonUnderBannerSection;

	/**
	 * Clicks on the 'See All Resources' button under the banner section.
	 */
	public void clickOnSeeAllResourcesButtonUnderBannerSection() {
		Common.waitForElementToBeVisible(driver, seeAllResourcesButtonUnderBannerSection);
		Common.jsClick(driver,seeAllResourcesButtonUnderBannerSection);
		log("Click on 'See All Resources' button under banner section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}
}
