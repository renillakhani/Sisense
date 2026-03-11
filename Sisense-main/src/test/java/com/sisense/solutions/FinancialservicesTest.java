package com.sisense.solutions;

import org.testng.annotations.Test;

import com.kfast.init.SeleniumInit;

public class FinancialservicesTest extends SeleniumInit {
	@Test
	public void verifyFinancialservicesPageTitleUnderSolutionsTab() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		financialservicesPage.clickOnFinancialServicesMenuUnderSolutionsTab();
		financialservicesPage.verifyFinancialServicesPageTitle();
	}

	@Test
	public void verifyReadcustomerstoriesPageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		financialservicesPage.clickOnFinancialServicesMenuUnderSolutionsTab();
		financialservicesPage.clickOnReadCustomerStoriesButtonUnderBannerSection();
		financialservicesPage.verifyReadCustomerStoriesPageTitle();
	}

	@Test
	public void verifyLearnMorePageTitleUnderRevolutionizeFinancialAnalyticsSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		financialservicesPage.clickOnFinancialServicesMenuUnderSolutionsTab();
		financialservicesPage.clickOnLearnMoreButtonUnderRevolutionizeFinancialAnalyticsSection();
		financialservicesPage.verifyLearnMorePageTitle();
	}

	@Test
	public void verifyScheduleademoPageTitleUnderReduceFinancialSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		financialservicesPage.clickOnFinancialServicesMenuUnderSolutionsTab();
		financialservicesPage.clickOnScheduleADemoButtonUnderReduceFinancialSection();
		financialservicesPage.verifyScheduleADemoPageTitle();
	}

	@Test
	public void verifyTryFreePageTitleUnderStartYourFreeTrialSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		financialservicesPage.clickOnFinancialServicesMenuUnderSolutionsTab();
		commonMethods.scrollToStartYourFreeTrialSection();
		commonMethods.clickOnTryFreeButtonAboveFooter();
		commonMethods.verifySisense7_DayFreeTrialPageTitle();
	}

	@Test
	public void verifyHomeBreadcrumbTitleUnderSolutionsPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		financialservicesPage.clickOnFinancialServicesMenuUnderSolutionsTab();
		commonMethods.clickOnHomeBreadcrumb();
		sisenseHeaderPage.verifySisenseHomePageTitle();
	}

	@Test
	public void verifySolutionBreadcrumbTitleUnderSolutionsPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		financialservicesPage.clickOnFinancialServicesMenuUnderSolutionsTab();
		commonMethods.clickOnSolutionsBreadcrumb();
		sisenseHeaderPage.verifySolutionsPageTitle();
	}

	@Test
	public void verifyDemoPageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		financialservicesPage.clickOnFinancialServicesMenuUnderSolutionsTab();
		sisenseHeaderPage.clickOnDemoButton();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyBookaliveDemoPageTitleUnderFooterSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		financialservicesPage.clickOnFinancialServicesMenuUnderSolutionsTab();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBookaLiveDemoButtonUnderFooter();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyTryFreePageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToSolutionsTab();
		financialservicesPage.clickOnFinancialServicesMenuUnderSolutionsTab();
		sisenseHeaderPage.clickOnTryFreeButton();
		sisenseHeaderPage.verifyTryFreePageTitle();
	}

}
