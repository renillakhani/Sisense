package com.sisense.platform;

import org.testng.annotations.Test;

import com.kfast.init.SeleniumInit;

public class ConnectivityTest extends SeleniumInit {

	@Test
	public void verifyConnectivityPageTitleUnderPlatformTab() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		connectivityPage.clickOnConnectivityMenuUnderPlatformTab();
		connectivityPage.verifyConnectivityPageTitleUnderPlatformTab();
	}

	@Test
	public void verifyHomeBreadcrumbTitleUnderPlatformTab() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		connectivityPage.clickOnConnectivityMenuUnderPlatformTab();
		commonMethods.clickOnHomeBreadcrumb();
		sisenseHeaderPage.verifySisenseHomePageTitle();
	}

	@Test
	public void verifyPlatformBreadcrumbTitleUnderPlatformTab() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		connectivityPage.clickOnConnectivityMenuUnderPlatformTab();
		commonMethods.clickOnPlatformBreadcrumb();
		sisenseHeaderPage.verifyPlatformPageTitle();
	}

	@Test
	public void verifyBookADemoPageTitleUnderConnectYourDataSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		connectivityPage.clickOnConnectivityMenuUnderPlatformTab();
		connectivityPage.clickOnBookADemoButtonUnderConnectYourDataSection();
		sisenseHeaderPage.verifyDemoPageTitle();

	}

	@Test
	public void verifyLearnAboutLiveConnectionsPageTitleUnderRealTimeInsightsSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		connectivityPage.clickOnConnectivityMenuUnderPlatformTab();
		connectivityPage.clickOnLearnAboutLiveConnectionsButtonUnderRealTimeInsightsSection();
		connectivityPage.verifyIntroducingLiveModelsPageTitleUnderRealTimeInsightsSection();
	}

	@Test
	public void verifyLearnAboutElasticubePageTitleUnderConsolidateDataSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		connectivityPage.clickOnConnectivityMenuUnderPlatformTab();
		connectivityPage.clickOnLearnAboutElasticubeButtonUnderConsolidateDataSection();
		connectivityPage.verifyIntroducingElastiCubesPageTitleUnderConsolidateDataSection();
	}

	@Test
	public void verifyTryFreePageTitleUnderStartYourFreeTrialSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		connectivityPage.clickOnConnectivityMenuUnderPlatformTab();
		commonMethods.scrollToStartYourFreeTrialSection();
		commonMethods.clickOnTryFreeButtonAboveFooter();
		commonMethods.verifySisense7_DayFreeTrialPageTitle();
	}

	@Test
	public void verifyDemoPageTitleUnderHeader() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		connectivityPage.clickOnConnectivityMenuUnderPlatformTab();
		sisenseHeaderPage.clickOnDemoButton();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyBookALiveDemoPageTitleUnderFooter() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		connectivityPage.clickOnConnectivityMenuUnderPlatformTab();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBookaLiveDemoButtonUnderFooter();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	
	public void verifyTryFreePageTitleUnderHeader() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		connectivityPage.clickOnConnectivityMenuUnderPlatformTab();
		sisenseHeaderPage.clickOnTryFreeButton();
		sisenseHeaderPage.verifyTryFreePageTitle();
	}

}
