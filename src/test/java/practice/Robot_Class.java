package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Robot_Class {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.w3schools.com"); 
		//click on cancel btn
		driver.findElement(By.xpath("//a[text()='JAVASCRIPT']")).click();
		//robot class scrool down
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
	}

}
