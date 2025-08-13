package Utilities;

import org.openqa.selenium.By;

public class AddToCartObjects extends Methods{
	
	//Second product elements
	public By secondProduct_c = By.xpath("(//android.view.ViewGroup[@content-desc=\"store item\"])[2]");
	public By secondProductDashbord_w =By.xpath("//android.view.ViewGroup[@content-desc=\"Add To Cart button\"]");
	public By QuantityaddButton_c =By.xpath("//android.view.ViewGroup[@content-desc=\"counter plus button\"]");
	public By AddToCart_c =By.xpath("//android.view.ViewGroup[@content-desc=\"Add To Cart button\"]");
	
	public By Menubar_c = By.xpath("//android.view.ViewGroup[@content-desc=\"open menu\"]");
	public By catalogDashbord_c = By.xpath("//android.view.ViewGroup[@content-desc=\"menu item catalog\"]");

	//third product elements
	public By ThirdProduct_c = By.xpath("(//android.view.ViewGroup[@content-desc=\"store item\"])[3]");
	public By ThirdProductDashbord_w =By.xpath("//android.view.ViewGroup[@content-desc=\"Add To Cart button\"]");
	//public By ThirdProductqtyadd_c =By.xpath("");
	//public By AddToCart_c =By.xpath("//android.view.ViewGroup[@content-desc=\"Add To Cart button\"]");

	

	/*(new TouchAction(driver))
	  .press(PointOption.point(251, 1730}))
	  .moveTo(PointOption.point(667, 492}))
	  .release()
	  .perform();*/
	  
	//5th product elements
	public By FifthProduct_c = By.xpath("(//android.view.ViewGroup[@content-desc=\"store item\"])[3]");
	public By FifthProductDashbord_w =By.xpath("//android.view.ViewGroup[@content-desc=\"Add To Cart button\"]");
	//public By FifthProductqtyadd_c =By.xpath("");
	
	public void addTocart(int productquantity_p1, int productquantity_p2) throws InterruptedException{
		takeScreenshot("Product Catalog");
		clickElement(secondProduct_c);
		WaitElementVisible(secondProductDashbord_w);
		for(int i=1; i<productquantity_p1; i++) {
			clickElement(QuantityaddButton_c);
		}
		takeScreenshot("Quantity added for 2nd product");
		clickElement(AddToCart_c);
		Thread.sleep(2000);
		clickElement(Menubar_c);
		Thread.sleep(2000);
		clickElement(catalogDashbord_c);
		
		clickElement(ThirdProduct_c);
		WaitElementVisible(ThirdProductDashbord_w);
		for(int i=1; i<productquantity_p2; i++) {
			clickElement(QuantityaddButton_c);
		}
		takeScreenshot("Quantity added for 3rd product");
		clickElement(AddToCart_c);
		Thread.sleep(2000);
		clickElement(Menubar_c);
		Thread.sleep(2000);
		clickElement(catalogDashbord_c);
		
		Thread.sleep(2000);
		Scrolling(389, 1789, 774, 285);
		clickElement(FifthProduct_c);
		WaitElementVisible(FifthProductDashbord_w);
		//clickElement(QuantityaddButton_c);
		takeScreenshot("Quantity added for 5th product");
		clickElement(AddToCart_c);
		Thread.sleep(2000);
		clickElement(Menubar_c);
		Thread.sleep(2000);
		clickElement(catalogDashbord_c);
		Thread.sleep(2000);

	}
	}
