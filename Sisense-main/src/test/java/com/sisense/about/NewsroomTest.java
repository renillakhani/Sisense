package com.sisense.about;

import org.testng.annotations.Test;

import com.kfast.init.SeleniumInit;

public class NewsroomTest extends SeleniumInit {
	@Test
	public void verifyNewsroomPageTitleUnderAboutTab() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToAboutTab();
		newsroomPage.clickOnNewsroomMenuUnderAboutTab();
		newsroomPage.verifyNewsroomPageTitle();
	}

	@Test
	public void verifyFillFormFunctionality() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToAboutTab();
		newsroomPage.clickOnNewsroomMenuUnderAboutTab();
		newsroomPage.scrollToEmailLabel();
		newsroomPage.fillUpTheForm("madhavi.sriramaneni@kiwiqa.com", "Madhavi", "Sriramaneni", "KiwiQA");
		marketplacePage.clickOnSignUPButtonUnderForm();
		newsroomPage.verifyFormSubmit();
	}

	@Test
	public void verifyPrivacyPolicyPageTitleUnderForm() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToAboutTab();
		newsroomPage.clickOnNewsroomMenuUnderAboutTab();
		newsroomPage.clickOnPrivacyPolicyLinkUnderFormSection();
		newsroomPage.verifyPrivacyPolicyPageTitle();
	}

	@Test
	public void verifyTermsOfServicePageTitleUnderAboutTab() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToAboutTab();
		newsroomPage.clickOnNewsroomMenuUnderAboutTab();
		newsroomPage.clickOnTermsOfServiceLinkUnderFormSection();
		newsroomPage.verifyTermsOfServicePageTitle();
	}

	@Test
	public void verifyHomeBreadcrumbTitleUnderNewsroomPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToAboutTab();
		newsroomPage.clickOnNewsroomMenuUnderAboutTab();
		commonMethods.clickOnHomeBreadcrumb();
		sisenseHeaderPage.verifySisenseHomePageTitle();
	}

	@Test
	public void verifyDemoPageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToAboutTab();
		newsroomPage.clickOnNewsroomMenuUnderAboutTab();
		sisenseHeaderPage.clickOnDemoButton();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyBookaliveDemoPageTitleUnderFooterSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToAboutTab();
		newsroomPage.clickOnNewsroomMenuUnderAboutTab();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBookaLiveDemoButtonUnderFooter();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyPressReleasesFillFormFunctionality() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToAboutTab();
		newsroomPage.clickOnNewsroomMenuUnderAboutTab();
		newsroomPage.clickOnPressReleasesLink();
		newsroomPage.scrollToEmailLabel();
		newsroomPage.fillUpTheForm("madhavi.sriramaneni@kiwiqa.com", "Madhavi", "Sriramaneni", "KiwiQA");
		marketplacePage.clickOnSignUPButtonUnderForm();
		newsroomPage.verifyFormSubmit();
	}

	@Test
	public void verifyPressReleasesPrivacyPolicyPageTitleUnderFormSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToAboutTab();
		newsroomPage.clickOnNewsroomMenuUnderAboutTab();
		newsroomPage.clickOnPressReleasesLink();
		newsroomPage.clickOnPrivacyPolicyLinkUnderFormSection();
		newsroomPage.verifyPrivacyPolicyPageTitle();
	}

	@Test
	public void verifyPressReleasesTermsOfServicePageTitleUnderFormSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToAboutTab();
		newsroomPage.clickOnNewsroomMenuUnderAboutTab();
		newsroomPage.clickOnPressReleasesLink();
		newsroomPage.clickOnTermsOfServiceLinkUnderFormSection();
		newsroomPage.verifyTermsOfServicePageTitle();
	}

	@Test
	public void verifyPressReleasesDemoPageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToAboutTab();
		newsroomPage.clickOnNewsroomMenuUnderAboutTab();
		newsroomPage.clickOnPressReleasesLink();
		sisenseHeaderPage.clickOnDemoButton();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyPressReleasesBookaliveDemoPageTitleUnderFooterSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToAboutTab();
		newsroomPage.clickOnNewsroomMenuUnderAboutTab();
		newsroomPage.clickOnPressReleasesLink();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBookaLiveDemoButtonUnderFooter();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyTryFreePageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToAboutTab();
		newsroomPage.clickOnNewsroomMenuUnderAboutTab();
		sisenseHeaderPage.clickOnTryFreeButton();
		sisenseHeaderPage.verifyTryFreePageTitle();
	}

	@Test
	public void verifyPressReleasesTryFreePageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToAboutTab();
		newsroomPage.clickOnNewsroomMenuUnderAboutTab();
		newsroomPage.clickOnPressReleasesLink();
		sisenseHeaderPage.clickOnTryFreeButton();
		sisenseHeaderPage.verifyTryFreePageTitle();
	}

	@Test
	public void verifyPressReleasesHomeBreadcrumbTitleUnderPressReleasesPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToAboutTab();
		newsroomPage.clickOnNewsroomMenuUnderAboutTab();
		newsroomPage.clickOnPressReleasesLink();
		commonMethods.clickOnHomeBreadcrumb();
		sisenseHeaderPage.verifySisenseHomePageTitle();
	}

	@Test
	public void verifyPressReleasesPageTitleUnderNewsroomPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToAboutTab();
		newsroomPage.clickOnNewsroomMenuUnderAboutTab();
		newsroomPage.clickOnPressReleasesLink();
		newsroomPage.verifyNewsroomPageTitle();
	}

}
