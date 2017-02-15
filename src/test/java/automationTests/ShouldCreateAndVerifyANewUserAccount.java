package automationTests;

import configurations.AutomationSetup;
import org.junit.Test;
import pageObjects.Login;
import pageObjects.Signup;

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
                "test@mail.com",
                "qa_automation"
        );

        Thread.sleep(1000);

        selectLoginButton();

        Thread.sleep(1000);

        automationSetup.endOfAutomationTest();

    }
}
