package TestCases;

import org.testng.annotations.Test;

import MobileConfig.DriverSetup;
import Utilities.SortingConfiguration;

public class SortingOperation extends DriverSetup{
	
	
	login lg =new login();//paralel run a tule dibo
	AddToCart ac = new AddToCart();//paralel run a tule dibo
	CartOperation CO = new CartOperation();//paralel run a tule dibo
	CheckOut cout = new CheckOut();//paralel run a tule dibo
	LogOut LoggedOut = new LogOut();//paralel run a tule dibo
	SortingConfiguration sort = new SortingConfiguration();
	
	@Test(description= "scenario 2: Verify Catalog Dashbord appeared"
			+ "Scencario 3: Verify Sort By name working or not"
			+ "Scenario 4: Verify Sort By price working or not")
	public void sort() throws InterruptedException{
		//lg.loggedIn();
		sort.Sorting();
		//ac.AddProductToCart();
		//CO.CartOperate();
		//cout.checkedOut();
		//LoggedOut.loggedOut();
		
	}

}
