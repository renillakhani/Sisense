package com.sisense.platform;

import org.testng.annotations.Test;

import com.kfast.init.SeleniumInit;

public class EmbeddableTest extends SeleniumInit {

	@Test
	public void verifyEmbeddablePageTitleUnderPlatformTab() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		embeddablePage.clickOnEmbeddableMenuUnderPlatformTab();
		embeddablePage.verifyEmbeddablePageTitleUnderPlatformTab();
	}

	@Test
	public void verifyFillTheFormUnderBookaLiveDemo() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		embeddablePage.clickOnEmbeddableMenuUnderPlatformTab();
		embeddablePage.clickOnBookALiveDemoButtonUnderEmbeddablePage();
		embeddablePage.fillUpBookALiveDemoForm("madhavi.sriramaneni@kiwiqa.com", "Madhavi", "Sriramaneni", "1111111111",
				"KiwiQA", "QA");
		embeddablePage.clickOnBookliveDemoButtonUnderform();
		embeddablePage.verifyBookliveDemoFormSubmit();
	}

	@Test
	public void verifyBookALiveDemoFormOpenTitleUnderEmbeddablePage() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		embeddablePage.clickOnEmbeddableMenuUnderPlatformTab();
		embeddablePage.clickOnBookALiveDemoButtonUnderEmbeddablePage();
		demoPage.verifyformIsOpen();
	}

	@Test
	public void verifyCheckOutTheQuickstartGuidePageTitleUnderNativelyEmbedSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		embeddablePage.clickOnEmbeddableMenuUnderPlatformTab();
		embeddablePage.clickOnCheckOutTheQuickstartGuideButtonUnderNativelyEmbedSection();
		embeddablePage.verifyQuickstartGuidePageTitleUnderNativelyEmbedSection();
	}

	@Test
	public void verifyReadOurGuidePageTitleUnderQuicklyIntegrateSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		embeddablePage.clickOnEmbeddableMenuUnderPlatformTab();
		embeddablePage.clickOnReadOurGuideButtonUnderQuicklyIntegrateSection();
		embeddablePage.verifyReadOurGuidePageTitleUnderQuicklyIntegrateSection();
	}

	@Test
	public void verifyGetStartedPageTitleUnderChooseWhatToEmbedSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		embeddablePage.clickOnEmbeddableMenuUnderPlatformTab();
		embeddablePage.clickOnGetStartedButtonUnderChooseWhatToEmbedSection();
		embeddablePage.verifyGetStartedPageTitleUnderChooseWhatToEmbedSection();
	}

	@Test
	public void verifyEmbeddingWithIFramePageTitleUnderEmbedInAFewClicksSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		embeddablePage.clickOnEmbeddableMenuUnderPlatformTab();
		embeddablePage.clickOnEmbeddingWithIFrameButtonUnderEmbedInAFewClicksSection();
		embeddablePage.verifyEmbeddingWithIFramePageTitleUnderEmbedInAFewClicksSection();
	}


	public void verifyLearnMorePageTitleUnderWorkAppsSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		embeddablePage.clickOnEmbeddableMenuUnderPlatformTab();
		embeddablePage.clickOnLearnMoreButtonUnderWorkAppsSection();
		embeddablePage.verifyLearnMorePageTitleUnderWorkAppsSection();
	}

	@Test
	public void verifyTryFreePageTitleUnderStartYourFreeTrialSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		embeddablePage.clickOnEmbeddableMenuUnderPlatformTab();
		commonMethods.scrollToStartYourFreeTrialSection();
		commonMethods.clickOnTryFreeButtonAboveFooter();
		commonMethods.verifySisense7_DayFreeTrialPageTitle();
	}

	@Test
	public void verifyDemoPageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		embeddablePage.clickOnEmbeddableMenuUnderPlatformTab();
		sisenseHeaderPage.clickOnDemoButton();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	@Test
	public void verifyBookALiveDemoPageTitleUnderFooterSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		embeddablePage.clickOnEmbeddableMenuUnderPlatformTab();
		commonMethods.scrollToFooter();
		sisenseFooterPage.clickOnBookaLiveDemoButtonUnderFooter();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	public void verifyTryFreePageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToPlatformTab();
		embeddablePage.clickOnEmbeddableMenuUnderPlatformTab();
		sisenseHeaderPage.clickOnTryFreeButton();
		sisenseHeaderPage.verifyTryFreePageTitle();
	}
}
