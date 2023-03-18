package seleniumSessions;

import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationConcepts {

	public static void main(String[] args) throws MalformedURLException {
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.google.com/");
    System.out.println(driver.getTitle());
    driver.navigate().to("https://www.amazon.in/");
    System.out.println(driver.getTitle());
    driver.navigate().back();
    System.out.println(driver.getTitle());
    driver.navigate().forward();
    System.out.println(driver.getTitle());
    driver.navigate().back();
    System.out.println(driver.getTitle());
  //  driver.navigate().to(new URL("https://www.amazon.in/"));
    driver.navigate().refresh();
	}

}
