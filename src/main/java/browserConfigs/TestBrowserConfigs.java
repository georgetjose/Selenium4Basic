package browserConfigs;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestBrowserConfigs
{
    @Test
    @Parameters("browser")
    public void testingBrowser(BrowserTypes browser) throws InterruptedException
    {
        BrowserDriver browserDriver = BrowserFlow.testBrowser(browser);
        BrowserActions browserActions = new WindowsBrowsers();
        if (browserDriver != null) {
            browserDriver.launchBrowser();
            browserActions.launchUrl("https://google.co.in");
            browserActions.maximize();
            Thread.sleep(3000);
            browserActions.closeBrowser();
        }
    }

}
