package webdriverFactoryPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import selenium.factory.WebDriverPool;

public class TestWebDriverFactory
{
    @Test
    public void useCase1() {
        // create a new managed instance
        WebDriver driver = WebDriverPool.DEFAULT.getDriver(new FirefoxOptions());
        // do something with the driver
        driver.get("http://seleniumhq.org/");
    }

    @Test
    public void useCase2() {
        // create a new managed instance
        WebDriver driver = WebDriverPool.DEFAULT.getDriver(new FirefoxOptions());
        // do something with the driver
        driver.get("http://seleniumhq.org/");

        // obtain the same instance from the pool of the managed instances
        driver = WebDriverPool.DEFAULT.getDriver(new FirefoxOptions());
        // do something with the driver
        driver.get("http://selenium2.ru/");
    }

    @Test
    public void testSomething() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        WebDriver driver = WebDriverPool.DEFAULT.getDriver(chromeOptions);
        // do something with the driver
        driver.get("http://seleniumhq.org/");
    }

    @Test
    public void testSomethingElse() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("incognito");
        WebDriver driver = WebDriverPool.DEFAULT.getDriver(chromeOptions);
        // do something with the driver
        driver.get("http://seleniumhq.org/");
    }

    @AfterSuite
    public void stopAllDrivers() {
        WebDriverPool.DEFAULT.dismissAll();
    }
}
