package com.sisense.footer;

import org.testng.annotations.Test;

import com.kfast.init.SeleniumInit;

public class BrandPortalTest extends SeleniumInit {

	@Test
	public void verifyDemoPageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBrandPortalLinkUnderFooter();
		sisenseHeaderPage.clickOnDemoButton();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyTryFreePageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBrandPortalLinkUnderFooter();
		sisenseHeaderPage.clickOnTryFreeButton();
		sisenseHeaderPage.verifyTryFreePageTitle();
	}

	@Test
	public void verifyHomeBreadcrumbTitleUnderBrandPortalPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBrandPortalLinkUnderFooter();
		commonMethods.clickOnHomeBreadcrumb();
		sisenseHeaderPage.verifySisenseHomePageTitle();
	}

	@Test
	public void verifyResourcehubBreadcrumbTitleUnderBrandPortalPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBrandPortalLinkUnderFooter();
		commonMethods.clickOnResourcehubBreadcrumb();
		sisenseHeaderPage.verifyResourcesPageTitle();
	}

	@Test
	public void verifyBookaliveDemoPageTitleUnderFooterSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBrandPortalLinkUnderFooter();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBookaLiveDemoButtonUnderFooter();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifywebAimContrastCheckerPageTitleUnderSisenseTypographySection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBrandPortalLinkUnderFooter();
		brandPortalPage.clickOnWebAimContrastCheckerButtonUnderSisenseTypographySection();
		brandPortalPage.verifyWebAimContrastCheckerPageTitle();
	}

	@Test
	public void verifyfirstDownloadGoogleFontButtonPageTitleUnderPoppinsSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBrandPortalLinkUnderFooter();
		brandPortalPage.clickOnDownloadGoogleFontButtonUnderPoppinsSection();
		brandPortalPage.verifyDownloadGoogleFontPageTitleUnderPoppinsSection();
	}

	@Test
	public void verifyDownloadGoogleFontButtonPageTitleUnderDMSansSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBrandPortalLinkUnderFooter();
		brandPortalPage.clickOnDownloadGoogleFontButtonUnderDMSansSection();
		brandPortalPage.verifyDownloadGoogleFontPageTitleUnderDMSansSection();
	}

	@Test
	public void verifyDownloadButtonPageTitleUnderSisenseColorPaletteSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBrandPortalLinkUnderFooter();
		brandPortalPage.clickOnDownloadButtonUnderSisenseColorPaletteSection();
		brandPortalPage.verifyDownloadButtonPageTitleUnderSisenseColorPaletteSection();
	}

	@Test
	public void verifyLogoAssetsButtonPageTitleUnderWhatCanYouFindHereSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBrandPortalLinkUnderFooter();
		brandPortalPage.clickOnLogoAssetsButtonUnderWhatCanYouFindHereSection();
		sisenseFooterPage.verifyBrandPortalPageTitleUnderFooter();
	}

	@Test
	public void verifyColorsButtonPageTitleUnderWhatCanYouFindHereSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBrandPortalLinkUnderFooter();
		brandPortalPage.clickOnColorsButtonUnderWhatCanYouFindHereSection();
		sisenseFooterPage.verifyBrandPortalPageTitleUnderFooter();
	}

	@Test
	public void verifyTypographyButtonPageTitleUnderWhatCanYouFindHereSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBrandPortalLinkUnderFooter();
		brandPortalPage.clickOnTypographyButtonUnderWhatCanYouFindHereSection();
		sisenseFooterPage.verifyBrandPortalPageTitleUnderFooter();
	}

}
