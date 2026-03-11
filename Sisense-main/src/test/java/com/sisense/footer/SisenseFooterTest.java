package com.sisense.footer;

import org.testng.annotations.Test;

import com.kfast.init.SeleniumInit;

public class SisenseFooterTest extends SeleniumInit {

	@Test
	public void verifyCloudPageTitleUnderFooter() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnCloudLinkUnderFooter();
		cloudPage.verifyCloudPageTitle();
	}

	@Test
	public void verifyComposePageTitleUnderFooter() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnComposeLinkUnderFooter();
		composablePage.verifyComposeSDKPageTitle();
	}

	@Test
	public void verifyEmbeddablePageTitleUnderFooter() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnEmbeddableLinkUnderFooter();
		embeddablePage.verifyEmbeddablePageTitleUnderPlatformTab();
	}

	@Test
	public void verifyConnectivityPageTitleUnderFooter() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnConnectivityLinkUnderFooter();
		connectivityPage.verifyConnectivityPageTitleUnderPlatformTab();
	}

	@Test
	public void verifyDataModelingPageTitleUnderFooter() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnDataModelingLinkUnderFooter();
		dataModelingPage.verifyDataModelingPageTitle();
	}

	@Test
	public void verifySisenseIntelligencePageTitleUnderFooter() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnSisenseIntelligenceLinkUnderFooter();
		sisenseIntelligencePage.verifySisenseIntelligencePageTitle();
	}

	@Test
	public void verifyTrustAndSecurityPageTitleUnderFooterPlatformSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnTrustAndSecurityLinkUnderFooterPlatformSection();
		sisenseFooterPage.verifyTrustCenterPageTitleUnderFooter();
	}

	@Test
	public void verifyAboutTitleUnderFooter() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnAboutLinkUnderFooter();
		sisenseHeaderPage.verifyAboutPageTitle();
	}

	@Test
	public void verifyAwardsTitleUnderFooter() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnAwardsLinkUnderFooterSisenseSection();
		sisenseFooterPage.verifyAwardsPageTitleUnderFooter();
	}

	@Test
	public void verifyCustomerStoriesTitleUnderFooter() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnCustomerStoriesLinkUnderFooter();
		customerStoriesPage.verifyCustomerStoriesPageTitle();
	}

	@Test
	public void verifyPricingPageTitleUnderFooter() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnPricingLinkUnderFooter();
		sisenseFooterPage.verifyPricingPageTitleUnderFooter();
	}

	@Test
	public void verifyNewsroomPageTitleUnderFooter() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnNewsroomLinkUnderFooter();
		sisenseFooterPage.verifyNewsroomPageTitleUnderFooter();
	}

	@Test
	public void verifyCareersPageTitleUnderFooter() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnCareersLinkUnderFooter();
		careersPage.verifyCareersPageTitleUnderFooter();
	}

	@Test
	public void verifyTrustAndSecurityPageTitleUnderFooter() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnTrustAndSecurityLinkUnderFooterSisenseSection();
		sisenseFooterPage.verifyTrustCenterPageTitleUnderFooter();
	}

	@Test
	public void verifyContactUsPageTitleUnderFooter() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnContactUsLinkUnderFooter();
		sisenseFooterPage.verifyContactUsPageTitleUnderFooter();
	}

	@Test
	public void verifySupportPortalPageTitleUnderFooter() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnSupportPortalLinkUnderFooter();
		sisenseFooterPage.verifySupportPortalPageTitleUnderFooter();
	}

	@Test
	public void verifyDocumentationPageTitleUnderFooter() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnDocumentationLinkUnderFooter();
		documentationPage.verifyDocumentationPageTitle();
	}

	@Test
	public void verifyPartnerResourcesPageTitleUnderFooter() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnPartnerResourcesLinkUnderFooter();
		sisenseFooterPage.verifyPartnerResourcesPageTitleUnderFooter();
	}

	@Test
	public void verifyBlogPageTitleUnderFooter() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBlogLinkUnderFooter();
		sisenseFooterPage.verifyBlogPageTitleUnderFooter();
	}

	@Test
	public void verifyMarketPlacePageTitleUnderFooter() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnMarketplaceLinkUnderFooter();
		marketplacePage.verifyMarketplacePageTitle();
	}

	@Test
	public void verifyCommunityPageTitleUnderFooter() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnCommunityLinkUnderFooter();
		communityPage.verifyCommunityPageTitle();
	}

	@Test
	public void verifyDeveloperPortalPageTitleUnderFooter() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnDeveloperPortalLinkUnderFooter();
		sisenseFooterPage.verifyDeveloperPortalPageTitleUnderFooter();
	}

	@Test
	public void verifyPrivacyPolicyPageTitleUnderFooter() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnPrivacyPolicyLinkUnderFooter();
		sisenseFooterPage.verifyPrivacyPolicyPageTitleUnderFooter();
	}

	@Test
	public void verifyLegalPageTitleUnderFooter() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnLegalLinkUnderFooter();
		sisenseFooterPage.verifyLegalPageTitleUnderFooter();
	}

	@Test
	public void verifyGithubPageTitleUnderFooter() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnGithubLinkUnderFooter();
		sisenseFooterPage.verifyGithubPageTitleUnderFooter();
	}

	@Test
	public void verifyPrivacyPolicyPageTitleUnderSocialMedia() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnPrivacyPolicyLinkUnderSocialMedia();
		sisenseFooterPage.verifyPrivacyPolicyPageTitleUnderSocialMedia();
	}

	@Test
	public void verifysocialMediaLegalPageTitleUnderSocialMedia() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnLegalLinkUnderSocialMedia();
		sisenseFooterPage.verifyLegalPageTitleUnderSocialMedia();
	}

	@Test
	public void verifyBookaliveDemoPageTitleUnderFooter() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBookaLiveDemoButtonUnderFooter();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyTwitterPageTitleUnderFooter() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnTwitterLinkUnderFooter();
		sisenseFooterPage.verifyTwitterPageTitleUnderFooter();
	}

	@Test
	public void verifyLinkedinPageTitleUnderFooter() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnLinkedinLinkUnderFooter();
		sisenseFooterPage.verifyLinkedinPageTitleUnderFooter();
	}

	@Test
	public void verifySuccessfullyTextAfterClickSubmitPreferencesButton() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnCookiePreferencesButton();
		sisenseFooterPage.clickOnSubmitPreferencesButton();
		sisenseFooterPage.verifySettingsSubmittedText();
	}

	@Test
	public void verifySuccessfullyTextAfterClickAcceptAllButton() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnCookiePreferencesButton();
		sisenseFooterPage.clickOnAcceptAllButton();
		sisenseFooterPage.verifySettingsSubmittedText();
	}

	@Test
	public void verifySuccessfullyTextAfterClickDeclineAllButton() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnCookiePreferencesButton();
		sisenseFooterPage.clickOnDeclineAllButton();
		sisenseFooterPage.verifySettingsSubmittedText();
	}

	@Test
	public void verifyCookiePreferencesPopUpUnderFooter() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnCookiePreferencesButton();
		sisenseFooterPage.verifyCookiePreferencesPopUp();

	}

	@Test
	public void verifyBrandPortalPageTitleUnderFooter() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBrandPortalLinkUnderFooter();
		sisenseFooterPage.verifyBrandPortalPageTitleUnderFooter();
	}

	@Test
	public void verifySisenseAcademyPageTitleUnderFooter() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnSisenseAcademyLinkUnderFooter();
		sisenseFooterPage.verifySisenseAcademyPageTitle();
	}

}
