package TestCases;

import org.testng.annotations.Test;

import MobileConfig.DriverSetup;
import Utilities.CheckOutOperation;

public class CheckOut extends DriverSetup {
	CheckOutOperation cop = new CheckOutOperation();
	
	@Test(description = "Scenario 13: Checkout process\n"
		    + "1. Verify check Information taken clearly\n"
		    + "2. Verify Payment Information taken clearly\n"
		    + "3. Verify Place Order Successfully")
	public void checkedOut() throws InterruptedException{
		cop.checkout();
	}
	

}
