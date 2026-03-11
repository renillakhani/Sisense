package com.sisense.footer;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.kfast.constants.FrameworkConstants;
import com.kfast.init.AbstractPage;
import com.kfast.init.Common;

public class CareersPage extends AbstractPage {
	public CareersPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	// Careers Link under Footer
	@FindBy(xpath = "//a[text()='Careers']")
	private WebElement careersLinkUnderFooter;

	/**
	 * Click on Careers Link under the Footer section.
	 */
	public void clickOnCareersLinkUnderFooter() {
		Common.waitForElementToBeVisible(driver, careersLinkUnderFooter);
		Common.jsClick(driver, careersLinkUnderFooter);
		log("Click on Careers Link under Footer successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verify the title of the Careers Page after clicking from the Footer.
	 */
	public void verifyCareersPageTitleUnderFooter() {
		Assert.assertEquals("Career Page Title Not Matched", driver.getTitle(), FrameworkConstants.CAREEERS_TITLE);
		log("Careers Page Title matched successfully.");
	}

	// View All Open Roles button under Header
	@FindBy(xpath = "//a[text()='View all open roles']")
	private WebElement viewAllOpenRolesButtonUnderHeader;

	/**
	 * Click on the 'View all open roles' button under the Header section.
	 */
	public void clickOnViewAllOpenRolesButtonUnderHeader() {
		log("Clicking on 'View all open roles' button under Header.");
		Common.jsClick(driver, viewAllOpenRolesButtonUnderHeader);
		log("Click on 'View all open roles' button under Header successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verify the title of the View All Open Roles page.
	 */
	public void verifyViewAllOpenRolesPageTitleUnderHeader() {
		Assert.assertEquals("Sisense View All Open Roles Page Title Not Matched", driver.getTitle(),
				"Careers at Sisense | Join Our Innovative Team");
		log("Sisense View All Open Roles Page Title matched successfully.");
	}

	// Awards and Recognition section (Used for scrolling only)
	@FindBy(xpath = "//h2[contains(text(),'Awards and recognition')]")
	private WebElement awardsAndRecognitionSection;

	/**
	 * Scroll to the Awards and Recognition section.
	 */
	private void scrollToAwardsAndRecognitionSection() {
		Common.waitForElementToBeVisible(driver, awardsAndRecognitionSection);
		Common.scrollUpToElement(driver, awardsAndRecognitionSection);
		log("Scroll to the 'Awards and recognition' section successfully.");
	}

	// Great Place to Work Link under Awards and Recognition
	@FindBy(xpath = "//a[contains(text(),'Great Place to Work')]")
	private WebElement greatPlaceToWorkLinkUnderAwardsSection;

	/**
	 * Click on the 'Great Place to Work' link under the Awards and Recognition
	 * section.
	 */
	public void clickOnGreatPlaceToWorkLinkUnderAwardsSection() {
		scrollToAwardsAndRecognitionSection();
		Common.waitForElementToBeVisible(driver, greatPlaceToWorkLinkUnderAwardsSection);
		Common.jsClick(driver, greatPlaceToWorkLinkUnderAwardsSection);
		log("Click on 'Great Place to Work' link under Awards and Recognition section successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verify the title of the Great Place to Work page.
	 */
	public void verifyGreatPlaceToWorkPageTitleUnderAwardsSection() {
		Assert.assertEquals("Sisense Great Place to Work Page Title Not Matched", driver.getTitle(),
				"Careers at Sisense | Join Our Innovative Team");
		log("Sisense Great Place to Work Page Title matched successfully.");
	}

	// Comparably Link under Awards and Recognition
	@FindBy(xpath = "//a[contains(text(),'Comparably')]")
	private WebElement comparablyLinkUnderAwardsSection;

	/**
	 * Click on the 'Comparably' link under the Awards and Recognition section.
	 */
	public void clickOnComparablyLinkUnderAwardsSection() {
		scrollToAwardsAndRecognitionSection();
		Common.waitForElementToBeVisible(driver, comparablyLinkUnderAwardsSection);
		Common.jsClick(driver, comparablyLinkUnderAwardsSection);
		log("Click on 'Comparably' link under Awards and Recognition section successfully.");
		Common.waitForPageToLoad(driver, 10);
		Common.switchToAnotherWindow(driver, 10);
		Common.waitForPageToLoad(driver, 10);
		Common.waitForPageToLoad(driver, 10);
  
	}

	/**
	 * Verify the title of the Comparably page.
	 */
	public void verifyComparablyPageTitleUnderAwardsSection() {
	    
	    log("Comparably page opened successfully.");
		Assert.assertEquals("Sisense Comparably Page Title Not Matched", driver.getTitle(),
				"Sisense Culture | Comparably");
		log("Sisense Comparably Page Title matched successfully.");
	}

	// Find your job Section
	@FindBy(xpath = "//a[contains(text(),'Comparably')]")
	private WebElement FindyourjobSection;

	@FindBy(xpath = "//select[@id='location']//option[@value=' United States (Remote)']")
	private WebElement locationFilterOption;

	// Click on location filter under Find your job Section
	public void clickOnLocationFilter() {
		Common.waitForElementToBeVisible(driver, locationFilterOption);
		Common.jsClick(driver, locationFilterOption);
		log("Click on the Location filter");
	}

	@FindBy(xpath = "//option[@value=' United States (Remote)']")
	private WebElement USOption;

	@FindBy(xpath = "//tbody/tr[1]/td[3]")
	private WebElement locationSearcResults;

	public void selectUSOption() {
		Common.waitForElementToBeVisible(driver, USOption);
		Common.jsClick(driver, USOption);
		log("Click on US Option");
	}

	// Verification of Search Results
	public void verifySearchResults() throws InterruptedException {
		Thread.sleep(4000);
		log("locationSearcResults.getText()  :" + locationSearcResults.getText());
		log("USOption.getText()  :" + USOption.getText());
		Common.waitForElementToBeVisible(driver, locationSearcResults);
		Assert.assertEquals("Filterd Page not matched", USOption.getText(), locationSearcResults.getText());
		log("Filterd Page matched");
	}

	@FindBy(xpath = "//label[@for='team']//select[@id='team' and @value='Sales']]")
	private WebElement teamFilterOption;

	public void clickOnTeamFilter() {
		Common.waitForElementToBeVisible(driver, teamFilterOption);
		Common.jsClick(driver, teamFilterOption);
		log("Click on the Team filter");
	}

	@FindBy(xpath = "//option[@value='Sales']")
	private WebElement salesOption;

	@FindBy(xpath = "//tbody/tr[1]/td[2]")
	private WebElement teamSearcResults;

	public void selectSalesOption() {
		Common.waitForElementToBeVisible(driver, salesOption);
		// Select LocationOptions = new Select(USOption);
		// LocationOptions.deselectByIndex(1);
		Common.jsClick(driver, salesOption);
		log("Click on Sales Option");
	}

	// Verification of Search Results
	public void verifyTeamSearchResults() throws InterruptedException {
		Thread.sleep(4000);
		log("teamSearcResults.getText()  :" + teamSearcResults.getText());
		log("salesOption.getText()  :" + salesOption.getText());
		Common.waitForElementToBeVisible(driver, teamSearcResults);
		Assert.assertEquals("Filterd Page not matched", salesOption.getText(), teamSearcResults.getText());
		log("Filterd Page matched");
	}

	@FindBy(xpath = "//*[@id='location']")
	private WebElement dropdownElement;

	@FindBy(xpath = "//h2[text()='Find your job']")
	private WebElement locationFilterSection;

	public void checkingLocationFilter() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, dropdownElement);
		Common.scrollUpToElement(driver, dropdownElement);
		Common.scrollUpToElement(driver, locationFilterSection);
		log("Scroll to Filter scetion");

		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();

		for (WebElement option : options) {
			String text = option.getText();
			String value = option.getAttribute("value");

			if (value == null || value.trim().isEmpty()) {
				log("Skipping option with no value attribute: " + text);
				continue;
			}

			log("Selecting option: " + value);

			dropdown.selectByValue(value);
			Thread.sleep(1000);

			Common.waitForPresenceOfAnElement(driver, By.xpath("//tbody"));

			List<WebElement> tableValues = driver.findElements(By.xpath("//tbody/tr/td[3]"));

			if (tableValues.isEmpty()) {
				log("âš  No records found for location: " + text);
				continue; // Skip to the next dropdown option
			}

			boolean status = true;
			int i = 0;

			for (WebElement tableValue : tableValues) {
				i++;
				String cellValue = tableValue.getText();

				if (cellValue.toLowerCase().contains(text.toLowerCase())) {
					log(text + " Location Value, Row No: " + i + " âœ… Found in: " + cellValue);
				} else {
					status = false;
					log(text + " Location Value, Row No: " + i + " âŒ NOT found in: " + cellValue);
				}
				Thread.sleep(1000);
			}

			if (!status) {
				Assert.fail(text + " Location Value NOT found In Table Row");
			}
		}
	}

	@FindBy(xpath = "//*[@id='team']")
	private WebElement teamDropdownElement;

	@FindBy(xpath = "//h2[text()='Find your job']")
	private WebElement teamFilterSection;

	// cHCKING tEAM fILTER under Current Openings at Sisense Section
	public void checkingTeamFilter() throws InterruptedException {
		Common.waitForElementToBeVisible(driver, dropdownElement);
		Common.scrollUpToElement(driver, dropdownElement);
		Common.scrollUpToElement(driver, locationFilterSection);
		log("Scroll to Filter scetion");

		Select dropdown = new Select(teamDropdownElement);
		List<WebElement> options = dropdown.getOptions();

		for (WebElement option : options) {
			String text = option.getText();
			String value = option.getAttribute("value");

			if (value == null || value.trim().isEmpty()) {
				log("Skipping option with no value attribute: " + text);
				continue;
			}

			log("Selecting option: " + value);

			dropdown.selectByValue(value);
			Thread.sleep(1000);

			Common.waitForPresenceOfAnElement(driver, By.xpath("//tbody"));

			List<WebElement> tableValues = driver.findElements(By.xpath("//tbody/tr/td[2]"));

			if (tableValues.isEmpty()) {
				log("âš  No records found for team: " + text);
				continue; // Skip to the next dropdown option
			}

			boolean status = true;
			int i = 0;

			for (WebElement tableValue : tableValues) {
				i++;
				String cellValue = tableValue.getText();

				if (cellValue.toLowerCase().contains(text.toLowerCase())) {
					log(text + " Team Value, Row No: " + i + " âœ… Found in: " + cellValue);
				} else {
					status = false;
					log(text + " Team Value, Row No: " + i + " âŒ NOT found in: " + cellValue);
				}
				Thread.sleep(1000);
			}

			if (!status) {
				Assert.fail(text + " Team Value NOT found In Table Row");
			}
		}
	}

	// Current Openings at Sisense heading
	@FindBy(xpath = "//h1[text()='Current Openings at Sisense']")
	private WebElement currentOpeningsAtSisenseHeading;

	@FindBy(xpath = "//iframe[@id='grnhse_iframe']")
	private WebElement iframe;

	// Create Alert link under Current Openings at Sisense section
	@FindBy(xpath = "//a[text()='Create alert']")
	private WebElement createAlertLinkUnderCurrentOpeningsAtSisenseSection;

	/**
	 * Clicks on the Create Alert link under the Current Openings at Sisense
	 * section. Switches to iframe, scrolls to the section, and opens the Create
	 * Alert page in a new window.
	 */
	public void clickOnCreateAlertLinkUnderCurrentOpeningsAtSisenseSection() throws InterruptedException {
		// Scroll to the bottom of the page
		Common.scrollUpToBottom(driver);

		// Switch to iframe where the content is located
		Common.waitForFrameAndSwitchToIt(driver, iframe, 10);

		// Wait and scroll to the Current Openings at Sisense heading
		Common.waitForElementToBeVisible(driver, currentOpeningsAtSisenseHeading);
		Common.scrollUpToElement(driver, currentOpeningsAtSisenseHeading);
		log("Scroll to the 'Current Openings at Sisense' section successfully.");

		// Wait for the Create Alert link and click on it using JavaScript
		Common.waitForElementToBeVisible(driver, createAlertLinkUnderCurrentOpeningsAtSisenseSection);
		Common.jsClick(driver, createAlertLinkUnderCurrentOpeningsAtSisenseSection);
		log("Click on the 'Create Alert' link under the Current Openings at Sisense section successfully.");

		// Wait for the new page to load and switch to the new window
		Common.waitForPageToLoad(driver, 10);
		Common.switchToAnotherWindow(driver, 10);
		Common.waitForPageToLoad(driver, 10);
	}

	/**
	 * Verifies the page title of the Create Alert page.
	 */
	public void verifyCreateAlertPageTitle() {
		Assert.assertEquals("Create Alert Page Title Not Matched", driver.getTitle(),
				FrameworkConstants.CREATE_ALERT_TITLE);
		log("Create Alert page title matched successfully.");
	}

	// Scroll to element
	@FindBy(xpath = "//label[@id='keyword-filter-label']")
	private WebElement searchHeading;

	// Close icon (updated to button instead of svg)
	@FindBy(xpath = "//button[@aria-label='Remove selection']")
	private WebElement closeIcon;

	// Department dropdown options
	@FindBy(xpath = "//div[@id='react-select-department-filter-listbox']//child::div")
	private List<WebElement> departmentOptions;

	// Search results text
	@FindBy(xpath = "//h3[@class='section-header font-primary']")
	private WebElement searchResultsText;

	// Input box to trigger dropdown
	@FindBy(xpath = "//input[@id='department-filter']")
	private WebElement inputClick;

	public void verifyDepartmentFilterOptions() throws InterruptedException {
		Common.scrollUpToBottom(driver);
		Common.waitForFrameAndSwitchToIt(driver, iframe, 10);
		log("Switched to iframe");
		Thread.sleep(4000);

		// Scroll to keyword filter label to ensure visibility
		Common.waitForElementToBeVisible(driver, searchHeading);
		Common.scrollUpToElement(driver, searchHeading);
		log("Scroll to search heading");

		try {
			Thread.sleep(4000);
			Common.waitForElementToBeVisible(driver, currentOpeningsAtSisenseHeading);
			Common.scrollUpToElement(driver, currentOpeningsAtSisenseHeading);
			log("Scroll to the 'Current Openings at Sisense' section successfully.");
			// Click on input to load dropdown options
			Thread.sleep(4000);
			Common.waitForElementToBeVisible(driver, inputClick);
			Common.waitForElementToBeClickable(driver, inputClick);
			// Common.jsClick(driver, inputClick);
			Common.actionsClick(driver, inputClick);
			// Common.click(inputClick);
			// Common.waitAndClick(driver, inputClick);

			// Common.jsClick(driver, inputClick);

			log("Click on department input");
			Thread.sleep(4000);
		} catch (Exception e) {
			Thread.sleep(4000);
			Common.waitForElementToBeVisible(driver, currentOpeningsAtSisenseHeading);
			Common.scrollUpToElement(driver, currentOpeningsAtSisenseHeading);
			Common.waitForElementToBeVisible(driver, inputClick);
			Common.waitForElementToBeClickable(driver, inputClick);
			// Common.jsClick(driver, inputClick);
			Common.actionsClick(driver, inputClick);
			log("Click on department input");
			Thread.sleep(4000);
		}

		String isExpanded;
		isExpanded = inputClick.getAttribute("aria-expanded");

		if ("false".equals(isExpanded)) {
			Thread.sleep(4000);
			System.out.println("Dropdown is closed. Opening it...");
			Common.waitForElementToBeVisible(driver, currentOpeningsAtSisenseHeading);
			Common.scrollUpToElement(driver, currentOpeningsAtSisenseHeading);
			Common.waitForElementToBeVisible(driver, inputClick);
			Common.waitForElementToBeClickable(driver, inputClick);
			// Common.jsClick(driver, inputClick);
			Common.actionsClick(driver, inputClick);
			log("Click on department input");
			Thread.sleep(4000);
		} else if ("true".equals(isExpanded)) {
			System.out.println("Dropdown is already open.");
		} else {
			System.out.println("Unexpected value for aria-expanded: " + isExpanded);
		}

		Common.waitForAllElementsToBeVisible(driver, departmentOptions);
		int size = departmentOptions.size();
		log("Dropdown options found: " + size);

		// Click on input to load dropdown options
		Common.waitForElementToBeVisible(driver, inputClick);
		Common.waitForElementToBeClickable(driver, inputClick);
		// Common.jsClick(driver, inputClick);
		Common.actionsClick(driver, inputClick);
		log("Close department input After Count size");
		Thread.sleep(4000);

		for (int i = 0; i < size; i++) {
			Thread.sleep(4000);
			// Reopen dropdown each iteration
			Common.waitForElementToBeVisible(driver, inputClick);
			Common.waitForElementToBeClickable(driver, inputClick);
			// Common.jsClick(driver, inputClick);
			Common.actionsClick(driver, inputClick);
			isExpanded = inputClick.getAttribute("aria-expanded");
			if ("false".equals(isExpanded)) {
				Thread.sleep(4000);
				System.out.println("Dropdown is closed. Opening it...");
				Common.waitForElementToBeVisible(driver, currentOpeningsAtSisenseHeading);
				Common.scrollUpToElement(driver, currentOpeningsAtSisenseHeading);
				Common.waitForElementToBeClickable(driver, inputClick);
				// Common.jsClick(driver, inputClick);
				Common.actionsClick(driver, inputClick);
				log("Click on department input");
				Thread.sleep(4000);
			} else if ("true".equals(isExpanded)) {
				System.out.println("Dropdown is already open.");
			} else {
				System.out.println("Unexpected value for aria-expanded: " + isExpanded);
			}
			log("Click on department input (loop iteration " + (i + 1) + ")");

			WebElement searchValue;
			try {
				Common.waitForAllElementsToBeVisible(driver, departmentOptions);
				searchValue = departmentOptions.get(i);
				Common.waitForElementToBeVisible(driver, searchValue);
			} catch (Exception e) {
				Common.waitForElementToBeVisible(driver, inputClick);
				Common.waitForElementToBeClickable(driver, inputClick);
				// Common.jsClick(driver, inputClick);
				Common.actionsClick(driver, inputClick);
				Common.waitForAllElementsToBeVisible(driver, departmentOptions);
				searchValue = departmentOptions.get(i);
				Common.waitForElementToBeVisible(driver, searchValue);
			}

			String expectedText = searchValue.getText();
			try {
				Common.jsClick(driver, searchValue); // Use JS click for better support
				log("Selected department option: " + expectedText);
			} catch (Exception e) {
				Common.waitForElementToBeVisible(driver, searchHeading);
				Common.scrollUpToElement(driver, searchHeading);
				log("Scroll to search heading");
				Common.jsClick(driver, searchValue); // Use JS click for better support
				log("Selected department option: " + expectedText);
			}

			// Wait for results to update
			Thread.sleep(4000);
			Common.waitForElementToBeVisible(driver, searchResultsText);

			String actualText = searchResultsText.getText();
			log("Search result displayed: " + actualText);

			if (actualText.equals(expectedText)) {
				log("âœ… Department matched for: " + expectedText);
			} else {
				log("âŒ Mismatch: Expected - " + expectedText + ", Actual - " + actualText);
				Assert.fail("Department mismatch for: " + expectedText);
			}
			Thread.sleep(4000);
			// Clear the selection for next iteration
			Common.waitForElementToBeVisible(driver, closeIcon);
			Common.waitForElementToBeClickable(driver, closeIcon);
			Common.jsClick(driver, closeIcon);
			log("Cleared selected department");
		}
	}
}
