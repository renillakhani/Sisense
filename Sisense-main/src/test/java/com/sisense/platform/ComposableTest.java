package com.sisense.platform;

import org.testng.annotations.Test;

import com.kfast.init.SeleniumInit;

public class ComposableTest extends SeleniumInit {

	@Test
	public void verifyComposableSDKPageTitleUnderPlatformTab() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		composablePage.clickOnComposableMenuUnderPlatformTab();
		composablePage.verifyComposeSDKPageTitle();
	}

	@Test
	public void verifyHomeBreadcrumbTitleUnderComposablePage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		composablePage.clickOnComposableMenuUnderPlatformTab();
		commonMethods.clickOnHomeBreadcrumb();
		sisenseHeaderPage.verifySisenseHomePageTitle();
	}

	@Test
	public void verifyPlatformBreadcrumbTitleUnderComposablePage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		composablePage.clickOnComposableMenuUnderPlatformTab();
		commonMethods.clickOnPlatformBreadcrumb();
		sisenseHeaderPage.verifyPlatformPageTitle();
	}

	@Test
	public void verifyTryNowButtonPageTitleUnderComposeSDKBannerSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		composablePage.clickOnComposableMenuUnderPlatformTab();
		composablePage.clickOnTryNowButtonUnderComposeSDKBanner();
		commonMethods.verifySisense7_DayFreeTrialPageTitle();
	}

	@Test
	public void verifyBookALiveDemoButtonPageTitleUnderComposeSDKSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		composablePage.clickOnComposableMenuUnderPlatformTab();
		composablePage.scrollToComposeSDKTheComposableAnalyticsSolutionSection();
		composablePage.clickOnBookaLiveDemoButton();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyDownloadSolutionBriefButtonPageTitleUnderSwiftCodeFirstAnalyticsSection()
			throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		composablePage.clickOnComposableMenuUnderPlatformTab();
		composablePage.clickOnDownloadSolutionBriefButtonUnderSwiftCodeFirstAnalyticsSection();
		composablePage.verifyComposeSdkSolutionBriefPdf();
	}

	@Test
	public void verifySecondTryNowButtonPageTitleUnderTryItFreeFor30DaysSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		composablePage.clickOnComposableMenuUnderPlatformTab();
		composablePage.clickOnTryNowSecondButtonUnderTryItFreeFor30DaysSection();
		commonMethods.verifySisense7_DayFreeTrialPageTitle();
	}

	@Test
	public void verifyExplorePlaygroundButtonPageTitleUnderByDevelopersSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		composablePage.clickOnComposableMenuUnderPlatformTab();
		composablePage.clickOnExplorePlaygroundButtonUnderByDevelopersSection();
		composablePage.verifyDevelopersPlaygroundPageTitle();
	}

	@Test
	public void verifyLearnMoreButtonPageTitleUnderPoweredByFusionSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		composablePage.clickOnComposableMenuUnderPlatformTab();
		composablePage.clickOnLearnMoreButtonUnderPoweredByFusionSection();
		composablePage.verifyEmbeddableAnalyticsPageTitle();
	}

	@Test
	public void verifyTryFreePageTitleUnderStartYourFreeTrialSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		composablePage.clickOnComposableMenuUnderPlatformTab();
		commonMethods.scrollToStartYourFreeTrialSection();
		commonMethods.clickOnTryFreeButtonAboveFooter();
		commonMethods.verifySisense7_DayFreeTrialPageTitle();
	}

	@Test
	public void verifyDemoButtonPageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		composablePage.clickOnComposableMenuUnderPlatformTab();
		sisenseHeaderPage.clickOnDemoButton();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyBookALiveDemoButtonPageTitleUnderFooterSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		composablePage.clickOnComposableMenuUnderPlatformTab();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBookaLiveDemoButtonUnderFooter();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	public void verifyTryFreeButtonPageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		composablePage.clickOnComposableMenuUnderPlatformTab();
		sisenseHeaderPage.clickOnTryFreeButton();
		sisenseHeaderPage.verifyTryFreePageTitle();
	}

}
