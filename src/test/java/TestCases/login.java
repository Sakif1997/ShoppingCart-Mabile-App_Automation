package TestCases;

import org.testng.annotations.Test;

import MobileConfig.DriverSetup;
import Utilities.LoginObjects;

public class login extends DriverSetup{
	LoginObjects logg = new LoginObjects();
	
	@Test(description = "Scenario 1: Verify login operation successfully")
	public void loggedIn() throws InterruptedException{
		logg.Login();
	}

}
