package com.sisense.resources;

import org.testng.annotations.Test;

import com.kfast.init.SeleniumInit;

public class EventsandWebinarsTest extends SeleniumInit {
	@Test
	public void verifyEventsandWebinarsPageTitleUnderResourcesTab() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		eventsandWebinarsPage.clickOnEventsAndWebinarsMenuUnderResourcesTab();
		eventsandWebinarsPage.verifyEventsAndWebinarsPageTitle();
	}

	@Test
	public void verifyFillFormFunctionality() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		eventsandWebinarsPage.clickOnEventsAndWebinarsMenuUnderResourcesTab();
		eventsandWebinarsPage.scrollToEmailLabelUnderFormSection();
		eventsandWebinarsPage.fillUpTheForm("madhavi.sriramaneni@kiwiqa.com", "Madhavi", "Sriramaneni", "KiwiQA");
		marketplacePage.clickOnSignUPButtonUnderForm();
		eventsandWebinarsPage.verifyFormSubmit();
	}

	@Test
	public void verifyPrivacyPolicyPageTitleUnderFormSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		eventsandWebinarsPage.clickOnEventsAndWebinarsMenuUnderResourcesTab();
		eventsandWebinarsPage.clickOnPrivacyPolicyLinkUnderFormSection();
		eventsandWebinarsPage.verifyPrivacyPolicyPageTitleUnderFormSection();
	}

	@Test
	public void verifyTermsOfServicePageTitleUnderFormSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		eventsandWebinarsPage.clickOnEventsAndWebinarsMenuUnderResourcesTab();
		eventsandWebinarsPage.clickOnTermsOfServiceLinkUnderFormSection();
		eventsandWebinarsPage.verifyTermsOfServicePageTitleUnderFormSection();
	}

	@Test
	public void verifyHomeBreadcrumbTitleUnderEventsAndWebinarsPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		eventsandWebinarsPage.clickOnEventsAndWebinarsMenuUnderResourcesTab();
		commonMethods.clickOnHomeBreadcrumb();
		sisenseHeaderPage.verifySisenseHomePageTitle();
	}

	@Test
	public void verifyResourcehubBreadcrumbTitleUnderEventsAndWebinarsPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		eventsandWebinarsPage.clickOnEventsAndWebinarsMenuUnderResourcesTab();
		commonMethods.clickOnResourcehubBreadcrumb();
		sisenseHeaderPage.verifyResourcesPageTitle();
	}

	@Test
	public void verifyDemoPageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		eventsandWebinarsPage.clickOnEventsAndWebinarsMenuUnderResourcesTab();
		sisenseHeaderPage.clickOnDemoButton();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyBookaliveDemoPageTitleUnderFooterSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		eventsandWebinarsPage.clickOnEventsAndWebinarsMenuUnderResourcesTab();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBookaLiveDemoButtonUnderFooter();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyTryFreePageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		eventsandWebinarsPage.clickOnEventsAndWebinarsMenuUnderResourcesTab();
		sisenseHeaderPage.clickOnTryFreeButton();
		sisenseHeaderPage.verifyTryFreePageTitle();
	}

	@Test
	public void verifyfreeTrialButtonPageTitleUnderAboveFooter() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		eventsandWebinarsPage.clickOnEventsAndWebinarsMenuUnderResourcesTab();
		eventsandWebinarsPage.scrollToTrySisenseFor7DaysSection();
		eventsandWebinarsPage.clickOnFreeTrialButton();
		sisenseHeaderPage.verifyTryFreePageTitle();
	}
}
