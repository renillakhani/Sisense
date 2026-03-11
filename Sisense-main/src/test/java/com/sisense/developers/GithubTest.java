package com.sisense.developers;

import org.testng.annotations.Test;

import com.kfast.init.SeleniumInit;

public class GithubTest extends SeleniumInit {
	@Test
	public void verifyGithubPageTitleUnderdevelopersTab() throws InterruptedException {
		log("Open Browser");
		commonMethods.acceptCookie();
		commonMethods.mouseHoverToDevelopersTab();
		githubPage.clickOnGithubMenuUnderDevelopersTab();
		githubPage.verifyGithubPageTitleUnderGithubPage();
	}

}
