package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WaitUtils;

public class MainPage {
    protected WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@title='Accounts']")

    private WebElement account_itemList;

    public AccountsPage clickOnAccountHeader() {
        WaitUtils.waitForElementToBeClickable(account_itemList).click();
        return new AccountsPage(driver);
    }
}
