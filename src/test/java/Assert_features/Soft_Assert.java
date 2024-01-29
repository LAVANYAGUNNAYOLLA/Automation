package Assert_features;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {
	@Test
	public void sample() {
		String str1="Hi";
		String str2="Hlo";
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(str1,str2);
		System.out.println("Hi,Iam after failing 1st verification");
		soft.assertAll();
	}
	@Test
	public void sample2() {
		Reporter.log("Hello",true);
	}

}
