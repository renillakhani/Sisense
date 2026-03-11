package com.orangehrm;

import static com.kfast.constants.FrameworkConstants.LOW_TIMEOUT;
import static com.kfast.constants.FrameworkConstants.TEST_DATA_PATH;
import static com.kfast.init.Common.checkIfElementIsDisplayedwithWait;
import static com.kfast.init.Common.scrollUpToElement;
import static com.kfast.init.Common.waitAndClick;
import static com.kfast.init.Common.waitAndSendKeys;
import static com.kfast.init.Common.waitForElementToBeVisible;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.kfast.init.AbstractPage;
import com.kfast.init.Common;
import com.kfast.utils.GenericUtils;

public class RecruitmentPage extends AbstractPage {

	public RecruitmentPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = "//h6[text()='Recruitment']")
	private WebElement recruitmentHeader;

	public boolean verifyRedirectedToRecruitment() {
		return checkIfElementIsDisplayedwithWait(driver, recruitmentHeader, LOW_TIMEOUT);
	}
	
	@FindBy(xpath = "//a[contains(text(),\"Candidates\")]")
	private WebElement recruitmentCandidateTab;

	public void recruitmentCandidateTab() {
		waitAndClick(driver, recruitmentCandidateTab);
	}

	@FindBy(xpath = "//li[.='Vacancies']")
	private WebElement vacanciesMenu;

	public RecruitmentPage clickOnVacancies() {
		log("Click on Vacancies");
		waitAndClick(driver, vacanciesMenu);
		return this;
	}

	@FindBy(xpath = "//h5[.='Vacancies']")
	private WebElement vacanciesHeader;

	public boolean verifyRedirectedToVacancies() {
		return checkIfElementIsDisplayedwithWait(driver, vacanciesHeader, LOW_TIMEOUT);
	}

	@FindBy(xpath = "//div[contains(@class, 'oxd-table-body')]/DIV[1]/DIV[1]/DIV[4]")
	private WebElement getHiringManager;

	public String getHiringManager() {
		log("Checking Hiring Manager " + Common.getText(getHiringManager));
		return Common.getText(getHiringManager);
	}
	
	@FindBy(xpath = "//div[contains(@class, 'oxd-table-body')]/DIV[1]/DIV[1]/DIV[6]/DIV[1]/BUTTON[2]/I[1]")
	private WebElement editVacancyIcon;
	
	public void editVacancy() {
		log("Clicking on vacancy edit icon");
		waitAndClick(driver, editVacancyIcon);
	}
	
	@FindBy(xpath = "//input[@placeholder=\"Type for hints...\"]")
	private WebElement clearHiringManagerField;
	
	public void clearHiringManagerField() {
		log("Clear Hiring Manager field");
		Common.clear(clearHiringManagerField);
	}
	
	@FindBy(xpath = "//input[@placeholder=\"Type for hints...\"]")
	private WebElement enterHiringManager;
	
	public void enterHiringManager() {
		log("Entering Hiring Manager");
		waitAndSendKeys(driver, enterHiringManager, "a");
	}

	@FindBy(xpath = "//div[contains(@class, 'oxd-autocomplete-dropdown')]/DIV[2]")
	private WebElement selectHiringManager;
	
	public void selectHiringManager() {
		log("Select Hiring Manager");
		waitForElementToBeVisible(driver, selectHiringManager);
		waitAndClick(driver, selectHiringManager);
	}
	
	@FindBy(xpath = "//button[contains(.,'Add')]")
	private WebElement addBtn;

	public RecruitmentPage clickOnAdd() {
		log("Click on Add button");
		waitAndClick(driver, addBtn);
		return this;
	}

	@FindBy(xpath = "//div[.='Vacancy Name']//input")
	private WebElement vacancyNameInput;

	public RecruitmentPage enterVacancyName(String vacancyName) {
		log("Enter Vacancy Name: " + vacancyName);
		waitAndSendKeys(driver, vacancyNameInput, vacancyName);
		return this;
	}

	@FindBy(xpath = "//input[@placeholder='First Name']")
	private WebElement firstNameInput;

	public RecruitmentPage enterFirstName(String firstName) {
		log("Enter first Name: " + firstName);
		waitAndSendKeys(driver, firstNameInput, firstName);
		return this;
	}

	@FindBy(xpath = "//input[@placeholder='Last Name']")
	private WebElement lastNameInput;

	public RecruitmentPage enterLastName(String lastName) {
		log("Enter last Name: " + lastName);
		waitAndSendKeys(driver, lastNameInput, lastName);
		return this;
	}

	@FindBy(xpath = "(//input[@placeholder='Type here'])[1]")
	private WebElement emailInput;

	public RecruitmentPage enterEmail(String email) {
		log("Enter Email: " + email);
		waitAndSendKeys(driver, emailInput, email);
		return this;
	}

	@FindBy(xpath = "//div[contains(text(),'-- Select --')]")
	private WebElement vacancySel;

	public void selVacancy() {
		log("Select vacancy: ");
		waitAndClick(driver, vacancySel);
		String xpath = "//div[contains(@class, 'oxd-select-dropdown')]/DIV[2]";
		WebElement vacancyList = driver.findElement(By.xpath(xpath));
		waitAndClick(driver, vacancyList);
	}

	@FindBy(xpath = "//input[@type='file']")
	private WebElement fileInput;

	public RecruitmentPage uploadFile(String file) {
		log("Upload file");
		String uploadFilePath = TEST_DATA_PATH + File.separator + file;
		fileInput.sendKeys(uploadFilePath);
		return this;
	}

	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement saveBtn;

	public RecruitmentPage clickSave() {
		log("Click on save button");
		scrollUpToElement(driver, saveBtn);
		waitAndClick(driver, saveBtn);
		return this;
	}

	public RecruitmentPage addCandidate(String firstName, String lastName, String email, String file) {
		log("*****Create candidate******");
		clickOnAdd();
		enterFirstName(firstName);
		enterLastName(lastName);
		selVacancy();
		enterEmail(email);
		uploadFile(file);
		clickSave();
		return this;
	}

	public boolean verifyAddedCandidate(String firstName, String lastName) {
		String xpath = "//p[.='" + firstName + "  " + lastName + "']";
		WebElement candidate = driver.findElement(By.xpath(xpath));
		return checkIfElementIsDisplayedwithWait(driver, candidate, LOW_TIMEOUT);
	}

	@FindBy(xpath = "//div[@class='orangehrm-recruitment-status']/child::p[.='Status: Application Initiated']")
	private WebElement status;

	public boolean verifyAddedCandidateStatus() {
		return checkIfElementIsDisplayedwithWait(driver, status, LOW_TIMEOUT);

	}

	@FindBy(xpath = "//button[text()=' Shortlist ']")
	private WebElement shortlistBtn;

	public RecruitmentPage clickShortlist() {
		log("Click on Shortlist button");
		waitAndClick(driver, shortlistBtn);
		return this;
	}

	@FindBy(xpath = "//textarea[@placeholder='Type here']")
	private WebElement notes;

	public RecruitmentPage enterNotes(String shortlistNote) {
		log("Enter notes to change status");
		waitForElementToBeVisible(driver, notes, 3);
		waitAndSendKeys(driver, notes, shortlistNote);
		log("Added note as: " + shortlistNote);
		return this;
	}

	public RecruitmentPage applyToShortlist(String note) {
		log("****Apply to Shortlist****");
		clickShortlist();
		enterNotes(note);
		clickSave();
		return this;

	}

	@FindBy(xpath = "//div[@class='orangehrm-recruitment-status']/child::p[.='Status: Shortlisted']")
	private WebElement shortlistStatus;

	public boolean verifyshortlistCandidateStatus() {
		return checkIfElementIsDisplayedwithWait(driver, shortlistStatus, LOW_TIMEOUT);

	}

	@FindBy(xpath = "//button[normalize-space()='Schedule Interview']")
	private WebElement scheduleInterviewBtn;

	public RecruitmentPage clickScheduleInterview() {
		log("Click on schedule Interview button");
		waitAndClick(driver, scheduleInterviewBtn);
		return this;
	}

	@FindBy(xpath = "//label[normalize-space()='Interview Title']/parent::div/following-sibling::div//input")
	private WebElement interviewTitle;

	public RecruitmentPage enterInterviewTitle(String title) {
		log("Enter Interview title: " + title);
		waitAndSendKeys(driver, interviewTitle, title);
		return this;
	}

	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	private WebElement interviewerTxtfield;

	@FindBy(xpath = "//div[@role='listbox']//div[2]")
	private WebElement listbox;

	public RecruitmentPage enterInterviewer() {
		log("Enter Interviewer name ");
		waitAndSendKeys(driver, interviewerTxtfield, "a");
		waitForElementToBeVisible(driver, listbox, 3);
		waitAndClick(driver, listbox);
		return this;
	}

	@FindBy(xpath = "//input[contains(@placeholder,'yyyy')]")
	private WebElement dateTxtfield;

	public RecruitmentPage enterDate(String date) {
		log("Enter Interviewe date: " + date);
		waitAndSendKeys(driver, dateTxtfield, date);
		return this;
	}

	public RecruitmentPage applyToScheduleInterview(String title, String date, String note) {
		log("****change shortlist to schedule interview****");
		clickScheduleInterview();
		enterInterviewTitle(title);
		enterInterviewer();
		enterDate(date);
		enterNotes(note);
		clickSave();
		return this;

	}

	@FindBy(xpath = "//p[text()='Success']")
	private WebElement successMsg;

	public boolean verifysuccessMessage() {
		return checkIfElementIsDisplayedwithWait(driver, successMsg, LOW_TIMEOUT);

	}

	@FindBy(xpath = "//div[@class='orangehrm-recruitment-status']/child::p[.='Status: Interview Scheduled']")
	private WebElement interviewStatus;

	public boolean verifyinterviewCandidateStatus() {
		return checkIfElementIsDisplayedwithWait(driver, interviewStatus, LOW_TIMEOUT);

	}

	@FindBy(xpath = "//button[normalize-space()='Mark Interview Passed']")
	private WebElement passedBtn;

	public RecruitmentPage clickPassed() {
		log("Click on mark Interview passed button");
		waitAndClick(driver, passedBtn);
		return this;
	}

	public RecruitmentPage interviewpassed(String note) {
		log("****change schedule interview to pass****");
		clickPassed();
		enterNotes(note);
		clickSave();
		return this;

	}

	@FindBy(xpath = "//div[@class='orangehrm-recruitment-status']/child::p[.='Status: Interview Passed']")
	private WebElement interviewPassStatus;

	public boolean verifyafterinterviewStatus() {
		return checkIfElementIsDisplayedwithWait(driver, interviewPassStatus, LOW_TIMEOUT);

	}

	@FindBy(xpath = "//button[normalize-space()='Offer Job']")
	private WebElement jobOfferBtn;

	public RecruitmentPage clickJobOffer() {
		log("Click on job offer button");
		waitAndClick(driver, jobOfferBtn);
		return this;
	}

	public RecruitmentPage jobOffer(String note) {
		log("****change pass to offer****");
		clickJobOffer();
		enterNotes(note);
		clickSave();
		return this;

	}

	@FindBy(xpath = "//div[@class='orangehrm-recruitment-status']/child::p[.='Status: Job Offered']")
	private WebElement offerStatus;

	public boolean verifyJobOfferStatus() {
		return checkIfElementIsDisplayedwithWait(driver, offerStatus, LOW_TIMEOUT);

	}

	@FindBy(xpath = "//button[normalize-space()='Hire']")
	private WebElement hireBtn;

	public RecruitmentPage clickHire() {
		log("Click on Hire button");
		waitAndClick(driver, hireBtn);
		return this;
	}

	public RecruitmentPage toHire(String note) {
		log("****change offer to hire****");
		clickHire();
		enterNotes(note);
		clickSave();
		return this;

	}

	@FindBy(xpath = "//div[@class='orangehrm-recruitment-status']/child::p[.='Status: Hired']")
	private WebElement hireStatus;

	public boolean verifyHireStatus() {
		return checkIfElementIsDisplayedwithWait(driver, hireStatus, LOW_TIMEOUT);

	}

}
