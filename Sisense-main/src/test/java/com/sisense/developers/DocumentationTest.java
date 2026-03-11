package com.sisense.developers;

import org.testng.annotations.Test;

import com.kfast.init.SeleniumInit;

public class DocumentationTest extends SeleniumInit {

	@Test
	public void verifyDocumentationPageTitleUnderDevelopersTab() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		documentationPage.clickOnDocumentationMenuUnderDevelopersTab();
		documentationPage.verifyDocumentationPageTitle();
	}

	@Test
	public void verifyBlogPageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		documentationPage.clickOnDocumentationMenuUnderDevelopersTab();
		documentationPage.clickOnBlogTabUnderDocumentation();
		blogPage.verifyBlogPageTitle();
	}

	@Test
	public void verifyMarketplacePageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		documentationPage.clickOnDocumentationMenuUnderDevelopersTab();
		documentationPage.clickOnMarketplaceTabUnderDocumentation();
		marketplacePage.verifyMarketplacePageTitle();
	}

	@Test
	public void verifyDeveloperDocsTapsPageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		documentationPage.clickOnDocumentationMenuUnderDevelopersTab();
		documentationPage.clickOnDeveloperDocsTabUnderDocumentation();
		documentationPage.verifyDeveloperDocsTabPageTitleUnderDocumentation();

	}

	@Test
	public void verifyGettingStartedPageTitleUnderDocumentationPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		documentationPage.clickOnDocumentationMenuUnderDevelopersTab();
		documentationPage.clickOnGettingStartedLinkUnderDocumentationPage();
		documentationPage.verifyIntroductionPageTitle();
	}

	@Test
	public void verifyReleaseNotesPageTitleUnderDocumentationPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		documentationPage.clickOnDocumentationMenuUnderDevelopersTab();
		documentationPage.clickOnReleaseNotesLinkUnderDocumentationPage();
		documentationPage.verifyReleaseNotesPageTitle();
	}

	@Test
	public void verifySecurityPageTitleUnderDocumentationPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		documentationPage.clickOnDocumentationMenuUnderDevelopersTab();
		documentationPage.clickOnSecurityLinkUnderDocumentationPage();
		documentationPage.verifySecurityPageTitle();
	}

	@Test
	public void verifyDeploymentPageTitleUnderDocumentationPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		documentationPage.clickOnDocumentationMenuUnderDevelopersTab();
		documentationPage.clickOnDeploymentLinkUnderDocumentationPage();
		documentationPage.verifyDeploymentPageTitle();
	}

	@Test
	public void verifyAdministrationPageTitleUnderDocumentationPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		documentationPage.clickOnDocumentationMenuUnderDevelopersTab();
		documentationPage.clickOnAdministrationLinkUnderDocumentationPage();
		documentationPage.verifyAdministrationPageTitle();
	}

	@Test
	public void verifyGitIntegrationPageTitleUnderDocumentationPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		documentationPage.clickOnDocumentationMenuUnderDevelopersTab();
		documentationPage.clickOnGitIntegrationLinkUnderDocumentationPage();
		documentationPage.verifyGitIntegrationPageTitle();
	}

	@Test
	public void verifyDataSourcesPageTitleUnderDocumentationPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		documentationPage.clickOnDocumentationMenuUnderDevelopersTab();
		documentationPage.clickOnDataSourcesLinkUnderDocumentationPage();
		documentationPage.verifyDataSourcesPageTitle();
	}

	@Test
	public void verifyModelingDataPageTitleUnderDocumentationPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		documentationPage.clickOnDocumentationMenuUnderDevelopersTab();
		documentationPage.clickOnModelingDataLinkUnderDocumentationPage();
		documentationPage.verifyModelingDataPageTitle();
	}

	@Test
	public void verifyDashboardsPageTitleUnderDocumentationPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		documentationPage.clickOnDocumentationMenuUnderDevelopersTab();
		documentationPage.clickOnDashboardsLinkUnderDocumentationPage();
		documentationPage.verifyDashboardsPageTitle();
	}

	@Test
	public void verifySisenseIntelligencePageTitleUnderDocumentationPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		documentationPage.clickOnDocumentationMenuUnderDevelopersTab();
		documentationPage.clickOnSisenseIntelligenceLinkUnderDocumentation();
		documentationPage.verifySisenseIntelligencePageTitleUnderDocumentation();
	}

	@Test
	public void verifyEmbedAndInfuseAnalyticsPageTitleUnderDocumentationPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		documentationPage.clickOnDocumentationMenuUnderDevelopersTab();
		documentationPage.clickOnEmbedAndInfuseAnalyticsLinkUnderDocumentation();
		documentationPage.verifyEmbedAndInfuseAnalyticsPageTitleUnderDocumentation();
	}

	@Test
	public void verifyCloudManagedServicesPageTitleUnderDocumentationPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		documentationPage.clickOnDocumentationMenuUnderDevelopersTab();
		documentationPage.clickOnCloudManagedServicesLinkUnderDocumentation();
		documentationPage.verifyCloudManagedServicesPageTitleUnderDocumentation();
	}

	@Test
	public void verifyNotebooksPageTitleUnderDocumentationPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		documentationPage.clickOnDocumentationMenuUnderDevelopersTab();
		documentationPage.clickOnNotebooksLinkUnderDocumentation();
		documentationPage.verifyNotebooksPageTitleUnderDocumentation();
	}

	@Test
	public void verifyTroubleshootingPageTitleUnderDocumentationPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		documentationPage.clickOnDocumentationMenuUnderDevelopersTab();
		documentationPage.clickOnTroubleshootingLinkUnderDocumentation();
		documentationPage.verifyTroubleshootingPageTitleUnderDocumentation();
	}

	@Test
	public void verifyDeveloperDocsPageTitleUnderDocumentationPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		documentationPage.clickOnDocumentationMenuUnderDevelopersTab();
		documentationPage.clickOnDeveloperDocsTabUnderDocumentation();
		documentationPage.verifyDeveloperDocsPageTitleUnderDocumentation();
	}

	@Test
	public void verifyJoinTheCommunityLinkPageTitleUnderDocumentationPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		documentationPage.clickOnDocumentationMenuUnderDevelopersTab();
		documentationPage.clickOnJoinTheCommunityLinkUnderDocumentation();
		documentationPage.verifyCommunitySiteHomePageTitle();
	}

	@Test
	public void verifyGoToSupportPortalPageTitleUnderDocumentationPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		documentationPage.clickOnDocumentationMenuUnderDevelopersTab();
		documentationPage.clickOnGoToSupportPortalLinkUnderDocumentation();
		documentationPage.verifySignInToSisenseCommunityPageTitleUnderDocumentation();

	}

	@Test
	public void verifyExploreTheAcademyLinkPageTitleUnderDocumentationPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		documentationPage.clickOnDocumentationMenuUnderDevelopersTab();
		documentationPage.clickOnExploreTheAcademyLinkUnderDocumentation();
		documentationPage.verifySisenseAcademyHomePageTitleUnderDocumentation();

	}

	@Test
	public void verifyBookaliveDemoPageTitleUnderDocumentationPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		documentationPage.clickOnDocumentationMenuUnderDevelopersTab();
		documentationPage.scrollToFooterUnderDocumentation();
		documentationPage.clickOnBookALiveDemoButtonUnderDocumentation();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

}
