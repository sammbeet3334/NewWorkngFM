package com.test.automation.uiAutomation.uiActions;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.automation.uiAutomation.testBase.TestBase;
/**
 * 
 * @author Bhanu Pratap
 *
 */
public class AddToCartPage  extends TestBase{

	public final static Logger log = Logger.getLogger(AddToCartPage.class.getName());
	WebDriver driver;

	@FindBy(xpath = "//*[@id='ProductSection']/div[1]/div[2]/div/div[2]/a[1]")
	WebElement facebookLink;

	@FindBy(xpath = "//*[@id='ProductSection']/div[1]/div[2]/div/div[2]/a[2]/svg")
	WebElement tweet;

	@FindBy(xpath = "//*[@id='ProductSection']/div[1]/div[2]/div/div[2]/a[3]")
	WebElement pinit;

	@FindBy(css = "AddToCart")
	WebElement addToCart;
	
	@FindBy(xpath="//*[contains(text(),'Log in to your Facebook account to share.')]")
	WebElement faceBookMessage;

	public AddToCartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[contains(@class,'x-grid-tree-node-leaf')]")    
	List<WebElement> allElements;
	
	/*
	 * @FindAll({
	 * 
	 * @FindBy(id = "one"),
	 * 
	 * @FindBy(id = "two") }) public List<WebElement> allElementsInList;
	 * 
	 * @FindBys({
	 * 
	 * @FindBy(id = "one"),
	 * 
	 * @FindBy(className = "two") }) public List<WebElement> allElementsInList2;
	 */

	public void clickOnfacebookLink() {
       facebookLink.click();
       log.info("clicked on facebook link and object is:-"+facebookLink.toString());
	}
	
	public boolean verifyFaceBookMessage(){
		try {
			faceBookMessage.isDisplayed();
			log.info("facebook page dispalyed and object is:-"+faceBookMessage.toString());
			return true;
		} catch (Exception e) {
            return false;
		}
	}

	public void tweet() {
		tweet.click();
		log.info("clicked on tweet link and object is:-"+tweet.toString());
		
		driver.switchTo().alert();
		driver.switchTo().window("");
		driver.switchTo().frame(1);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		new Select(tweet).selectByValue("");
		WebDriverWait wait= new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(tweet));
		
	
		//wait.until(ExpectedConditions);
		
		
		
	}
	
	

}
