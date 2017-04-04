package automationTests.trip;

import configurations.AutomationSetup;
import org.junit.Test;
import pageObjects.*;

import static library.Accounts.ACCOUNT_DARRYL;

/**
 * Created by stevenstretton on 01/02/2017.
 */
public class ShouldValidateFriendIsAddedToTrip extends Login{

    private NavBar navBar = new NavBar();
    private Notification notification = new Notification();

    @Test
    public void shouldValidateFriendIsAddedToTrip() throws InterruptedException
    {

        AutomationSetup automationSetup = new AutomationSetup();
        automationSetup.executeInitialisationSettings();
        automationSetup.goToDefaultPage();

        addDetails(
                ACCOUNT_DARRYL.getAccountEmail(),
                ACCOUNT_DARRYL.getAccountPassword()
        );

        Thread.sleep(1000);

        selectLoginButton();

        Thread.sleep(1000);

        navBar.selectNotifications();

        Thread.sleep(1000);

        notification.verifyNotification();

        Thread.sleep(1000);

        automationSetup.endOfAutomationTest();
    }


}
