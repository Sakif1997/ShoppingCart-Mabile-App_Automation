package Utilities;

import org.openqa.selenium.By;

public class SorToAddToCartProduct extends Methods {
	public By Menubar_c = By.xpath("//android.view.ViewGroup[@content-desc=\\\"open menu\\\"]/android.widget.ImageView");
	public By login_w_c = By.xpath("//android.view.ViewGroup[@content-desc=\\\"menu item log in\\\"]/android.widget.TextView\\n");
	public By Username_in = By.id("Username input field");// bod@example.com
	public By Pass_in = By.id("Password input field");//10203040
	public By LoginButton_c = By.id("Login button");
	
	
	public void Login() throws InterruptedException{
		Thread.sleep(2000);
		clickElement(Menubar_c);
		WaitElementVisible(login_w_c);
		clickElement(login_w_c);
		Thread.sleep(2000);
		FieldValue(Username_in, "bod@example.com");
		FieldValue(Pass_in, "10203040");
		Thread.sleep(2000);
		clickElement(LoginButton_c);

		
		
	}


	
	

}
