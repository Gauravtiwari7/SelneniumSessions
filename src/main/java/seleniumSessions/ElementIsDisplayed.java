package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDisplayed {
	static WebDriver driver;

	public static void main(String[] args) {

   driver=new ChromeDriver();
  driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//  Boolean flagimage= driver.findElement(By.className("img-responsive")).isDisplayed();
//  if(flagimage)System.out.println("Pass");
//  Boolean flagSearch= driver.findElement(By.name("search")).isDisplayed();
//  if(flagSearch)System.out.println("Pass");
//  
  By logoImage= By.className("img-responsive");
  By serach=By.name("search");
  By searchicon=By.xpath("//button[contains(@class,'btn-default')]");
  if(doElementisDispalyed(logoImage)) {
	  System.out.println("Image is present--PASS");
  }
	if(doElementisDispalyed(serach))	{
		System.out.println("search is present");
		doSendkeys(serach, "Macbook");
		doClick(searchicon);
	}

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static boolean doElementisDispalyed (By locator) {
		return getElement(locator).isDisplayed();
	}
	public static void doSendkeys(By locator, String value) {
        getElement(locator).sendKeys(value);		
	}
	public static void doClick(By locator) {
		getElement(locator).click();
	}

}
