

# Mobile App Automation

This project is for end-to-end testing of the **[My Demo App APK](https://drive.google.com/file/d/1pAYDfsN5dTn2-2DYEAYOhn0w21YnfJAt/view)** mobile application using the **Page Object Model (POM)** pattern.
The following testing procedure covers a complete shopping journey, including **login, catalog browsing, sorting, adding products to the cart, modifying cart items, checkout, order confirmation, and logout**.

---

## Target/Goals

The following scenarios will be replicated:

### Customer Shopping Procedure

1. Open mobile application and **log in**
2. Navigate to the **Catalog** section
3. Sort products **by Name** (any order)
4. Sort products **by Price** (any order)
5. Add **2nd product** to cart with quantity **3**
6. Add **3rd product** to cart with quantity **2**
7. Add **5th product** to cart with quantity **1**

### Customer Cart & Checkout Procedure

1. Go to **Shopping Cart**
2. **Decrease** quantity of 1st product
3. **Increase** quantity of 3rd product
4. **Remove** 2nd product from cart
5. Proceed to **Checkout**
6. Complete the **checkout process** (including payment and order confirmation)
7. **Log out** from the application

---

## ✨ Key Features

- Full end-to-end test coverage of user journeys—from login to logout.
- Structured implementation using Page Object Model (POM) for maintainability and scalability.
- Automation of cart operations: add, remove, update items, and validate price calculations.
- Seamless checkout automation, including address entry, payment, and instant order confirmation.
- Easy configuration and management of test data for diverse scenarios.
- Comprehensive reporting with HTML reports, logs, and screenshots.

---

## 🧩 Technology Stack

- **Java** (Core programming language)
- **Appium** (Mobile application automation)
- **Selenium** (User interface automation)
- **TestNG** (Test orchestration)
- **Allure Reports** (Reporting)
- **Android Emulator/Real Device** (Test execution)

---
## 📋 Overview

This project demonstrates complete automation of a demo mobile shopping cart application using the Page Object Model (POM) approach. The automation covers real-device execution, multiple scenario flows, parallel testing, and detailed reporting.

- **Demo App Video Overview:**  
  [Watch the app demo](https://drive.google.com/file/d/15wapjPyYa7c5TzbpSunLZ2iIETV-dIIV/view?usp=drive_link)

- **Full Automation Run on Real Device:**  
  [View real device test execution](https://drive.google.com/file/d/1zcW3fosA7LlsLnySfHOIf40k9g6l33gh/view?usp=drive_link)

- **Scenario 1 to 7 Execution:**  
  [See scenario flows in action](https://drive.google.com/file/d/1LIocCP2UiCzKEpx7ZSgUCZna-i0eJKL2/view?usp=drive_link)

- **TestNG Parallel Test Execution:**  
  [Parallel execution video](https://drive.google.com/file/d/1zcW3fosA7LlsLnySfHOIf40k9g6l33gh/view?usp=drive_link)

- **Glimpse of Automation Code:**  
  [Preview source code](https://drive.google.com/file/d/1ogJRuxeYo9wOdlaBdHwUvqCvR5YNCVTy/view?usp=drive_link)

- **Check Report:**  
  [Live report link](https://mydemomobileshopingapp.netlify.app/)  
  [Report overview screenshot](https://drive.google.com/file/d/1C4Vwk9wPmNHOsXadmh6bLeEfoQoEkJb5/view?usp=drive_link)

> These resources provide a complete walkthrough of the mobile app automation lifecycle, from initial overview to final test reports.

## 🚀 Getting Started

### 1. Prerequisites

- Java JDK 8 or above
- Maven
- Appium Server ([Download](https://appium.io/))
- Android emulator or physical device
- [Demo App APK](https://drive.google.com/file/d/1pAYDfsN5dTn2-2DYEAYOhn0w21YnfJAt/view)

### 2. Installation

```bash
git clone https://github.com/Sakif1997/ShoppingCart-Mabile-App_Automation.git
cd ShoppingCart-Mabile-App_Automation
mvn install
```

### 3. Appium Server Setup

- Start Appium Desktop or run via CLI:
  ```bash
  appium
  ```
- Make sure the device/emulator is connected and the APK path is set in the configuration.

### 4. Execution

```bash
mvn test
```

---

## 📦 Project Structure

```
src/
  main/
    java/
      pages/         # Page Object classes (LoginPage, CartPage, CheckoutPage, etc.)
      tests/         # Test classes for scenarios and E2E flows
      utils/         # Utilities for driver management, data, config
      reports/       # Reporting and logging modules
resources/
  testdata/          # External test data files
  config/            # Configuration files (device, environment, credentials)
```

---

## 🧠 My Thought Process

- Focused on achieving a modular and reusable automation framework suitable for real-world mobile app testing.
- Prioritized maintainability by adopting the Page Object Model (POM) for separating UI interactions from test logic.
- Emphasized the importance of reporting and logging for debugging and transparency in test results.
- Selected Appium for its robust cross-platform support and ability to interact with real devices and emulators.

---

## 🛠 Approach and Methodology

- Designed the automation framework using POM, segregating functionality into distinct page classes.
- Implemented utility classes for driver setup, data management, and configuration to ensure flexibility.
- Integrated Appium server to facilitate communication between automation scripts and the mobile app, enabling device-agnostic testing.
- Adopted TestNG for orchestrating test execution and Extent Reports for comprehensive reporting.
- Utilized externalized test data to enable data-driven testing and scenario coverage.

---

## 📋 Steps Taken to Complete the Tasks

1. Analyzed the mobile app workflow and identified key pages: login, catalog, cart, checkout, and order confirmation.
2. Created corresponding Page Object classes encapsulating element locators and user actions.
3. Developed utility classes for driver management, configuration, and test data handling.
4. Configured Appium server to connect with Android emulator and specified APK path.
5. Wrote modular and maintainable test scripts for smoke, functional, regression, and end-to-end scenarios.
6. Implemented reporting with Extent Reports and integrated screenshots for failed test cases.
7. Validated the automation by executing tests on multiple Android devices/emulators.

---
---

## Test Work
### Info of testing in Real Device(this test conducted in real device)
#### FollowUp the below steps:
---
Mobile App Installation: Install the mobile app **[My Demo App APK](https://drive.google.com/file/d/1pAYDfsN5dTn2-2DYEAYOhn0w21YnfJAt/view)**  on the real device under test.  
Enable USB debugging on the real device.  
Connect the device to your machine using a USB cable. 
Run CMD to make sure the device is connected by this command:
```ruby
adb devices
```
Then press Enter
Another Important instruction to get application location just give a command below and tap to the app and press enter immediately
```ruby
adb shell dumpsys window | find "mCurrentFocus"
```
  
Picture for demonstration  
![App Demo Screenshot](https://drive.google.com/uc?id=1HGx6NbTC1yhzIxJSL1-L8oSokU-xmDo8)  

Launch Appium Server Gui and Appium Inspector from the Appium Desktop application.  
Fillup Remote Path and Desired Capabilities Following from CMD: Instructions showed in image  
![Additional Demo Screenshot](https://drive.google.com/uc?id=1CfaOqvMdTjdI7IIekLwrDH4eHbbYZ4RB)  

This will help to Inspect elements of the mobile app.
Picture for demonstration  
![Additional Demo Inspect elelement](https://drive.google.com/uc?id=1IWueGmobZquZ8Fx-Ye2sOsW-xgSax_nP)  


### Automation Part  
---
The following instructions will help you navigate those testing pages. As I am following the page object model, I will create some packages. At the package level, there is a list of classes where you can create methods, use methods for particular pages, and run and test the testing pages separately and parallelly as well.  

1. Set Environment    
i) pom.xml [dependencies set]  
ii) DriverSetup[create separate package ]  

2. Page Object Model: create methods, using methods for separate page and create test cases of those pages  
i) Driver Control/setup [package name: MobileConfig]  
ii) Methods and Page objects[package name: Utilities]  
iii) TestCases [package name: TestCases ]  

3. Create Allure report  
i) pom.xml [dependencies set for allure report]  
ii) Testng.xml [to run all test file togather]  
My POM Look Like:  
![packages](https://drive.google.com/uc?id=1Twi3jB6vN1q1J5_w0qoaCQ2zZeRShOk0)

##  Set Environment
---
Setting up dependencies on testing frameworks that will contain the testing process:  
Create a Maven Project  
Set pom.xml file   
pom.xml file Code:  
Set Under Dependencies
```ruby
     <dependency>
				<groupId>org.testng</groupId>
				<artifactId>testng</artifactId>
				<version>7.5</version>
				<scope>test</scope>
		</dependency>
		<dependency>
				<groupId>org.seleniumhq.selenium</groupId>
				<artifactId>selenium-java</artifactId>
				<version>3.141.59</version>
		</dependency>
		<!--  https://mvnrepository.com/artifact/io.appium/java-client  -->
		<dependency>
				<groupId>io.appium</groupId>
				<artifactId>java-client</artifactId>
				<version>7.6.0</version>
		</dependency>
		<!--  https://mvnrepository.com/artifact/org.apache.commons/commons-lang3  -->
		<dependency>
				<groupId>org.apache.commons</groupId>
				<artifactId>commons-lang3</artifactId>
				<version>3.12.0</version>
		</dependency>
		<!--  https://mvnrepository.com/artifact/commons-io/commons-io  -->
		<dependency>
				<groupId>commons-io</groupId>
				<artifactId>commons-io</artifactId>
				<version>2.11.0</version>
		</dependency>
		<dependency>
		<!--  https://mvnrepository.com/artifact/commons-validatorcommons-validator  -->
				<groupId>commons-validator</groupId>
				<artifactId>commons-validator</artifactId>
				<version>1.7</version>
				</dependency>
		<dependency>
				<groupId>io.qameta.allure</groupId>
				<artifactId>allure-testng</artifactId>
				<version>2.19.0</version>
		</dependency>
```

## BrowserControl/Setup
---
Create MobileConfig class under Package  
The package will hold DriverSetup in which we run the automation Code 
Inside DriverSetup Class:   
MobileConfig.DriverSetup class is responsible for setting up and configuring the Appium AndroidDriver
 * for mobile automation testing. It includes methods annotated with @BeforeSuite and @AfterSuite to be executed
 * before and after the entire test suite, respectively.  
"I prefer to connect my real device for test run to avoid emulator latency"



```ruby
package MobileConfig;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DriverSetup {
	public static AndroidDriver<AndroidElement> driver;
	@BeforeSuite
	public void SetupDriver() throws MalformedURLException{
		 DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		 desiredCapabilities.setCapability("platformName", "Android");
		 desiredCapabilities.setCapability("appium:appPackage", "com.saucelabs.mydemoapp.rn");
		 desiredCapabilities.setCapability("appium:appActivity", "com.saucelabs.mydemoapp.rn.MainActivity");
		 URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");


		 driver = new AndroidDriver<AndroidElement>(remoteUrl, desiredCapabilities);
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@AfterSuite
	public void quitDriver() {
		driver.quit();
	}
}
```
---
## Page Object model  
### Methods  
Create a package that includes methods and Methods make it easier to implement parallel testing. My method page contains methods that cover more test scenarios in less time.  
##### Methods and Usages:  
* To retrieves a single AndroidElement based on the specified locator (By object).  
```ruby
public AndroidElement getElement(By locator) {
		return driver.findElement(locator);
	}
```

* To finds an element using the specified locator and performs a click action on it.  
```ruby
public void clickElement(By locator) {
		getElement(locator).click();
	}
```
* To finds an element using the specified locator and enters the provided text into the input field.  
```ruby
public void FieldValue(By locator,String text) {
		getElement(locator).sendKeys(text);
	}
```
* To waits for the visibility of the element identified by the specified locator. 
```ruby
public void WaitElementVisible(By locator) {
		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(locator));

	}
``` 
* To performs a scrolling action from one point to another on the mobile device screen.  
```ruby
public void Scrolling(int p1, int p2, int m1, int m2){
		(new TouchAction<>(driver))
		  .press(PointOption.point(p1, p2)).waitAction()
		  .moveTo(PointOption.point(m1, m2))
		  .release()
		  .perform();
	}
```
* To perform ScreenShot for Allure report to track desire testing screen location
```ruby
public void takeScreenshot(String name) {
		Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
	}
```

Combind Picture of My Methods:  
![Method](https://drive.google.com/uc?id=1IP0z-Kf1wFrkGTntYkBvCglyYq1avBFy)  

### Scenario Replication Classes

### Targeted Scenario:  Customer Login Procedure  

PackageName: Utilities  
ClassName: LoginObjects  
Overview of this class:  

* The `LoginObjects` class contains the locators and methods necessary to perform the customer login procedure in a mobile application.    
* This class extends the `Methods` class, inheriting reusable utilities for interacting with mobile elements.    
* The login procedure involves accessing the menu, selecting the login option, entering valid credentials, and clicking the login button to authenticate.  

Here, I build a class that has the xpaths and IDs required to produce scenarios.  
"Those elements’ XPaths and IDs are inherited or captured from Appium Inspector."  


```java
package Utilities;

import org.openqa.selenium.By;

public class LoginObjects extends Methods {
	public By Menubar_c = By.xpath("//android.view.ViewGroup[@content-desc=\"open menu\"]");
	public By login_w_c = By.xpath("//android.view.ViewGroup[@content-desc=\"menu item log in\"]");
	public By Username_in = By.xpath("//android.widget.EditText[@content-desc=\"Username input field\"]");// bob@example.com
	public By Pass_in = By.xpath("//android.widget.EditText[@content-desc=\"Password input field\"]");//10203040
	public By LoginButton_c = By.xpath("//android.view.ViewGroup[@content-desc=\"Login button\"]");
	
	public void Login() throws InterruptedException {
		clickElement(Menubar_c);
		WaitElementVisible(login_w_c);
		clickElement(login_w_c);
		Thread.sleep(2000);
		FieldValue(Username_in, "bob@example.com");
		FieldValue(Pass_in, "10203040");
		Thread.sleep(2000);
		clickElement(LoginButton_c);
	}
}
```



### Test Run of Customer Login Procedure

PackageName: TestCases
ClassName: login
Overview of this TestCase class:

* The test scenario is implemented in the `loggedIn` method, which calls the `Login` method from the `LoginObjects` class.
* The `Login` method executes the required steps to interact with the app elements and perform the login process successfully.

```java
package TestCases;

import org.testng.annotations.Test;
import MobileConfig.DriverSetup;
import Utilities.LoginObjects;

public class login extends DriverSetup {
	LoginObjects logg = new LoginObjects();
	
	@Test(description = "Scenario 1: Verify login operation successfully\r\n"
			+ "\r\n"
			+ "Given: Bob is on the home page after opening the mobile app\r\n"
			+ "When: Bob opens the menu and selects the login option\r\n"
			+ "And: Bob enters username 'bob@example.com' and password '10203040'\r\n"
			+ "Then: Bob clicks the login button and successfully logs in")
	public void loggedIn() throws InterruptedException {
		logg.Login();
	}
}
```



### Targeted Scenario:  Product Sorting Procedure

PackageName: Utilities
ClassName: SortingConfiguration
Overview of this class:

* The `SortingConfiguration` class contains the locators and methods needed to perform product sorting in the mobile application.
* This class extends the `Methods` class, inheriting common interaction utilities for mobile elements.
* The sorting procedure includes opening the sort menu, selecting **Name (Descending)** order, then selecting **Price (Ascending)** order to verify sorting functionalities.

Here, I build a class that has the XPaths required to produce scenarios.
"Those elements’ XPaths are inherited or captured from Appium Inspector."  


```java
package Utilities;

import org.openqa.selenium.By;

public class SortingConfiguration extends Methods {
	public By Sortingoption_c = By.xpath("//android.view.ViewGroup[@content-desc=\"sort button\"]");
	public By SortByNameDescendingOrder_c = By.xpath("//android.view.ViewGroup[@content-desc=\"nameDesc\"]");
	public By SortByPriceAscendingOrder_c = By.xpath("//android.view.ViewGroup[@content-desc=\"priceAsc\"]");
	
	public void Sorting() throws InterruptedException {
		Thread.sleep(2000);
		clickElement(Sortingoption_c);
		Thread.sleep(2000);
		clickElement(SortByNameDescendingOrder_c);
		Thread.sleep(2000);
		clickElement(Sortingoption_c);
		Thread.sleep(2000);
		clickElement(SortByPriceAscendingOrder_c);
		Thread.sleep(2000);
	}
}
```



### Test Run of Product Sorting Procedure

PackageName: TestCases
ClassName: SortingOperation
Overview of this TestCase class:

* The test scenario is implemented in the `sort` method, which calls the `Sorting` method from the `SortingConfiguration` class.
* The `Sorting` method performs the steps to sort products first by **Name (Descending)** and then by **Price (Ascending)** in the catalog dashboard.

```java
package TestCases;

import org.testng.annotations.Test;
import MobileConfig.DriverSetup;
import Utilities.SortingConfiguration;

public class SortingOperation extends DriverSetup {
	
	login lg = new login(); // parallel run placeholder
	AddToCart ac = new AddToCart(); // parallel run placeholder
	CartOperation CO = new CartOperation(); // parallel run placeholder
	CheckOut cout = new CheckOut(); // parallel run placeholder
	LogOut LoggedOut = new LogOut(); // parallel run placeholder
	SortingConfiguration sort = new SortingConfiguration();
	
	@Test(description = "Scenario 2: Verify Catalog Dashboard appears\r\n"
			+ "Scenario 3: Verify 'Sort By Name' functionality\r\n"
			+ "Scenario 4: Verify 'Sort By Price' functionality")
	public void sort() throws InterruptedException {
		//lg.loggedIn();
		sort.Sorting();
		//ac.AddProductToCart();
		//CO.CartOperate();
		//cout.checkedOut();
		//LoggedOut.loggedOut();
	}
}
```

### Targeted Scenario:  Add Multiple Products to Cart Procedure

PackageName: Utilities
ClassName: AddToCartObjects
Overview of this class:

* The `AddToCartObjects` class contains the locators and methods needed to automate adding multiple products to the shopping cart in the mobile application.
* This class extends the `Methods` class, inheriting reusable functions for element interaction, waiting, scrolling, and screenshot capture.
* The procedure covers selecting products from the catalog dashboard, adjusting their quantities, and adding them to the cart one by one.

Here, I build a class that has the XPaths required to produce scenarios.
"Those elements’ XPaths are inherited or captured from Appium Inspector."

```java
package Utilities;

import org.openqa.selenium.By;

public class AddToCartObjects extends Methods {
	
	// Second product elements
	public By secondProduct_c = By.xpath("(//android.view.ViewGroup[@content-desc=\"store item\"])[2]");
	public By secondProductDashbord_w = By.xpath("//android.view.ViewGroup[@content-desc=\"Add To Cart button\"]");
	public By QuantityaddButton_c = By.xpath("//android.view.ViewGroup[@content-desc=\"counter plus button\"]");
	public By AddToCart_c = By.xpath("//android.view.ViewGroup[@content-desc=\"Add To Cart button\"]");
	
	public By Menubar_c = By.xpath("//android.view.ViewGroup[@content-desc=\"open menu\"]");
	public By catalogDashbord_c = By.xpath("//android.view.ViewGroup[@content-desc=\"menu item catalog\"]");

	// Third product elements
	public By ThirdProduct_c = By.xpath("(//android.view.ViewGroup[@content-desc=\"store item\"])[3]");
	public By ThirdProductDashbord_w = By.xpath("//android.view.ViewGroup[@content-desc=\"Add To Cart button\"]");

	// Fifth product elements
	public By FifthProduct_c = By.xpath("(//android.view.ViewGroup[@content-desc=\"store item\"])[3]");
	public By FifthProductDashbord_w = By.xpath("//android.view.ViewGroup[@content-desc=\"Add To Cart button\"]");
	
	public void addTocart(int productquantity_p1, int productquantity_p2) throws InterruptedException {
		takeScreenshot("Product Catalog");
		
		// Second product
		clickElement(secondProduct_c);
		WaitElementVisible(secondProductDashbord_w);
		for (int i = 1; i < productquantity_p1; i++) {
			clickElement(QuantityaddButton_c);
		}
		takeScreenshot("Quantity added for 2nd product");
		clickElement(AddToCart_c);
		Thread.sleep(2000);
		clickElement(Menubar_c);
		Thread.sleep(2000);
		clickElement(catalogDashbord_c);
		
		// Third product
		clickElement(ThirdProduct_c);
		WaitElementVisible(ThirdProductDashbord_w);
		for (int i = 1; i < productquantity_p2; i++) {
			clickElement(QuantityaddButton_c);
		}
		takeScreenshot("Quantity added for 3rd product");
		clickElement(AddToCart_c);
		Thread.sleep(2000);
		clickElement(Menubar_c);
		Thread.sleep(2000);
		clickElement(catalogDashbord_c);
		
		// Fifth product
		Thread.sleep(2000);
		Scrolling(389, 1789, 774, 285);
		clickElement(FifthProduct_c);
		WaitElementVisible(FifthProductDashbord_w);
		takeScreenshot("Quantity added for 5th product");
		clickElement(AddToCart_c);
		Thread.sleep(2000);
		clickElement(Menubar_c);
		Thread.sleep(2000);
		clickElement(catalogDashbord_c);
		Thread.sleep(2000);
	}
}
```

### Test Run of Add Multiple Products to Cart Procedure

PackageName: TestCases
ClassName: AddToCart
Overview of this TestCase class:

* The test scenario is implemented in the `AddProductToCart` method, which calls the `addTocart` method from the `AddToCartObjects` class.
* The `addTocart` method automates adding the 2nd, 3rd, and 5th products to the cart, with configurable quantities for the 2nd and 3rd products.

```java
package TestCases;

import org.testng.annotations.Test;
import MobileConfig.DriverSetup;
import Utilities.AddToCartObjects;

public class AddToCart extends DriverSetup {
	AddToCartObjects addcart = new AddToCartObjects();
	
	@Test(description = "Scenario 5 to 7: Verify products are correctly added to the cart queue")
	public void AddProductToCart() throws InterruptedException {
		// first parameter = quantity for 2nd product, second parameter = quantity for 3rd product
		addcart.addTocart(3, 2);
	}
}
```



### Scenario Replication Classes

### Targeted Scenario:  Cart Page Operations Procedure

PackageName: Utilities
ClassName: CartOperationElements
Overview of this class:

* The `CartOperationElements` class contains the locators and methods needed to perform operations on the cart page in the mobile application.
* This class extends the `Methods` class, inheriting common interaction functions for clicking, waiting, scrolling, and capturing screenshots.
* The procedure covers navigating to the cart, modifying product quantities, removing products, and proceeding to checkout.

Here, I build a class that has the XPaths required to produce scenarios.
"Those elements’ XPaths are inherited or captured from Appium Inspector."

```java
package Utilities;

import org.openqa.selenium.By;

public class CartOperationElements extends Methods {
	public By Carticon_c = By.xpath("//android.view.ViewGroup[@content-desc=\"cart badge\"]");
	public By CartlistPage_w = By.xpath("//android.view.ViewGroup[@content-desc=\"Proceed To Checkout button\"]");
	
	public By DecreseButton_1stpro_c = By.xpath("//android.view.ViewGroup[@content-desc=\"counter minus button\"]");
	public By incresButton_3rdpro_c = By.xpath("(//android.view.ViewGroup[@content-desc=\"counter plus button\"])[2]");
	public By RemoveIteam_2ndpro_c = By.xpath("(//android.view.ViewGroup[@content-desc=\"remove item\"])[1]");
	public By ProceedToCheckout_button = By.xpath("//android.view.ViewGroup[@content-desc=\"Proceed To Checkout button\"]");
	
	public void cartpageOperation() throws InterruptedException {
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
```

---

### Test Run of Cart Page Operations Procedure

PackageName: TestCases
ClassName: CartOperation
Overview of this TestCase class:

* The test scenario is implemented in the `CartOperate` method, which calls the `cartpageOperation` method from the `CartOperationElements` class.
* The `cartpageOperation` method performs cart modification steps such as decreasing the quantity of the 1st product, increasing the quantity of the 3rd product, removing the 2nd product, and proceeding to checkout.

```java
package TestCases;

import org.testng.annotations.Test;
import MobileConfig.DriverSetup;
import Utilities.CartOperationElements;

public class CartOperation extends DriverSetup {
	
	CartOperationElements co = new CartOperationElements();

	@Test(description = "Scenario 8: Go to Cart\r\n"
			+ "Scenario 9: Decrease 1st Product\r\n"
			+ "Scenario 10: Increase 3rd Product\r\n"
			+ "Scenario 11: Delete 2nd Product\r\n"
			+ "Scenario 12: Proceed to checkout")
	public void CartOperate() throws InterruptedException {
		co.cartpageOperation();
	}
}
```

### Targeted Scenario:  Checkout Process Procedure

PackageName: Utilities
ClassName: CheckOutOperation
Overview of this class:

* The `CheckOutOperation` class contains the locators and methods to automate the full checkout process in the mobile application.
* This class extends the `Methods` class, inheriting reusable interaction utilities for waiting, clicking, filling fields, scrolling, and taking screenshots.
* The procedure covers entering shipping information, proceeding to payment, filling payment details, reviewing the order, and placing it successfully.

Here, I build a class that has the XPaths required to produce scenarios.
"Those elements’ XPaths are inherited or captured from Appium Inspector."

```java
package Utilities;

import org.openqa.selenium.By;

public class CheckOutOperation extends Methods {
	public By checkoutdashbord_w = By.xpath("//android.view.ViewGroup[@content-desc=\"To Payment button\"]");
	public By Fullname_in = By.xpath("//android.widget.EditText[@content-desc=\"Full Name* input field\"]");
	public By Address_in = By.xpath("//android.widget.EditText[@content-desc=\"Address Line 1* input field\"]");
	public By city_in = By.xpath("//android.widget.EditText[@content-desc=\"City* input field\"]");
	public By ZipCode_in = By.xpath("//android.widget.EditText[@content-desc=\"Zip Code* input field\"]");
	public By Country_c = By.xpath("//android.widget.EditText[@content-desc=\"Country* input field\"]");
	
	public By ToProceedButton_c = By.xpath("//android.view.ViewGroup[@content-desc=\"To Payment button\"]");
	public By ReviewOrder_w = By.xpath("//android.view.ViewGroup[@content-desc=\"Review Order button\"]");
	public By CardUserName_in = By.xpath("//android.widget.EditText[@content-desc=\"Full Name* input field\"]");
	public By CardNumber_in = By.xpath("//android.widget.EditText[@content-desc=\"Card Number* input field\"]");
	public By ExparedDate_in = By.xpath("//android.widget.EditText[@content-desc=\"Expiration Date* input field\"]");
	public By SecurityCode_in = By.xpath("//android.widget.EditText[@content-desc=\"Security Code* input field\"]");
	public By ReviewOrderButton_c = By.xpath("//android.view.ViewGroup[@content-desc=\"Review Order button\"]");
	
	public By PlaceOrder_w_c = By.xpath("//android.view.ViewGroup[@content-desc=\"Place Order button\"]");
	public By CheckoutPage_w = By.xpath("//android.view.ViewGroup[@content-desc=\"Continue Shopping button\"]");
	
	public void checkout() throws InterruptedException {
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
		FieldValue(ExparedDate_in, "12/25");
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
```

---

### Test Run of Checkout Process Procedure

PackageName: TestCases
ClassName: CheckOut
Overview of this TestCase class:

* The test scenario is implemented in the `checkedOut` method, which calls the `checkout` method from the `CheckOutOperation` class.
* The `checkout` method executes the complete checkout workflow, including verifying checkout information, payment information, and placing the order successfully.

```java
package TestCases;

import org.testng.annotations.Test;
import MobileConfig.DriverSetup;
import Utilities.CheckOutOperation;

public class CheckOut extends DriverSetup {
	CheckOutOperation cop = new CheckOutOperation();
	
	@Test(description = "Scenario 13: Checkout process\r\n"
			+ "1. Verify checkout information is taken correctly\r\n"
			+ "2. Verify payment information is taken correctly\r\n"
			+ "3. Verify place order successfully")
	public void checkedOut() throws InterruptedException {
		cop.checkout();
	}
}
```

### Targeted Scenario:  Customer Logout Procedure

PackageName: Utilities
ClassName: logOutObjects
Overview of this class:

* The `logOutObjects` class contains the locators and methods to automate the logout process in the mobile application.
* This class extends the `Methods` class, inheriting reusable utilities for element interaction, waiting, and capturing screenshots.
* The logout procedure involves opening the menu, selecting the logout option, confirming the logout action, and verifying the success message.

Here, I build a class that has the XPaths required to produce scenarios.
"Those elements’ XPaths are inherited or captured from Appium Inspector."

```java
package Utilities;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class logOutObjects extends Methods {
	public By Menubar_c = By.xpath("//android.view.ViewGroup[@content-desc=\"open menu\"]");
	public By logout_c = By.xpath("//android.view.ViewGroup[@content-desc=\"menu item log out\"]");
	public By LogoutPop_accept = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]");
	
	@Test(description = "Scenario 14: Verify Logout")
	public void logout() throws InterruptedException {
		clickElement(Menubar_c);
		Thread.sleep(2000);
		takeScreenshot("logout");
		clickElement(logout_c);
		Thread.sleep(2000);
		clickElement(LogoutPop_accept);
		Thread.sleep(2000);
		takeScreenshot("logout Successful Message");
	}
}
```

---

### Test Run of Customer Logout Procedure

PackageName: TestCases
ClassName: LogOut
Overview of this TestCase class:

* The test scenario is implemented in the `loggedOut` method, which calls the `logout` method from the `logOutObjects` class.
* The `logout` method executes all steps required to log out of the application and confirm the action.

```java
package TestCases;

import org.testng.annotations.Test;
import MobileConfig.DriverSetup;
import Utilities.logOutObjects;

public class LogOut extends DriverSetup {
	logOutObjects lgot = new logOutObjects();
	
	@Test(description = "Scenario 14: Verify Logout")
	public void loggedOut() throws InterruptedException {
		lgot.logout();
	}
}
```
---
## Allure Report Creation

To create an allure report, first set dependency in the pom.xml file.  
```ruby
        <dependency>
				<groupId>io.qameta.allure</groupId>
				<artifactId>allure-testng</artifactId>
				<version>2.19.0</version>
		</dependency>
```
* Create some methods for allure report (like allure ScreenShot) which is added already
```ruby
public void takeScreenshot(String name) {
		Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES)));
	}
```
     
* then run the testing.xml file  
* then refresh the whole package and see a "allure-results" file created under Maven Dependencies  
-after runing the testng.xml file and refresh the whole package allure reasult appear 
![ConvertToTestNg](https://drive.google.com/uc?id=1OV8Po-2yAjKCQopmcccZcoY_Q3WwMsso)  
Terminal image:  
![Terminal](https://drive.google.com/uc?id=1b8WyHLH-inLgfFYmVaHdqzGc3wAA7ZH2)  


* To get allure report open the whole package terminal  
* then write in terminal to clean previous files>   
```ruby
allure generate ./allure-results --clean
```

* then write in terminal to create allure report>   
```ruby
allure open ./allure-report
```
* terminal gives us http to show us an allure report file directory


### Allure Report Overview Image
#### Scenario 1 Cases  



