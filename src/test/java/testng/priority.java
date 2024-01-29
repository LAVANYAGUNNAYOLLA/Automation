package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority{
	@Test(priority=3)
	public void tc1() {
		Reporter.log("a",true);
	}
	@Test(priority=2)
	public void tc3() {
		Reporter.log("c",true);
	}
	@Test(priority=1)
	public void tc2() {
		Reporter.log("b",true);
		
	}
	

}
