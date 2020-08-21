package Framework;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import driverStuff.DriverManagerFactory;
import driverStuff.DriverType;

public class TestSuperClass {
	protected WebDriver driver;
	protected String BaseURL;
	
	@BeforeTest
	public void beforeTest() {
		driver = DriverManagerFactory.getManager(DriverType.CHROME).getDriver();
		

	}
	@AfterTest
	public void afterTest() {
		driver.quit();
		
	}

		

}
