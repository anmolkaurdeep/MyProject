package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verification {

	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.roicians.com/career/");
		  
		  
		  VerificationPOM abc =new VerificationPOM(driver);
		  abc.typeframe("Roicians");
		  abc.typelname("anmol");
	}

}
