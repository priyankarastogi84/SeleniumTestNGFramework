package testcases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjectModel.LoginPageObjects;
import pageObjectModel.SignupPageObjects;
import resources.Baseclass;
import resources.Constants;
import resources.commonMethods;

public class SignupTestCases extends Baseclass {

	//Added comment for demo purpose.
	@Test
	public void verifySignup() throws IOException, InterruptedException {

		LoginPageObjects lpo = new LoginPageObjects(driver);

		lpo.clickOntryForFree().click();

		SignupPageObjects spo = new SignupPageObjects(driver);

		Thread.sleep(4000);

		spo.enterFirstName().sendKeys(Constants.firstname);

		spo.enterLastName().sendKeys(Constants.lastname);

		spo.enterJobTitle().sendKeys(Constants.jobtitle);

		spo.clickOnNextButton().click();

		commonMethods.selectDropdown(spo.selectEmployee(), 2);

		spo.enterCompany().sendKeys(Constants.company);

		commonMethods.selectDropdownWithVisibleText(spo.selectCountry(), "India");

		commonMethods.selectDropdownWithVisibleText(spo.selectState(), "Delhi");

		spo.clickOnNextButton().click();
		
		commonMethods.verifyAssertions(spo.signupPageConfirmation(), Constants.expectedsignupTextMessage, "Valid signup text is not showing");

		spo.enterphone().sendKeys(Constants.phone);

		spo.enterEmail().sendKeys(Constants.email);

		spo.checkbox().click();
	}

}
