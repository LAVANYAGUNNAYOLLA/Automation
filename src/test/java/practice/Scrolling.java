package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Scrolling {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.Flipkart.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		Thread.sleep(3000);
		//click on popup
		driver.findElement(By.xpath("//span[text()='Electronics']")).click();
		//typecasting
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		 jse.executeScript("window.scrollBy(2000,0);");
		 
		 
		 
		 
		
	}

}
