package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTagDropDownHandle {

	static WebDriver driver;
	public static void main(String[] args) {

         driver =new ChromeDriver();
         driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
       //dropdown--html tag ---> <select> 
       //use select class in selenium 
//       WebElement country_ele=driver.findElement(SelectCountryDrpDwn);
//         Select select=new Select(country_ele);
//         //select.selectByIndex(1);
//        // select.selectByValue("American Samoa");
//         select.selectByVisibleText("Belarus");
         By SelectCountryDrpDwn=  By.id("Form_getForm_Country");
         doSelectDropdownByIndex(SelectCountryDrpDwn, 5);
         doSelectDropdownByValue(SelectCountryDrpDwn,"Australia");
         doSelectDropdownByVisibleText(SelectCountryDrpDwn,"Benin");
         
     	
         


	}
	
	public static WebElement GetElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doSelectDropdownByIndex(By locator,int index) {
	Select select=new Select(GetElement(locator));
	select.selectByIndex(index);
	}
	public static void doSelectDropdownByValue(By locator,String value) {
		Select select=new Select(GetElement(locator));
		select.selectByValue(value);
		}
	public static void doSelectDropdownByVisibleText(By locator,String text) {
		Select select=new Select(GetElement(locator));
		select.selectByVisibleText(text);
		}

}
