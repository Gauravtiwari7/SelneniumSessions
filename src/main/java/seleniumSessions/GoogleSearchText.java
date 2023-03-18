package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchText {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

         driver =new ChromeDriver();
         driver.get("https://www.google.com/");
         driver.findElement(By.name("q")).sendKeys("Naveen automation labs");
         Thread.sleep(3000);
     By googleSuggListLocator =By.xpath("//li[@role='presentation']//div[@class='wM6W7d']/span");
     doSearch(googleSuggListLocator, "naveen automation labs github");
	}
	public static void doSearch(By suggListLocator,String suggName) {
		 List<WebElement> suggeList=driver.findElements(suggListLocator);
	        for(WebElement e:suggeList) {
	        	String text=e.getText();
	        	System.out.println(text);
	        	if(text.contains(suggName)) {
	        		e.click();
	        		break;
	        	}
	        	
	        }
	}

}
