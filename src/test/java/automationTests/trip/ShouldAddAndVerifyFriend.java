package automationTests.trip;

import configurations.AutomationSetup;
import org.junit.Test;
import pageObjects.*;

import static library.Accounts.ACCOUNT_DARRYL;
import static library.Accounts.ACCOUNT_PJ;

/**
 * Created by stevenstretton on 01/02/2017.
 */
public class ShouldAddAndVerifyFriend extends Login{

    private NavBar navBar = new NavBar();
    private Friends friends = new Friends();
    private Account account = new Account();

    @Test
    public void shouldAddAndVerifyFriend() throws InterruptedException
    {
        AutomationSetup automationSetup = new AutomationSetup();
        automationSetup.executeInitialisationSettings();
        automationSetup.goToDefaultPage();

        addDetails(
                ACCOUNT_DARRYL.getAccountEmail(),
                ACCOUNT_DARRYL.getAccountPassword()
        );

        selectLoginButton();

        Thread.sleep(1000);

        navBar.selectFriends();

        Thread.sleep(1000);

        friends.validateAndAddPJ(ACCOUNT_PJ.getAccountName());

        Thread.sleep(1000);

        navBar.selectAccount();

        Thread.sleep(1000);

        account.logoutAndValidate();

        Thread.sleep(1000);

        addDetails(
                ACCOUNT_PJ.getAccountEmail(),
                ACCOUNT_PJ.getAccountPassword()
        );

        selectLoginButton();

        Thread.sleep(1000);

        navBar.selectNotifications();

        Thread.sleep(1000);

        friends.isUserOnList(ACCOUNT_PJ.getAccountName());

        automationSetup.endOfAutomationTest();
    }


}
