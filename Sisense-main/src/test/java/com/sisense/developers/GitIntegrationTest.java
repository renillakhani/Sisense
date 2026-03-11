package com.sisense.developers;

import org.testng.annotations.Test;

import com.kfast.init.SeleniumInit;

public class GitIntegrationTest extends SeleniumInit {
	@Test
	public void verifyGitIntegrationPageTitleUnderDevelopersTab() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		gitIntegrationPage.clickOnGitIntegrationMenuUnderDevelopersTab();
		gitIntegrationPage.verifyGitIntegrationPageTitleUnderDevelopersTab();
	}

	@Test
	public void verifybookaliveDemoPageTitleUnderBannerSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		gitIntegrationPage.clickOnGitIntegrationMenuUnderDevelopersTab();
		gitIntegrationPage.clickOnBookaLiveDemoButtonUnderBannerSection();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifySeamlesssourcecontrolTitleUnderGitIntegrationPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		gitIntegrationPage.clickOnGitIntegrationMenuUnderDevelopersTab();
		gitIntegrationPage.clickOnSeamlessSourceControlLinkUnderGitIntegrationPage();
		gitIntegrationPage.verifySeamlessSourceControlPageTitleUnderGitIntegrationPage();
	}

	@Test
	public void verifyVersioncontrolledanalyticsPageTitleUnderGitIntegrationPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		gitIntegrationPage.clickOnGitIntegrationMenuUnderDevelopersTab();
		gitIntegrationPage.clickOnVersionControlledAnalyticsLinkUnderGitIntegrationPage();
		gitIntegrationPage.verifyVersionControlledAnalyticsPageTitleUnderGitIntegrationPage();
	}

	@Test
	public void verifyWatchnowPageTitleUnderVersionControlledAnalyticsSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		gitIntegrationPage.clickOnGitIntegrationMenuUnderDevelopersTab();
		gitIntegrationPage.clickOnVersionControlledAnalyticsLinkUnderGitIntegrationPage();
		gitIntegrationPage.clickOnWatchNowButtonUnderVersionControlledAnalyticsSection();
		gitIntegrationPage.verifyWatchNowPageTitleUnderVersionControlledAnalyticsSection();
	}

	@Test
	public void verifyFluidCICDProcessesPageTitleUnderGitIntegrationSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		gitIntegrationPage.clickOnGitIntegrationMenuUnderDevelopersTab();
		gitIntegrationPage.clickOnFluidCICDProcessesLinkUnderGitIntegrationSection();
		gitIntegrationPage.verifyFluidCICDProcessesPageTitleUnderGitIntegrationSection();
	}

	@Test
	public void verifyLearnmorePageTitleUnderFluidCICDProcessesSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		gitIntegrationPage.clickOnGitIntegrationMenuUnderDevelopersTab();
		gitIntegrationPage.clickOnFluidCICDProcessesLinkUnderGitIntegrationSection();
		gitIntegrationPage.clickOnLearnMoreButtonUnderFluidCICDProcessesSection();
		gitIntegrationPage.verifyLearnMorePageTitleUnderGitIntegrationSection();
	}

	@Test
	public void verifyGeta30dayfreetrialPageTitleUnderBuildBetterAndFasterSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		gitIntegrationPage.clickOnGitIntegrationMenuUnderDevelopersTab();
		gitIntegrationPage.clickOnGetA30DayFreeTrialButtonUnderBuildBetterAndFasterSection();
		commonMethods.verifySignUpPageTitle();
	}

	@Test
	public void verifyHomeBreadcrumbTitleUnderGitIntegrationPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		gitIntegrationPage.clickOnGitIntegrationMenuUnderDevelopersTab();
		commonMethods.clickOnHomeBreadcrumb();
		sisenseHeaderPage.verifySisenseHomePageTitle();
	}

	@Test
	public void verifyDeveloperPortalBreadcrumbTitleUnderGitIntegrationPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		gitIntegrationPage.clickOnGitIntegrationMenuUnderDevelopersTab();
		commonMethods.clickOnDeveloperPortalBreadcrumb();
		sisenseHeaderPage.verifyDevelopersPageTitle();
	}

	@Test
	public void verifyDemoPageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		gitIntegrationPage.clickOnGitIntegrationMenuUnderDevelopersTab();
		sisenseHeaderPage.clickOnDemoButton();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyBookaliveDemoPageTitleUnderFooterSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		gitIntegrationPage.clickOnGitIntegrationMenuUnderDevelopersTab();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBookaLiveDemoButtonUnderFooter();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyTryFreePageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		gitIntegrationPage.clickOnGitIntegrationMenuUnderDevelopersTab();
		sisenseHeaderPage.clickOnTryFreeButton();
		sisenseHeaderPage.verifyTryFreePageTitle();
	}

}
