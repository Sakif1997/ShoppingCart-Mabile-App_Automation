package Utilities;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class logOutObjects extends Methods{
	public By Menubar_c = By.xpath("//android.view.ViewGroup[@content-desc=\"open menu\"]");
	public By logout_c = By.xpath("//android.view.ViewGroup[@content-desc=\"menu item log out\"]");
	public By LogoutPop_accept = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]");
	
	@Test(description = "Scenario 14: Verify Logout")
	public void logout() throws InterruptedException{
		clickElement(Menubar_c);
		Thread.sleep(2000);
		takeScreenshot("logout");
		clickElement(logout_c);
		Thread.sleep(2000);
		clickElement(LogoutPop_accept);
		Thread.sleep(2000);
		takeScreenshot("logout Successful Mesage");



	}


}
