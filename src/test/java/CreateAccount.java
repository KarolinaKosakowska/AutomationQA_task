import org.testng.annotations.Test;
import pages.MainPage;

public class CreateAccount extends BaseTest {

    @Test(dataProvider = "getCorrectRegisterEmails")
    public void createAccountAndVerifyItWasCreatedTest(String correctEmail, String password) {

        //new MainPage(driver)

    }
}