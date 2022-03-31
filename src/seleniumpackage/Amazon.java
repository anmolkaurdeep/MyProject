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
import org.openqa.selenium.support.ui.Select;

public class Amazon {
	 //static boolean a = true;
	public static void main(String[] args) throws IOException// throws IOException
	{
		WebElement write;
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		 driver.get("https://www.amazon.com/");
		
		
		
		  File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(srcfile,new File("D:\\Desktop\\anmol.png"));
		 
		
		boolean a = driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
		 System.out.println(a);
		 
		 Actions action = new Actions(driver);
		  action.moveToElement(driver.findElement(By.id( "nav-link-accountList-nav-line-1"))).build().perform();
		  driver.findElement(By.cssSelector("#nav-flyout-ya-newCust > a")).click();
		  
		  write= driver.findElement(By.name("customerName"));
		  write.sendKeys("anmol");
			write = driver.findElement(By.id("ap_email"));
			write.sendKeys("anmol@gmail.com");
			write =driver.findElement(By.id("ap_password"));
			write.sendKeys("Anmol12345");
			 write = driver.findElement(By.id("ap_password_check"));
			 write.sendKeys("Anmol12345");
		
			 driver.findElement(By.id("continue")).click(); 
			 }
}
			 

		
	

