package Assert_features;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_equals {
	@Test
	public void test() {
		Reporter.log("running test method",true);
		String actResult="Hi";
		String expResult="Hi";
		Assert.assertEquals(actResult,expResult);
		
	}

}
