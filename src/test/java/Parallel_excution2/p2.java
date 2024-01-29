package Parallel_excution2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class p2 {
	@Test
	public void Tc2() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		
	}

}
