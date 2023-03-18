package seleniumSessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownAllElements {

	static WebDriver driver;
	public static void main(String[] args) {

         driver =new ChromeDriver();
         driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
//         Select select =new Select (driver.findElement(SelectCountryDrpDwn));
//      List<WebElement> country_list=  select.getOptions();
//      System.out.println(country_list.size()-1);
//      for(WebElement e: country_list) {
//    	 String text= e.getText();
//    	 System.out.println(text);
//    	 if(text.equals("Brazil")) {
//    		 e.click();
//    		 break;
//    	 }
//      }
         By SelectCountryDrpDwn=  By.id("Form_getForm_Country");

//        if(getTotalDropDownOptions(SelectCountryDrpDwn)-1 == 232) {
//        	System.out.println("Country dropdown count is correct");
//        }
//        if(getDropDownOptionsTextList(SelectCountryDrpDwn).contains("India")) {
//        	System.out.println("India is present");
//        	
//        }
//       List<String> expCountryList= Arrays.asList("India","Brazil","Belgium");
//        if(getDropDownOptionsTextList(SelectCountryDrpDwn).containsAll(expCountryList)) {
//        	System.out.println("Pass");
//        	
//        }
         selectDropDownValue(SelectCountryDrpDwn, "North Korea");

    
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static List<WebElement> getDropDownOptionsList(By locator) {
		Select select =new Select(getElement(locator));
		return select.getOptions();
	}
	public static List<String> getDropDownOptionsTextList(By locator) {
		List<WebElement>optionsList=getDropDownOptionsList(locator);
		List<String> optionsTextList=new ArrayList<String>();
		for(WebElement e: optionsList) {
			String text=e.getText();
			optionsTextList.add(text);
			
		}
		return optionsTextList;
		
	}
	public static int getTotalDropDownOptions(By locator) {
		
		int optionsCount= getDropDownOptionsList(locator).size();
		System.out.println("total options --->"+optionsCount);
		return optionsCount;
		
	}
	public static void selectDropDownValue(By locator,String expValue) {
		List<WebElement>optionsList=getDropDownOptionsList(locator);
		for(WebElement e: optionsList) {
			String text=e.getText();
			System.out.println(text);
			if(text.equals(expValue)) {
				e.click();
				break;
			}
		}
	}

}
