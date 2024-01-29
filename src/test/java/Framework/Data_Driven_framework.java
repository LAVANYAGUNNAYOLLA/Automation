package Framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Data_Driven_framework {
	public static void main(String[] args) throws IOException  {
		FileInputStream fisp=new FileInputStream("C:\\Users\\Lavan\\Desktop\\Data.properties.txt");
		Properties p=new Properties();
		p.load(fisp);
		String username=p.getProperty("un");
		System.out.println(username);
		String browser=p.getProperty("browser");
		System.out.println(browser);
		String URL=p.getProperty("url");
		WebDriver driver=new EdgeDriver();
		driver.get(URL);
		
		
		
	}

}
