package testngSessions;

import org.testng.annotations.Test;

public class CRUDOperationTest {
	
	public void createUser() {
		System.out.println("Create the user");
	}
	public void getUser() {
		System.out.println("get the user");
	}
	public void updateUser() {
		System.out.println("update the user");
	}
	public void DeleteUser() {
		System.out.println("delete the user");
	}
	
	@Test
	public void createUserTest() {
		createUser();
	}
	@Test
	public void getuserTest() {
		createUser();//post
		getUser();//get
	}
	@Test
	public void updateUserTest() {
		createUser();
		getUser();
		updateUser();
		getUser();
	}
	@Test
	public void deleteUserTest() {
		createUser();
		getUser();
		DeleteUser();
		getUser();
	}
	

}
