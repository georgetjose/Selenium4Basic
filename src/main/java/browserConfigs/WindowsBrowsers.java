package browserConfigs;

import org.openqa.selenium.WebDriver;

public class WindowsBrowsers implements BrowserActions
{
    public static WebDriver driver;
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
