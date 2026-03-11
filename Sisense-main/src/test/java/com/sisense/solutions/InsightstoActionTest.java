package com.sisense.solutions;

import org.testng.annotations.Test;

import com.kfast.init.SeleniumInit;

public class InsightstoActionTest extends SeleniumInit {
	@Test
	public void verifyInsightstoActionPageTitleUnderSolutionTab() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		insightstoActionPage.clickOnInsightsToActionMenuUnderSolutionTab();
		insightstoActionPage.verifyInsightsToActionPageTitle();
	}

	
	public void verifyRequestaDemoPageTitleUnderBannerSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		insightstoActionPage.clickOnInsightsToActionMenuUnderSolutionTab();
		insightstoActionPage.clickOnRequestADemoButtonUnderBannerSection();
		insightstoActionPage.verifyRequestADemoPageTitle();
	}

	@Test
	public void verifyTakeTheSisenseTestDrivePageTitleUnderBannerSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		insightstoActionPage.clickOnInsightsToActionMenuUnderSolutionTab();
		insightstoActionPage.scrollToBannerSection();
		insightstoActionPage.clickOnFreeTrialButtonUnderBannerSection();
		commonMethods.verifySisense7_DayFreeTrialPageTitle();
	}

	@Test
	public void verifyLearnMorePageTitleUnderConnectAllDataSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		insightstoActionPage.clickOnInsightsToActionMenuUnderSolutionTab();
		insightstoActionPage.clickOnLearnMoreButtonUnderConnectAllDataSection();
		insightstoActionPage.verifyLearnMorePageTitleUnderConnectAllDataSection();
	}

	@Test
	public void verifysecondLearnMorePageTitleUnderEliminateBarriersSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		insightstoActionPage.clickOnInsightsToActionMenuUnderSolutionTab();
		insightstoActionPage.clickOnLearnMoreButtonUnderEliminateBarriersSection();
		insightstoActionPage.verifyLearnMorePageTitleUnderEliminateBarriersSection();
	}

	@Test
	public void verifyThirdLearnMorePageTitleUnderAIExplorationSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		insightstoActionPage.clickOnInsightsToActionMenuUnderSolutionTab();
		insightstoActionPage.clickOnLearnMoreButtonUnderAIExplorationSection();
		sisenseIntelligencePage.verifySisenseIntelligencePageTitle();
	}

	@Test
	public void verifyTryFreePageTitleUnderStartYourFreeTrialSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		insightstoActionPage.clickOnInsightsToActionMenuUnderSolutionTab();
		commonMethods.scrollToStartYourFreeTrialSection();
		commonMethods.clickOnTryFreeButtonAboveFooter();
		commonMethods.verifySisense7_DayFreeTrialPageTitle();
	}
	

	@Test
	public void verifyHomeBreadcrumbTitleUnderInsightsToActionPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		insightstoActionPage.clickOnInsightsToActionMenuUnderSolutionTab();
		commonMethods.clickOnHomeBreadcrumb();
		sisenseHeaderPage.verifySisenseHomePageTitle();
	}

	@Test
	public void verifySolutionsBreadcrumbTitleUnderInsightsToActionPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		insightstoActionPage.clickOnInsightsToActionMenuUnderSolutionTab();
		commonMethods.clickOnSolutionsBreadcrumb();
		sisenseHeaderPage.verifySolutionsPageTitle();
	}

	@Test
	public void verifyDemoPageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		insightstoActionPage.clickOnInsightsToActionMenuUnderSolutionTab();
		sisenseHeaderPage.clickOnDemoButton();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyBookaliveDemoPageTitleUnderFooterSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		insightstoActionPage.clickOnInsightsToActionMenuUnderSolutionTab();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBookaLiveDemoButtonUnderFooter();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyTryFreePageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		insightstoActionPage.clickOnInsightsToActionMenuUnderSolutionTab();
		sisenseHeaderPage.clickOnTryFreeButton();
		sisenseHeaderPage.verifyTryFreePageTitle();
	}
}
