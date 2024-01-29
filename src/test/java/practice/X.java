package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class X {
	public static void main(String[] args) { 
	System.setProperty("webdriver.edge.driver","C:\\Users\\Lavan\\Downloads\\edgedriver_win64/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com");
		
	}

}
