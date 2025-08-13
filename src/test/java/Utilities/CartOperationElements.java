package Utilities;

import org.openqa.selenium.By;

public class CartOperationElements extends Methods{
	public By Carticon_c = By.xpath("//android.view.ViewGroup[@content-desc=\"cart badge\"]");
	public By CartlistPage_w = By.xpath("//android.view.ViewGroup[@content-desc=\"Proceed To Checkout button\"]");
	
	  
	/*(new TouchAction(driver))
	  .press(PointOption.point(650, 206}))
	  .moveTo(PointOption.point(234, 1541}))
	  .release()
	  .perform();*/
	
	public By DecreseButton_1stpro_c =By.xpath("//android.view.ViewGroup[@content-desc=\"counter minus button\"]");
	/*(new TouchAction(driver))
  .press(PointOption.point(420, 1379}))
  .moveTo(PointOption.point(647, 389}))
  .release()
  .perform();*/
	public By incresButton_3rdpro_c =By.xpath("(//android.view.ViewGroup[@content-desc=\"counter plus button\"])[2]");
	public By RemoveIteam_2ndpro_c = By.xpath("(//android.view.ViewGroup[@content-desc=\"remove item\"])[1]");
	public By ProceedToCheckout_button =By.xpath("//android.view.ViewGroup[@content-desc=\"Proceed To Checkout button\"]");
	
	
	public void cartpageOperation() throws InterruptedException{
		clickElement(Carticon_c);
		WaitElementVisible(CartlistPage_w);
		Thread.sleep(2000);
		takeScreenshot("Cart Product list");
		Scrolling(650, 206, 234, 1541);
		Thread.sleep(2000);
		clickElement(DecreseButton_1stpro_c);
		Scrolling(420, 1379, 647, 389);
		clickElement(incresButton_3rdpro_c);
		clickElement(RemoveIteam_2ndpro_c);
		Thread.sleep(2000);
		takeScreenshot("Final Product list");
		clickElement(ProceedToCheckout_button);
		Thread.sleep(2000);
	}

}
