package BatchExcution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample2 {
	
		@Test
		public void tc1() {
			Reporter.log("running Tc1,true");
		}
			@Test
			public void tc2() {
				Reporter.log("running Tc2,true");
			}
			@Test
			public void Tc3() {
				Reporter.log("running Tc3,true");
				
				
			}
}
