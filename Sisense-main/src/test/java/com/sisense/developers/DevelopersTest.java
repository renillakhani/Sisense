package com.sisense.developers;

import org.testng.annotations.Test;

import com.kfast.init.SeleniumInit;

public class DevelopersTest extends SeleniumInit {

	public void verifyDevelopersPageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		developersPage.clickOnDevelopersTabUnderHeaderSection();
		sisenseHeaderPage.verifyDevelopersPageTitle();
	}

	/* Currently this TestDriveComposeSDK button is removed from the page */
	
	@Test
	public void verifyFirstTestDriveComposeSDKPageTitleUnderBannerSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		developersPage.clickOnDevelopersTabUnderHeaderSection();
		developersPage.clickOnStartYourFreeTrialButtonUnderBannerSection();
		commonMethods.verifySisense7_DayFreeTrialPageTitle();
	}

	@Test
	public void verifyWatchADemoPageTitleUnderChooseTheEmbeddedSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		developersPage.clickOnDevelopersTabUnderHeaderSection();
		developersPage.clickOnWatchaDemoButtonUnderChoosetheEmbeddedAnalyticsSection();
		developersPage.verifyWatchADemoPageTitleUnderChooseTheEmbeddedSection();
	}

	@Test
	public void verifyHomeBreadcrumbTitleUnderDevelopersPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		developersPage.clickOnDevelopersTabUnderHeaderSection();
		commonMethods.clickOnHomeBreadcrumb();
		sisenseHeaderPage.verifySisenseHomePageTitle();
	}

	@Test
	public void verifyDemoPageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		developersPage.clickOnDevelopersTabUnderHeaderSection();
		sisenseHeaderPage.clickOnDemoButton();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyBookaliveDemoPageTitleUnderFooterSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		developersPage.clickOnDevelopersTabUnderHeaderSection();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBookaLiveDemoButtonUnderFooter();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyTryFreePageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		developersPage.clickOnDevelopersTabUnderHeaderSection();
		sisenseHeaderPage.clickOnTryFreeButton();
		sisenseHeaderPage.verifyTryFreePageTitle();
	}
}
