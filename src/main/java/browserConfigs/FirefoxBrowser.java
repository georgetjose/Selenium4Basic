package browserConfigs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser extends WindowsBrowsers implements BrowserDriver
{
    //public static FirefoxDriver driver;

    @Override
    public WebDriver launchBrowser() {
        return new FirefoxDriver();
    }

}
