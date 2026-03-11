package com.sisense.platform;

import org.testng.annotations.Test;
import com.kfast.init.SeleniumInit;
import com.sisense.common.CommonMethods;

public class PlatformTest extends SeleniumInit {

	@Test
	public void verifyHomeBreadcrumbPageTitleUnderPlatformPage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnPlatformTab();
		commonMethods.clickOnHomeBreadcrumb();
		sisenseHeaderPage.verifySisenseHomePageTitle();
	}

	@Test
	public void verifyBookADemoPageTitleUnderBannerSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnPlatformTab();
		platformPage.scrollToBannerSection();
		platformPage.clickOnBookADemoButtonUnderBannerSection();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyLearnMorePageTitleUnderDataModelingSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnPlatformTab();
		platformPage.scrollToDataModelingSection();
		platformPage.clickLearnMoreButtonUnderDataModelingSection();
		dataModelingPage.verifyDataModelingPageTitle();
	}

	@Test
	public void verifyLearnMorePageTitleUnderDataConnectivitySection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnPlatformTab();
		platformPage.scrollToDataConnectivitySection();
		platformPage.clickLearnMoreButtonUnderDataConnectivitySection();
		connectivityPage.verifyConnectivityPageTitleUnderPlatformTab();
	}

	@Test
	public void verifyLearnMorePageTitleUnderEmbeddingSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnPlatformTab();
		platformPage.scrollToEmbeddingSection();
		platformPage.clickLearnMoreButtonUnderEmbeddingSection();
		embeddablePage.verifyEmbeddablePageTitleUnderPlatformTab();
	}

	@Test
	public void verifyLearnMorePageTitleUnderComposabilitySection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnPlatformTab();
		platformPage.scrollToComposabilitySection();
		platformPage.clickLearnMoreButtonUnderComposabilitySection();
		composablePage.verifyComposeSDKPageTitle();
	}

	@Test
	public void verifyLearnMorePageTitleUnderAISection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnPlatformTab();
		platformPage.scrollToAIThroughoutSection();
		platformPage.clickLearnMoreButtonUnderAIThroughoutSection();;
		sisenseIntelligencePage.verifySisenseIntelligencePageTitle();
	}

	@Test
	public void verifyLearnMorePageTitleUnderSecureScalableSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnPlatformTab();
		platformPage.scrollToSecureScalableSection();
		platformPage.clickLearnMoreButtonUnderSecureScalableSection();
		trustAndSecurityPage.verifySecurityPageTitle();
	}

	@Test
	public void verifyLearnMorePageTitleUnderCloudDeploymentSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnPlatformTab();
		platformPage.scrollToCloudDeploymentSection();
		platformPage.clickLearnMoreButtonUnderCloudDeploymentSection();
		cloudPage.verifyCloudPageTitle();
	}

	@Test
	public void verifyTryFreePageTitleUnderStartYourFreeTrialSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnPlatformTab();
		commonMethods.scrollToStartYourFreeTrialSection();
		commonMethods.clickOnTryFreeButtonAboveFooter();
		commonMethods.verifySisense7_DayFreeTrialPageTitle();

	}

	@Test
	public void verifyDemoPageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnPlatformTab();
		sisenseHeaderPage.clickOnDemoButton();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyBookaLiveDemoPageTitleUnderFooterSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnPlatformTab();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBookaLiveDemoButtonUnderFooter();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	public void verifyTryFreePageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnPlatformTab();
		sisenseHeaderPage.clickOnTryFreeButton();
		sisenseHeaderPage.verifyTryFreePageTitle();
	}
}