package com.test.automation.uiAutomation.loginRegister;

import org.testng.annotations.Test;

import com.test.automation.uiAutomation.testBase.TestBase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class SC_Login_TC001 extends TestBase {
  @Test
  public void firstTest() {
	  System.out.println("first test");
	  for(int a=0;a<10;a++) {
		  System.out.println(a);
	  }
	  
	  for(int b=0;b<10;b++) {
		  System.out.println(b);
	  }
	  
  }
  @Test
  public void secondTest() {
	  System.out.println("second test");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() throws IOException {
	  init();
	  //browser issue fixed
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

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
