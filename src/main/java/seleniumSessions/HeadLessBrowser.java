package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessBrowser {

	public static void main(String[] args) {
	
		//Browser is not visible 
		//headless-testing is happening behind the scene 
		//fast
		ChromeOptions co=new ChromeOptions();
		//co.setHeadless(true);
		//co.addArguments("--headless");
		co.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://naveenautomationlabs.com/opencart/");
         System.out.println(driver.getTitle());
         System.out.println(driver.getCurrentUrl());
         driver.quit();

	}

}
