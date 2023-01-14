package TestBrowserLaunch;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {

	public static void main(String args[]) {
		
		  WebDriverManager.chromedriver().setup(); 
		  ChromeDriver driver = new ChromeDriver();
		  driver.get("https://platform.testleaf.com/");
		  driver.manage().window().maximize(); 
		  System.out.println("chrome launched successfully");
		  driver.close();
		  
		  
		  WebDriverManager.edgedriver().setup(); EdgeDriver edDriver = new
		  EdgeDriver(); edDriver.get("https://platform.testleaf.com/");
		  edDriver.manage().window().maximize();
		  System.out.println("Edge launched successfully");
		  edDriver.close();		  

		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver ffDriver = new FirefoxDriver();
		ffDriver.get("https://platform.testleaf.com/");
		ffDriver.manage().window().maximize();
		System.out.println("Firefox launched successfully");
		ffDriver.close();

	}

}
