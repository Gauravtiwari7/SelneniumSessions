package seleniumSessions;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// Open Browser
		
		
		ChromeDriver driver=new ChromeDriver();
		
		//2.enter url
		driver.get("https://www.google.com");

	}

}
