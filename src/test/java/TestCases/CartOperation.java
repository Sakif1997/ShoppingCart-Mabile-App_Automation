package TestCases;

import org.testng.annotations.Test;

import MobileConfig.DriverSetup;
import Utilities.CartOperationElements;

public class CartOperation extends DriverSetup {
	
	CartOperationElements co = new CartOperationElements();
	
	

	@Test(description = "Scenario 8: Go to Cart\n"
		    + "Scenario 9: Decrease 1st Product\n"
		    + "Scenario 10: Increase 3rd Product\n"
		    + "Scenario 11: Delete 2nd Product\n"
		    + "Scenario 12: Proceed to checkout")
	public void CartOperate()  throws InterruptedException{
		co.cartpageOperation();
	}

}
