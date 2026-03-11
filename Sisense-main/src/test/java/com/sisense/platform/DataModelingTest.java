package com.sisense.platform;

import org.testng.annotations.Test;

import com.kfast.init.SeleniumInit;

public class DataModelingTest extends SeleniumInit {

	@Test
	public void verifyDataModelingPageTitleUnderPlatformTab() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		dataModelingPage.clickOnDataModelingMenuUnderPlatformTab();
		dataModelingPage.verifyDataModelingPageTitle();
	}

	@Test
	public void verifyHomeBreadcrumbTitleUnderDataModelingPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		dataModelingPage.clickOnDataModelingMenuUnderPlatformTab();
		commonMethods.clickOnHomeBreadcrumb();
		sisenseHeaderPage.verifySisenseHomePageTitle();
	}

	@Test
	public void verifyPlatformBreadcrumbTitleUnderDataModelingPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		dataModelingPage.clickOnDataModelingMenuUnderPlatformTab();
		commonMethods.clickOnPlatformBreadcrumb();
		sisenseHeaderPage.verifyPlatformPageTitle();
	}

	@Test
	public void verifyBookaDemoPageTitleUnderBannerSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		dataModelingPage.clickOnDataModelingMenuUnderPlatformTab();
		dataModelingPage.scrollToPowerfulDataModelingSection();
		dataModelingPage.clickOnBookADemoButtonUnderBannerSection();
		sisenseHeaderPage.verifyDemoPageTitle();

	}

	@Test
	public void verifyLearnAboutPerspectivesPageTitleUnderTailoredViewsSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		dataModelingPage.clickOnDataModelingMenuUnderPlatformTab();
		dataModelingPage.clickOnLearnAboutPerspectivesButtonUnderTailoredViewsSection();
		dataModelingPage.verifyLearnAboutPerspectivesPageTitle();
	}

	@Test
	public void verifyTryFreePageTitleUnderStartYourFreeTrialSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		dataModelingPage.clickOnDataModelingMenuUnderPlatformTab();
		commonMethods.scrollToStartYourFreeTrialSection();
		commonMethods.clickOnTryFreeButtonAboveFooter();
		commonMethods.verifySisense7_DayFreeTrialPageTitle();
	}

	@Test
	public void verifyDemoPageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		dataModelingPage.clickOnDataModelingMenuUnderPlatformTab();
		sisenseHeaderPage.clickOnDemoButton();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyBookaLiveDemoPageTitleUnderFooterSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		dataModelingPage.clickOnDataModelingMenuUnderPlatformTab();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBookaLiveDemoButtonUnderFooter();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyTryFreePageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		dataModelingPage.clickOnDataModelingMenuUnderPlatformTab();
		sisenseHeaderPage.clickOnTryFreeButton();
		sisenseHeaderPage.verifyTryFreePageTitle();
	}

}
