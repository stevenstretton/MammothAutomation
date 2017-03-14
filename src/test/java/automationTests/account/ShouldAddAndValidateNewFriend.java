package automationTests.account;

import configurations.AutomationSetup;
import org.junit.Test;
import pageObjects.Friends;
import pageObjects.Login;
import pageObjects.NavBar;

/**
 * Created by stevenstretton on 01/02/2017.
 */
public class ShouldAddAndValidateNewFriend extends Login{

    private NavBar navBar = new NavBar();
    private Friends friends = new Friends();

    @Test
    public void shouldLoginIntoTestUserAccount() throws InterruptedException
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

        navBar.selectFriends();

        friends.addFriend();

        automationSetup.endOfAutomationTest();

    }


}
