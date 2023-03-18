package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementNotPresent {

	static WebDriver driver;

	public static void main(String[] args) {

   driver=new ChromeDriver();
  driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
  By logoImage= By.className("img-responsive");
  By serach=By.name("search");
  Boolean flagImage=  driver.findElement(logoImage).isDisplayed();
  System.out.println(flagImage);
  //FE - throw NoSuchElementException
  

	}

}
