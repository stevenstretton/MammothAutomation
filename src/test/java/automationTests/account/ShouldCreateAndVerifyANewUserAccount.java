package automationTests.account;

import configurations.AutomationSetup;
import org.junit.Test;
import pageObjects.Login;
import pageObjects.Signup;

import static library.Accounts.ACCOUNT_TEST;

/**
 * Created by stevenstretton on 01/02/2017.
 */
public class ShouldCreateAndVerifyANewUserAccount extends Login {

    @Test
    public void shouldCreateAndVerifyANewUserAccount()  throws InterruptedException
    {
        AutomationSetup automationSetup = new AutomationSetup();
        automationSetup.executeInitialisationSettings();
        automationSetup.goToDefaultPage();

        selectCreateAccount();

        Signup signup = new Signup();

        signup.addDetails(
                "testFirstName",
                "testSurname",
                "testUsername",
                "test@mail.com",
                "qa_automation",
                "qa_automation"
        );

        signup.selectCreateAccountButton();

        Thread.sleep(1000);

        automationSetup.goToDefaultPage();

        addDetails(
                ACCOUNT_TEST.getAccountEmail(),
                ACCOUNT_TEST.getAccountPassword()
        );

        Thread.sleep(1000);

        selectLoginButton();

        Thread.sleep(1000);

        automationSetup.endOfAutomationTest();

    }
}
