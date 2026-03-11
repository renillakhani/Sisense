package com.sisense.resources;

import com.kfast.init.SeleniumInit;
import org.testng.annotations.*;

public class GuidesAndReportsTest extends SeleniumInit {

	@Test
	public void verifyGuidesAndReportsPageTitleUnderResourcesTab() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		guidesAndReportsPage.clickOnGuidesAndReportsMenuUnderResourcesTab();
		guidesAndReportsPage.verifyGuidesAndReportsPageTitle();
	}

	@Test
	public void verifyReportCardsUnderReportPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		guidesAndReportsPage.clickOnGuidesAndReportsMenuUnderResourcesTab();
		guidesAndReportsPage.verifyReportCardsUnderReportPage();
	}

	@Test
	public void verifyReportCardsHeadingUnderReportPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		guidesAndReportsPage.clickOnGuidesAndReportsMenuUnderResourcesTab();
		guidesAndReportsPage.verifyReportCardsHeadingUnderReportPage();
	}

	@Test
	public void verifyFillFormFunctionality() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		guidesAndReportsPage.clickOnGuidesAndReportsMenuUnderResourcesTab();
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
		guidesAndReportsPage.clickOnGuidesAndReportsMenuUnderResourcesTab();
		customerStoriesPage.clickOnPrivacyPolicyLinkUnderFormSection();
		customerStoriesPage.verifyPrivacyPolicyPageTitleUnderFormSection();
	}

	@Test
	public void verifyTermsOfServicePageTitleUnderFormSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		guidesAndReportsPage.clickOnGuidesAndReportsMenuUnderResourcesTab();
		customerStoriesPage.clickOnTermsOfServiceLinkUnderFormSection();
		customerStoriesPage.verifyTermsOfServicePageTitleUnderFormSection();
	}

	@Test
	public void verifyHomeBreadcrumbTitleUnderGuidesAndReportsPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		guidesAndReportsPage.clickOnGuidesAndReportsMenuUnderResourcesTab();
		commonMethods.clickOnHomeBreadcrumb();
		sisenseHeaderPage.verifySisenseHomePageTitle();
	}

	@Test
	public void verifyResourcehubBreadcrumbTitleUnderGuidesAndReportsPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		guidesAndReportsPage.clickOnGuidesAndReportsMenuUnderResourcesTab();
		commonMethods.clickOnResourcehubBreadcrumb();
		sisenseHeaderPage.verifyResourcesPageTitle();
	}

	@Test
	public void verifyDemoPageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		guidesAndReportsPage.clickOnGuidesAndReportsMenuUnderResourcesTab();
		sisenseHeaderPage.clickOnDemoButton();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyBookaliveDemoPageTitleUnderFooterSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		guidesAndReportsPage.clickOnGuidesAndReportsMenuUnderResourcesTab();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBookaLiveDemoButtonUnderFooter();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyTryFreePageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		guidesAndReportsPage.clickOnGuidesAndReportsMenuUnderResourcesTab();
		sisenseHeaderPage.clickOnTryFreeButton();
		sisenseHeaderPage.verifyTryFreePageTitle();
	}

	@Test
	public void verifyBookADemoButtonPageTitleUnderAboveFooter() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		guidesAndReportsPage.clickOnGuidesAndReportsMenuUnderResourcesTab();
		guidesAndReportsPage.scrollToSeeHowSisenseFitsYourTechStackSection();
		guidesAndReportsPage.clickOnBookADemoButton();
		sisenseHeaderPage.verifyDemoPageTitle();
	}
}
