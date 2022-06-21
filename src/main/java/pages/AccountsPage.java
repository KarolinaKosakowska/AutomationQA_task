package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.DriverManager;
import utils.WaitUtils;

public class AccountsPage {
    private WebDriver driver;

    public AccountsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//li[@data-target-selection-name='sfdc:StandardButton.Account.New']")
    private WebElement new_button;

    @FindBy(xpath = "//li[@data-target-selection-name='sfdc:StandardButton.Account.Edit]")
    private WebElement edit_button;

    @FindBy(xpath = "//div[@class='testonly-outputNameWithHierarchyIcon]/lightning-formatted-text[text()='")
    private WebElement accountName_label;

    public AccountDetailsComponent clickOnNewButton() {
        WaitUtils.waitForElementToBeClickable(new_button).click();
        return new AccountDetailsComponent(driver);
    }

    public AccountDetailsComponent clickOnEditButton() {
        WaitUtils.waitForElementToBeClickable(edit_button).click();
        return new AccountDetailsComponent(driver);
    }

    public AccountsPage assertNewCreatedAccountNameIsDisplayed(String text) {
        WebElement accountName_label = DriverManager.getDriver().findElement(By.xpath("//div[@class='testonly-outputNameWithHierarchyIcon]/lightning-formatted-text[text()='" + text + "']"));
        Assert.assertEquals(accountName_label, text);
        return this;
    }
}