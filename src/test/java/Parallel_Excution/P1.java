package Parallel_Excution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class P1 {
	@Test
	public void tc1() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	

}
