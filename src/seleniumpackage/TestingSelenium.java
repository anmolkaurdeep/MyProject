package seleniumpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestingSelenium {
 WebDriver driver;
 SoftAssert obj;
 boolean a = true;
	@BeforeSuite
	public void driversetup() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	}
	
	  @BeforeTest public void initalsetup() { 
		  driver =new ChromeDriver();
	  driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS); }
	 
	
	@BeforeMethod
	public void before() {
		driver =new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
	}
	 @Test //(priority=1, groups="title",dependsOnMethods= {"display"})
	 public void gettitle() {
		String Title = driver.getTitle();
		System.out.println("title");
		 // Assert.assertEquals(Title, "Yahoo");
		//obj.assertEquals(Title,"yahoo");
		//  driver.close(); obj.assertAll();
		 
	 }
	 
	 
	 @Test// (priority=2, groups="display")
	 public void display() {
		 driver.findElement(By.linkText("Gmail")).isDisplayed();
		 System.out.println(a);
	 }
		
		  @AfterMethod
		   public void aftermethod() { driver.close(); }
		 
}
