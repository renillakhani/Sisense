package com.sisense.header;

import org.testng.annotations.Test;
import com.kfast.init.SeleniumInit;


public class SisenseHeaderTest extends SeleniumInit {

	@Test
	public void verifySisenseHomePageTitle() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.verifySisenseHomePageTitle();
	}

	@Test
	public void verifyPlatformPageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnPlatformTab();
		sisenseHeaderPage.verifyPlatformPageTitle();
	}

	@Test
	public void verifySolutionsPageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnSolutionsTab();
		sisenseHeaderPage.verifySolutionsPageTitle();
	}

	@Test
	public void verifyDevelopersPageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnDevelopersTab();
		sisenseHeaderPage.verifyDevelopersPageTitle();
	}

	@Test
	public void verifyResourcesPageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnResourcesTab();
		sisenseHeaderPage.verifyResourcesPageTitle();
	}

	@Test
	public void verifyAboutPageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnAboutTab();
		sisenseHeaderPage.verifyAboutPageTitle();
	}

	@Test
	public void verifyDemoPageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnDemoButton();
		sisenseHeaderPage.verifyDemoPageTitle();
	}

	
	public void verifyTryFreePageTitleUnderHeaderSection() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		sisenseHeaderPage.clickOnTryFreeButton();
		sisenseHeaderPage.verifyTryFreePageTitle();
	}
}
