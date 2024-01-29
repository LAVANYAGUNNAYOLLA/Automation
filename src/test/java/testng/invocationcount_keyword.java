package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocationcount_keyword {
	@Test(invocationCount =10)
	public void tc1() {
		Reporter.log("Hi....gm",true);

}
}