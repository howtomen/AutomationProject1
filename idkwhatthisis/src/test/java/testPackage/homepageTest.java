package testPackage;

import org.testng.annotations.Test;

import Framework.SuperPageObject;
import Framework.TestSuperClass;

public class homepageTest extends TestSuperClass {
	//This test is the initial test to pull up the homepage
	
	@Test
	public void hompage() {
		new SuperPageObject(driver).navigate();
	}

}
