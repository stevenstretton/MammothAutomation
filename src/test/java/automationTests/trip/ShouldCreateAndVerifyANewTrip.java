package automationTests.trip;

import configurations.AutomationSetup;
import org.junit.Test;
import pageObjects.Login;
import pageObjects.MyTrips;
import pageObjects.NavBar;
import pageObjects.NewTrip;

/**
 * Created by stevenstretton on 01/02/2017.
 */
public class ShouldCreateAndVerifyANewTrip extends Login{

    private NavBar navBar = new NavBar();
    private NewTrip newTrip = new NewTrip();
    private MyTrips myTrips = new MyTrips();

    @Test
    public void shouldCreateAndVerifyANewTrip() throws InterruptedException
    {

        String TRIP_NAME = "Holiday to New York";
        String TRIP_DESCRIPTION = "Were going to New York for a few days";

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

        navBar.selectNewTrips();

        Thread.sleep(1000);

        newTrip.name(TRIP_NAME);
        newTrip.location("New York, USA");
        newTrip.description(TRIP_DESCRIPTION);
        newTrip.transport("Flight");
        newTrip.friends();
        newTrip.addItem("Passport", "Make sure you have your passport ready!");
        newTrip.addTrip();

        Thread.sleep(1000);

        navBar.selectMyTrips();

        Thread.sleep(1000);

        myTrips.findTripName(TRIP_NAME);
        myTrips.findTripDescription(TRIP_DESCRIPTION);

        Thread.sleep(1000);

        automationSetup.endOfAutomationTest();
    }


}
