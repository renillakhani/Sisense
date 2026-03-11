package com.sisense.solutions;

import org.testng.annotations.Test;

import com.kfast.init.SeleniumInit;

public class TechnologyTest extends SeleniumInit {
	@Test
	public void verifyTechnologyPageTitleUnderSolutionsTab() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		technologyPage.clickOnTechnologyMenuUnderSolutionsTab();
		technologyPage.verifyTechnologyPageTitle();
	}

	@Test
	public void verifyReadcustomerstoriesPageTitleUnderBannerSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		technologyPage.clickOnTechnologyMenuUnderSolutionsTab();
		technologyPage.clickOnReadCustomerStoriesButtonUnderBannerSection();
		technologyPage.verifyReadCustomerStoriesPageTitle();
	}

	@Test
	public void verifyLearnMorePageTitleUnderDelightYourCustomersSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		technologyPage.clickOnTechnologyMenuUnderSolutionsTab();
		technologyPage.clickOnLearnMoreButtonUnderDelightYourCustomersSection();
		embeddablePage.verifyEmbeddablePageTitleUnderPlatformTab();

	}

	@Test
	public void verifyScheduleademoPageTitleUnderEngageYourEndUsersSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		technologyPage.clickOnTechnologyMenuUnderSolutionsTab();
		technologyPage.clickOnScheduleADemoButtonUnderEngageYourEndUsersSection();
		technologyPage.verifyScheduleADemoPageTitle();
	}

	@Test
	public void verifyTryFreePageTitleUnderStartYourFreeTrialSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		technologyPage.clickOnTechnologyMenuUnderSolutionsTab();
		commonMethods.scrollToStartYourFreeTrialSection();
		commonMethods.clickOnTryFreeButtonAboveFooter();
		commonMethods.verifySisense7_DayFreeTrialPageTitle();
	}

	@Test
	public void verifyHomeBreadcrumbTitleUnderTechnologPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		technologyPage.clickOnTechnologyMenuUnderSolutionsTab();
		commonMethods.clickOnHomeBreadcrumb();
		sisenseHeaderPage.verifySisenseHomePageTitle();
	}

	@Test
	public void verifySolutionBreadcrumbTitleUnderTechnologPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		technologyPage.clickOnTechnologyMenuUnderSolutionsTab();
		commonMethods.clickOnSolutionsBreadcrumb();
		sisenseHeaderPage.verifySolutionsPageTitle();
	}

	@Test
	public void verifyDemoPageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		technologyPage.clickOnTechnologyMenuUnderSolutionsTab();
		sisenseHeaderPage.clickOnDemoButton();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyBookaliveDemoPageTitleUnderFooterSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		technologyPage.clickOnTechnologyMenuUnderSolutionsTab();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBookaLiveDemoButtonUnderFooter();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyTryFreePageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		technologyPage.clickOnTechnologyMenuUnderSolutionsTab();
		sisenseHeaderPage.clickOnTryFreeButton();
		sisenseHeaderPage.verifyTryFreePageTitle();
	}

	@Test
	public void verifyComposableDevelopmentPageTitleUnderEngageYourEndUsersSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		technologyPage.clickOnTechnologyMenuUnderSolutionsTab();
		technologyPage.scrollToEngageYourEndUsersSection();
		technologyPage.clickOnComposableDevelopmentLinkUnderEngageYourEndUsersSection();
		composablePage.verifyComposeSDKPageTitle();
	}
}
