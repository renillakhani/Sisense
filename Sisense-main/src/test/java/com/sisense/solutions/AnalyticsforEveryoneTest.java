package com.sisense.solutions;

import org.testng.annotations.Test;

import com.kfast.init.SeleniumInit;

public class AnalyticsforEveryoneTest extends SeleniumInit {
	@Test
	public void verifyAnalyticsforEveryonePageTitleUnderSolutionTab() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		analyticsforEveryonePage.clickOnAnalyticsForEveryoneMenuUnderSolutionsTab();
		analyticsforEveryonePage.verifyAnalyticsForEveryonePageTitle();
	}

	@Test
	public void verifyRequestaDemoPageTitle() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		analyticsforEveryonePage.clickOnAnalyticsForEveryoneMenuUnderSolutionsTab();
		analyticsforEveryonePage.clickOnRequestADemoButtonUnderBannerSection();
		analyticsforEveryonePage.verifyRequestADemoPageTitle();
	}

	@Test
	public void verifyTakeTheSisenseTestDrivePageTitleUnderBannerSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		analyticsforEveryonePage.clickOnAnalyticsForEveryoneMenuUnderSolutionsTab();
		analyticsforEveryonePage.scrollToBannerSection();
		insightstoActionPage.clickOnFreeTrialButtonUnderBannerSection();
		commonMethods.verifySisense7_DayFreeTrialPageTitle();
	}

	@Test
	public void verifyWatchaDemoPageTitleUnderEnableTrulySelfServiceAnalyticsSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		analyticsforEveryonePage.clickOnAnalyticsForEveryoneMenuUnderSolutionsTab();
		analyticsforEveryonePage.clickOnWatchADemoButtonUnderSelfServiceSection();
		analyticsforEveryonePage.verifyWatchADemoPageTitle();
	}

	@Test
	public void verifyLearnMorePageTitleUnderProvideActionableInsightsSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		analyticsforEveryonePage.clickOnAnalyticsForEveryoneMenuUnderSolutionsTab();
		analyticsforEveryonePage.clickOnLearnMoreButtonUnderProvideActionableInsightsSection();
		analyticsforEveryonePage.verifyLearnMorePageTitle();
	}

	@Test
	public void verifysecondLearnMorePageTitleUnderBoostEngagementSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		analyticsforEveryonePage.clickOnAnalyticsForEveryoneMenuUnderSolutionsTab();
		analyticsforEveryonePage.clickOnLearnMoreButtonUnderBoostEngagementSection();
		analyticsforEveryonePage.verifySecondLearnMorePageTitle();
	}

	@Test
	public void verifyTryFreePageTitleUnderStartYourFreeTrialSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		analyticsforEveryonePage.clickOnAnalyticsForEveryoneMenuUnderSolutionsTab();
		commonMethods.scrollToStartYourFreeTrialSection();
		commonMethods.clickOnTryFreeButtonAboveFooter();
		commonMethods.verifySisense7_DayFreeTrialPageTitle();
	}

	@Test
	public void verifyHomeBreadcrumbTitleUnderAnalyticsForEveryonePage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		analyticsforEveryonePage.clickOnAnalyticsForEveryoneMenuUnderSolutionsTab();
		commonMethods.clickOnHomeBreadcrumb();
		sisenseHeaderPage.verifySisenseHomePageTitle();
	}

	@Test
	public void verifySolutionBreadcrumbTitleUnderAnalyticsForEveryonePage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		analyticsforEveryonePage.clickOnAnalyticsForEveryoneMenuUnderSolutionsTab();
		commonMethods.clickOnSolutionsBreadcrumb();
		sisenseHeaderPage.verifySolutionsPageTitle();
	}

	@Test
	public void verifyDemoPageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		analyticsforEveryonePage.clickOnAnalyticsForEveryoneMenuUnderSolutionsTab();
		sisenseHeaderPage.clickOnDemoButton();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyBookaliveDemoPageTitleUnderFooterSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		analyticsforEveryonePage.clickOnAnalyticsForEveryoneMenuUnderSolutionsTab();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBookaLiveDemoButtonUnderFooter();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyTryFreePageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		analyticsforEveryonePage.clickOnAnalyticsForEveryoneMenuUnderSolutionsTab();
		sisenseHeaderPage.clickOnTryFreeButton();
		sisenseHeaderPage.verifyTryFreePageTitle();
	}
}
