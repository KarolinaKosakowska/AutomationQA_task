package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WaitUtils;

public class AccountsPage {
    private WebDriver driver;

    public AccountsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//div[@title='New']")
    private WebElement new_button;

    public AccountsPage clickOnNewButton(){
        WaitUtils.waitForElementToBeClickable(new_button).click();
        return this;
    }
}
