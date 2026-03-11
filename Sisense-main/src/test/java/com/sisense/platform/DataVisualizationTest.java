package com.sisense.platform;

import org.testng.annotations.Test;

import com.kfast.init.SeleniumInit;
import com.sisense.common.CommonMethods;

public class DataVisualizationTest extends SeleniumInit {

	@Test
	public void verifyDataVisualizationPageTitleUnderPlatformTab() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		dataVisualizationPage.clickOnDataVisualizationMenuUnderPlatformTab();
		dataVisualizationPage.verifyDataVisualizationPageTitle();
	}

	@Test
	public void verifyGetA7_DayFreeTrialPageTitleUnderHeroBanner() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		dataVisualizationPage.clickOnDataVisualizationMenuUnderPlatformTab();
		dataVisualizationPage.scrollToBannerSection();
		dataVisualizationPage.clickOnGetA7_DayFreeTrialButtonUnderHeroBanner();

	}

	@Test
	public void verifyHomeBreadcrumbTitleUnderDataVisualizationPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		dataVisualizationPage.clickOnDataVisualizationMenuUnderPlatformTab();
		commonMethods.clickOnHomeBreadcrumb();
		sisenseHeaderPage.verifySisenseHomePageTitle();
	}

	@Test
	public void verifyPlatformBreadcrumbTitleUnderDataVisualizationPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		dataVisualizationPage.clickOnDataVisualizationMenuUnderPlatformTab();
		commonMethods.clickOnPlatformBreadcrumb();
		sisenseHeaderPage.verifyPlatformPageTitle();
	}

	@Test
	public void verifyDemoPageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		dataVisualizationPage.clickOnDataVisualizationMenuUnderPlatformTab();
		sisenseHeaderPage.clickOnDemoButton();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyFillFormFunctionality() throws Exception {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		dataVisualizationPage.clickOnDataVisualizationMenuUnderPlatformTab();
		customerStoriesPage.scrollToEmailLabelUnderFormSection();
		dataVisualizationPage.fillUpContactUsForm("madhavi.sriramaneni@kiwiqa.com", "Madhavi", "Sriramaneni",
				"9998887776", "KiwiQA", "QA");
		dataVisualizationPage.clickOnWatchDemoButtonButtonUnderForm();
		dataVisualizationPage.verifyFormSubmissionSuccess();
	}

	@Test
	public void verifyReadTheStoryPageTitle() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		dataVisualizationPage.clickOnDataVisualizationMenuUnderPlatformTab();
		dataVisualizationPage.clickReadTheStoryButton();

	}

	@Test
	public void verifyPrivacyPolicyPageUnderform() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		dataVisualizationPage.clickOnDataVisualizationMenuUnderPlatformTab();
		dataVisualizationPage.scrollToJobTitleLableUnderFormSection();
		dataVisualizationPage.clickOnPrivacyPolicyLinkUnderForm();
		dataVisualizationPage.verifyPrivacyPolicyPageTitle();

	}

	@Test
	public void verifyTermsOfServicePageUnderform() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		dataVisualizationPage.clickOnDataVisualizationMenuUnderPlatformTab();
		dataVisualizationPage.scrollToJobTitleLableUnderFormSection();
		dataVisualizationPage.clickOnTermsOfServiceLinkUnderForm();
		dataVisualizationPage.verifyTermsOfServicePageTitle();

	}

	@Test
	public void verifyBookaLiveDemoPageTitleUnderFooterSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		dataVisualizationPage.clickOnDataVisualizationMenuUnderPlatformTab();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBookaLiveDemoButtonUnderFooter();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

}
