package browserConfigs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser implements BrowserDriver
{
    public static FirefoxDriver driver;

    @Override
    public WebDriver launchBrowser() {
        return new FirefoxDriver();
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
