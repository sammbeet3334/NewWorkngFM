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
	 @Test(groups = "pre-tests")
	  public void Deps001() {
		 System.out.println("Test deps 001 test 1");
		 assertEquals(true, false);
		 //
	  }
	 
	 @Test(groups = "pre-tests2")
	  public void Deps002() {
		 System.out.println("Test deps 001 test 2");
		 assertEquals(true, true);
		 
	  }
	 
	 @Test
	  public void Deps003() {
		 System.out.println("Test deps 001 test 3");
		 
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
