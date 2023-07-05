package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class Baseclass {

	public WebDriver driver;
	public Properties prop;

	public void initializerDriver() throws IOException {

		// To read the data
		FileInputStream fs = new FileInputStream(
				(System.getProperty("user.dir") + "\\src\\main\\java\\resources\\data.properties"));

		// properties is a class
		prop = new Properties();
		prop.load(fs); // this method will take the control of the file

		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("Chrome")) {

			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("edge")) {

			driver = new EdgeDriver();
		}

		else {

			System.out.println("please choose proper browser");
		}

	}

	@BeforeMethod
	public void launchBrowserandURL() throws IOException {
		initializerDriver();

		driver.get(prop.getProperty("url"));

	}
}
