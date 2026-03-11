package com.sisense.platform;

import org.testng.annotations.Test;

import com.kfast.init.SeleniumInit;

public class SisenseIntelligenceTest extends SeleniumInit {

	@Test
	public void verifySisenseIntelligencePageTitleUnderPlatformTab() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		sisenseIntelligencePage.clickOnSisenseIntelligenceMenuUnderPlatformTab();
		sisenseIntelligencePage.verifySisenseIntelligencePageTitle();
	}

	@Test
	public void verifyHomeBreadcrumbTitleUnderSisenseIntelligencePage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		sisenseIntelligencePage.clickOnSisenseIntelligenceMenuUnderPlatformTab();
		commonMethods.clickOnHomeBreadcrumb();
		sisenseHeaderPage.verifySisenseHomePageTitle();
	}

	@Test
	public void verifyPlatformBreadcrumbTitleUnderSisenseIntelligencePage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		sisenseIntelligencePage.clickOnSisenseIntelligenceMenuUnderPlatformTab();
		commonMethods.clickOnPlatformBreadcrumb();
		sisenseHeaderPage.verifyPlatformPageTitle();
	}

	@Test
	public void verifyBookALiveDemoPageTitleUnderBannerSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		sisenseIntelligencePage.clickOnSisenseIntelligenceMenuUnderPlatformTab();
		sisenseIntelligencePage.scrollToBannerSection();
		sisenseIntelligencePage.clickOnBookALiveDemoButtonUnderBannerSection();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyLearnMorePageTitleUnderTransformChartsSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		sisenseIntelligencePage.clickOnSisenseIntelligenceMenuUnderPlatformTab();
		sisenseIntelligencePage.clickOnLearnMoreButtonUnderTransformChartsSection();
		composablePage.verifyComposeSDKPageTitle();
	}

	@Test
	public void verifyComposeSDKLinkPageTitleUnderBuildOnceSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		sisenseIntelligencePage.clickOnSisenseIntelligenceMenuUnderPlatformTab();
		sisenseIntelligencePage.clickOnComposeSDKLinkUnderBuildOnceSection();
		composablePage.verifyComposeSDKPageTitle();
	}

	@Test
	public void verifyBookaDemoPageTitleUnderBannerSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		sisenseIntelligencePage.clickOnSisenseIntelligenceMenuUnderPlatformTab();
		sisenseIntelligencePage.scrollToBannerSection();
		sisenseIntelligencePage.clickOnBookADemoButtonUnderBannerSection();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyFirstLearnMorePageTitleUnderIntuitiveDataExplorationSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		sisenseIntelligencePage.clickOnSisenseIntelligenceMenuUnderPlatformTab();
		sisenseIntelligencePage.scrollToIntuitiveDataExplorationSection();
		sisenseIntelligencePage.clickOnFirstLearnMoreButtonUnderIntuitiveDataExplorationSection();
		sisenseIntelligencePage.verify4StrategiesForSuccessPageTitle();
	}

	@Test
	public void verifyWatchDemoPageTitleUnderAIAssistantSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		sisenseIntelligencePage.clickOnSisenseIntelligenceMenuUnderPlatformTab();
		sisenseIntelligencePage.clickOnWatchDemoButtonUnderAIAssistantSection();
		sisenseIntelligencePage.verifyWatchDemoPageTitle();

	}

	@Test
	public void verifySecondLearnMorePageTitleUnderIntegrationWithComposeSDKSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		sisenseIntelligencePage.clickOnSisenseIntelligenceMenuUnderPlatformTab();
		sisenseIntelligencePage.scrollToIntegrationWithComposeSDKSection();
		sisenseIntelligencePage.clickOnSecondLearnMoreButtonUnderIntegrationWithComposeSDKSection();
		composablePage.verifyComposeSDKPageTitle();
	}

	@Test
	public void verifyTryFreePageTitleUnderStartYourFreeTrialSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		sisenseIntelligencePage.clickOnSisenseIntelligenceMenuUnderPlatformTab();
		commonMethods.scrollToStartYourFreeTrialSection();
		commonMethods.clickOnTryFreeButtonAboveFooter();
		commonMethods.verifySisense7_DayFreeTrialPageTitle();
	}

	@Test
	public void verifyDemoPageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		sisenseIntelligencePage.clickOnSisenseIntelligenceMenuUnderPlatformTab();
		sisenseHeaderPage.clickOnDemoButton();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyBookaliveDemoPageTitleUnderFooterSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		sisenseIntelligencePage.clickOnSisenseIntelligenceMenuUnderPlatformTab();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBookaLiveDemoButtonUnderFooter();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	public void verifyTryFreePageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		sisenseIntelligencePage.clickOnSisenseIntelligenceMenuUnderPlatformTab();
		sisenseHeaderPage.clickOnTryFreeButton();
		sisenseHeaderPage.verifyTryFreePageTitle();
	}

}
