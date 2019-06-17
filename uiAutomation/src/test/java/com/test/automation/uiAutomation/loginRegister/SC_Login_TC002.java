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

public class SC_Login_TC002 extends TestBase {
	@Test
	public void firstTest() {
		System.out.println("first test");
		for (int a = 0; a < 10; a++) {
			System.out.println(a);
		}

		for (int k = 0; k < 10; k++) {
			System.out.println(k);

			for (int b = 0; b < 10; b++) {
				System.out.println(b);
			}

			// test comment 2

		}

	}
	@Test
	public void newTestclass() {
		//New test class1
	}
	
	@Test
	public void newTestclass3() {
		//New test class3
		//added script for Rel1 second commit
	}
	
	@Test
	public void testSambeet()
	{
		//new tst added by sambeet 
		for (int i = 0; i < 10; i++) {
			System.out.println("sambeet");
			System.out.println(i);
			
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
		// browser issue fixed
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
