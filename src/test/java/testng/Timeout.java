package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Timeout {
	@Test(timeOut =8000)
	public void tc1() {
		Reporter.log("lavanya",true);
	}

}
