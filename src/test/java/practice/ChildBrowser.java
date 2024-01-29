package practice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		//click on continue with google
		driver.get("https://www.linkedin.com");
		driver.findElement(By.xpath("//div[@class='nsm7Bb-HzV7m-LgbsSe-bN97Pc-sM5MNb oXtfBe-l4eHX']")).click();
		//getwindowhandles
		Thread.sleep(3000);
		Set<String> ids=driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(ids);
		//get the window id
		String cwid=al.get(1);
		Thread.sleep(3000);
		//switch to child browser
		driver.switchTo().window(cwid);
		driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1] ")).sendKeys("gunnayollalavanya@gmail.com");
		
	}
}
