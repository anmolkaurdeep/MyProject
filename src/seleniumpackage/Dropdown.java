
	package seleniumpackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

			public static void main(String[] args) throws InterruptedException, IOException {
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

				  WebDriver driver = new ChromeDriver();
				  driver.get("https://demoqa.com/alerts");
				//Select obj = new Select(driver.findElement(By.id("searchDropdownBox")));
				//obj.selectByVisibleText("Baby");
				//obj.selectByValue("search-alias=baby-products-intl-ship");
				//obj.selectByIndex(3);
				//driver.findElement(By.id("alertButton")).click();
				//Alert al= driver.switchTo().alert();
				 // Thread.sleep(4000);
				 //al.accept();
				  File srcfile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				  FileUtils.copyFile (srcfile,new File ("D://screenshot.jpg"));
	}
}

