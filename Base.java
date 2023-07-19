package OnlineMobileSearch;
//import java.io.FileInputStream;
import java.util.Properties;
//import java.util.concurrent.TimeUnit;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Base {
	public static WebDriver driver;
	public static Properties prop;
	
	public void driverSetup()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter browser chrome or Edge:");
		String browser=sc.next();
		
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		

		
	
		
		//To maximize the window size.
		driver.manage().window().maximize();
		
		

		
	}
	public void closeBrowser()
	{
		driver.quit();
	}

}
