package com.sisense.developers;

import org.testng.annotations.Test;

import com.kfast.init.SeleniumInit;

public class PlaygroundTest extends SeleniumInit {

	@Test
	public void verifyPlaygroundPageTitleUnderDevelopersTab() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		playgroundPage.clickOnPlaygroundMenuUnderDevelopersTab();
		playgroundPage.verifyPlaygroundPageTitleUnderDevelopersTab();
	}

	@Test
	public void verifyComposeSDKPageTitleUnderPlaygroundPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		playgroundPage.clickOnPlaygroundMenuUnderDevelopersTab();
		playgroundPage.switchToPlaygroundPageIFrameUnderPlaygroundPage();
		playgroundPage.clickOnComposeSDKLinkUnderPlaygroundPage();
		composablePage.verifyComposeSDKPageTitle();
	}

	@Test
	public void verifyDocumentationQuickstartsAndGuidesPageTitleUnderPlaygroundPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		playgroundPage.clickOnPlaygroundMenuUnderDevelopersTab();
		playgroundPage.switchToPlaygroundPageIFrameUnderPlaygroundPage();
		playgroundPage.clickOnDocumentationQuickstartsAndGuidesLinkUnderPlaygroundPage();
		playgroundPage.verifyComposeSDKPageTitleUnderPlaygroundPage();
	}

	@Test
	public void verifyStartA30_DayFreeTrialLinkPageTitleUnderPlaygroundPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		playgroundPage.clickOnPlaygroundMenuUnderDevelopersTab();
		playgroundPage.switchToPlaygroundPageIFrameUnderPlaygroundPage();
		playgroundPage.clickOnStartA30DayFreeTrialLinkUnderPlaygroundPage();
		sisenseHeaderPage.verifyTryFreePageTitle();
	}

	@Test
	public void verifyDeveloperCommunityLinkPageTitleUnderPlaygroundPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		playgroundPage.clickOnPlaygroundMenuUnderDevelopersTab();
		playgroundPage.switchToPlaygroundPageIFrameUnderPlaygroundPage();
		playgroundPage.clickOnDeveloperCommunityLinkUnderPlaygroundPage();
		playgroundPage.verifySignInToSisenseCommunityPageTitleUnderDocumentation();
	}

	@Test
	public void verifyDiscordLinkPageTitleUnderPlaygroundPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		playgroundPage.clickOnPlaygroundMenuUnderDevelopersTab();
		playgroundPage.switchToPlaygroundPageIFrameUnderPlaygroundPage();
		playgroundPage.clickOnDiscordLinkUnderPlaygroundPage();
		playgroundPage.verifyDiscordLinkUrlUnderPlaygroundPage();
	}

	@Test
	public void verifyStartYourFreeTrialPageTitleUnderLeftSideSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		playgroundPage.clickOnPlaygroundMenuUnderDevelopersTab();
		playgroundPage.switchToPlaygroundPageIFrameUnderPlaygroundPage();
		playgroundPage.clickOnStartYourFreeTrialButtonUnderPlaygroundPage();
		sisenseHeaderPage.verifyTryFreePageTitle();
	}

	@Test
	public void verifyColumnChartLinkTitleUnderPlaygroundPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		playgroundPage.clickOnPlaygroundMenuUnderDevelopersTab();
		playgroundPage.switchToPlaygroundPageIFrameUnderPlaygroundPage();
		playgroundPage.clickOnColumnChartLinkUnderPlaygroundPage();
		playgroundPage.verifyColumnChartLinkUrlUnderPlaygroundPage();
	}

	@Test
	public void verifyPieChartLinkTitleUnderPlaygroundPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		playgroundPage.clickOnPlaygroundMenuUnderDevelopersTab();
		playgroundPage.switchToPlaygroundPageIFrameUnderPlaygroundPage();
		playgroundPage.clickOnPieChartLinkUnderPlaygroundPage();
		playgroundPage.verifyPieChartLinkUrlUnderPlaygroundPage();
	}

	@Test
	public void verifyQueryAPILinkTitleUnderPlaygroundPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		playgroundPage.clickOnPlaygroundMenuUnderDevelopersTab();
		playgroundPage.switchToPlaygroundPageIFrameUnderPlaygroundPage();
		playgroundPage.clickOnQueryAPILinkUnderPlaygroundPage();
		playgroundPage.verifyQueryAPILinkUrlUnderPlaygroundPage();
	}

	@Test
	public void verifyDashboardLayoutWithFiltersLinkTitleUnderPlaygroundPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		playgroundPage.clickOnPlaygroundMenuUnderDevelopersTab();
		playgroundPage.switchToPlaygroundPageIFrameUnderPlaygroundPage();
		playgroundPage.clickOnDashboardLayoutWithFiltersLinkUnderPlaygroundPage();
		playgroundPage.verifyDashboardLayoutWithFiltersLinkUrlUnderPlaygroundPage();
	}

	@Test
	public void verifyverifyMicroAnalyticsLinkTitleUnderPlaygroundPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		playgroundPage.clickOnPlaygroundMenuUnderDevelopersTab();
		playgroundPage.switchToPlaygroundPageIFrameUnderPlaygroundPage();
		playgroundPage.clickOnMicroAnalyticsLinkUnderPlaygroundPage();
		playgroundPage.verifyMicroAnalyticsLinkUrlUnderPlaygroundPage();
	}

	@Test
	public void verifyQueriesAndDataVisualizationsLinkUnderPlaygroundPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		playgroundPage.clickOnPlaygroundMenuUnderDevelopersTab();
		playgroundPage.switchToPlaygroundPageIFrameUnderPlaygroundPage();
		playgroundPage.clickOnQueriesAndDataVisualizationsLinkUnderPlaygroundPage();
		playgroundPage.switchToPlaygroundPageIFrameUnderPlaygroundPage();
		playgroundPage.verifyQueriesAndDataVisualizationsLinkUnderPlaygroundPage();
	}

	@Test
	public void verifyEmbedExistingDashboardsLinkUnderPlaygroundPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		playgroundPage.clickOnPlaygroundMenuUnderDevelopersTab();
		playgroundPage.switchToPlaygroundPageIFrameUnderPlaygroundPage();
		playgroundPage.clickOnEmbedExistingDashboardsLinkUnderPlaygroundPage();
		playgroundPage.switchToPlaygroundPageIFrameUnderPlaygroundPage();
		playgroundPage.verifyEmbedExistingDashboardsLinkUnderPlaygroundPage();
	}

	@Test
	public void verifyCollaborativeApproachLinkUnderPlaygroundPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		playgroundPage.clickOnPlaygroundMenuUnderDevelopersTab();
		playgroundPage.switchToPlaygroundPageIFrameUnderPlaygroundPage();
		playgroundPage.clickOnCollaborativeApproachLinkUnderPlaygroundPage();
		playgroundPage.switchToPlaygroundPageIFrameUnderPlaygroundPage();
		playgroundPage.verifyCollaborativeApproachLinkUnderPlaygroundPage();
	}

	@Test
	public void verifyDeveloperForumLinkUnderPlaygroundPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		playgroundPage.clickOnPlaygroundMenuUnderDevelopersTab();
		playgroundPage.switchToPlaygroundPageIFrameUnderPlaygroundPage();
		playgroundPage.clickOnDeveloperForumLinkUnderPlaygroundPage();
		playgroundPage.verifyDeveloperForumLinkUnderPlaygroundPage();
	}

	@Test
	public void verifyDemoPageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		playgroundPage.clickOnPlaygroundMenuUnderDevelopersTab();
		sisenseHeaderPage.clickOnDemoButton();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyBookaliveDemoPageTitleUnderFooterSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		playgroundPage.clickOnPlaygroundMenuUnderDevelopersTab();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBookaLiveDemoButtonUnderFooter();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyTryFreePageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		playgroundPage.clickOnPlaygroundMenuUnderDevelopersTab();
		sisenseHeaderPage.clickOnTryFreeButton();
		sisenseHeaderPage.verifyTryFreePageTitle();
	}

}
