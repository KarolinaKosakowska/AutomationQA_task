package utils;

import config.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
    public static WebDriver driver;
    private static Config config = new Config();

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver() {
        System.setProperty("webdriver.chrome.driver", "d:/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(config.getApplicationUrl());
    }
}