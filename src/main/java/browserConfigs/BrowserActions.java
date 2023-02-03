package browserConfigs;

import org.openqa.selenium.WebDriver;

public interface BrowserActions
{
    void launchUrl(String url);

    void maximize();

    void closeBrowser();
}
