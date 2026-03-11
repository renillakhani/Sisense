package com.sisense.resources;

import org.testng.annotations.Test;

import com.kfast.init.SeleniumInit;

public class CommunityTest extends SeleniumInit {

	@Test
	public void verifyCommunityPageTitleUnderResourcesTab() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToResourcesTab();
		communityPage.clickOnCommunityMenuUnderResourcesTab();
		communityPage.verifyCommunityPageTitle();

	}

}
