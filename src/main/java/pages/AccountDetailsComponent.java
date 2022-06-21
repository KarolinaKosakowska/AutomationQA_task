package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static utils.WaitUtils.waitForElementToBeClickable;

public class AccountDetailsComponent {

    private WebDriver driver;

    public AccountDetailsComponent(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='10991:0']")
    private WebElement accountName_text;

    @FindBy(xpath = "//input[@id='10971:0']")
    private WebElement phone_text;

    @FindBy(xpath = "//*[@id='12227:0']/div/a")
    private WebElement type_dropDown;

    @FindBy(xpath = "//div[@class='button-container-inner slds-float_right']/button[3]")
    private WebElement save_button;


    public AccountDetailsComponent insertAccountName(String text) {
        waitForElementToBeClickable(accountName_text).clear();
        accountName_text.sendKeys(text);
        return this;
    }

    public AccountDetailsComponent insertPhone(String text) {
        waitForElementToBeClickable(accountName_text).clear();
        phone_text.sendKeys(text);
        return this;
    }

    public AccountDetailsComponent selectFromDropDown(String text) {
        waitForElementToBeClickable(type_dropDown).clear();
        Select select = new Select(type_dropDown);
        select.selectByVisibleText(text);
        return this;
    }

    public AccountsPage clickOnSaveButton() {
        waitForElementToBeClickable(save_button).click();
        return new AccountsPage(driver);
    }
}
