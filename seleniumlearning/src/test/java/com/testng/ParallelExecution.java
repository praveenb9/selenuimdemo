package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParallelExecution {

	 @Test
	  public void testCase1() {
		  System.out.println("testCase1 : Login");
	  }
	  @Test
	  public void testCase2() {
		  System.out.println("testCase2 : Search");
	  }
	  @Test
	  public void testCase3() {
		  System.out.println("testCase3 : Logout");
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("beforeMethod : launch App");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("AfterMethod : Close App");

	  }

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("BeforeClass : Create TestData");

	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("AfterClass : Clear TestData");

	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("BeforeTest : Smoke Testing");

	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("AfterTest : Generate Reports");

	  }

	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("BeforeSuite : DB Connection");

	  }

	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("AfterSuite : Close DB Connection");

	  }
}
