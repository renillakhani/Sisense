package com.sisense.footer;

import org.testng.annotations.Test;

import com.kfast.init.SeleniumInit;

public class CareersTest extends SeleniumInit {
	@Test
	public void verifyCareerPageTitleUnderFooter() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		careersPage.clickOnCareersLinkUnderFooter();
		careersPage.verifyCareersPageTitleUnderFooter();
	}

	@Test
	public void verifyViewallopenrolesPageTitleUnderHeader() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		careersPage.clickOnCareersLinkUnderFooter();
		careersPage.clickOnViewAllOpenRolesButtonUnderHeader();
		careersPage.verifyViewAllOpenRolesPageTitleUnderHeader();
	}

	@Test
	public void verifyGreatPlacetoWorkPageTitleUnderAwardsSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		careersPage.clickOnCareersLinkUnderFooter();
		careersPage.clickOnGreatPlaceToWorkLinkUnderAwardsSection();
		careersPage.verifyGreatPlaceToWorkPageTitleUnderAwardsSection();
	}

	@Test
	public void verifyComparablyPageTitleUnderAwardsSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		careersPage.clickOnCareersLinkUnderFooter();
		careersPage.clickOnComparablyLinkUnderAwardsSection();
		careersPage.verifyComparablyPageTitleUnderAwardsSection();
	}

	@Test
	public void verifyLocationFilterUnderCurrentOpeningsAtSisenseSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		careersPage.clickOnCareersLinkUnderFooter();
		careersPage.clickOnLocationFilter();
		careersPage.selectUSOption();
		careersPage.verifySearchResults();
	}

	@Test
	public void verifyCheckingLocationFilterUnderCurrentOpeningsAtSisenseSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		careersPage.clickOnCareersLinkUnderFooter();
		careersPage.checkingLocationFilter();

	}

	@Test
	public void verifyCheckingTeamFilterUnderCurrentOpeningsAtSisenseSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		careersPage.clickOnCareersLinkUnderFooter();
		careersPage.checkingTeamFilter();

	}

	@Test
	public void verifyTeamFilterUnderCurrentOpeningsAtSisenseSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		careersPage.clickOnCareersLinkUnderFooter();
		careersPage.clickOnLocationFilter();
		careersPage.selectSalesOption();
		careersPage.verifyTeamSearchResults();
	}

	@Test
	public void verifyHomeBreadcrumbTitleUnderCareersPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		careersPage.clickOnCareersLinkUnderFooter();
		commonMethods.clickOnHomeBreadcrumb();
		sisenseHeaderPage.verifySisenseHomePageTitle();
	}

	@Test
	public void verifyAboutBreadcrumbTitleUnderCareersPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		careersPage.clickOnCareersLinkUnderFooter();
		commonMethods.clickOnAboutBreadcrumb();
		sisenseHeaderPage.verifyAboutPageTitle();
	}

	@Test
	public void verifyDemoPageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		careersPage.clickOnCareersLinkUnderFooter();
		sisenseHeaderPage.clickOnDemoButton();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyBookaliveDemoPageTitleUnderFooterSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		careersPage.clickOnCareersLinkUnderFooter();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBookaLiveDemoButtonUnderFooter();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyTryFreePageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		careersPage.clickOnCareersLinkUnderFooter();
		sisenseHeaderPage.clickOnTryFreeButton();
		sisenseHeaderPage.verifyTryFreePageTitle();
	}

	@Test
	public void verifyCreateAlertPageTitleUnderCurrentOpeningsAtSisenseSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		careersPage.clickOnCareersLinkUnderFooter();
		careersPage.clickOnCreateAlertLinkUnderCurrentOpeningsAtSisenseSection();
		careersPage.verifyCreateAlertPageTitle();
	}

	@Test
	public void verifyDepartmentFilter() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.scrollToFooter();
		careersPage.clickOnCareersLinkUnderFooter();
		careersPage.verifyDepartmentFilterOptions();
	}

}
