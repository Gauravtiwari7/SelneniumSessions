package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsInSelenium {
      static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//1.id
		//2.Name
//		driver.findElement(By.name("email")).sendKeys("test@gmaail.com");
//	    By Email=	By.name("email");
		//3.class name can be duplicated most of the time -not recommbeded if its duplicate 
		//driver.findElement(By.className("form-control")).sendKeys("test");
		//4 .xpath -its not an attribute -its the address of the element in Html DOM
//		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("test@gmail.com");
//		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("test@123");
	
//		
//		By emailId= By.xpath("//input[@id='input-email']");
//		By password=By.xpath("//input[@id='input-password']");
//		By login=By.xpath("//input[@type='submit']");
//		doSendkeys(emailId, "naveen@gmail.com");
//		doSendkeys(password, "naveen@123");
//		doClick(login);
       // 5. css selector-not an attribute
		//driver.findElement(By.cssSelector("#input-email")).sendKeys("test@gmaiil.com");
		//6.link text 
		//driver.findElement(By.linkText("Register")).click();
		//7-partial link text
		//driver.findElement(By.partialLinkText("Wish")).click();
		//tag 
	String text=	driver.findElement(By.tagName("h2")).getText();
	System.out.println(text);
	}
	public static WebElement getElement (By locator) {
		return driver.findElement(locator);
	}
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	public static void doSendkeys(By locator,String value) {
		driver.findElement(locator).sendKeys(value);
	}

}
