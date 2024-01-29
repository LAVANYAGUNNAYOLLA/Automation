package Parallel_excution3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class p2 {
	@Test
	public void tc2() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}

}
