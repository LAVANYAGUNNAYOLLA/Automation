package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_popup {
	public static void main(String[] args) {
		//create object of chromeoptions class
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(c);
		driver.get("https://www.hdfc.com");                                                                                                                                                                                                                                                                                                                                                
		
		
	}

}
