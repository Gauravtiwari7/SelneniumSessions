package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {
	private WebDriver driver;
	/**
	 * This method is usaed to intilize 
	 * @param browserName
	 * @return this returns the specific browser driver
	 */
	
	public WebDriver initDriver(String browserName) {
		System.out.println("Browser name is "+browserName);
		
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "firefox":
			driver=new FirefoxDriver();
			break;
		case "safari":
			driver=new SafariDriver();
			break;
		case "edge":
			driver=new EdgeDriver();
			break;

		default:
			System.out.println("Please pass the right browser"+ browserName);
			break;
		}
		return driver;
	}
    public void launchUrl(String url) {
    	if(url== null) {
    		System.out.println("url cannot be null");
    		
    	}
    	if(url.indexOf("https")==0) {
    		driver.get(url);
    		
    	}
    }
    public String getTitle() {
    	String title=driver.getTitle();
    	System.out.println("Page title is "+title);
    	return title;
    }
    public String getcurrentUrl() {
    	String getUrl=driver.getCurrentUrl();
    	System.out.println("current url is "+getUrl);
    	return getUrl;
    }
    public void closeBrowser() {
    	if(driver!=null) {
    		driver.close();
    	}
    }
    
}
