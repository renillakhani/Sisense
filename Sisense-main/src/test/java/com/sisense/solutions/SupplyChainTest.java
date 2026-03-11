package com.sisense.solutions;

import org.testng.annotations.Test;

import com.kfast.init.SeleniumInit;

public class SupplyChainTest extends SeleniumInit {

	@Test
	public void verifySupplyChainPageTitleUnderSolutionsTab() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		supplyChainPage.clickOnSupplyChainMenuUnderSolutionsTab();
		supplyChainPage.verifySupplyChainPageTitle();
	}

	@Test
	public void verifyReadcustomerstoriesPageTitleUnderBannerSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		supplyChainPage.clickOnSupplyChainMenuUnderSolutionsTab();
		financialservicesPage.clickOnReadCustomerStoriesButtonUnderBannerSection();
		supplyChainPage.verifySupplyChainPageTitle();
	}

	@Test
	public void verifyLearnMorePageTitleUnderTransformSupplyChainAnalyticsSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		supplyChainPage.clickOnSupplyChainMenuUnderSolutionsTab();
		supplyChainPage.scrollToTransformSupplyChainAnalyticsSection();
		supplyChainPage.clickOnLearnMoreButtonUnderTransformSupplyChainAnalyticsSection();
		sisenseIntelligencePage.verifySisenseIntelligencePageTitle();
	}

	@Test
	public void verifyScheduleADemoPageTitleUnderIntegrateAllDataSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		supplyChainPage.clickOnSupplyChainMenuUnderSolutionsTab();
		supplyChainPage.scrollToIntegrateAllDataSection();
		supplyChainPage.clickOnScheduleADemoButtonUnderIntegrateAllDataSection();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyTryFreePageTitleUnderStartYourFreeTrialSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		supplyChainPage.clickOnSupplyChainMenuUnderSolutionsTab();
		commonMethods.scrollToStartYourFreeTrialSection();
		commonMethods.clickOnTryFreeButtonAboveFooter();
		commonMethods.verifySisense7_DayFreeTrialPageTitle();
	}

	@Test
	public void verifyHomeBreadcrumbTitleUnderSupplyChainPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		supplyChainPage.clickOnSupplyChainMenuUnderSolutionsTab();
		commonMethods.clickOnHomeBreadcrumb();
		sisenseHeaderPage.verifySisenseHomePageTitle();
	}

	@Test
	public void verifySolutionBreadcrumbTitleUnderSupplyChainPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		supplyChainPage.clickOnSupplyChainMenuUnderSolutionsTab();
		commonMethods.clickOnSolutionsBreadcrumb();
		sisenseHeaderPage.verifySolutionsPageTitle();
	}

	@Test
	public void verifyDemoPageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		supplyChainPage.clickOnSupplyChainMenuUnderSolutionsTab();
		sisenseHeaderPage.clickOnDemoButton();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyBookaliveDemoPageTitleUnderFooterSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		supplyChainPage.clickOnSupplyChainMenuUnderSolutionsTab();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBookaLiveDemoButtonUnderFooter();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyTryFreePageTitleUnderHeadersSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		supplyChainPage.clickOnSupplyChainMenuUnderSolutionsTab();
		sisenseHeaderPage.clickOnTryFreeButton();
		sisenseHeaderPage.verifyTryFreePageTitle();
	}

	@Test
	public void verifyComposableDevelopmentTechnologyPageTitleUnderBuildSupplyChainAnalyticsSection()
			throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		supplyChainPage.clickOnSupplyChainMenuUnderSolutionsTab();
		supplyChainPage.scrollToBuildSupplyChainAnalyticsSection();
		supplyChainPage.clickOnComposableDevelopmentTechnologyLinkUnderBuildSupplyChainAnalyticsSection();
		composablePage.verifyComposeSDKPageTitle();
	}
}
