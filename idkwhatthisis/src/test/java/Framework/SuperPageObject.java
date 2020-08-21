package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SuperPageObject {
	protected WebDriver driver;
	protected String baseURL = "https://www.demoblaze.com";
	
	public SuperPageObject(WebDriver driverInstance) {
		driver = driverInstance;
        PageFactory.initElements(driver, this);
	}
	
	public void navigate() {
		driver.get(baseURL);
	}
	
	protected void Navigate(String url) {
		String link = baseURL+ url;
		driver.get(link);
	}
}
