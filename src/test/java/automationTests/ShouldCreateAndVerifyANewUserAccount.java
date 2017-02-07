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
    public void shouldLoginIntoTestUserAccount()  throws InterruptedException
    {
        AutomationSetup automationSetup = new AutomationSetup();
        automationSetup.executeInitialisationSettings();
        automationSetup.goToDefaultPage();

        selectSignUpButton();

        Signup signup = new Signup();

        signup.addDetails(
                "TestFirstname",
                "TestSurname",
                "TestUsername",
                "test@email.com",
                "qa_automation",
                "qa_automation"
        );

        Thread.sleep(1000);

        signup.selectCreateAccountButton();

        automationSetup.goToDefaultPage();

        addDetails(
                "test@email.com",
                "qa_automation"
        );

        Thread.sleep(1000);

        selectLoginButton();

        Thread.sleep(1000);

        automationSetup.endOfAutomationTest();

    }
}
