package seleniumpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Waitevent {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.amazon.com/");
		  
		 driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		 WebDriverWait wait= new WebDriverWait(driver, 100);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")));

		 
		 Thread.sleep(5000);
	}

}
