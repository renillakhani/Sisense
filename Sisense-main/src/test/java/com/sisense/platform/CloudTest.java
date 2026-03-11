package com.sisense.platform;

import org.testng.annotations.Test;

import com.kfast.init.SeleniumInit;

public class CloudTest extends SeleniumInit {
	@Test
	public void verifyCloudPageTitleUnderPlatformSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		cloudPage.clickOnCloudMenuUnderPlatformTab();
		cloudPage.verifyCloudPageTitle();
	}

	@Test
	public void verifyHomeBreadcrumbTitleUnderCloudPageSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		cloudPage.clickOnCloudMenuUnderPlatformTab();
		commonMethods.clickOnHomeBreadcrumb();
		sisenseHeaderPage.verifySisenseHomePageTitle();
	}

	@Test
	public void verifyPlatformBreadcrumbTitleUnderCloudPageSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		cloudPage.clickOnCloudMenuUnderPlatformTab();
		commonMethods.clickOnPlatformBreadcrumb();
		sisenseHeaderPage.verifyPlatformPageTitle();
	}

	@Test
	public void verifyBookaLiveDemoPageTitleUnderCloudPageSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		cloudPage.clickOnCloudMenuUnderPlatformTab();
		cloudPage.clickOnBookaLiveDemoButton();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyCheckOutOurReleaseNotesPageTitleUnderFeaturePrioritizationSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		cloudPage.clickOnCloudMenuUnderPlatformTab();
		cloudPage.clickOnCheckOutReleaseNotesButtonUnderFeaturePrioritizationSection();
		cloudPage.verifyReleaseNotesPageTitle();
	}

	@Test
	public void verifySeeOurSupportResourcesPageTitleUnderProactiveSupportSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		cloudPage.clickOnCloudMenuUnderPlatformTab();
		cloudPage.clickOnSeeSupportResourcesButtonUnderProactiveSupportSection();
		supportPage.verifySupportPageTitle();
	}

	@Test
	public void verifyLearnMoreAboutSecurityAndTrustPageTitleUnderSecureEnvironmentSection()
			throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		cloudPage.clickOnCloudMenuUnderPlatformTab();
		cloudPage.clickOnLearnMoreSecurityTrustButtonUnderSecureEnvironmentSection();
		cloudPage.verifyTrustCenterPageTitle();
	}

	@Test
	public void verifyTryFreePageTitleUnderStartYourFreeTrialSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		cloudPage.clickOnCloudMenuUnderPlatformTab();
		commonMethods.scrollToStartYourFreeTrialSection();
		commonMethods.clickOnTryFreeButtonAboveFooter();
		commonMethods.verifySisense7_DayFreeTrialPageTitle();
	}

	@Test
	public void verifyDemoPageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		cloudPage.clickOnCloudMenuUnderPlatformTab();
		sisenseHeaderPage.clickOnDemoButton();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyBookaLiveDemoPageTitleUnderFooterSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		cloudPage.clickOnCloudMenuUnderPlatformTab();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBookaLiveDemoButtonUnderFooter();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyTryFreePageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		cloudPage.clickOnCloudMenuUnderPlatformTab();
		sisenseHeaderPage.clickOnTryFreeButton();
		sisenseHeaderPage.verifyTryFreePageTitle();
	}
}
