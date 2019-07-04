package com.test.automation.uiAutomation.loginRegister;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SC_DepsTest_001 {
	 @Test(groups = "smoke")
	  public void Deps001() {
		 System.out.println("Test deps 001 test 1");
		 assertEquals(true, true);
		 //
	  }
	 
	 @Test(groups = "regrssion")
	  public void Deps002() {
		 System.out.println("Test deps 001 test 2");
		 assertEquals(true, true);
		 
	  }
	 
	 @Test(groups= {"pre-tests","regression"},priority=1)
	  public void Deps003() {
		 System.out.println("Test deps 001 test 3");
		 
	  }
	 
	 @Test(groups= "sambeet")
	  public void Deps004() {
		 System.out.println("sambeet");
		 
	  }
	  @BeforeMethod
	  public void beforeMethod() {
	  }

	  @AfterMethod
	  public void afterMethod() {
	  }

	  @BeforeClass
	  public void beforeClass() {
	  }

	  @AfterClass
	  public void afterClass() {
	  }

	  @BeforeTest
	  public void beforeTest() {
	  }

	  @AfterTest
	  public void afterTest() {
	  }

}
