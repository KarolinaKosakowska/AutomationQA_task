package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.WaitUtils;

public class NewAccountComponent {

    private WebDriver driver;

    public NewAccountComponent(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=]")
    private WebElement accountName_text;

    @FindBy(xpath = "//*[@id=]")
    private WebElement phone_text;


    @FindBy(xpath = "//*[@id=]")
    private WebElement type_dropDown;


    public NewAccountComponent insertAccountName(String text) {
        WaitUtils.waitForElementToBeClickable(accountName_text).clear();
        accountName_text.sendKeys(text);
        return this;
    }

    public NewAccountComponent insertPhone(String text) {
        WaitUtils.waitForElementToBeClickable(accountName_text).clear();
        phone_text.sendKeys(text);
        return this;
    }

    public NewAccountComponent selectFromDropDown(String text) {
        WaitUtils.waitForElementToBeClickable(type_dropDown).clear();
        Select select = new Select(type_dropDown);
        select.selectByVisibleText(text);
        return this;
    }
}
