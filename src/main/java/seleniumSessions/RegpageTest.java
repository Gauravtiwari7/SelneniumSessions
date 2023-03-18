package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegpageTest {

	public static void main(String[] args) {
			String browerName="firefox";
			BrowserUtil bUtil=new BrowserUtil();
		WebDriver driver=	bUtil.initDriver(browerName);
           bUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
          String title= bUtil.getTitle();
          System.out.println(title);
         //by locator: OR
          By FName= By.id("input-firstname");
          By LName= By.id("input-lastname");
          By Email= By.id("input-email");
          By Tphone= By.id("input-telephone");
          By Pass= By.id("input-password");
          By Cpass= By.id("input-confirm");
          ElementUtil eUtil=new ElementUtil(driver);
          eUtil.doSendKeys(FName, "gaurav");
          eUtil.doSendKeys(LName, "tiwari");
          eUtil.doSendKeys(Email, "gaurav@gmaail.com");
          eUtil.doSendKeys(Tphone, "45255255");
          eUtil.doSendKeys(Pass, "gaurav@123");
          eUtil.doSendKeys(Cpass, "gaurav@123");
          
          
	}

}
