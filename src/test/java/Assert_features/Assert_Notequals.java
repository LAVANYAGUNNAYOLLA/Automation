package Assert_features;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_Notequals {
	@Test
	public void Tc2() {
		Reporter.log("running Tc2",true);
		String actR="Hi";
		String expR="Hlo";
		Assert.assertNotEquals(actR,expR);
		
		
		
	}

}
