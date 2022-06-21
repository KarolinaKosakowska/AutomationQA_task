import org.testng.annotations.Test;
import pages.MainPage;

public class CreateAccountTests extends BaseTest {

    @Test(dataProvider = "getCorrectRegisterEmails")
    public void createAccountAndVerifyItWasCreatedTest(String correctEmail, String password) {

        new MainPage(driver)
                .clickOnAccountHeader()
                .clickOnNewButton();

    }
}