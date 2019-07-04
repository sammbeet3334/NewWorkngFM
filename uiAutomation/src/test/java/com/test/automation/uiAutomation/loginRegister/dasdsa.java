package com.test.automation.uiAutomation.loginRegister;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dasdsa {
public static void main(String[] args) {
	//System.out.println(System.getProperty("user.dir"));
	System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http:google.com");
}
}
