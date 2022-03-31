package seleniumpackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testproject {
	 WebDriver driver;
	 WebElement write;
	  @BeforeSuite
 public void driversetup()
{
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
 }
 @BeforeMethod
 public void setmethod()
 {
	 driver=new ChromeDriver();
	 driver.get("https://www.google.com/");
	driver.navigate().to("https://www.amazon.com/");
 }
 
	
	/*
	 * @Test public void screenshot() throws IOException { File srcfile =
	 * ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 * FileUtils.copyFile(srcfile,new
	 * File("C:\\Users\\Anmoldeepk\\Desktop\\anmol.png")); }
	 */
 
 @Test(priority=1)
 public void amazontitle() {
	 boolean a= driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
	 System.out.println(a);
 }
 
	
	  @Test (priority=2)
	  public void hover() { 
	 Actions action = new Actions(driver);
	 action.moveToElement(driver.findElement(By.id( "nav-link-accountList-nav-line-1"))).build().perform();
	  driver.findElement(By.cssSelector("#nav-flyout-ya-newCust > a")).click();
	  }
	  
		
	   @Test (priority=3)
	   public void inputvalues() {
	    write= driver.findElement(By.id("ap_customer_name"));
	    write.sendKeys("anmol");
	    		  
	   	write = driver.findElement(By.id("ap_email"));
	    write.sendKeys("anmol@gmail.com");
	    			
	    write =driver.findElement(By.id("ap_password"));
	    write.sendKeys("Anmol12345");
	    			
	     write = driver.findElement(By.id("ap_password_check"));
	     write.sendKeys("Anmol12345");
	  }
	
	 
 @AfterMethod
 public void close() {
 driver.close();
}
}

