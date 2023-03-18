package testngSessions;

import org.testng.annotations.Test;

public class TestDependency {
	
	@Test
	public void searchtest() {
		System.out.println("SearchTest");
		//int i=9/0;
	}
	
	@Test(dependsOnMethods = "searchtest")
	public void addToCartTest() {
		System.out.println("AddtoCartTest");

	}
    @Test(dependsOnMethods = "addToCartTest")
    public void MakePayment() {
		System.out.println("MakePaymentTest");

    }
}
