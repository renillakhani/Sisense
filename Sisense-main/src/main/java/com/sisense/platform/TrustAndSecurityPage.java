package com.sisense.platform;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.kfast.constants.FrameworkConstants;
import com.kfast.init.AbstractPage;
import com.kfast.init.Common;

public class TrustAndSecurityPage extends AbstractPage {

	public TrustAndSecurityPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	// 'Trust and Security' Menu under 'Capabilities'
	@FindBy(xpath = "//a[text()='Capabilities']//parent::li//ul//a[text()='Trust and security']")
	private WebElement trustAndSecurityMenuUnderCapabilities;

	public void clickOnTrustAndSecurityMenuUnderPlatformTab() {
		Common.waitForElementToBeVisible(driver, trustAndSecurityMenuUnderCapabilities);
		Common.jsClick(driver,trustAndSecurityMenuUnderCapabilities);
		log("Click on 'Trust and Security' menu under 'Platform' Tab successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	// Banner Section - H1 Text
	@FindBy(xpath = "//h1[contains(text(), 'The secure and scalable analytics platform')]")
	private WebElement bannerSection;

	public void scrollToBannerSection() {
		Common.waitForElementToBeVisible(driver, bannerSection);
		Common.scrollUpToElement(driver, bannerSection);
		log("Scroll to 'Banner' section successfully.");
	}

	// 'Book a demo' Button under Banner section
	@FindBy(xpath = "//a[contains(text(), 'Book a demo')]")
	private WebElement bookADemoButtonUnderBannerSection;

	public void clickOnBookADemoButtonUnderBannerSection() {
		Common.waitForElementToBeVisible(driver, bookADemoButtonUnderBannerSection);
		Common.jsClick(driver,bookADemoButtonUnderBannerSection);
		log("Click on 'Book a demo' button under 'Banner' section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	// 'Trust center' Button
	@FindBy(xpath = "//h1[contains(text(),'The secure and scalable analytics platform')]/following-sibling::div//a[contains(text(),'Trust center')]")
	private WebElement trustCenterButtonUnderBannerSection;

	public void clickOnTrustCenterButtonUnderBannerSection() {
		Common.waitForElementToBeVisible(driver, trustCenterButtonUnderBannerSection);
		Common.jsClick(driver,trustCenterButtonUnderBannerSection);
		log("Click on 'Trust center' button under 'Banner' section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	// 'Data protection' Section
	@FindBy(xpath = "//h2[contains(text(), 'Data protection')]")
	private WebElement dataProtectionSection;

	public void scrollToDataProtectionSection() {
		Common.waitForElementToBeVisible(driver, dataProtectionSection);
		Common.scrollUpToElement(driver, dataProtectionSection);
		log("Scroll to 'Data protection' section successfully.");
	}

	// First 'Learn more' Button under Data protection section
	@FindBy(xpath = "//h2[contains(text(), 'Data protection')]/following-sibling::div//a[text()='Learn more']")
	private WebElement firstLearnMoreButtonUnderDataProtectionSection;

	public void clickOnFirstLearnMoreButtonUnderDataProtectionSection() {
		Common.waitForElementToBeVisible(driver, firstLearnMoreButtonUnderDataProtectionSection);
		Common.jsClick(driver,firstLearnMoreButtonUnderDataProtectionSection);
		log("Click on first 'Learn more' button under 'Data protection' section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	public void verifyPrivacyAndDataProtectionCenterPageTitle() {
		Assert.assertEquals("Sisense Privacy and Data protection center Page title Not Matched",
				"Privacy and Data Protection Center - Sisense", driver.getTitle());
		log("Sisense Privacy and Data protection center Page title matched successfully.");
	}

	// 'Governance' Section
	@FindBy(xpath = "//h2[contains(text(), 'Governance')]")
	private WebElement governanceSection;

	public void scrollToGovernanceSection() {
		Common.waitForElementToBeVisible(driver, governanceSection);
		Common.scrollUpToElement(driver, governanceSection);
		log("Scroll to 'Governance' section successfully.");
	}

	// 'Watch a demo now' Button
	@FindBy(xpath = "//a[contains(text(), 'Watch a demo now')]")
	private WebElement watchADemoNowButtonUnderGovernanceSection;

	public void clickOnWatchADemoNowButtonUnderGovernanceSection() {
		Common.waitForElementToBeVisible(driver, watchADemoNowButtonUnderGovernanceSection);
		Common.jsClick(driver,watchADemoNowButtonUnderGovernanceSection);
		log("Click on 'Watch a demo now' button under 'Governance' section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	// 'Data security' Section
	@FindBy(xpath = "//h2[contains(text(), 'Data security')]")
	private WebElement dataSecuritySection;

	public void scrollToDataSecuritySection() {
		Common.waitForElementToBeVisible(driver, dataSecuritySection);
		Common.scrollUpToElement(driver, dataSecuritySection);
		log("Scroll to 'Data security' section successfully.");
	}

	// Second 'Learn more' Button under Data security section
	@FindBy(xpath = "//h2[contains(text(), 'Data security')]/following-sibling::div//a[text()='Learn more']")
	private WebElement secondLearnMoreButtonUnderDataSecuritySection;

	public void clickOnSecondLearnMoreButtonUnderDataSecuritySection() {
		Common.waitForElementToBeVisible(driver, secondLearnMoreButtonUnderDataSecuritySection);
		Common.jsClick(driver,secondLearnMoreButtonUnderDataSecuritySection);
		log("Click on second 'Learn more' button under 'Data security' section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	public void verifyPerspectivesOverviewPageTitle() {
		Assert.assertEquals("Sisense Perspectives Overview Page title Not Matched", "Sisense | Perspectives Overview",
				driver.getTitle());
		log("Sisense Perspectives Overview Page title matched successfully.");
	}

	// 'Security you can rely on...' Section
	@FindBy(xpath = "//h2[contains(text(),'Security you can rely on, transparency you can trust')]")
	private WebElement securityYouCanRelyOnSection;

	public void scrollToSecurityYouCanRelyOnSection() {
		Common.waitForElementToBeVisible(driver, securityYouCanRelyOnSection);
		Common.scrollUpToElement(driver, securityYouCanRelyOnSection);
		log("Scroll to 'Security you can rely on, transparency you can trust' section successfully.");
	}

	// 'Visit the Sisense Trust Center' Button
	@FindBy(xpath = "//h2[contains(text(),'Security you can rely on')]/following-sibling::div//a[text()='Visit the Sisense Trust Center']")
	private WebElement visitSisenseTrustCenterButtonUnderSecuritySection;

	public void clickOnVisitSisenseTrustCenterButtonUnderSecuritySection() {
		Common.waitForElementToBeVisible(driver, visitSisenseTrustCenterButtonUnderSecuritySection);
		Common.jsClick(driver,visitSisenseTrustCenterButtonUnderSecuritySection);
		log("Click on 'Visit the Sisense Trust Center' button under 'Security' section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	public void verifyVisitSisenseTrustCenterPageTitle() {
		Assert.assertEquals("Visit the Sisense Trust Center Page title Not Matched",
				"Sisense Trust Center | Powered by SafeBase", driver.getTitle());
		log("Visit the Sisense Trust Center Page title matched successfully.");
	}

	// 'We’re only as strong as our weakest link' Section
	@FindBy(xpath = "//h2[contains(text(),'We’re only as strong as our weakest link')]")
	private WebElement weAreOnlyAsStrongAsSection;

	public void scrollToWeAreOnlyAsStrongAsSection() {
		Common.scrollUpToBottom(driver);
		Common.waitForElementToBeVisible(driver, weAreOnlyAsStrongAsSection);
		Common.scrollUpToElement(driver, weAreOnlyAsStrongAsSection);
		log("Scroll to 'We’re only as strong as our weakest link' section successfully.");
	}

	// 'Learn about our privacy policy' Button
	@FindBy(xpath = "//a[text()='Learn about our privacy policy']")
	private WebElement learnAboutPrivacyPolicyButtonUnderWeAreOnlySection;

	public void clickOnLearnAboutPrivacyPolicyButtonUnderWeAreOnlySection() {
		Common.waitForElementToBeVisible(driver, learnAboutPrivacyPolicyButtonUnderWeAreOnlySection);
		Common.jsClick(driver,learnAboutPrivacyPolicyButtonUnderWeAreOnlySection);
		log("Click on 'Learn about our privacy policy' button under 'We’re only as strong as our weakest link' section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	public void verifySecurityPageTitle() {
		Common.waitForPageToLoad(driver, 10);
		Assert.assertEquals("Sisense Security Page title Not Matched", driver.getTitle(),
				FrameworkConstants.TRUST_AND_SECURITY_TITLE);
		log("Sisense Security Page title matched successfully.");
	}
}
