package testngSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpencartTest extends BaseTest {

	@Test(priority = 1)
	public void TitleTest() {
		String title=driver.getTitle();
		Assert.assertEquals(title, "Your Store");
		
	}
	@Test(priority = 2)
	public void SearchExistTest() {
		Boolean flag=driver.findElement(By.name("search")).isDisplayed();
		Assert.assertTrue(flag);
		
	}

  

}
