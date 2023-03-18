package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDwonWithoutSelect {

	static WebDriver driver;
	public static void main(String[] args) {

         driver =new ChromeDriver();
         driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
         By SelectCountryDrpDwn=  By.id("Form_getForm_Country");
         By option=By.xpath("//select[@id='Form_getForm_Country']/option");
    //   List<WebElement> optionsList=  driver.findElements(option);
//       System.out.println(optionsList.size());
//       for(WebElement e:optionsList) {
//    	  String text= e.getText();
//    	  System.out.println(text);
//    	  if(text.equals("India")) {
//    		  e.click();
//    		  break;
//    	  }
//       }
       selectDropDownwithoutSelect(option, "India");
       

	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	public static void  selectDropDownwithoutSelect(By locator,String option) {
		List<WebElement>dropdownList=getElements(locator);
		for(WebElement e:dropdownList) {
			String text=e.getText();
			System.out.println(text);
			if(text.equals(option)) {
				e.click();
				break;
			}
		}
		
	}

}
