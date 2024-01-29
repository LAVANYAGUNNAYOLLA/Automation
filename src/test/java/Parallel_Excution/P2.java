package Parallel_Excution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class P2 {
	@Test
	public void tc2() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
	}

}
