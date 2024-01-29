package Assert_features;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_assertfalse {
	@Test
	public void Tc4() {
		Reporter.log("running Tc4",true);
		Assert.assertFalse(false);
		
	}

}
