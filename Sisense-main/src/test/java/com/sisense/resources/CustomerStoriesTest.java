package com.sisense.resources;

import org.testng.annotations.Test;

import com.kfast.init.SeleniumInit;

public class CustomerStoriesTest extends SeleniumInit {
	@Test
	public void verifyCustomerStoriesPageTitleUnderResourcesTab() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		customerStoriesPage.clickOnCustomerStoriesMenuUnderResourcesTab();
		customerStoriesPage.verifyCustomerStoriesPageTitle();
	}

	@Test
	public void verifyCaseStudyCardsUnderCaseStudyPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		customerStoriesPage.clickOnCustomerStoriesMenuUnderResourcesTab();
		customerStoriesPage.verifyCaseStudyCardsUnderCaseStudyPage();

	}

	@Test
	public void verifyCaseStudyCardsHeadingUnderCaseStudyPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		customerStoriesPage.clickOnCustomerStoriesMenuUnderResourcesTab();
		customerStoriesPage.verifyCaseStudyCardsHeadingUnderCaseStudyPage();

	}

	@Test
	public void verifyFillFormFunctionality() throws Exception {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		customerStoriesPage.clickOnCustomerStoriesMenuUnderResourcesTab();
		customerStoriesPage.scrollToEmailLabelUnderFormSection();
		dataVisualizationPage.fillUpContactUsForm("madhavi.sriramaneni@kiwiqa.com", "Madhavi", "Sriramaneni",
				"9998887776", "KiwiQA", "QA");
		customerStoriesPage.clickOnWatchDemoButtonUnderFormSection();
		customerStoriesPage.verifyFormSubmit();
	}

	@Test
	public void verifyPrivacyPolicyPageTitleUnderFormSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		customerStoriesPage.clickOnCustomerStoriesMenuUnderResourcesTab();
		customerStoriesPage.clickOnPrivacyPolicyLinkUnderFormSection();
		customerStoriesPage.verifyPrivacyPolicyPageTitleUnderFormSection();
	}

	@Test
	public void verifyTermsOfServicePageTitleUnderFormSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		customerStoriesPage.clickOnCustomerStoriesMenuUnderResourcesTab();
		customerStoriesPage.clickOnTermsOfServiceLinkUnderFormSection();
		customerStoriesPage.verifyTermsOfServicePageTitleUnderFormSection();
	}

	@Test
	public void verifyHomeBreadcrumbTitleUnderCustomerStoriesPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		customerStoriesPage.clickOnCustomerStoriesMenuUnderResourcesTab();
		commonMethods.clickOnHomeBreadcrumb();
		sisenseHeaderPage.verifySisenseHomePageTitle();
	}

	@Test
	public void verifyResourcehubBreadcrumbTitleUnderCustomerStoriesPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		customerStoriesPage.clickOnCustomerStoriesMenuUnderResourcesTab();
		commonMethods.clickOnResourcehubBreadcrumb();
		sisenseHeaderPage.verifyResourcesPageTitle();
	}

	@Test
	public void verifyDemoPageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		customerStoriesPage.clickOnCustomerStoriesMenuUnderResourcesTab();
		sisenseHeaderPage.clickOnDemoButton();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyBookaliveDemoPageTitleUnderFooterSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		customerStoriesPage.clickOnCustomerStoriesMenuUnderResourcesTab();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBookaLiveDemoButtonUnderFooter();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyTryFreePageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		customerStoriesPage.clickOnCustomerStoriesMenuUnderResourcesTab();
		sisenseHeaderPage.clickOnTryFreeButton();
		sisenseHeaderPage.verifyTryFreePageTitle();
	}

}
