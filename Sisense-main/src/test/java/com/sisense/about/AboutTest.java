package com.sisense.about;

import org.testng.annotations.Test;

import com.kfast.init.SeleniumInit;

public class AboutTest extends SeleniumInit {
	@Test
	public void verifyHomeBreadcrumbTitleUnderAboutPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnAboutTab();
		commonMethods.clickOnHomeBreadcrumb();
		sisenseHeaderPage.verifySisenseHomePageTitle();
	}

	public void verifyBiasForActionLinkTextUnderOurValuesSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnAboutTab();
		aboutPage.scrollToOurValuesSection();
		aboutPage.clickOnBiasForActionLinkUnderOurValuesSection();
		aboutPage.verifyBiasForActionTextUnderOurValuesSection();
	}

	public void verifyCaringLinkTextUnderOurValuesSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnAboutTab();
		aboutPage.scrollToOurValuesSection();
		aboutPage.clickOnCaringLinkUnderOurValuesSection();
		aboutPage.verifyCaringTextUnderOurValuesSection();
	}

	public void verifyCustomerCentricTextUnderOurValuesSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnAboutTab();
		aboutPage.scrollToOurValuesSection();
		aboutPage.clickOnCustomerCentricLinkUnderOurValuesSection();
		aboutPage.verifyCustomerCentricTextUnderOurValuesSection();
	}

	public void verifyInclusivityTextUnderOurValuesSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnAboutTab();
		aboutPage.scrollToOurValuesSection();
		aboutPage.clickOnInclusivityLinkUnderOurValuesSection();
		aboutPage.verifyInclusivityTextUnderOurValuesSection();
	}

	public void verifyDisruptorsTextUnderOurValuesSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnAboutTab();
		aboutPage.scrollToOurValuesSection();
		aboutPage.clickOnDisruptorsLinkUnderOurValuesSection();
		aboutPage.verifyDisruptorsTextUnderOurValuesSection();
	}

	@Test
	public void verifyExploreOpenPositionsPageTitleUnderOurValuesSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnAboutTab();
		companyPage.clickOnExploreOpenPositionsButtonUnderOurValuesSection();
		careersPage.verifyCareersPageTitleUnderFooter();
	}

	@Test
	public void verifyExploreCareersAtSisensePageTitleUnderOurCultureAndCareersSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnAboutTab();
		companyPage.clickOnExploreCareersAtSisenseButtonUnderOurCultureAndCareersSection();
		careersPage.verifyCareersPageTitleUnderFooter();
	}

	@Test
	public void verifyAboutOurInvestorsPageTitleUnderOurInvestorsSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnAboutTab();
		companyPage.clickOnAboutOurInvestorsLinkUnderOurInvestorsSection();
		companyPage.verifyAboutOurInvestorsLinkPageTitle();
	}

	@Test
	public void verifyContactUsPageTitleUnderGetInTouchSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnAboutTab();
		companyPage.clickOnContactUsButtonUnderGetInTouchSection();
		supportPage.verifyGetInTouchPageTitle();
	}

	@Test
	public void verifyDemoPageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnAboutTab();
		sisenseHeaderPage.clickOnDemoButton();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyBookaliveDemoPageTitleUnderFooterSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnAboutTab();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBookaLiveDemoButtonUnderFooter();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyTryFreePageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnAboutTab();
		sisenseHeaderPage.clickOnTryFreeButton();
		sisenseHeaderPage.verifyTryFreePageTitle();
	}
}
