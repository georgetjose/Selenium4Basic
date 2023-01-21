package Jan2023.TArch;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions ch_Ops = new ChromeOptions();
        ch_Ops.addArguments("start-maximized");
        ChromeDriver driver_chrome = new ChromeDriver(ch_Ops);
        driver_chrome.get("https://www.google.com");
        driver_chrome.close();
        
        WebDriverManager.edgedriver().setup();
        EdgeOptions ed_Ops = new EdgeOptions();
        ed_Ops.addArguments("start-maximized");
        EdgeDriver driver_edge = new EdgeDriver(ed_Ops);
        driver_edge.get("https://www.google.com");
        driver_edge.close();
        
    }
}
