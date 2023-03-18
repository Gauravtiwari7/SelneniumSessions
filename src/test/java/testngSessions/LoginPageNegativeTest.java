package testngSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageNegativeTest {
	public WebDriver driver;
	public boolean doLogin(String userName,String password) {
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(userName);
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String errorMessage=driver.findElement(By.cssSelector(".alert.alert-danger.alert-dismissible")).getText();
		System.out.println(errorMessage);
		if(errorMessage.contains(" No match for E-Mail Address and/or Password")) {
			return true;
		}
		return false;
		
	}
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}
	@DataProvider
	public Object[][] getloginNegativeData() {
		return new Object[][] {
			
			{"tedt@gmail.com","test@123"},
			{"tezscdssddt@gmail.com","tesddsst@123"},
			{"tezsccdsfdsfdssddt@gmail.com","teasdfdst@123"},

		};
	}
	@Test(dataProvider ="getloginNegativeData")
	public void logintest(String userName,String Password) {
		 boolean flag=doLogin(userName, Password);
          Assert.assertTrue(flag);	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
