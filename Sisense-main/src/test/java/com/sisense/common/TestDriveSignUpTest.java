package com.sisense.common;

import org.testng.annotations.Test;

import com.kfast.init.SeleniumInit;

public class TestDriveSignUpTest extends SeleniumInit {

	@Test
	public void verifyHomeBreadcrumbTitleUnderTestDriveSignUpPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnTryFreeButton();
		commonMethods.clickOnHomeBreadcrumb();
		sisenseHeaderPage.verifySisenseHomePageTitle();
	}

	@Test
	public void verifySolutionBreadcrumbTitleUnderTestDriveSignUpPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnTryFreeButton();
		commonMethods.clickOnSolutionsBreadcrumb();
		sisenseHeaderPage.verifySolutionsPageTitle();
	}

	@Test
	public void verifyDemoPageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnTryFreeButton();
		sisenseHeaderPage.clickOnDemoButton();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyBookaliveDemoPageTitleUnderFooterSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnTryFreeButton();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBookaLiveDemoButtonUnderFooter();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyStartYourFreeTrialButton() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnTryFreeButton();
		testDriveSignUpPage.clickOnStartYourFreeTrialButtonUnderHeroSection();
		testDriveSignUpPage.verifyStartYourFreeTrialButton();
	}

	@Test
	public void verifyStartYourTestDriveButton() throws Exception {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnTryFreeButton();
		testDriveSignUpPage.clickOnStartYourTestDriveButtonUnderSpinSection();
		sisenseHeaderPage.verifyTryFreePageTitle();
	}

	@Test
	public void verifyPrivacyPolicyPageTitleUnderFormSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnTryFreeButton();
		marketplacePage.clickOnPrivacyPolicyLinkUnderFormSection();
		marketplacePage.verifyPrivacyPolicyPageTitleUnderFormSection();
	}

	@Test
	public void verifyTermsOfServicePageTitleUnderFormSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnTryFreeButton();
		marketplacePage.clickOnTermsOfServiceLinkUnderFormSection();
		testDriveSignUpPage.verifyTermsOfServicePageTitle();
	}

	@Test
	public void verifyTryFreePageTitleUnderHedaerSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnTryFreeButton();
		sisenseHeaderPage.clickOnTryFreeButton();
		sisenseHeaderPage.verifyTryFreePageTitle();
	}

	@Test
	public void verifyAlreadyRegisteredEmailFillFormFunctionalityUnderSignUpForTestDrive() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnTryFreeButton();
		marketplacePage.scrollToEmailLabelUnderFormSection();
		testDriveSignUpPage.fillUpTheForm("madhavi.sriramaneni@kiwiqa.com", "Madhavi", "Sriramaneni", "KiwiQA", "QA");
		testDriveSignUpPage.clickOnSignUpForTestDriveButtonUnderFormSection();
		testDriveSignUpPage.verifyFormSubmissionUnderFormSection();
	}

	@Test
	public void verifyNewEmailFillFormFunctionalityUnderSignUpForTestDrive() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnTryFreeButton();
		marketplacePage.scrollToEmailLabelUnderFormSection();
		testDriveSignUpPage.fillUpTheForm("madhavi23@smadhu.33mail.com", "Madhavi", "Sriramaneni", "KiwiQA", "QA");
		testDriveSignUpPage.clickOnSignUpForTestDriveButtonUnderFormSection();
		testDriveSignUpPage.verifyFormSubmissionUnderFormSection();
	}

	@Test
	public void verifyEduEmailFormateFillFormFunctionalityUnderSignUpForTestDrive() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnTryFreeButton();
		marketplacePage.scrollToEmailLabelUnderFormSection();
		testDriveSignUpPage.fillUpTheForm("madhavi.sriramaneni@kiwiqa.edu", "Madhavi");
		testDriveSignUpPage.verifyFormSubmissionWithEduEmailFormateUnderFormSection();

	}

	@Test
	public void verifyEduAuEmailFormateFillFormFunctionalityUnderSignUpForTestDrive() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnTryFreeButton();
		marketplacePage.scrollToEmailLabelUnderFormSection();
		testDriveSignUpPage.fillUpTheForm("madhavi.sriramaneni@kiwiqa.edu.au", "Madhavi");
		testDriveSignUpPage.verifyFormSubmissionWithEduEmailFormateUnderFormSection();

	}

	@Test
	public void verifyAcUkEmailFormateFillFormFunctionalityUnderSignUpForTestDrive() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnTryFreeButton();
		marketplacePage.scrollToEmailLabelUnderFormSection();
		testDriveSignUpPage.fillUpTheForm("madhavi.sriramaneni@kiwiqa.ac.uk", "Madhavi");
		testDriveSignUpPage.verifyFormSubmissionWithEduEmailFormateUnderFormSection();
	}

}
