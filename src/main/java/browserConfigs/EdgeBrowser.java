package browserConfigs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser implements BrowserDriver
{
    public static EdgeDriver driver;

    @Override
    public WebDriver launchBrowser() {
        driver = new EdgeDriver();
        return driver;
    }

    @Override
    public void launchUrl(String url)
    {
        driver.get(url);
    }

    @Override
    public void maximize()
    {
        driver.manage().window().maximize();
    }

    @Override
    public void closeBrowser()
    {
        driver.close();
    }
}
