package com.sisense.resources;

import org.testng.annotations.Test;

import com.kfast.init.SeleniumInit;

public class WhitepapersTest extends SeleniumInit {

	@Test
	public void verifyWhitepapersPageTitleUnderWhitepapersPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		whitepapersPage.clickOnWhitepapersMenuUnderResourcesTab();
		whitepapersPage.verifyWhitepapersPageTitle();
	}

	@Test
	public void verifyFillFormFunctionality() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		whitepapersPage.clickOnWhitepapersMenuUnderResourcesTab();
		marketplacePage.scrollToEmailLabelUnderFormSection();
		marketplacePage.fillUpForm("madhavi.sriramaneni@kiwiqa.com", "Madhavi", "Sriramaneni", "KiwiQA");
		marketplacePage.clickOnSignUPButtonUnderForm();
		customerStoriesPage.verifyFormSubmit();
	}

	@Test
	public void verifyPrivacyPolicyPageTitleUnderFormSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		whitepapersPage.clickOnWhitepapersMenuUnderResourcesTab();
		customerStoriesPage.clickOnPrivacyPolicyLinkUnderFormSection();
		customerStoriesPage.verifyPrivacyPolicyPageTitleUnderFormSection();
	}

	@Test
	public void verifyTermsOfServicePageTitleUnderFormSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		whitepapersPage.clickOnWhitepapersMenuUnderResourcesTab();
		customerStoriesPage.clickOnTermsOfServiceLinkUnderFormSection();
		customerStoriesPage.verifyTermsOfServicePageTitleUnderFormSection();
	}

	@Test
	public void verifyHomeBreadcrumbTitleUnderWhitepapersPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		whitepapersPage.clickOnWhitepapersMenuUnderResourcesTab();
		commonMethods.clickOnHomeBreadcrumb();
		sisenseHeaderPage.verifySisenseHomePageTitle();
	}

	@Test
	public void verifyResourcehubBreadcrumbTitleUnderWhitepapersPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		whitepapersPage.clickOnWhitepapersMenuUnderResourcesTab();
		commonMethods.clickOnResourcehubBreadcrumb();
		sisenseHeaderPage.verifyResourcesPageTitle();
	}

	@Test
	public void verifyDemoPageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		whitepapersPage.clickOnWhitepapersMenuUnderResourcesTab();
		sisenseHeaderPage.clickOnDemoButton();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyBookaliveDemoPageTitleUnderFooterSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		whitepapersPage.clickOnWhitepapersMenuUnderResourcesTab();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBookaLiveDemoButtonUnderFooter();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyTryFreePageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		whitepapersPage.clickOnWhitepapersMenuUnderResourcesTab();
		sisenseHeaderPage.clickOnTryFreeButton();
		sisenseHeaderPage.verifyTryFreePageTitle();
	}

	@Test
	public void verifyWhitepapersCardsUnderWhitepapersPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		whitepapersPage.clickOnWhitepapersMenuUnderResourcesTab();
		whitepapersPage.verifyWhitepapersCardsUnderWhitepapersPage();
	}

	@Test
	public void verifyWhitepapersCardsHeadingUnderWhitepapersPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		whitepapersPage.clickOnWhitepapersMenuUnderResourcesTab();
		whitepapersPage.verifyWhitepapersCardsHeadingUnderWhitepapersPage();
	}

	@Test
	public void verifyWatchADemoPageTitleAboveFooter() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		whitepapersPage.clickOnWhitepapersMenuUnderResourcesTab();
		whitepapersPage.scrollToSeeHowSisenseDeliversFastScalableInsightsSection();
		whitepapersPage.clickOnWatchADemoButton();
		whitepapersPage.verifyWatchADemoPageTitle();
	}

}
