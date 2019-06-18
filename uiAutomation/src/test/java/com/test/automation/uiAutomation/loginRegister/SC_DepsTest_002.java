package com.test.automation.uiAutomation.loginRegister;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SC_DepsTest_002 {
  @Test(dependsOnGroups = {"pre-tests","pre-tests2"})
  public void Deps003() {
	  System.out.println("Test deps 002 test 1");
	  
  }
  @Test(groups = "smoke")
  public void Deps004() {
	  System.out.println("Test deps 002 test 2");
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
