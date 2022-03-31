package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testngg {
	WebDriver driver;
	VerificationPOM abc;
	
	@BeforeMethod
	public void openbrowser()
	{
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.roicians.com/career/");
    }
	  
	  
	  
	 @Test
	 public void typefname_validdate() {
	//	 driver.findElement(By.id(null)). sendKeys("anmol");
		 abc.typeframe("name");
	 }

	 
	 @Test
	 public void typeinvalidfname()
	 {
		 driver.findElement(By.id("null")). sendKeys("Roi");
	 }
	 
	 @AfterMethod
	 public void Closebrowser() {
		 driver.close();
	 }
}
