package seleniumpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerificationPOM {

	ChromeDriver driver;  // defining the variable globally in POM class so that it can access it to every other class
	//creating variable
	@FindBy (id="text-248418663108") WebElement Fname;
    @FindBy (id="text-58969147196") WebElement Lname;
	
    
    public VerificationPOM(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
    
    
    
    
	public void typeframe(String name)//method
	{
		Fname.sendKeys(name);
	}
	
	public void typelname(String names)
	{
	Lname.sendKeys(names);
}
}