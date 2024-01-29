package testng;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class enabled {
	@Test(enabled=false)
	public void tc1() {
		Reporter.log("family",true);
	
		
	}


}
