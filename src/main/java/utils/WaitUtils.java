package utils;

import config.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {

    protected WebDriver driver;
    protected Config config = new Config();

    private static final int DEFAULT_TIMEOUT = 2;

    public static WebElement waitForElementToBeClickable(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), timeout);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        return element;
    }

    public static WebElement waitForElementToBeClickable(WebElement element) {
        waitForElementToBeClickable(element, DEFAULT_TIMEOUT);
        return element;
    }

    public static WebElement waitForElementToBeVisible(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), timeout);
        wait.until(ExpectedConditions.visibilityOfAllElements(element));
        return element;
    }

    public static WebElement waitForElementToBeVisible(WebElement element) {
        waitForElementToBeVisible(element, DEFAULT_TIMEOUT);
        return element;
    }
}