package TestCases;

import org.testng.annotations.Test;

import MobileConfig.DriverSetup;
import Utilities.logOutObjects;

public class LogOut extends DriverSetup{
	logOutObjects lgot = new logOutObjects();
	
	
	@Test(description = "Scenario 14: Verify Logout")
	public void loggedOut() throws InterruptedException{
		lgot.logout();
	}

}
