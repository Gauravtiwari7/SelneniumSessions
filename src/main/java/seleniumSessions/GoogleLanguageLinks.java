package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLanguageLinks {

	static WebDriver driver;
	public static void main(String[] args) {

         driver =new ChromeDriver();
         driver.get("https://www.google.com/");
         List<WebElement> LangLinks=driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
        System.out.println( LangLinks.size());
        for(WebElement e:LangLinks) {
        	String langtext=e.getText();
        	System.out.println(langtext);
        	if(langtext.equals("हिन्दी")) {
        		e.click();
        		break;
        	}
        }
         

	}

}
