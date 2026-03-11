package com.sisense.resources;

import org.testng.annotations.Test;

import com.kfast.init.SeleniumInit;

public class BlogTest extends SeleniumInit {
	@Test
	public void verifyBlogPageTitleUnderResourcesTab() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		blogPage.clickOnBlogMenuUnderResourcesTab();
		blogPage.verifyBlogPageTitle();
	}

	@Test
	public void verifyFillFormFunctionality() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		blogPage.clickOnBlogMenuUnderResourcesTab();
		blogPage.scrollToEmailLabelUnderFormSection();
		blogPage.fillUpTheForm("madhavi.sriramaneni@kiwiqa.com", "Madhavi", "Sriramaneni", "KiwiQA");
		marketplacePage.clickOnSignUPButtonUnderForm();
		blogPage.verifyFormSubmission();

	}

	@Test
	public void verifyPrivacyPolicyPageTitleUnderFormSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		blogPage.clickOnBlogMenuUnderResourcesTab();
		blogPage.clickOnPrivacyPolicyLinkUnderFormSection();
		blogPage.verifyPrivacyPolicyPageTitle();
	}

	@Test
	public void verifyTermsOfServicePageTitleInderFormSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		blogPage.clickOnBlogMenuUnderResourcesTab();
		blogPage.clickOnTermsOfServiceLinkUnderFormSection();
		blogPage.verifyTermsOfServicePageTitle();
	}

	@Test
	public void verifyHomeBreadcrumbTitleUnderBlogPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		blogPage.clickOnBlogMenuUnderResourcesTab();
		commonMethods.clickOnHomeBreadcrumb();
		sisenseHeaderPage.verifySisenseHomePageTitle();
	}

	@Test
	public void verifyDemoPageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		blogPage.clickOnBlogMenuUnderResourcesTab();
		sisenseHeaderPage.clickOnDemoButton();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyBookaliveDemoPageTitleUnderFooterSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		blogPage.clickOnBlogMenuUnderResourcesTab();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBookaLiveDemoButtonUnderFooter();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyTryFreePageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		blogPage.clickOnBlogMenuUnderResourcesTab();
		sisenseHeaderPage.clickOnTryFreeButton();
		sisenseHeaderPage.verifyTryFreePageTitle();
	}

	@Test
	public void verifyExploreTheSisensePlatformButtonPageTitleUnderAboveFooter() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		blogPage.clickOnBlogMenuUnderResourcesTab();
		blogPage.scrollToExploreTheAI_PoweredAnalyticsPlatformDsignedSection();
		blogPage.clickOnExploreTheSisensePlatformButtonUnderAboveFooter();
		blogPage.verifyPlatformPageTitle();
	}

}
