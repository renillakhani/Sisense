package com.kfast.tests;

import static com.kfast.init.DriverManager.getDriver;
import static com.kfast.init.ITestStatus.FAILED;
import static com.kfast.init.ITestStatus.PASSED;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.kfast.init.SeleniumInit;
import com.kfast.utils.GenericUtils;
import com.orangehrm.HomePage;
import com.orangehrm.LoginPage;
import com.orangehrm.PIMPage;
import com.orangehrm.RecruitmentPage;

public class OrangeRecruitmentTest extends SeleniumInit {

	@Test
	public void recruitmentFlow(Map<String, String> testData) throws InterruptedException {
		int numOfFailure = 0;
		WebDriver driver = getDriver();
		HomePage homePage = new HomePage(driver);
		RecruitmentPage recruitmentPage = new RecruitmentPage(driver);
		PIMPage pimPage = new PIMPage(driver);
		LoginPage loginIndexPage = new LoginPage(driver);

		// login to application and verify dashboard
		String adminUsername = testData.get("adminUsername");
		String adminPassword = testData.get("adminPassword");

		loginIndexPage.login(adminUsername, adminPassword);

		log("Verifying user has been logged in.");
		if (homePage.verifyRedirectedToDashboard()) {
			logStatus(PASSED, "Login Successful");
		} else {
			logStatus(FAILED, "Login Unsuccessful.");
			numOfFailure++;
		}

		// Go to Recruitment and verify Recruitment page
		homePage.goToRecruitment();

		log("Verifying user has been redirected to Recruitment page.");
		if (recruitmentPage.verifyRedirectedToRecruitment()) {
			logStatus(PASSED, "Redirected to Recruitment page");
		} else {
			logStatus(FAILED, "Redirection Unsuccessful.");
			numOfFailure++;
		}

		
		recruitmentPage.clickOnVacancies();
		
		//checking hiring manager is available for Vacancy
		if(recruitmentPage.getHiringManager().contains("Deleted")) {
			recruitmentPage.editVacancy();
			recruitmentPage.clearHiringManagerField();
			recruitmentPage.enterHiringManager();
			recruitmentPage.selectHiringManager();
			recruitmentPage.clickSave();
			
			log("Verifying success message");
			if (recruitmentPage.verifysuccessMessage()) {
				logStatus(PASSED, "Success message displayed");
			} else {
				logStatus(FAILED, "Success message not displayed");
				numOfFailure++;
			}
		}
		
		recruitmentPage.recruitmentCandidateTab();

		// create candidate
		String firstName = testData.get("firstName");
		firstName += GenericUtils.generateRandomChars(5);
		String lastName = testData.get("lastName");
		String email = testData.get("email");
		String file = testData.get("uploadFile");
		String empName = firstName + " " + lastName;

		recruitmentPage.addCandidate(firstName, lastName, email, file);

		log("Verifying candidate has been added successfully.");
		if (recruitmentPage.verifyAddedCandidate(firstName, lastName)) {
			logStatus(PASSED, empName + " candidate added Successful");
		} else {
			logStatus(FAILED, "Candidate not added in the list.");
			numOfFailure++;
		}

		log("Verifying candidate current status");
		if (recruitmentPage.verifyAddedCandidateStatus()) {
			logStatus(PASSED, empName + " candidate status is 'Application Initiated' ");
		} else {
			logStatus(FAILED, "candidate status is not 'Application Initiated'");
			numOfFailure++;
		}

		// Shortlist candidate and verify success msg and status
		String shortNote = testData.get("shortListNote");

		recruitmentPage.applyToShortlist(shortNote);

		log("Verifying success message");
		if (recruitmentPage.verifysuccessMessage()) {
			logStatus(PASSED, "Success message displayed");
			log("Verifying candidate current status");
			if (recruitmentPage.verifyshortlistCandidateStatus()) {
				logStatus(PASSED,
						empName + " candidate status is changed from 'Application Initiated' to 'Shortlisted' ");
			} else {
				logStatus(FAILED, "candidate status was not changed to 'Shortlisted'.");
				numOfFailure++;
			}
		} else {
			logStatus(FAILED, "Success message not displayed");
			numOfFailure++;
		}

		// schedule interview and verify success msg and status
		String title = testData.get("interviewTitle");
		String date = testData.get("interviewDate");
		String intNote = testData.get("interviewNote");

		recruitmentPage.applyToScheduleInterview(title, date, intNote);
		log("Verifying success message");
		if (recruitmentPage.verifysuccessMessage()) {
			logStatus(PASSED, "Success message displayed");
			log("Verifying candidate current status");
			if (recruitmentPage.verifyinterviewCandidateStatus()) {
				logStatus(PASSED,
						empName + " candidate status is changed from 'Shortlisted' to 'Interview Scheduled' ");
			} else {
				logStatus(FAILED, "candidate status was not changed to 'Interview Scheduled'.");
				numOfFailure++;
			}
		} else {
			logStatus(FAILED, "Success message not displayed");
			numOfFailure++;
		}

		// interview pass and verify success msg and status
		String resultNote = testData.get("resultNote");
		recruitmentPage.interviewpassed(resultNote);

		log("Verifying success message");
		if (recruitmentPage.verifysuccessMessage()) {
			logStatus(PASSED, "Success message displayed");
			log("Verifying candidate current status");
			if (recruitmentPage.verifyafterinterviewStatus()) {
				logStatus(PASSED,
						empName + " candidate status is changed from 'Interview Scheduled' to 'Interview Passed' ");
			} else {
				logStatus(FAILED, "candidate status was not changed to 'Interview Passed'.");
				numOfFailure++;
			}
		} else {
			logStatus(FAILED, "Success message not displayed");
			numOfFailure++;
		}

		// offer job and verify success msg and status
		String jobOfferNote = testData.get("jobOfferNote");
		recruitmentPage.jobOffer(jobOfferNote);

		log("Verifying success message");
		if (recruitmentPage.verifysuccessMessage()) {
			logStatus(PASSED, "Success message displayed");
			log("Verifying candidate current status");
			if (recruitmentPage.verifyJobOfferStatus()) {
				logStatus(PASSED, empName + " candidate status is changed from 'Interview Passed' to 'Job Offered' ");
			} else {
				logStatus(FAILED, "candidate status was not changed to 'Job offered'.");
				numOfFailure++;
			}
		} else {
			logStatus(FAILED, "Success message not displayed");
			numOfFailure++;
		}

		// hire candidate and verify success msg and status
		String hireNote = testData.get("hireNote");
		recruitmentPage.toHire(hireNote);

		log("Verifying success message");
		if (recruitmentPage.verifysuccessMessage()) {
			logStatus(PASSED, "Success message displayed");
			log("Verifying candidate current status");
			if (recruitmentPage.verifyHireStatus()) {
				logStatus(PASSED, empName + " candidate status is changed from 'Job offered' to 'Hired' ");
			} else {
				logStatus(FAILED, "candidate status was not changed to 'Hired'.");
				numOfFailure++;
			}
		} else {
			logStatus(FAILED, "Success message not displayed");
			numOfFailure++;
		}

		// check in employee PIM list
		homePage.goToPIM();
		log("Verifying user has been redirected to PIM page.");
		if (pimPage.verifyRedirectedToPIM()) {
			logStatus(PASSED, "Redirected to PIM page");
		} else {
			logStatus(FAILED, "Redirection Unsuccessful.");
			numOfFailure++;
		}

		pimPage.checkEmpList(empName);

		log("Verifying hired employee name in PIM list");
		if (pimPage.verifyEmpName()) {
			logStatus(PASSED, empName + " found under PIM list");
		} else {
			logStatus(FAILED, "Hired employee not found under PIM list.");
			numOfFailure++;
		}

		if (numOfFailure > 0) {
			Assert.assertTrue(false);
		}
	}
}
