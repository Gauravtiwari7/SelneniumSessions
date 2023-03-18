package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver=new ChromeDriver();

    //Find all links on the page 
		//Print the total Links count 
		//print the text of each link 
		//and avoid the blank text
		driver.get("https://www.amazon.in/");
		List<WebElement>Totallinks=driver.findElements(By.tagName("a"));
		int TotallinkCount=Totallinks.size();
		System.out.println("total links"+ ":"+TotallinkCount);
		//print the text of each link
		ArrayList<String> singleAddress = new ArrayList<String>();
		for (int i=0;i<Totallinks.size();i++) {
			String Linktext=Totallinks.get(i).getText();
			if(Linktext.length()>0) {
			System.out.println(i+":"+Linktext);
			singleAddress.add(Linktext);
         }
		
			
		}
		 int actsize=	singleAddress.size();
		 //System.out.println(actsize);
		 int blanklinkcount=TotallinkCount -actsize;
		 System.out.println("Total Blank Link count is "+":"+blanklinkcount);
//		int count=0;
//		for(WebElement e:Totallinks) {
//			String text=e.getText();
//			if(text.length()>0) {
//				System.out.println(count +":"+text);
//			}
//			count++;
//		}
		

	}

}
