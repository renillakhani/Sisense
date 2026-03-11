package com.sisense.about;

import org.testng.annotations.Test;

import com.kfast.init.SeleniumInit;

public class CompanyTest extends SeleniumInit {
	@Test
	public void verifyCompanyPageTitleUnderAboutTab() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToAboutTab();
		companyPage.clickOnCompanyMenuUnderAboutTab();
		sisenseHeaderPage.verifyAboutPageTitle();
	}

	@Test
	public void verifyExploreOpenPositionsPageTitleUnderOurValuesSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToAboutTab();
		companyPage.clickOnCompanyMenuUnderAboutTab();
		companyPage.clickOnExploreOpenPositionsButtonUnderOurValuesSection();
		careersPage.verifyCareersPageTitleUnderFooter();
	}

	@Test
	public void verifyExplorecareersatSisensePageTitleUnderOurCultureAndCareersSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToAboutTab();
		companyPage.clickOnCompanyMenuUnderAboutTab();
		companyPage.clickOnExploreCareersAtSisenseButtonUnderOurCultureAndCareersSection();
		careersPage.verifyCareersPageTitleUnderFooter();
	}

	@Test
	public void verifyAboutOurInvestorsLinkPageTitleUnderOurInvestorsSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToAboutTab();
		companyPage.clickOnCompanyMenuUnderAboutTab();
		companyPage.clickOnAboutOurInvestorsLinkUnderOurInvestorsSection();
		companyPage.verifyAboutOurInvestorsLinkPageTitle();
	}

	@Test
	public void verifyContactusPageTitlUnderGetInTouchSectione() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToAboutTab();
		companyPage.clickOnCompanyMenuUnderAboutTab();
		companyPage.clickOnContactUsButtonUnderGetInTouchSection();
		companyPage.verifyContactUsPageTitle();
	}

	@Test
	public void verifyHomeBreadcrumbTitleUnderCompanyPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToAboutTab();
		companyPage.clickOnCompanyMenuUnderAboutTab();
		commonMethods.clickOnHomeBreadcrumb();
		sisenseHeaderPage.verifySisenseHomePageTitle();
	}

	@Test
	public void verifyDemoPageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToAboutTab();
		companyPage.clickOnCompanyMenuUnderAboutTab();
		sisenseHeaderPage.clickOnDemoButton();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyBookaliveDemoPageTitleUnderFooterSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToAboutTab();
		companyPage.clickOnCompanyMenuUnderAboutTab();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBookaLiveDemoButtonUnderFooter();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyTryFreePageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToAboutTab();
		companyPage.clickOnCompanyMenuUnderAboutTab();
		sisenseHeaderPage.clickOnTryFreeButton();
		sisenseHeaderPage.verifyTryFreePageTitle();
	}
}
