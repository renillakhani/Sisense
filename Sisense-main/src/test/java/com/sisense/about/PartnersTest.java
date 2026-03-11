package com.sisense.about;

import org.testng.annotations.Test;

import com.kfast.init.SeleniumInit;

public class PartnersTest extends SeleniumInit {

	@Test
	public void verifyPartnersPageTitleUnderAboutTab() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToAboutTab();
		partnersPage.clickOnPartnersMenuUnderAboutTab();
		partnersPage.verifyPartnersPageTitle();
	}

	@Test
	public void verifyFillFormBecomeaPartnerFunctionality() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToAboutTab();
		partnersPage.clickOnPartnersMenuUnderAboutTab();
		partnersPage.clickOnBecomeAPartnerButtonUnderBanner();
		partnersPage.fillUpBecomeAPartnerForm("madhavi.sriramaneni@kiwiqa.com", "Madhavi", "Sriramaneni", "9998886667",
				"KiwiQA", "QA", "Partner - Platform", "Testing");
		partnersPage.clickOnSubmitButtonUnderForm();
		partnersPage.verifyFormSubmissionUnderBecomeAPartner();
	}

	@Test
	public void verifyViewAllPartnersPageTitleUnderBannerSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToAboutTab();
		partnersPage.clickOnPartnersMenuUnderAboutTab();
		partnersPage.clickOnViewAllPartnersButtonUnderBanner();
		partnersPage.verifyViewAllPartnersPageTitle();
	}

	@Test
	public void verifyFillFormFunctionality() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToAboutTab();
		partnersPage.clickOnPartnersMenuUnderAboutTab();
		partnersPage.scrollToEmailLabel();
		partnersPage.fillUpSubscribeForm("madhavi.sriramaneni@kiwiqa.com", "Madhavi", "Sriramaneni", "KiwiQA");
		marketplacePage.clickOnSignUPButtonUnderForm();
		partnersPage.verifyFormSubmission();
	}

	@Test
	public void verifyPrivacyPolicyPageTitleUnderFormSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToAboutTab();
		partnersPage.clickOnPartnersMenuUnderAboutTab();
		partnersPage.clickOnPrivacyPolicyLinkUnderFormSection();
		partnersPage.verifyPrivacyPolicyPageTitle();
	}

	@Test
	public void verifyTermsOfServicePageTitleUnderFormSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToAboutTab();
		partnersPage.clickOnPartnersMenuUnderAboutTab();
		partnersPage.clickOnTermsOfServiceLinkUnderFormSection();
		partnersPage.verifyTermsOfServicePageTitle();
	}

	@Test
	public void verifyDemoPageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToAboutTab();
		partnersPage.clickOnPartnersMenuUnderAboutTab();
		sisenseHeaderPage.clickOnDemoButton();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyBookaliveDemoPageTitleUnderFooterSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToAboutTab();
		partnersPage.clickOnPartnersMenuUnderAboutTab();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBookaLiveDemoButtonUnderFooter();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyTryFreePageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToAboutTab();
		partnersPage.clickOnPartnersMenuUnderAboutTab();
		sisenseHeaderPage.clickOnTryFreeButton();
		sisenseHeaderPage.verifyTryFreePageTitle();
	}

	@Test
	public void verifyHomeBreadcrumbTitleUnderPartnersPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToAboutTab();
		partnersPage.clickOnPartnersMenuUnderAboutTab();
		commonMethods.clickOnHomeBreadcrumb();
		sisenseHeaderPage.verifySisenseHomePageTitle();
	}
}
