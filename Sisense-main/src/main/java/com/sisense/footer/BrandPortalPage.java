package com.sisense.footer;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.kfast.constants.FrameworkConstants;
import com.kfast.init.AbstractPage;
import com.kfast.init.Common;

public class BrandPortalPage extends AbstractPage {

	public BrandPortalPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	// Section: Sisense Typography
	@FindBy(xpath = "//strong[contains(text(), 'Sisense Typography')]")
	private WebElement sisenseTypographySection;

	// Button: Web AIM Contrast Checker under Sisense Typography section
	@FindBy(xpath = "//a[normalize-space()='Web AIM Contrast Checker']")
	private WebElement webAimContrastCheckerButton;

	/**
	 * Click on 'Web AIM Contrast Checker' button under Sisense Typography section
	 * 
	 */
	public void clickOnWebAimContrastCheckerButtonUnderSisenseTypographySection() throws InterruptedException {

		Common.waitForPageToLoad(driver, 10);
		Common.waitForPageToLoad(driver, 10);
		Common.scrollUpToBottom(driver);
		Common.scrollUpTop(driver);
		try {
			Common.waitForElementToBeVisible(driver, sisenseTypographySection);
			Common.scrollToVertical(driver, sisenseTypographySection);
			Common.scrollUpToElement(driver, sisenseTypographySection);
			log("Scroll to 'Sisense Typography' section.");
			Common.waitForElementToBeVisible(driver, webAimContrastCheckerButton);
			Common.jsClick(driver, webAimContrastCheckerButton);
			log("Click on 'Web AIM Contrast Checker' button.");
		} catch (Exception e) {
			Common.scrollUpToBottom(driver);
			Common.waitForElementToBeVisible(driver, poppinsSection);
			Common.scrollUpToElement(driver, poppinsSection);
			Common.waitForElementToBeVisible(driver, sisenseTypographySection);
			Common.scrollToVertical(driver, sisenseTypographySection);
			Common.scrollUpToElement(driver, sisenseTypographySection);
			log("Scroll to 'Sisense Typography' section.");
			Common.waitForElementToBeVisible(driver, webAimContrastCheckerButton);
			Common.jsClick(driver, webAimContrastCheckerButton);
			log("Click on 'Web AIM Contrast Checker' button.");
		}
		Common.waitForPageToLoad(driver, 10);
		Common.switchToAnotherWindow(driver, 10);
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verify page title for Web AIM Contrast Checker
	 */
	public void verifyWebAimContrastCheckerPageTitle() {
		Assert.assertEquals("Web AIM Contrast Checker Page Title Not Matched", driver.getTitle(),
				"WebAIM: Contrast Checker");
		log("Web AIM Contrast Checker page title matched.");
	}

	// Section: Poppins
	@FindBy(xpath = "//h3[normalize-space()='Poppins']")
	private WebElement poppinsSection;

	// Button: Download Google Font under Poppins section
	@FindBy(xpath = "//h3[normalize-space()='Poppins']//parent::div//child::div//child::a[normalize-space()='Download Google Font']")
	private WebElement firstDownloadGoogleFontButton;

	/**
	 * Click on 'Download Google Font' button under Poppins section
	 * 
	 * @throws InterruptedException
	 */
	public void clickOnDownloadGoogleFontButtonUnderPoppinsSection() throws InterruptedException {
		Common.scrollUpToBottom(driver);
		Common.scrollUpToBottom(driver);
		try {
			Common.waitForElementToBeVisible(driver, poppinsSection);
			Common.scrollUpToElement(driver, poppinsSection);
			Common.scrollToVertical(driver, poppinsSection);
			log("Scroll to 'Poppins' section.");
			Common.waitForElementToBeVisible(driver, firstDownloadGoogleFontButton);
			Common.jsClick(driver, firstDownloadGoogleFontButton);
			log("Click on 'Download Google Font' button under Poppins section.");
		} catch (Exception e) {
			Common.scrollUpToBottom(driver);
			Common.waitForElementToBeVisible(driver, poppinsSection);
			Common.scrollUpToElement(driver, poppinsSection);
			Common.scrollToVertical(driver, poppinsSection);
			log("Scroll to 'Poppins' section.");
			Common.waitForElementToBeVisible(driver, firstDownloadGoogleFontButton);
			Common.jsClick(driver, firstDownloadGoogleFontButton);
			log("Click on 'Download Google Font' button under Poppins section.");
		}
		Common.waitForPageToLoad(driver, 10);
		Common.switchToAnotherWindow(driver, 10);
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verify page title for Google Fonts Poppins
	 */
	public void verifyDownloadGoogleFontPageTitleUnderPoppinsSection() {
		Assert.assertEquals("First Download Google Font Page Title Not Matched", driver.getTitle(),
				"Poppins - Google Fonts");
		log("Google Fonts Poppins page title matched.");
	}

	// Section: DM Sans
	@FindBy(xpath = "//h3[normalize-space()='DM Sans']")
	private WebElement dmSansSection;

	// Button: Download Google Font under DM Sans section
	@FindBy(xpath = "//h3[normalize-space()='DM Sans']//parent::div//child::div//child::a[normalize-space()='Download Google Font']")
	private WebElement secondDownloadGoogleFontButton;

	/**
	 * Click on 'Download Google Font' button under DM Sans section
	 * 
	 * @throws InterruptedException
	 */
	public void clickOnDownloadGoogleFontButtonUnderDMSansSection() throws InterruptedException {
		Common.scrollUpToBottom(driver);
		Common.scrollUpToBottom(driver);
		try {
			Common.waitForElementToBeVisible(driver, dmSansSection);
			Common.scrollUpToElement(driver, dmSansSection);
			Common.scrollToVertical(driver, dmSansSection);
			log("Scroll to 'DM Sans' section.");
			Common.waitForElementToBeVisible(driver, secondDownloadGoogleFontButton);
			Common.jsClick(driver, secondDownloadGoogleFontButton);
			log("Click on 'Download Google Font' button under DM Sans section.");
		} catch (Exception e) {
			Common.scrollUpToBottom(driver);
			Common.waitForElementToBeVisible(driver, dmSansSection);
			Common.scrollUpToElement(driver, dmSansSection);
			Common.scrollToVertical(driver, dmSansSection);
			log("Scroll to 'DM Sans' section.");
			Common.waitForElementToBeVisible(driver, secondDownloadGoogleFontButton);
			Common.jsClick(driver, secondDownloadGoogleFontButton);
			log("Click on 'Download Google Font' button under DM Sans section.");
		}
		Common.waitForPageToLoad(driver, 10);
		Common.switchToAnotherWindow(driver, 10);
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verify page title for Google Fonts DM Sans
	 */
	public void verifyDownloadGoogleFontPageTitleUnderDMSansSection() {
		Assert.assertEquals("Second Download Google Font Page Title Not Matched", driver.getTitle(),
				"DM Sans - Google Fonts");
		log("Google Fonts DM Sans page title matched.");
	}

	// Section: Sisense Color Palette Best Practices
	@FindBy(xpath = "//strong[contains(text(),'Sisense Color Palette Best Practices')]")
	private WebElement sisenseColorPaletteSection;

	// Button: Download under Sisense Color Palette Best Practices section
	@FindBy(xpath = "//strong[contains(text(),'Sisense Color Palette') and contains(text(),'Best Practices')]//parent::h2//parent::div//child::div//a[normalize-space()='Download']")
	private WebElement downloadButton;

	@FindBy(xpath = "//h2[normalize-space()='Logo Minimum Size']")
	private WebElement logoMinimumSizeSection;

	/**
	 * Click on 'Download' button under Sisense Color Palette Best Practices section
	 * 
	 * @throws InterruptedException
	 */
	public void clickOnDownloadButtonUnderSisenseColorPaletteSection() throws InterruptedException {
		Common.waitForPageToLoad(driver, 20);
		Common.scrollUpToBottom(driver);
		Common.scrollUpToBottom(driver);
		Common.waitForPageToLoad(driver, 20);
		try {
			Common.waitForElementToBeVisible(driver, logoMinimumSizeSection);
			Common.scrollToVertical(driver, logoMinimumSizeSection);
			Common.waitForElementToBeVisible(driver, sisenseColorPaletteSection);
			Common.scrollToVertical(driver, sisenseColorPaletteSection);
			Common.scrollUpToElement(driver, sisenseColorPaletteSection);
			log("Scroll to 'Sisense Color Palette Best Practices' section.");
			Common.waitForElementToBeVisible(driver, downloadButton);
			Common.jsClick(driver, downloadButton);
			log("Click on 'Download' button under Sisense Color Palette Best Practices section.");
		} catch (Exception e) {
			Common.scrollUpToBottom(driver);
			Common.waitForElementToBeVisible(driver, logoMinimumSizeSection);
			Common.scrollToVertical(driver, logoMinimumSizeSection);
			Common.waitForElementToBeVisible(driver, sisenseColorPaletteSection);
			Common.scrollToVertical(driver, sisenseColorPaletteSection);
			Common.scrollUpToElement(driver, sisenseColorPaletteSection);
			log("Scroll to 'Sisense Color Palette Best Practices' section.");
			Common.waitForElementToBeVisible(driver, downloadButton);
			Common.jsClick(driver, downloadButton);
			log("Click on 'Download' button under Sisense Color Palette Best Practices section.");
		}
		Common.waitForPageToLoad(driver, 10);
		Common.switchToAnotherWindow(driver, 10);
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verify page title for Sisense Color Palette image
	 */
	public void verifyDownloadButtonPageTitleUnderSisenseColorPaletteSection() {
		Assert.assertEquals("Download Button Page Title Not Matched", driver.getTitle(),
				"Sisense-Color-Palette.webp (1536×1384)");
		log("Sisense Color Palette image page title matched.");
	}

	// Section: What Can You Find Here?
	@FindBy(xpath = "//h3[text()='What Can You Find Here?']")
	private WebElement whatCanYouFindHereSection;

	// Button: Logo Assets under What Can You Find Here section
	@FindBy(xpath = "//a[normalize-space()='Logo Assets']")
	private WebElement logoAssetsButton;

	/**
	 * Click on 'Logo Assets' button under What Can You Find Here section
	 * 
	 * @throws InterruptedException
	 */
	public void clickOnLogoAssetsButtonUnderWhatCanYouFindHereSection() throws InterruptedException {
		Common.waitForPageToLoad(driver, 10);
		Common.scrollUpToBottom(driver);
		Common.scrollUpToBottom(driver);
		Common.waitForPageToLoad(driver, 10);
		try {
			Common.waitForElementToBeVisible(driver, whatCanYouFindHereSection);
			Common.scrollToVertical(driver, whatCanYouFindHereSection);
			Common.scrollUpToElement(driver, whatCanYouFindHereSection);
			log("Scroll to 'What Can You Find Here?' section.");
			Common.waitForElementToBeVisible(driver, logoAssetsButton);
			Common.jsClick(driver, logoAssetsButton);
			log("Click on 'Logo Assets' button under What Can You Find Here section.");
		} catch (Exception e) {
			Common.scrollUpToBottom(driver);
			Common.waitForElementToBeVisible(driver, whatCanYouFindHereSection);
			Common.scrollToVertical(driver, whatCanYouFindHereSection);
			Common.scrollUpToElement(driver, whatCanYouFindHereSection);
			log("Scroll to 'What Can You Find Here?' section.");
			Common.waitForElementToBeVisible(driver, logoAssetsButton);
			Common.jsClick(driver, logoAssetsButton);
			log("Click on 'Logo Assets' button under What Can You Find Here section.");
		}

		Common.waitForPageToLoad(driver, 10);
	}

	// Button: Colors under What Can You Find Here section
	@FindBy(xpath = "//a[normalize-space()='Colors']")
	private WebElement colorsButton;

	/**
	 * Click on 'Colors' button under What Can You Find Here section
	 * 
	 * @throws InterruptedException
	 */
	public void clickOnColorsButtonUnderWhatCanYouFindHereSection() throws InterruptedException {
		Common.waitForPageToLoad(driver, 10);
		Common.scrollUpToBottom(driver);
		Common.scrollUpToBottom(driver);
		Common.waitForPageToLoad(driver, 10);
		try {
			Common.waitForElementToBeVisible(driver, whatCanYouFindHereSection);
			Common.scrollToVertical(driver, whatCanYouFindHereSection);
			Common.scrollUpToElement(driver, whatCanYouFindHereSection);
			log("Scroll to 'What Can You Find Here?' section.");
			Common.waitForElementToBeVisible(driver, colorsButton);
			Common.jsClick(driver, colorsButton);
			log("Click on 'Colors' button under What Can You Find Here section.");
		} catch (Exception e) {
			Common.scrollUpToBottom(driver);
			Common.waitForElementToBeVisible(driver, whatCanYouFindHereSection);
			Common.scrollToVertical(driver, whatCanYouFindHereSection);
			Common.scrollUpToElement(driver, whatCanYouFindHereSection);
			log("Scroll to 'What Can You Find Here?' section.");
			Common.waitForElementToBeVisible(driver, colorsButton);
			Common.jsClick(driver, colorsButton);
			log("Click on 'Colors' button under What Can You Find Here section.");
		}
		Common.waitForPageToLoad(driver, 10);
	}

	// Button: Typography under What Can You Find Here section
	@FindBy(xpath = "//a[normalize-space()='Typography']")
	private WebElement typographyButton;

	/**
	 * Click on 'Typography' button under What Can You Find Here section
	 * 
	 * @throws InterruptedException
	 */
	public void clickOnTypographyButtonUnderWhatCanYouFindHereSection() throws InterruptedException {
		Common.waitForPageToLoad(driver, 10);
		Common.scrollUpToBottom(driver);
		Common.scrollUpToBottom(driver);
		Common.waitForPageToLoad(driver, 10);
		try {
			Common.waitForElementToBeVisible(driver, whatCanYouFindHereSection);
			Common.scrollToVertical(driver, whatCanYouFindHereSection);
			Common.scrollUpToElement(driver, whatCanYouFindHereSection);
			log("Scroll to 'What Can You Find Here?' section.");
			Common.waitForElementToBeVisible(driver, typographyButton);
			Common.jsClick(driver, typographyButton);
			log("Click on 'Typography' button under What Can You Find Here section.");
		} catch (Exception e) {
			Common.scrollUpToBottom(driver);
			Common.waitForElementToBeVisible(driver, whatCanYouFindHereSection);
			Common.scrollToVertical(driver, whatCanYouFindHereSection);
			Common.scrollUpToElement(driver, whatCanYouFindHereSection);
			log("Scroll to 'What Can You Find Here?' section.");
			Common.waitForElementToBeVisible(driver, typographyButton);
			Common.jsClick(driver, typographyButton);
			log("Click on 'Typography' button under What Can You Find Here section.");
		}
		Common.waitForPageToLoad(driver, 10);
	}
}
