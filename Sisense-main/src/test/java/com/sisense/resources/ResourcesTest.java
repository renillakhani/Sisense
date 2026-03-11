package com.sisense.resources;

import org.testng.annotations.Test;

import com.kfast.init.SeleniumInit;

public class ResourcesTest extends SeleniumInit {

	@Test
	public void verifyHomeBreadcrumbTitleUnderResourcesPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnResourcesTab();
		commonMethods.clickOnHomeBreadcrumb();
		sisenseHeaderPage.verifySisenseHomePageTitle();
	}

	@Test
	public void verifySeeAllResourcesButtonTitleUnderBannerSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnResourcesTab();
		resourcesPage.scrollToBannerSection();
		resourcesPage.clickOnSeeAllResourcesButtonUnderBannerSection();
		sisenseHeaderPage.verifyResourcesPageTitle();
	}

	@Test
	public void verifyDemoPageTitleUnderHedaerSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnResourcesTab();
		sisenseHeaderPage.clickOnDemoButton();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyBookaliveDemoPageTitleUnderFooterSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnResourcesTab();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBookaLiveDemoButtonUnderFooter();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyTryFreePageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnResourcesTab();
		sisenseHeaderPage.clickOnTryFreeButton();
		sisenseHeaderPage.verifyTryFreePageTitle();
	}

}
