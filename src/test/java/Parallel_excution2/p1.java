package Parallel_excution2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class p1 {
	@Test
	public void Tc1() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.meesho.com");
		
	}

}
