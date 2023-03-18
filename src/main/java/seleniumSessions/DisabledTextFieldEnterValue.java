package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledTextFieldEnterValue {

	static WebDriver driver;
	public static void main(String[] args) {

         driver =new ChromeDriver();
         driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
         WebElement pass=  driver.findElement(By.id("pass"));//this is disabled
         pass.sendKeys("test@123");
         //org.openqa.selenium.ElementNotInteractableException: element not interactable
         
         
         //when u try to click disabled button then  u get this exception-ElementClickInterceptedEception
         

	}

}
