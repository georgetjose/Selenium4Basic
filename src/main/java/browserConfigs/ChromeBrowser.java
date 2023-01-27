package browserConfigs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser implements BrowserDriver
{
    public static ChromeDriver driver;

    @Override
    public WebDriver launchBrowser() {
        driver = new ChromeDriver();
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
