package com.sisense.resources;

import org.testng.annotations.Test;

import com.kfast.init.SeleniumInit;

public class GlossaryTest extends SeleniumInit {
	@Test
	public void verifyGlossaryPageTitleUnderResourcesTab() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		glossaryPage.clickOnGlossaryMenuUnderResourcesTab();
		glossaryPage.verifyGlossaryPageTitle();
	}

	@Test
	public void verifyFillFormFunctionality() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		glossaryPage.clickOnGlossaryMenuUnderResourcesTab();
		glossaryPage.scrollToEmailLabelUnderFormSection();
		glossaryPage.fillUpTheForm("madhavi.sriramaneni@kiwiqa.com", "Madhavi", "Sriramaneni", "KiwiQA");
		marketplacePage.clickOnSignUPButtonUnderForm();
		glossaryPage.verifyFormSubmissionUnderGlossaryPage();
	}

	@Test
	public void verifyPrivacyPolicyPageTitleUnderFormSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		glossaryPage.clickOnGlossaryMenuUnderResourcesTab();
		marketplacePage.clickOnPrivacyPolicyLinkUnderFormSection();
		marketplacePage.verifyPrivacyPolicyPageTitleUnderFormSection();

	}

	@Test
	public void verifyTermsOfServicePageTitleUnderFormSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		glossaryPage.clickOnGlossaryMenuUnderResourcesTab();
		glossaryPage.clickOnTermsOfServiceLinkUnderFormSection();
		glossaryPage.verifyTermsOfServicePageTitle();
	}

	@Test
	public void verifyHomeBreadcrumbTitleUnderGlossaryPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		glossaryPage.clickOnGlossaryMenuUnderResourcesTab();
		commonMethods.clickOnHomeBreadcrumb();
		sisenseHeaderPage.verifySisenseHomePageTitle();
	}

	@Test
	public void verifyResourcehubBreadcrumbTitleUnderGlossaryPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		glossaryPage.clickOnGlossaryMenuUnderResourcesTab();
		commonMethods.clickOnResourcehubBreadcrumb();
		sisenseHeaderPage.verifyResourcesPageTitle();
	}

	@Test
	public void verifyDemoPageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		glossaryPage.clickOnGlossaryMenuUnderResourcesTab();
		sisenseHeaderPage.clickOnDemoButton();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyBookaliveDemoPageTitleUnderFooterSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		glossaryPage.clickOnGlossaryMenuUnderResourcesTab();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBookaLiveDemoButtonUnderFooter();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyTryFreePageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		glossaryPage.clickOnGlossaryMenuUnderResourcesTab();
		sisenseHeaderPage.clickOnTryFreeButton();
		sisenseHeaderPage.verifyTryFreePageTitle();
	}

	@Test
	public void verifyExploreTheSisensePlatformButtonPageTitleUnderAboveFooter() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		glossaryPage.clickOnGlossaryMenuUnderResourcesTab();
		glossaryPage.scrollToExploreTheAI_PoweredAnalyticsPlatformDsignedSection();
		glossaryPage.clickOnExploreTheSisensePlatformButtonUnderAboveFooter();
		glossaryPage.verifyPlatformPageTitle();
	}
}
