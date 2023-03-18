package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		//Create a webelement + perforem action (click ,sendkeys,gettext,isDisplayed....)
		//create a webelement : need a locator
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//1.id
		//first type
//		driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("naveen@123");
		//2.
//		WebElement emailId=driver.findElement(By.id("input-email"));
//		WebElement password=driver.findElement(By.id("input-passwordl"));
//		emailId.sendKeys("naveen@gmail.com");
//		password.sendKeys("naveen@123");
		
		//3 : By locator
//		By emaiId=By.id("input-email");
//		By Password=By.id("input-password");
//	WebElement Eid=	driver.findElement(emaiId);
//	WebElement Pass=driver.findElement(Password);
//      Eid.sendKeys("naveen@gmail.com");
//      Pass.sendKeys("naveen@123");
		
		//4. By locator + generic method
		
//		By emaiId=By.id("input-email");
//		By Password=By.id("input-password");
//		getElement(emaiId).sendKeys("naveen@gmail.com");
//		getElement(Password).sendKeys("naveen@123");
		
		//5. By locator _ generic method for webelement and actions 
		
//		By emaiId=By.id("input-email");
//		By Password=By.id("input-password");
//		doSendKeys(emaiId, "naveen@gmail.com");
//		doSendKeys(Password, "naveen@123");
		
		//6.By locator+eneric method for webelement and actions in ElementUtil class
		By emaiId=By.id("input-email");
		By Password=By.id("input-password");
		ElementUtil eutil=new ElementUtil(driver);
		eutil.doSendKeys(emaiId, "naveen@gmail.com");
		eutil.doSendKeys(Password, "naveen@gmail.com");
		
		
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
	public static void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}

}
