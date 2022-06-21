import org.testng.annotations.Test;
import pages.AccountsPage;

public class EditAccountTests extends BaseTest {

    @Test
    public void createAccountAndVerifyItWasCreatedTest() {
        new AccountsPage(driver)
                .clickOnEditButton()
                .insertAccountName("Test123")
                .clickOnSaveButton()
                .assertNewCreatedAccountNameIsDisplayed("Test123");
    }
}