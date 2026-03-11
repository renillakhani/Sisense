package com.sisense.resources;

import org.testng.annotations.Test;

import com.kfast.init.SeleniumInit;

public class SupportTest extends SeleniumInit {

	@Test
	public void verifySupportPageTitleUnderResourcesTab() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		supportPage.clickOnSupportMenuUnderResourcesTab();
		supportPage.verifySupportPageTitle();
	}

	@Test
	public void verifySupportPortalPageTitleUnderCustomerSuccessAndSupportSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		supportPage.clickOnSupportMenuUnderResourcesTab();
		supportPage.clickOnSupportPortalLinkUnderCustomerSuccessAndSupportSection();
		supportPage.verifySignInToSisenseCommunityPageTitleUnderDocumentation();
	}

	@Test
	public void verifyContactUsPageTitleUnderGetInTouchSection() throws Exception {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		supportPage.clickOnSupportMenuUnderResourcesTab();
		supportPage.clickOnContactUsButtonUnderGetInTouchSection();
		supportPage.verifyGetInTouchPageTitle();
	}

	@Test
	public void verifyHomeBreadcrumbTitleUnderSupportPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		supportPage.clickOnSupportMenuUnderResourcesTab();
		commonMethods.clickOnHomeBreadcrumb();
		sisenseHeaderPage.verifySisenseHomePageTitle();
	}

	@Test
	public void verifyDemoPageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		supportPage.clickOnSupportMenuUnderResourcesTab();
		sisenseHeaderPage.clickOnDemoButton();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyBookaliveDemoPageTitleUnderFooterSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		supportPage.clickOnSupportMenuUnderResourcesTab();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBookaLiveDemoButtonUnderFooter();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyTryFreePageTitleUnderHedaerSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		supportPage.clickOnSupportMenuUnderResourcesTab();
		sisenseHeaderPage.clickOnTryFreeButton();
		sisenseHeaderPage.verifyTryFreePageTitle();
	}
}
