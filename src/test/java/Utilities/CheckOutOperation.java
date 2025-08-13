package Utilities;

import org.openqa.selenium.By;

public class CheckOutOperation extends Methods{
	public By checkoutdashbord_w = By.xpath("//android.view.ViewGroup[@content-desc=\"To Payment button\"]");
	/*(new TouchAction(driver))
	  .press(PointOption.point(461, 1445}))
	  .moveTo(PointOption.point(650, 347}))
	  .release()
	  .perform();*/
	public By Fullname_in = By.xpath("//android.widget.EditText[@content-desc=\"Full Name* input field\"]");
	public By Address_in = By.xpath("//android.widget.EditText[@content-desc=\"Address Line 1* input field\"]");
	
	
	public By city_in = By.xpath("//android.widget.EditText[@content-desc=\"City* input field\"]");
	
	
	public By ZipCode_in = By.xpath("//android.widget.EditText[@content-desc=\"Zip Code* input field\"]");
	public By Country_c = By.xpath("//android.widget.EditText[@content-desc=\"Country* input field\"]");
	
	public By ToProceedButton_c = By.xpath("//android.view.ViewGroup[@content-desc=\"To Payment button\"]");
	
	public By ReviewOrder_w = By.xpath("//android.view.ViewGroup[@content-desc=\"Review Order button\"]");
	public By CardUserName_in = By.xpath("//android.widget.EditText[@content-desc=\"Full Name* input field\"]");//Sakif
	public By CardNumber_in = By.xpath("//android.widget.EditText[@content-desc=\"Card Number* input field\"]");//325812657456789
	public By ExparedDate_in = By.xpath("//android.widget.EditText[@content-desc=\"Expiration Date* input field\"]");//13/25
	public By SecurityCode_in =By.xpath("//android.widget.EditText[@content-desc=\"Security Code* input field\"]"); //123
	public By ReviewOrderButton_c = By.xpath("//android.view.ViewGroup[@content-desc=\"Review Order button\"]");
	
	
	public By PlaceOrder_w_c = By.xpath("//android.view.ViewGroup[@content-desc=\"Place Order button\"]");
	public By CheckoutPage_w = By.xpath("//android.view.ViewGroup[@content-desc=\"Continue Shopping button\"]");
	
	public void checkout() throws InterruptedException{
		WaitElementVisible(checkoutdashbord_w);
		takeScreenshot("Checkout Dashbord");
		Scrolling(461, 1445, 650, 347);
		Thread.sleep(2000);
		FieldValue(Fullname_in, "Sakif");
		FieldValue(Address_in, "Dhanmondi");
		FieldValue(city_in, "Dhaka");
		Thread.sleep(2000);
		FieldValue(ZipCode_in, "1209");
		FieldValue(Country_c, "Bangladesh");
		takeScreenshot("Check out informations");
		Thread.sleep(2000);
		clickElement(ToProceedButton_c);
		clickElement(ReviewOrder_w);
		takeScreenshot("Payment Information Dashbord");
		FieldValue(CardUserName_in, "Sakif");
		FieldValue(CardNumber_in, "3432234356567878");
		FieldValue(ExparedDate_in,"12/25");
		FieldValue(SecurityCode_in, "123");
		Thread.sleep(2000);
		takeScreenshot("Payment Information Taken");
		clickElement(ReviewOrderButton_c);
		Thread.sleep(2000);
		clickElement(ReviewOrderButton_c);

		WaitElementVisible(PlaceOrder_w_c);
		takeScreenshot("Checkout Page");
		Thread.sleep(2000);
		clickElement(PlaceOrder_w_c);
		WaitElementVisible(CheckoutPage_w);
		Thread.sleep(2000);
		takeScreenshot("Checkout Ended");


		
	}


}
