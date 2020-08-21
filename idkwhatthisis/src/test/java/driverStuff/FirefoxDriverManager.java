package driverStuff;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager extends DriverManager {

	@Override
	protected void startService() {
	}

	@Override
	protected void stopService() {
	}

	@Override
	protected void createDriver() {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

}
