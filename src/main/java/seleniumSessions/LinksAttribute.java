package seleniumSessions;

import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksAttribute {

	static WebDriver driver;
	public static void main(String[] args) {

         driver =new ChromeDriver();
         driver.get("https://www.amazon.in/");
     By Links=    By.tagName("a");
     By images=    By.tagName("img");
//     List<WebElement> Linkslist=getElements(Links);
//     System.out.println("Total Links --->"+Linkslist.size());
//     for(WebElement e : Linkslist) {
//    	String hrefVal= e.getAttribute("href");
//    	String linkText=e.getText();
//    	System.out.println(hrefVal + "----->"+linkText);	
 //    }

//  List<WebElement> imagesList=getElements(images);
//  System.out.println("Total images" + imagesList.size());
//  for(WebElement e: imagesList) {
//	  String srcValue=e.getAttribute("src");
//	  System.out.println(srcValue);
//  }
     getEleAttribute(images, "src");
     getEleAttribute(Links, "href");

	}
	
	
	public static void getEleAttribute(By locator,String attrName) {
		List<WebElement>eleList=getElements(locator);
		for(WebElement e: eleList) {
			String Attvalue=e.getAttribute(attrName);
			System.out.println(Attvalue);
		}
	}

  public static List<WebElement> getElements(By locator) {
	  return driver.findElements(locator);
  }
}
