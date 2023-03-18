package testngSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {

	
	
	@Test(priority = 1)
	public void TitleTest() {
		//driver.get("https://naveenautomationlabs.com/opencart/");
		String title=driver.getTitle();
		Assert.assertEquals(title, "Google");
		
	}
	@Test
	public void SearchExistTest() {
		Boolean flag=driver.findElement(By.name("q")).isDisplayed();
		Assert.assertTrue(flag);
		
	}

 

}
