package TestCases;

import org.testng.annotations.Test;

import MobileConfig.DriverSetup;
import Utilities.AddToCartObjects;

public class AddToCart extends DriverSetup{
	AddToCartObjects addcart = new AddToCartObjects();
	
	
	@Test(description = "Scenario 5 to 7: Verify prodct correctly added to cart Queue")
	public void AddProductToCart() throws InterruptedException{
		// first product quantity is 3, Second product quantity is 2
		addcart.addTocart(3, 2);
	}

}
