package com.sisense.resources;

import org.testng.annotations.Test;

import com.kfast.init.SeleniumInit;

public class SisenseAcademyTest extends SeleniumInit {

	@Test
	public void verifySisenseAcademyPageTitleUnderResourcesTab() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		sisenseAcademyPage.clickOnSisenseAcademyMenuUnderResourcesTab();
		sisenseAcademyPage.verifySisenseAcademyPageTitle();
	}

}
