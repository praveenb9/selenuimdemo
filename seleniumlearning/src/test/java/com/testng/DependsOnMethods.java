package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods {

	 @Test
	  public void login() {
		  System.out.println("testCase1 : Login");
	  }
	  @Test(dependsOnMethods = "login")
	  public void search() {
		  Assert.assertEquals("abc", "a");
		  System.out.println("testCase2 : Search");
	  }
	  @Test(dependsOnMethods = "search",alwaysRun = true)
	  public void logout() {
		  System.out.println("testCase3 : Logout");
	  }
	
}
