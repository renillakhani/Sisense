package com.sisense.platform;

import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.platform.Platform;
import com.kfast.init.SeleniumInit;

public class TrustAndSecurityTest extends SeleniumInit {

	@Test
	public void verifySecurityPageTitleUnderPlatformTab() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		trustAndSecurityPage.clickOnTrustAndSecurityMenuUnderPlatformTab();
		trustAndSecurityPage.verifySecurityPageTitle();
	}

	@Test
	public void verifyHomeBreadcrumbTitleUnderTrustAndSecurityPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		trustAndSecurityPage.clickOnTrustAndSecurityMenuUnderPlatformTab();
		commonMethods.clickOnHomeBreadcrumb();
		sisenseHeaderPage.verifySisenseHomePageTitle();
	}

	@Test
	public void verifyPlatformBreadcrumbTitleUnderTrustAndSecurityPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		trustAndSecurityPage.clickOnTrustAndSecurityMenuUnderPlatformTab();
		commonMethods.clickOnPlatformBreadcrumb();
		sisenseHeaderPage.verifyPlatformPageTitle();
	}

	@Test
	public void verifyBookADemoPageTitle() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		trustAndSecurityPage.clickOnTrustAndSecurityMenuUnderPlatformTab();
		trustAndSecurityPage.scrollToBannerSection();
		trustAndSecurityPage.clickOnBookADemoButtonUnderBannerSection();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyTrustCenterPageTitle() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		trustAndSecurityPage.clickOnTrustAndSecurityMenuUnderPlatformTab();
		trustAndSecurityPage.scrollToBannerSection();
		trustAndSecurityPage.clickOnTrustCenterButtonUnderBannerSection();
		cloudPage.verifyTrustCenterPageTitle();
	}

	@Test
	public void verifyFirstLearnMorePageTitle() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		trustAndSecurityPage.clickOnTrustAndSecurityMenuUnderPlatformTab();
		trustAndSecurityPage.scrollToDataProtectionSection();
		trustAndSecurityPage.clickOnFirstLearnMoreButtonUnderDataProtectionSection();
		trustAndSecurityPage.verifyPrivacyAndDataProtectionCenterPageTitle();
	}

	@Test
	public void verifyWatchADemoNowPageTitle() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		trustAndSecurityPage.clickOnTrustAndSecurityMenuUnderPlatformTab();
		trustAndSecurityPage.scrollToGovernanceSection();
		trustAndSecurityPage.clickOnWatchADemoNowButtonUnderGovernanceSection();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifySecondLearnMorePageTitle() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		trustAndSecurityPage.clickOnTrustAndSecurityMenuUnderPlatformTab();
		trustAndSecurityPage.scrollToDataSecuritySection();
		trustAndSecurityPage.clickOnSecondLearnMoreButtonUnderDataSecuritySection();
		trustAndSecurityPage.verifyPerspectivesOverviewPageTitle();
	}

	@Test
	public void verifyBookAFreeDemoPageTitleUnderBookADemoSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		trustAndSecurityPage.clickOnTrustAndSecurityMenuUnderPlatformTab();
		commonMethods.clickOnBookAFreeDemoButton();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyDemoPageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		trustAndSecurityPage.clickOnTrustAndSecurityMenuUnderPlatformTab();
		sisenseHeaderPage.clickOnDemoButton();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyBookaLiveDemoPageTitleUnderFooterSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		trustAndSecurityPage.clickOnTrustAndSecurityMenuUnderPlatformTab();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBookaLiveDemoButtonUnderFooter();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyTryFreePageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		trustAndSecurityPage.clickOnTrustAndSecurityMenuUnderPlatformTab();
		sisenseHeaderPage.clickOnTryFreeButton();
		sisenseHeaderPage.verifyTryFreePageTitle();
	}

	@Test
	public void verifyVisitSisenseTrustCenterPageTitle() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		trustAndSecurityPage.clickOnTrustAndSecurityMenuUnderPlatformTab();
		trustAndSecurityPage.scrollToSecurityYouCanRelyOnSection();
		trustAndSecurityPage.clickOnVisitSisenseTrustCenterButtonUnderSecuritySection();
		trustAndSecurityPage.verifyVisitSisenseTrustCenterPageTitle();
	}

	@Test
	public void verifyLearnAboutPrivacyPolicyPageTitleUnderWeAreOnlySection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		trustAndSecurityPage.clickOnTrustAndSecurityMenuUnderPlatformTab();
		trustAndSecurityPage.scrollToWeAreOnlyAsStrongAsSection();
		trustAndSecurityPage.clickOnLearnAboutPrivacyPolicyButtonUnderWeAreOnlySection();
		sisenseFooterPage.verifyPrivacyPolicyPageTitleUnderFooter();
	}
}
