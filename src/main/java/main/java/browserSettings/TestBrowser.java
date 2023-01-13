package main.java.browserSettings;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class TestBrowser
{
    public static void main(String[] args)
    {
        ChromeOptions optionsGC = new ChromeOptions();
        optionsGC.addArguments("start-maximized");
        ChromeDriver driverGC = new ChromeDriver(optionsGC);
        driverGC.get("https://www.google.co.in");
        driverGC.close();

        FirefoxOptions optionsFF = new FirefoxOptions();
        optionsFF.addArguments("start-maximized");
        FirefoxDriver driverFF = new FirefoxDriver(optionsFF);
        driverFF.get("https://www.google.co.in");
        driverFF.close();

        EdgeOptions optionsME = new EdgeOptions();
        optionsME.addArguments("start-maximized");
        EdgeDriver driverME = new EdgeDriver(optionsME);
        driverME.get("https://www.google.co.in");
        driverME.close();
    }
}
