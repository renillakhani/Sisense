package com.sisense.about;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.kfast.init.AbstractPage;
import com.kfast.init.Common;

public class AboutPage extends AbstractPage {
	public AboutPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	// ------------------ OUR VALUES SECTION ------------------
	@FindBy(xpath = "//h2[contains(text(), 'Our values')]")
	private WebElement ourValuesSection;

	public void scrollToOurValuesSection() {
		Common.waitForElementToBeVisible(driver, ourValuesSection);
		Common.scrollUpToElement(driver, ourValuesSection);
		log("Scroll to Our Values section successfully.");
	}

	// ------------------ BIAS FOR ACTION ------------------
	@FindBy(xpath = "//a[text()='Bias for Action']")
	private WebElement biasForActionLink;

	@FindBy(xpath = "//p[contains(text(),'“Bias for action” is one of our key principles at ')]")
	private WebElement biasForActionText;

	public void clickOnBiasForActionLinkUnderOurValuesSection() {
		Common.waitForElementToBeVisible(driver, biasForActionLink);
		try {
			Common.jsClick(driver,biasForActionLink);
		} catch (Exception e) {
			Common.scrollUpToElement(driver, biasForActionLink);
			Common.jsClick(driver,biasForActionLink);
		}
		log("Click on Bias for Action link successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	public void verifyBiasForActionTextUnderOurValuesSection() {
		Common.waitForElementToBeVisible(driver, biasForActionText);
		Assert.assertEquals("Bias for Action text is Not Matched", biasForActionText.getText(),
				"“Bias for action” is one of our key principles at Sisense, stressing the need for quick, decisive actions in business. It promotes acting on the best information at hand rather than waiting for full certainty, aiming to prevent “analysis paralysis” that can slow innovation. This approach encourages calculated risk-taking and learning from the results rather than impulsive decisions.");
		log("Bias for Action text is matched successfully.");
	}

	// ------------------ CARING ------------------
	@FindBy(xpath = "//a[text()='Caring']")
	private WebElement caringLink;

	@FindBy(xpath = "//p[contains(text(),'Our commitment extends beyond professional development to genuinely caring for our team members')]")
	private WebElement caringText;

	public void clickOnCaringLinkUnderOurValuesSection() {
		Common.scrollUpToElement(driver, caringLink);
		Common.waitForElementToBeVisible(driver, caringLink);
		try {
			Common.jsClick(driver,caringLink);
		} catch (Exception e) {
			Common.scrollUpToElement(driver, caringLink);
			Common.jsClick(driver,caringLink);
		}
		log("Click on Caring link successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	public void verifyCaringTextUnderOurValuesSection() {
		Common.waitForElementToBeVisible(driver, caringText);
		Assert.assertEquals("Caring text is Not Matched", caringText.getText(),
				"Our commitment extends beyond professional development to genuinely caring for our team members’ well-being. Our culture is built on support and equity, and we advocate for excellence, ensuring it goes hand-in-hand with resilience, respect for personal boundaries, and self-care.");
		log("Caring text is matched successfully.");
	}

	// ------------------ CUSTOMER CENTRIC ------------------
	@FindBy(xpath = "//a[text()='Customer-Centric']")
	private WebElement customerCentricLink;

	@FindBy(xpath = "//p[contains(text(),'We align our strategy with a comprehensive understanding of our customers')]")
	private WebElement customerCentricText;

	public void clickOnCustomerCentricLinkUnderOurValuesSection() {
		Common.scrollUpToElement(driver, customerCentricLink);
		Common.waitForElementToBeVisible(driver, customerCentricLink);
		try {
			Common.jsClick(driver,customerCentricLink);
		} catch (Exception e) {
			Common.scrollUpToElement(driver, customerCentricLink);
			Common.jsClick(driver,customerCentricLink);
		}
		log("Click on Customer-Centric link successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	public void verifyCustomerCentricTextUnderOurValuesSection() {
		Common.waitForElementToBeVisible(driver, customerCentricText);
		Assert.assertEquals("Customer-Centric text is Not Matched", customerCentricText.getText(),
				"We align our strategy with a comprehensive understanding of our customers’ unique challenges and goals, tailoring our technology to drive their innovations forward. Together, we transform ambitions into achievements through a symbiotic relationship, committed to continual learning and adapting to serve their evolving needs better.");
		log("Customer-Centric text is matched successfully.");
	}

	// ------------------ INCLUSIVITY ------------------
	@FindBy(xpath = "//a[text()='Inclusivity']")
	private WebElement inclusivityLink;

	@FindBy(xpath = "//p[contains(text(),'Inclusivity means creating a welcoming, valued, and respectful environment, thus, enhancing')]")
	private WebElement inclusivityText;

	public void clickOnInclusivityLinkUnderOurValuesSection() {
		Common.scrollUpToElement(driver, inclusivityLink);
		Common.waitForElementToBeVisible(driver, inclusivityLink);
		try {
			Common.jsClick(driver,inclusivityLink);
		} catch (Exception e) {
			Common.scrollUpToElement(driver, inclusivityLink);
			Common.jsClick(driver,inclusivityLink);
		}
		log("Click on Inclusivity link successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	public void verifyInclusivityTextUnderOurValuesSection() {
		Common.waitForElementToBeVisible(driver, inclusivityText);
		Assert.assertEquals("Inclusivity text is Not Matched", inclusivityText.getText(),
				"Inclusivity means creating a welcoming, valued, and respectful environment, thus, enhancing organizational performance, innovation, and employee satisfaction. We ensure all voices are heard, actively encouraging open communication. This approach fosters a sense of connection, belonging, and collaboration for our collective success.");
		log("Inclusivity text is matched successfully.");
	}

	// ------------------ DISRUPTORS ------------------
	@FindBy(xpath = "//a[text()='Disruptors']")
	private WebElement disruptorsLink;

	@FindBy(xpath = "//p[contains(text(),'Embracing the “disruptor” mindset, we promote innovation and critical thinking')]")
	private WebElement disruptorsText;

	public void clickOnDisruptorsLinkUnderOurValuesSection() {
		Common.scrollUpToElement(driver, disruptorsLink);
		Common.waitForElementToBeVisible(driver, disruptorsLink);
		try {
			Common.jsClick(driver,disruptorsLink);
		} catch (Exception e) {
			Common.scrollUpToElement(driver, disruptorsLink);
			Common.jsClick(driver,disruptorsLink);
		}
		log("Click on Disruptors link successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	public void verifyDisruptorsTextUnderOurValuesSection() {
		Common.waitForElementToBeVisible(driver, disruptorsText);
		Assert.assertEquals("Disruptors text is Not Matched", disruptorsText.getText(),
				"Embracing the “disruptor” mindset, we promote innovation and critical thinking as core elements of our culture. We’re dedicated to continual learning, staying ahead of trends, and fostering a work environment where questioning and open communication are encouraged.");
		log("Disruptors text is matched successfully.");
	}

	// ------------------ EXPLORE OPEN POSITIONS ------------------
	@FindBy(xpath = "//a[normalize-space()='Explore open positions']")
	private WebElement exploreOpenPositionsButton;

	public void clickOnExploreOpenPositionsButtonUnderThisPage() {
		Common.scrollUpToElement(driver, exploreOpenPositionsButton);
		Common.waitForElementToBeVisible(driver, exploreOpenPositionsButton);
		try {
			Common.jsClick(driver,exploreOpenPositionsButton);
		} catch (Exception e) {
			Common.scrollUpToElement(driver, exploreOpenPositionsButton);
			Common.jsClick(driver,exploreOpenPositionsButton);
		}
		log("Click on Explore Open Positions button successfully.");
		Common.waitForPageToLoad(driver, 10);
	}

	// ------------------ JOIN A TEAM THAT VALUES ACTION SECTION ------------------
	@FindBy(xpath = "//h3[contains(text(),'Join a team that values action, innovation, and in')]")
	private WebElement joinTeamSection;

	public void scrollToJoinATeamThatValuesActionSection() {
		Common.scrollUpToBottom(driver);
		Common.waitForElementToBeVisible(driver, joinTeamSection);
		Common.scrollUpToElement(driver, joinTeamSection);
		log("Scroll to 'Join a team that values action, innovation, and inclusivity' section successfully.");
	}

	// ------------------ OUR INVESTORS SECTION ------------------
	@FindBy(xpath = "//h2[text()='Our Investors']")
	private WebElement ourInvestorsSection;

	public void scrollToOurInvestorsSection() {
		Common.scrollUpToBottom(driver);
		Common.waitForElementToBeVisible(driver, ourInvestorsSection);
		Common.scrollUpToElement(driver, ourInvestorsSection);
		log("Scroll to Our Investors section successfully.");
	}
}
