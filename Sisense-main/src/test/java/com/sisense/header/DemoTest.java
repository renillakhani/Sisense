package com.sisense.header;

import org.testng.annotations.Test;

import com.kfast.init.SeleniumInit;

public class DemoTest extends SeleniumInit {

	@Test
	public void verifyScheduleADemoFormOpen() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnDemoButton();
		demoPage.clickOnScheduleADemoButton();
		demoPage.verifyformIsOpen();
	}

	@Test
	public void verifyWatchDemoFormOpen() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnDemoButton();
		demoPage.scrollToaccelerate_AutomateSection();
		demoPage.clickOnWatchDemoButton();
		demoPage.verifyWatchDemoFormIsOpen();
	}

	@Test
	public void verifyScheduleADemoFunctionality() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnDemoButton();
		demoPage.clickOnScheduleADemoButton();
		demoPage.fillUpScheduleADemoForm("madhavi.sriramaneni@kiwiqa.com", "Madhavi", "Sriramaneni", "1111111111",
				"KiwiQA", "QA");
		demoPage.clickOnBookliveDemoButton();
		demoPage.verifyScheduleADemoFormSubmit();
	}

	@Test
	public void verifyHomeBreadcrumbTitle() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnDemoButton();
		commonMethods.clickOnHomeBreadcrumb();
		sisenseHeaderPage.verifySisenseHomePageTitle();
	}

	@Test
	public void verifyWatchDemoFunctionality() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnDemoButton();
		demoPage.scrollToaccelerate_AutomateSection();
		demoPage.clickOnWatchDemoButton();
		demoPage.fillUpWatchDemoForm("madhavi.sriramaneni@kiwiqa.com", "Madhavi", "Sriramaneni", "2222222222", "KiwiQA",
				"QA");
		demoPage.clickOnWatchDemoUnderTheForm();
		demoPage.verifyWatchDemoFormSubmit();
	}

	@Test
	public void verifyContactUsPageTitle() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnDemoButton();
		demoPage.clickOnContactUsButton();
		demoPage.verifyGetInTouchPageTitle();
	}

	@Test
	public void verifyTryFreePageTitle() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnDemoButton();
		sisenseHeaderPage.clickOnTryFreeButton();
		sisenseHeaderPage.verifyTryFreePageTitle();
	}

	@Test
	public void verifyTestDriveSisenseButtonPageTitle() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnDemoButton();
		demoPage.clickOnTestDriveSisenseButton();
		sisenseHeaderPage.verifyTryFreePageTitle();
	}

	@Test
	public void verifyPrivacyPolicyPageTitle() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnDemoButton();
		demoPage.clickOnPrivacyPolicyLink();
		marketplacePage.verifyPrivacyPolicyPageTitleUnderFormSection();
	}

	@Test
	public void verifyTermsOfServicePageTitle() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnDemoButton();
		demoPage.clickOnTermsOfServiceLink();
		marketplacePage.verifyTermsOfServicePageTitleUnderFormSection();
	}

	@Test
	public void verifyWatchDemoFormOpenNewPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnDemoButton();
		demoPage.scrollToaccelerate_AutomateSectionNewPage();
		demoPage.clickOnWatchDemoButton();
		demoPage.verifyformIsOpenNewPage();
	}

	@Test
	public void verifyWatchDemoFunctionalityNewPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnDemoButton();
		demoPage.scrollToaccelerate_AutomateSectionNewPage();
		demoPage.clickOnWatchDemoButton();
		demoPage.fillUpWatchDemoForm("madhavi.sriramaneni@kiwiqa.com", "Madhavi", "Sriramaneni", "2222222222", "KiwiQA",
				"QA");
		demoPage.clickOnWatchDemoUnderTheForm();
		demoPage.verifyWatchDemoFormSubmit();
	}

	@Test
	public void verifyBannerFormFunctionalityNewPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnDemoButton();
		demoPage.fillUpBannerForm("madhavi.sriramaneni@kiwiqa.com", "Madhavi", "Sriramaneni", "2222222222", "KiwiQA",
				"QA");
		demoPage.clickOnBookLiveDemoButtonNewPage();
		demoPage.verifyBannerForSubmit();
	}

	@Test
	public void verifyBookaLiveDemoPageTitleUnderFooterSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnDemoButton();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBookaLiveDemoButtonUnderFooter();
		sisenseHeaderPage.verifyDemoPageTitle();
	}
	
	@Test
	public void verifyScheduleaDemo() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnDemoButton();
		demoPage.fillUpScheduleADemoForm("madhavi.sriramaneni@kiwiqa.com", "Madhavi", "Sriramaneni", "9059763244","KiwiQA", "QA");
		demoPage.clickOnBookliveDemoButton();
		demoPage.verifyScheduleADemoFormSubmit();
	}

}
