package Assert_features;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_fail {
	@Test
	public void Tc5() {
		Reporter.log("running Tc1",true);
		Assert.fail();
		System.out.println("Test is failed intentionally");
	}
	@Test
	public void Tc2() {
		Reporter.log("running Tc2",true);
	}

}
