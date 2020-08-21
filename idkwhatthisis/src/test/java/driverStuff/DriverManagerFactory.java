package driverStuff;

public class DriverManagerFactory {
	public static DriverManager getManager(DriverType type) {
		switch(type) {
		case CHROME:
			return new ChromeDriverManager();
		case FIREFOX: //not set up yet but soon
			return new FirefoxDriverManager();
		default:
			System.out.printf("We do not support this driver: %s", type);
		}
		return null;
	}
}