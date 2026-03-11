package com.sisense.solutions;

import org.testng.annotations.Test;

import com.kfast.init.SeleniumInit;

public class ManufacturingTest extends SeleniumInit {
	@Test
	public void verifyManufacturingPageTitleUnderSolutionsTab() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		manufacturingPage.clickOnManufacturingMenuUnderSolutionsTab();
		manufacturingPage.verifyManufacturingPageTitle();
	}

	@Test
	public void verifyReadcustomerstoriesPageTitleUnderBannerSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		manufacturingPage.clickOnManufacturingMenuUnderSolutionsTab();;
		manufacturingPage.clickOnReadCustomerStoriesButtonUnderBannerSection();
		manufacturingPage.verifyReadCustomerStoriesPageTitle();
	}

	@Test
	public void verifyLearnMorePageTitlUnderAPIPlatformSectione() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		manufacturingPage.clickOnManufacturingMenuUnderSolutionsTab();;
		manufacturingPage.clickOnLearnMoreButtonUnderAPIPlatformSection();
		cloudPage.verifyCloudPageTitle();
	}

	@Test
	public void verifyScheduleademoPageTitleUnderProductionSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		manufacturingPage.clickOnManufacturingMenuUnderSolutionsTab();;
		manufacturingPage.clickOnScheduleADemoButtonUnderProductionSection();
		manufacturingPage.verifyScheduleADemoPageTitle();
	}

	@Test
	public void verifyTryFreePageTitleUnderStartYourFreeTrialSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		manufacturingPage.clickOnManufacturingMenuUnderSolutionsTab();;
		commonMethods.scrollToStartYourFreeTrialSection();
		commonMethods.clickOnTryFreeButtonAboveFooter();
		commonMethods.verifySisense7_DayFreeTrialPageTitle();
	}

	@Test
	public void verifyHomeBreadcrumbTitleUnderManufacturingPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		manufacturingPage.clickOnManufacturingMenuUnderSolutionsTab();;
		commonMethods.clickOnHomeBreadcrumb();
		sisenseHeaderPage.verifySisenseHomePageTitle();
	}

	@Test
	public void verifySolutionBreadcrumbTitleUnderManufacturingPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		manufacturingPage.clickOnManufacturingMenuUnderSolutionsTab();;
		commonMethods.clickOnSolutionsBreadcrumb();
		sisenseHeaderPage.verifySolutionsPageTitle();
	}

	@Test
	public void verifyDemoPageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		manufacturingPage.clickOnManufacturingMenuUnderSolutionsTab();;
		sisenseHeaderPage.clickOnDemoButton();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyBookaliveDemoPageTitleUnderFooterSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		manufacturingPage.clickOnManufacturingMenuUnderSolutionsTab();;
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBookaLiveDemoButtonUnderFooter();
		sisenseHeaderPage.verifyDemoPageTitle();
	}
	@Test
	public void verifyTryFreePageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		manufacturingPage.clickOnManufacturingMenuUnderSolutionsTab();;
		sisenseHeaderPage.clickOnTryFreeButton();
		sisenseHeaderPage.verifyTryFreePageTitle();
	}
	@Test
	public void verifyComposableDevelopmentTechnologyPageTitleUnderFastestWayToDeliverSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		manufacturingPage.clickOnManufacturingMenuUnderSolutionsTab();;
		manufacturingPage.scrollToFastestWayToDeliverSection();
		manufacturingPage.clickOnComposableDevelopmentTechnologyLinkUnderFastestWayToDeliverSection();
		composablePage.verifyComposeSDKPageTitle();
	}
}
