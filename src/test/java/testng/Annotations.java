package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	@BeforeSuite
	public void as() {
		Reporter.log("before suit",true);
	}
	@BeforeTest
	public void as1() {
		Reporter.log("Before class",true);
	}
	@BeforeClass
	public void bs() {
		Reporter.log("before test",true);
	}
	@BeforeMethod
	public void bm() {
		Reporter.log("before method",true);
	}
	@Test
	public void verifyuserid() {
		Reporter.log("running verify",true);
	}
	@AfterSuite
	public void As() {
		Reporter.log("After suit",true);
	}
		@AfterMethod
		public void Av() {
			Reporter.log("After method",true);
		}
		@AfterClass
		public void Ac() {
			Reporter.log("After class",true);
		}
		@AfterTest
		public void At() {
			Reporter.log("After test",true);
		}
		@AfterSuite
		public void As1() {
			Reporter.log("After suit",true);
		}
			
			
			
			
		
		
		
		
		
	
		
		
	}
	


