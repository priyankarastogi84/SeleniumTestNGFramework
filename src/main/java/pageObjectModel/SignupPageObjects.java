package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPageObjects {

	public WebDriver driver; // This driver don't have scope.

	private By firstName = By.xpath("//input[@name='UserFirstName']");
	private By lastName = By.xpath("//input[@name='UserLastName']");
	private By jobTitle = By.xpath("//input[@name='UserTitle']");
	private By nextButton = By.xpath("//span[contains(text(),'Next')]");
	private By selectEmployee = By.xpath("//select[@name='CompanyEmployees']");
	private By company = By.xpath("//input[@name='CompanyName']");
	private By selectCountry = By.xpath("//select[@name='CompanyCountry']");
	private By state = By.xpath("//select[@name='CompanyState']");
	private By phone = By.xpath("//input[@name='UserPhone']");
	private By email = By.xpath("//input[@name='UserEmail']");
	private By checkboxclick = By.xpath("(//div[@class='checkbox-ui'])[1]");
	private By signupPageConfirmation = By.xpath("//h2[@id='answer-2-more-questions-and-well-get-you-into-your-free-trial']");

	public SignupPageObjects(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement enterFirstName() {

		return driver.findElement(firstName);

	}

	public WebElement enterLastName() {

		return driver.findElement(lastName);

	}

	public WebElement enterJobTitle() {

		return driver.findElement(jobTitle);

	}

	public WebElement clickOnNextButton() {

		return driver.findElement(nextButton);

	}

	public WebElement selectEmployee() {

		return driver.findElement(selectEmployee);

	}

	public WebElement enterCompany() {

		return driver.findElement(company);

	}

	public WebElement selectCountry() {

		return driver.findElement(selectCountry);

	}

	public WebElement selectState() {

		return driver.findElement(state);

	}

	public WebElement enterphone() {

		return driver.findElement(phone);

	}

	public WebElement enterEmail() {

		return driver.findElement(email);

	}

	public WebElement checkbox() {

		return driver.findElement(checkboxclick);

	}

	public WebElement signupPageConfirmation() {

		return driver.findElement(signupPageConfirmation);

	}
}
