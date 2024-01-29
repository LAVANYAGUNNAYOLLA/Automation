package Assert_features;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_assertrue {
	@Test
	public void Tc3() {
		Reporter.log("running Tc3,true");
		Assert.assertTrue(true);
	}

}
