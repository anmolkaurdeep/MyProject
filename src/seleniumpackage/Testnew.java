 package seleniumpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testnew {

	@BeforeSuite //setproperty
	public void before() {
		System.out.println("beofre testcase");
		}
	
	@BeforeTest//intial setup data Webdriver driver =new Webdriver();
	public void beforetest() {
		System.out.println("beforetest");
	}
	
	@BeforeClass() //login details
		public void beforeclass() {
			System.out.println("beforeclass");
		}
		
	@BeforeMethod //URL
	public void method() {
		System.out.println("Mehtod");
	}
	@Test
	public void writeTC()
	{
		System.out.println("Write test case");
		}
	
	@Test
	public void EcexuteTC() {
		System.out.println("Execute TC");
	}
	
	@Test
	public void defectTC() {
		System.out.println("Log defect");
		
	}
	@AfterMethod//close browser
	public void aftermethod() {
		System.out.println("after method");
	}
	@AfterClass //logout
	public void afterclass() {
		System.out.println("afterclass");
	}
	@AfterTest //once but after class condition
	public void aftetest() {
		System.out.println("aftertest");
     }
	@AfterSuite// atleast when all annotations are executed 
	public void aftersuite() {
		System.out.println("aftersuite");
	}
}
	
