package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroup {

	 @Test(groups = {"smoke_testing","sanity_testing"})
	  public void login() {
		  System.out.println("testCase1 : Login");
	  }
	  @Test(groups = {"functional_testing","smoke_testing"})
	  public void search() {
		  System.out.println("testCase2 : Search");
	  }
	  @Test(groups = {"re_testing","smoke_testing"})
	  public void logout() {
		  System.out.println("testCase3 : Logout");
	  }
}
