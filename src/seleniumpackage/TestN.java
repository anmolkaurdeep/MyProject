package seleniumpackage;

import org.testng.annotations.Test;

public class TestN {
	
	@Test (priority=1)
    public void writetestcase() {
		System.out.println("First test case suppose to be written");
	}
	
	@Test (priority=2)
	public void executetestcase() {
		System.out.println("test execution");
		
	}
	
	@Test (priority=3)
	public void defectlog() {
		System.out.println("defect must log");
	}
}
