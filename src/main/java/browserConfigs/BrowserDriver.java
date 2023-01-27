package browserConfigs;

import org.openqa.selenium.WebDriver;

public interface BrowserDriver
{
    WebDriver launchBrowser();

    void launchUrl(String url);

    void maximize();

    void closeBrowser();
}
