package Utilities;

import org.openqa.selenium.By;

public class LoginObjects extends Methods {
	public By Menubar_c = By.xpath("//android.view.ViewGroup[@content-desc=\"open menu\"]");
	public By login_w_c = By.xpath("//android.view.ViewGroup[@content-desc=\"menu item log in\"]");
	public By Username_in = By.xpath("//android.widget.EditText[@content-desc=\"Username input field\"]");// bod@example.com
	public By Pass_in = By.xpath("//android.widget.EditText[@content-desc=\"Password input field\"]");//10203040
	public By LoginButton_c = By.xpath("//android.view.ViewGroup[@content-desc=\"Login button\"]");
	
	
	public void Login() throws InterruptedException{
		clickElement(Menubar_c);
		WaitElementVisible(login_w_c);
		clickElement(login_w_c);
		Thread.sleep(2000);
		FieldValue(Username_in, "bob@example.com");
		FieldValue(Pass_in, "10203040");
		takeScreenshot("login Page");
		Thread.sleep(2000);
		clickElement(LoginButton_c);
	}
}
