package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getElementsfromPageSection {

	static WebDriver driver;
	public static void main(String[] args) {

         driver =new ChromeDriver();
         driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
         By SectionList=By.xpath("//aside[@id='column-right']//a");
         List<String> rightElelist=  getElementsTextList(SectionList);
         System.out.println(rightElelist);
         System.out.println(rightElelist.contains("Login"));
         System.out.println(rightElelist.contains("Wish List"));
         System.out.println(rightElelist.contains("Newsletter"));
         
	}
	public static List<String> getElementsTextList(By locator) {
		List<String> eleTextList=new ArrayList<String>();
		List <WebElement> eleList=getElements(locator);	 
		for(WebElement e: eleList) {
			String text=e.getText();
			eleTextList.add(text);
		}
		return eleTextList;

		}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
		}

}
