package com.sisense.solutions;

import org.testng.annotations.Test;

import com.kfast.init.SeleniumInit;

public class SolutionsTest extends SeleniumInit {

	@Test
	public void verifyHomeBreadcrumbTitleUnderSolutionsTab() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnSolutionsTab();
		commonMethods.clickOnHomeBreadcrumb();
		sisenseHeaderPage.verifySisenseHomePageTitle();
	}

	@Test
	public void verifyRequestADemoPageTitleUnderBannerSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnSolutionsTab();
		solutionsPage.scrollToBannerSection();
		solutionsPage.clickOnRequestDemoButtonUnderBannerSection();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyPrivacyPolicyPageTitleUnderForm() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnSolutionsTab();
		customerStoriesPage.clickOnPrivacyPolicyLinkUnderFormSection();
		customerStoriesPage.verifyPrivacyPolicyPageTitleUnderFormSection();
	}

	@Test
	public void verifyTermsOfServicePageTitleUnderForm() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnSolutionsTab();
		customerStoriesPage.clickOnTermsOfServiceLinkUnderFormSection();
		customerStoriesPage.verifyTermsOfServicePageTitleUnderFormSection();
	}

	@Test
	public void verifyFillFormFunctionality() throws Exception {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnSolutionsTab();
		customerStoriesPage.scrollToEmailLabelUnderFormSection();
		dataVisualizationPage.fillUpContactUsForm("madhavi.sriramaneni@kiwiqa.com", "Madhavi", "Sriramaneni",
				"9998887776", "KiwiQA", "QA");
		solutionsPage.clickOnContactUsButtonUnderForm();
		solutionsPage.verifyFormSubmissionSuccess();
	}

	@Test
	public void verifyDemoPageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnSolutionsTab();
		sisenseHeaderPage.clickOnDemoButton();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyBookaliveDemoPageTitleUnderFooterSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnSolutionsTab();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBookaLiveDemoButtonUnderFooter();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyTryFreePageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnSolutionsTab();
		sisenseHeaderPage.clickOnTryFreeButton();
		sisenseHeaderPage.verifyTryFreePageTitle();
	}

}
