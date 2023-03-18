package testngSessions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {
WebDriver driver;
	
@Parameters({"url","browsername"})	
@BeforeTest
   public void Setup(String url,String browserName) {
	System.out.println("Running test on "+browserName);
	
	if(browserName.equalsIgnoreCase("chrome")) {
		driver=new ChromeDriver() ;
	}
	else if(browserName.equalsIgnoreCase("firefox")) {
	driver=new FirefoxDriver();
	}
	else {
		System.out.println("Please Pass the Right Browser"+browserName);
	}
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	@AfterTest
	  public void tearDown() {
		  driver.quit();
	  }

}
