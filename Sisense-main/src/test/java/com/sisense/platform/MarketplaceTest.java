package com.sisense.platform;

import org.testng.annotations.Test;

import com.kfast.init.Common;
import com.kfast.init.SeleniumInit;

public class MarketplaceTest extends SeleniumInit {

	@Test
	public void verifyMarketplacePageTitleUnderPlatformSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		marketplacePage.clickOnMarketplaceMenuUnderPlatformSection();
		marketplacePage.verifyMarketplacePageTitle();
	}

	@Test
	public void verifyHomeBreadcrumbTitleUnderMarketplacePage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		marketplacePage.clickOnMarketplaceMenuUnderPlatformSection();
		commonMethods.clickOnHomeBreadcrumb();
		sisenseHeaderPage.verifySisenseHomePageTitle();
	}

	@Test
	public void verifyCheckOutOurCommunityLinkTitleUnderBannerSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		marketplacePage.clickOnMarketplaceMenuUnderPlatformSection();
		marketplacePage.clickOnCheckOutOurCommunityLinkUnderBannerSection();
		marketplacePage.verifyCommunitySiteHomePageTitle();
	}

	@Test
	public void verifySearchFunctionalityUnderFilterSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		marketplacePage.clickOnMarketplaceMenuUnderPlatformSection();
		marketplacePage.scrollToCardsUnderFilterSection();
		marketplacePage.clickOnSearchIconUnderFilterSection();
		marketplacePage.enterPaldiTextUnderSearchBox();
		marketplacePage.verifySearchDataUnderFilterSection();
	}

	@Test
	public void verifyPremiumFilterUnderCostFilterFunctionality() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		marketplacePage.clickOnMarketplaceMenuUnderPlatformSection();
		marketplacePage.scrollToCardsUnderFilterSection();
		marketplacePage.clickOnCostFilterButtonUnderFIlterSection();
		marketplacePage.selectPremiumOptionUnderCostFilter();
		marketplacePage.verifySearchDataUnderPremiumFilterSection();
	}

	@Test
	public void verifyFreeFilterUnderCostFilterFunctionality() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		marketplacePage.clickOnMarketplaceMenuUnderPlatformSection();
		marketplacePage.scrollToCardsUnderFilterSection();
		marketplacePage.clickOnCostFilterButtonUnderFIlterSection();
		marketplacePage.selectFreeOptionUnderCostFilter();
		marketplacePage.verifySearchDataUnderFreeFilterSection();
	}

	@Test
	public void verifyPublisherFilterFunctionalityUnderFilterSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		marketplacePage.clickOnMarketplaceMenuUnderPlatformSection();
		marketplacePage.scrollToCardsUnderFilterSection();
		marketplacePage.clickOnPublisherFilterButtonUnderFilter();
		marketplacePage.selectPaldiSolutionsOptionUnderPublisherFilter();
		marketplacePage.verifySearchDataUnderFilterSection();
	}

	@Test
	public void verifyFillFormFunctionality() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		marketplacePage.clickOnMarketplaceMenuUnderPlatformSection();
		marketplacePage.scrollToEmailLabelUnderFormSection();
		marketplacePage.fillUpForm("madhavi.sriramaneni@kiwiqa.com", "Madhavi", "Sriramaneni", "KiwiQA");
		marketplacePage.clickOnSignUPButtonUnderForm();
		marketplacePage.verifyFormSubmit();
	}

	@Test
	public void verifyPrivacyPolicyPageTitleUnderForm() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		marketplacePage.clickOnMarketplaceMenuUnderPlatformSection();
		marketplacePage.clickOnPrivacyPolicyLinkUnderFormSection();
		marketplacePage.verifyPrivacyPolicyPageTitleUnderFormSection();
	}

	@Test
	public void verifyTermsOfServicePageTitleUnderForm() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		marketplacePage.clickOnMarketplaceMenuUnderPlatformSection();
		marketplacePage.clickOnTermsOfServiceLinkUnderFormSection();
		marketplacePage.verifyTermsOfServicePageTitleUnderFormSection();
	}

	@Test
	public void verifyDemoPageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		marketplacePage.clickOnMarketplaceMenuUnderPlatformSection();
		sisenseHeaderPage.clickOnDemoButton();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyBookaliveDemoPageTitleUnderFooterSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		marketplacePage.clickOnMarketplaceMenuUnderPlatformSection();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBookaLiveDemoButtonUnderFooter();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyTryFreePageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		marketplacePage.clickOnMarketplaceMenuUnderPlatformSection();
		sisenseHeaderPage.clickOnTryFreeButton();
		sisenseHeaderPage.verifyTryFreePageTitle();
	}

}
