package browserConfigs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser extends WindowsBrowsers implements BrowserDriver
{
    //public static ChromeDriver driver;

    @Override
    public WebDriver launchBrowser() {
        driver = new ChromeDriver();
        return driver;
    }

}
