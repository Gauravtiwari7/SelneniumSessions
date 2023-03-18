package testngSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest {
	//Global pre Conditions 
	//pre conditions 
	//test cases->Test steps-->act vs expect result -Assertion 
	//Post Steps
	//Post global steps 
	
	//BS - start DBConnections
	//BT - Create User
	//BC - Launch Browser
	
	//BM - Login to App
	//Home Page Search test
	//AM - Logout
	
	//BM - Login to App
	//Home Page Title test
	//AM - Logout
	
	//BM - Login to App
	//Home Page URL test
	//AM - Logout
	
	//AC - Close Browser
	//AT - Delete User

	//1
	@BeforeSuite 
	public void startDBConnections() {
		System.out.println("BS - start DBConnections");
	}
	//2
	@BeforeTest 
	public void createUser() {
		System.out.println("BT - Create User");
	}
	//3
	@BeforeClass 
	public void launchBrowser() {
		System.out.println("BC - Launch Browser");
	}
	//4 runs before every  test 
	@BeforeMethod 
	public void logintoApp() {
		System.out.println("BM - Login to App");
	}
	
	@Test
	public void homepageTitleTest() {
		System.out.println("Home Page Title test");
	}
	@Test
	public void homepageURLTest() {
		System.out.println("Home Page URL test");
	}
	//5
	@Test
	public void homepageSearchTest() {
		System.out.println("Home Page Search test");
	}
	//6-runs after every test 
	@AfterMethod
	public void LogOut() {
		System.out.println("AM - Logout");
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC - Close Browser");
	}
	@AfterTest
	public void DeleteUser() {
		System.out.println("AT - Delete User");
	}
	@AfterSuite
	public void disconnectwithDB() {
		System.out.println("AS - Disconnect with database");
	}


}
