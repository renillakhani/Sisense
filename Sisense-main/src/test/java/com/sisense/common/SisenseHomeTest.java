package com.sisense.common;

import org.testng.annotations.Test;

import com.kfast.init.SeleniumInit;

public class SisenseHomeTest extends SeleniumInit {

	@Test
	public void verifyTryFreeButtonUnderBannerSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		homePage.clickOnTryFreeButtonUnderBannerSection();

	}

	@Test
	public void verifyLearnMoreButtonUnderBannerSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		homePage.clickOnLearnmoreButtonUnderHeroSection();
		homePage.verifyLearnMorePageTitleUnderHeroBanner();

	}

	public void verifyLearnHowButtonBelowHomePageSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		homePage.clickOnLearnHowButtonBelowHeroSection();
	}

	@Test
	public void verifyLearnmoreButtonUnderBuildSmarterSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		homePage.clickOnLearnMoreButtonUnderBuildSmarterSection();
		composablePage.verifyComposeSDKPageTitle();
	}

	public void verifyLearnmoreButtonUnderEmbedWithPrecisionSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		homePage.clickOnLearnMoreButtonUnderEmbedWithPrecisionSection();
		composablePage.verifyComposeSDKPageTitle();
	}

	public void verifyLearnmoreButtonUnderGoFromDataSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		homePage.clickOnLearnMoreButtonUnderGoFromDataSection();
		sisenseIntelligencePage.verifySisenseIntelligencePageTitle();

	}

	public void verifyGetstartedtodayButtonUnderUnderAccelerateSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		homePage.clickOnGetStartedTodayButtonUnderAccelerateSection();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyReadTheBarriosCaseStudyButton() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		homePage.clickOnReadTheBigtincanCaseStudyButton();
		homePage.verifyReadTheBigtincanCaseStudyPageTitle();
	}

	@Test
	public void verifyJoinTheSisenseCommunityButtonUnderCommunitySection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		homePage.clickOnJoinTheSisenseCommunityButtonUnderFooterSection();
		homePage.verifyJoinTheSisenseCommunityPageTitle();
	}

	@Test
	public void verifyTryFreePageTitleUnderStartYourFreeTrialSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		homePage.scrollToStartYourFreeTrialSection();
		homePage.clickOnTryFreeButtonAboveFooter();
		commonMethods.verifySisense7_DayFreeTrialPageTitle();

	}

}
