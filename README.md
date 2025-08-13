

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

---


