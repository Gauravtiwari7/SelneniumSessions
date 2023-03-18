package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {
	private WebDriver driver;
	public ElementUtil(WebDriver driver) {
		this.driver=driver;
	}
	
	public  WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
	public  void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
	public  void doClick(By locator) {
		driver.findElement(locator).click();
	}
	public  boolean doElementisDispalyed (By locator) {
		return getElement(locator).isDisplayed();
	}

	public List<WebElement> getElements(By locator) {
	return driver.findElements(locator);
	}
	public String getElementAttribute(By locator,String attrName) {
		return getElement(locator).getAttribute(attrName);
	}
	public void getElementAttributes(By locator,String attrName) {
		List<WebElement> eleList=getElements(locator);
		for(WebElement e:eleList) {
			e.getAttribute(attrName);
			System.out.println(attrName);
		}
	}
	public int getTotalElementsCount(By locator) {
	int eleCount=getElements(locator).size();
	System.out.println("totsal elements for :"+ locator +"--->"+eleCount);
	return eleCount;
	
	}
	public  List<String> getElementsTextList(By locator) {
		List<String> eleTextList=new ArrayList<String>();
		List <WebElement> eleList=getElements(locator);	 
		for(WebElement e: eleList) {
			String text=e.getText();
			eleTextList.add(text);
		}
		return eleTextList;

		}
	//***********************Select based dropdown utils*******************************//
	public  void doSelectDropdownByIndex(By locator,int index) {
	Select select=new Select(getElement(locator));
	select.selectByIndex(index);
	}
	public  void doSelectDropdownByValue(By locator,String value) {
		Select select=new Select(getElement(locator));
		select.selectByValue(value);
		}
	public  void doSelectDropdownByVisibleText(By locator,String text) {
		Select select=new Select(getElement(locator));
		select.selectByVisibleText(text);
		}
	public  List<WebElement> getDropDownOptionsList(By locator) {
		Select select =new Select(getElement(locator));
		return select.getOptions();
	}
	public  List<String> getDropDownOptionsTextList(By locator) {
		List<WebElement>optionsList=getDropDownOptionsList(locator);
		List<String> optionsTextList=new ArrayList<String>();
		for(WebElement e: optionsList) {
			String text=e.getText();
			optionsTextList.add(text);
			
		}
		return optionsTextList;
		
	}
	public  int getTotalDropDownOptions(By locator) {
		
		int optionsCount= getDropDownOptionsList(locator).size();
		System.out.println("total options --->"+optionsCount);
		return optionsCount;
		
	}
	public  void selectDropDownValue(By locator,String expValue) {
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
	public  void  selectDropDownwithoutSelect(By locator,String option) {
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
	public  void doSearch(By suggListLocator,String suggName) {
		 List<WebElement> suggeList=getElements(suggListLocator);
	        for(WebElement e:suggeList) {
	        	String text=e.getText();
	        	if(text.length()>0) {
		        	System.out.println(text);
	        	}
	        	if(text.contains(suggName)) {
	        		e.click();
	        		break;
	        	}
	        	
	        }
	}

}
