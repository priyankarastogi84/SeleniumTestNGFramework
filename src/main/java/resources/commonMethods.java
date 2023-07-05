package resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class commonMethods {

	public static void selectDropdown(WebElement element, int index) {

		WebElement a = element;
		Select s = new Select(a);
		s.selectByIndex(index);

	}

	public static void selectDropdownWithVisibleText(WebElement element, String visibleText) {

		WebElement a = element;
		Select s = new Select(a);
		s.selectByVisibleText(visibleText);

	}

	public static void verifyAssertions(WebElement actualText, String expectedText, String message) {

		WebElement a = actualText;

		String actualtext = a.getText();

		String expectedtext = expectedText;

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualtext, expectedtext, message);

		sa.assertAll();// This is mandatory
	}
}
