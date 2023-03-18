package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SwitchCaseWebdriverlogic {
	static WebDriver driver;
	public static void main(String[] args) {

      String browser="firefox";
      
		
		switch (browser) {
		case "chrome":
	    driver=new ChromeDriver();  		
			break;
		case "firefox":
		driver=new FirefoxDriver();
		break;
		case "internetexplorer":
			driver =new InternetExplorerDriver();
			break;
		
		default:
			break;
		}
		
		
		driver.get("https://www.flipkart.com/");
		String title=driver.getTitle();
		if(title.contains("Online")) {
			System.out.println("Title is "+title);
			System.out.println("Pass");
		}
		else {
			System.out.println("Title is "+title);
			System.out.println("Fail");
		}
		driver.quit();
	}

}
