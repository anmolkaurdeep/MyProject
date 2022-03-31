package seleniumpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumclass {

	public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

  WebDriver driver = new ChromeDriver();
  driver.get("https://www.amazon.com/");
	/*
	 * driver.navigate().to("https://www.roicians.com/"); driver.navigate().back();
	 * driver.navigate().forward(); driver.navigate().refresh(); driver.close();
	 */

	}

}
