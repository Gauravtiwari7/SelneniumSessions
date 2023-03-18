package testngSessions;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest {
	
	
	
	@Test(priority = 1)
	public void TitleTest() {
		String title=driver.getTitle();
		Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		
	}
	@Test(priority = 2)
	public void SearchExistTest() {
		Boolean flag=driver.findElement(By.cssSelector("input#twotabsearchtextbox")).isDisplayed();
		Assert.assertTrue(flag);
		
	}

 
}
