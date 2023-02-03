package browserConfigs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser extends WindowsBrowsers implements BrowserDriver
{
    //public static EdgeDriver driver;

    @Override
    public WebDriver launchBrowser() {
        driver = new EdgeDriver();
        return driver;
    }
}
