package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjectModel.LoginPageObjects;
import resources.Baseclass;
import resources.Constants;
import resources.commonMethods;

public class LoginTestCase extends Baseclass {

	@Test(dataProvider = "testData")
	public void verifyLogin(String username, String password) throws IOException, InterruptedException {

		LoginPageObjects lpo = new LoginPageObjects(driver);

		lpo.enterUsername().sendKeys(username);

		lpo.enterPassword().sendKeys(password);
		
		Thread.sleep(3000);

		lpo.clickOnLogin().click();

		commonMethods.verifyAssertions(lpo.errorMessage(), Constants.expectedTextErrorMessage,
				"Valid Error message is not showing");

	}
	
	// object is a class--
	// object[][]-is return type of data provider

	@DataProvider
	public Object[][] testData() { // test data()is data provider name
		Object[][] data = new Object[3][2]; // create the object of object class
		data[0][0] = Constants.username1; // 1st user name
		data[0][1] = Constants.password1; // 1st password
		data[1][0] = Constants.username2; // 2nd user name
		data[1][1] = Constants.password2; // 2nd password
		data[2][0] = Constants.username3; // 3rd user name
		data[2][1] = Constants.password3; // 3rd password
		return data;
	}

}
