import org.testng.annotations.Test;
import pages.MainPage;

public class CreateAccountTests extends BaseTest {

    @Test
    public void createAccountAndVerifyItWasCreatedTest() {

        new MainPage(driver)
                .clickOnAccountHeader()
                .clickOnNewButton()
                .insertAccountName("Test")
                .insertPhone("012345678")
                .selectFromDropDown("Customer")
                .clickOnSaveButton()
                .assertNewCreatedAccountNameIsDisplayed("Test");
    }
}