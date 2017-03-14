package automationTests.account;

import configurations.AutomationSetup;
import org.junit.Test;
import pageObjects.Account;
import pageObjects.Login;
import pageObjects.NavBar;

/**
 * Created by stevenstretton on 01/02/2017.
 */
public class ShouldLogoutSuccessfully extends Login{

    private NavBar navBar = new NavBar();
    private Account account = new Account();

    @Test
    public void shouldLogoutSuccessfully() throws InterruptedException
    {
        AutomationSetup automationSetup = new AutomationSetup();
        automationSetup.executeInitialisationSettings();
        automationSetup.goToDefaultPage();

        addDetails(
                "a@a.com",
                "password"
        );

        Thread.sleep(1000);

        selectLoginButton();

        Thread.sleep(1000);

        navBar.selectAccount();

        Thread.sleep(1000);

        account.logoutAndValidate();

        automationSetup.endOfAutomationTest();

    }


}
