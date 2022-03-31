package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.amazon.com/");
		  
		  Actions action = new Actions(driver);
		  action.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList"))).build().perform();
		  driver.findElement(By.cssSelector("#nav_prefetch_yourorders > span")).click();

	}

}
