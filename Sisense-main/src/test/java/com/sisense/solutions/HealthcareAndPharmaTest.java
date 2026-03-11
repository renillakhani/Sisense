package com.sisense.solutions;

import org.testng.annotations.Test;

import com.kfast.init.SeleniumInit;

public class HealthcareAndPharmaTest extends SeleniumInit {

	@Test
	public void verifyHealthcareAndPharmaTestPageTitleUnderSolutionsTab() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		healthcareAndPharmaPage.clickOnHealthcareAndPharmaMenuUnderSolutionsTab();
		healthcareAndPharmaPage.verifyHealthcareAndPharmaPageTitle();
	}

	@Test
	public void verifyReadcustomerstoriesPageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		healthcareAndPharmaPage.clickOnHealthcareAndPharmaMenuUnderSolutionsTab();
		financialservicesPage.clickOnReadCustomerStoriesButtonUnderBannerSection();
		healthcareAndPharmaPage.verifyHealthcareAndPharmaPageTitle();
	}

	@Test
	public void verifyLearnMorePageTitleUnderTheFastestPathSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		healthcareAndPharmaPage.clickOnHealthcareAndPharmaMenuUnderSolutionsTab();
		healthcareAndPharmaPage.scrollToTheFastestPathSection();
		healthcareAndPharmaPage.clickOnLearnMoreButtonUnderTheFastestPathSection();
		sisenseHeaderPage.verifyPlatformPageTitle();
	}

	@Test
	public void verifyFirstScheduleADemoPageTitleUnderContextualAnalyticsSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		healthcareAndPharmaPage.clickOnHealthcareAndPharmaMenuUnderSolutionsTab();
		healthcareAndPharmaPage.scrollToContextualAnalyticsSection();
		healthcareAndPharmaPage.clickOnFreeTrialButtonUnderContextualAnalyticsSection();
		commonMethods.verifySisense7_DayFreeTrialPageTitle();
	}

	@Test
	public void verifySecondScheduleADemoPageTitleUnderSecurelyTTransformPatientSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		healthcareAndPharmaPage.clickOnHealthcareAndPharmaMenuUnderSolutionsTab();
		healthcareAndPharmaPage.scrollToSecurelyTransformPatientSection();
		healthcareAndPharmaPage.clickOnSecondScheduleADemoButtonUnderSecurelyTTransformPatientSection();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyWatchNowPageTitleUnderMytonomySection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		healthcareAndPharmaPage.clickOnHealthcareAndPharmaMenuUnderSolutionsTab();
		healthcareAndPharmaPage.scrollToMytonomySectionUnderHealthcareAndPharmaPage();
		healthcareAndPharmaPage.clickOnWatchNowButtonUnderMytonomySection();
		healthcareAndPharmaPage.verifyRevolutionizingUserExperienceAndDataSecurityPageTitle();
	}

	@Test
	public void verifyTryFreePageTitleUnderStartYourFreeTrialSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		healthcareAndPharmaPage.clickOnHealthcareAndPharmaMenuUnderSolutionsTab();
		commonMethods.scrollToStartYourFreeTrialSection();
		commonMethods.clickOnTryFreeButtonAboveFooter();
		commonMethods.verifySisense7_DayFreeTrialPageTitle();
	}

	@Test
	public void verifyHomeBreadcrumbTitleUnderHealthcareAndPharmPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		healthcareAndPharmaPage.clickOnHealthcareAndPharmaMenuUnderSolutionsTab();
		commonMethods.clickOnHomeBreadcrumb();
		sisenseHeaderPage.verifySisenseHomePageTitle();
	}

	@Test
	public void verifySolutionBreadcrumbTitleUnderHealthcareAndPharmPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		healthcareAndPharmaPage.clickOnHealthcareAndPharmaMenuUnderSolutionsTab();
		commonMethods.clickOnSolutionsBreadcrumb();
		sisenseHeaderPage.verifySolutionsPageTitle();
	}

	@Test
	public void verifyDemoPageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		healthcareAndPharmaPage.clickOnHealthcareAndPharmaMenuUnderSolutionsTab();
		sisenseHeaderPage.clickOnDemoButton();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyBookaliveDemoPageTitleUnderFooterSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		healthcareAndPharmaPage.clickOnHealthcareAndPharmaMenuUnderSolutionsTab();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBookaLiveDemoButtonUnderFooter();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyTryFreePageTitleUnderFooterSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		healthcareAndPharmaPage.clickOnHealthcareAndPharmaMenuUnderSolutionsTab();
		sisenseHeaderPage.clickOnTryFreeButton();
		sisenseHeaderPage.verifyTryFreePageTitle();
	}
}
