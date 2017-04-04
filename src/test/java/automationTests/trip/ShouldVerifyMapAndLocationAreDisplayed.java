package automationTests.trip;

import configurations.AutomationSetup;
import org.junit.Test;
import pageObjects.*;

import static library.Accounts.ACCOUNT_TIM;

/**
 * Created by stevenstretton on 01/02/2017.
 */
public class ShouldVerifyMapAndLocationAreDisplayed extends Login{

    private NavBar navBar = new NavBar();
    private MyTrips myTrips = new MyTrips();
    private ViewTrip viewTrip = new ViewTrip();
    private Map map = new Map();

    @Test
    public void shouldVerifyMapAndLocationAreDisplayed() throws InterruptedException
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

        navBar.selectMyTrips();

        Thread.sleep(1000);

        myTrips.selectViewTripInformation();

        Thread.sleep(1000);

        viewTrip.goToMapView();

        Thread.sleep(1000);

        map.selectStaticButton();

        Thread.sleep(1000);

        map.doesMarkerExist();

        automationSetup.endOfAutomationTest();
    }


}
