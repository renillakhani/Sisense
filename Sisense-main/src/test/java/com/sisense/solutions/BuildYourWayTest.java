package com.sisense.solutions;

import org.testng.annotations.Test;

import com.kfast.init.SeleniumInit;

public class BuildYourWayTest extends SeleniumInit {

	@Test
	public void verifyBuildYourWayPageTitleUnderSolutionsTab() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		buildYourWayPage.clickOnBuildYourWayMenuUnderSolutionsTab();
		buildYourWayPage.verifyBuildYourWayPageTitle();
	}

	@Test
	public void verifyHomeBreadcrumbTitleUnderBuildYourWayPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		buildYourWayPage.clickOnBuildYourWayMenuUnderSolutionsTab();
		commonMethods.clickOnHomeBreadcrumb();
		sisenseHeaderPage.verifySisenseHomePageTitle();
	}

	@Test
	public void verifySolutionsBreadcrumbTitleUnderBuildYourWayPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		buildYourWayPage.clickOnBuildYourWayMenuUnderSolutionsTab();
		commonMethods.clickOnSolutionsBreadcrumb();
		sisenseHeaderPage.verifySolutionsPageTitle();
	}

	@Test
	public void verifyRequestADemoPageTitleUnderBannerSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		buildYourWayPage.clickOnBuildYourWayMenuUnderSolutionsTab();
		buildYourWayPage.clickOnRequestADemoButtonUnderBannerSection();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyTakeTheSisenseTestDrivePageTitleUnderBannerSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		buildYourWayPage.clickOnBuildYourWayMenuUnderSolutionsTab();
		buildYourWayPage.scrollToBannerSection();
		insightstoActionPage.clickOnFreeTrialButtonUnderBannerSection();
		commonMethods.verifySisense7_DayFreeTrialPageTitle();
	}

	@Test
	public void verifyLearnMorePageTitleUnderCustomizeAnalyticsEffortlesslySection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		buildYourWayPage.clickOnBuildYourWayMenuUnderSolutionsTab();
		buildYourWayPage.clickOnLearnMoreButtonUnderCustomizeAnalyticsEffortlesslySection();
		composablePage.verifyComposeSDKPageTitle();
	}

	@Test
	public void verifyCheckOutThePlaygroundPageTitleUnderBuiltInAnalyticsSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		buildYourWayPage.clickOnBuildYourWayMenuUnderSolutionsTab();
		buildYourWayPage.clickOnCheckOutThePlaygroundButtonUnderBuiltInAnalyticsSection();
		composablePage.verifyDevelopersPlaygroundPageTitle();
	}

	@Test
	public void verifyWatchADemoPageTitleUnderAIExperiencesSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		buildYourWayPage.clickOnBuildYourWayMenuUnderSolutionsTab();
		buildYourWayPage.clickOnWatchADemoButtonUnderAIExperiencesSection();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyTryFreePageTitleUnderStartYourFreeTrialSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		buildYourWayPage.clickOnBuildYourWayMenuUnderSolutionsTab();
		commonMethods.scrollToStartYourFreeTrialSection();
		commonMethods.clickOnTryFreeButtonAboveFooter();
		commonMethods.verifySisense7_DayFreeTrialPageTitle();
	}

	@Test
	public void verifyDemoPageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		buildYourWayPage.clickOnBuildYourWayMenuUnderSolutionsTab();
		sisenseHeaderPage.clickOnDemoButton();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyBookaliveDemoPageTitleUnderFooterSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		buildYourWayPage.clickOnBuildYourWayMenuUnderSolutionsTab();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBookaLiveDemoButtonUnderFooter();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyTryFreePageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		buildYourWayPage.clickOnBuildYourWayMenuUnderSolutionsTab();
		sisenseHeaderPage.clickOnTryFreeButton();
		sisenseHeaderPage.verifyTryFreePageTitle();
	}

}
