package automationTests.account;

import configurations.AutomationSetup;
import org.junit.Test;
import pageObjects.Login;

import static library.Accounts.ACCOUNT_TIM;

/**
 * Created by stevenstretton on 01/02/2017.
 */
public class ShouldLoginIntoTestUserAccount extends Login{

    @Test
    public void shouldLoginIntoTestUserAccount() throws InterruptedException
    {
        AutomationSetup automationSetup = new AutomationSetup();
        automationSetup.executeInitialisationSettings();
        automationSetup.goToDefaultPage();

        addDetails(
                ACCOUNT_TIM.getAccountEmail(),
                ACCOUNT_TIM.getAccountPassword()
        );

        Thread.sleep(1000);

        selectLoginButton();

        Thread.sleep(1000);

        automationSetup.endOfAutomationTest();

    }


}
