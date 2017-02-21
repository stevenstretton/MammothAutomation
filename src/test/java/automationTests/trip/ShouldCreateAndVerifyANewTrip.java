package automationTests.trip;

import configurations.AutomationSetup;
import org.junit.Test;
import pageObjects.Login;
import pageObjects.NavBar;
import pageObjects.NewTrip;

/**
 * Created by stevenstretton on 01/02/2017.
 */
public class ShouldCreateAndVerifyANewTrip extends Login{

    private NavBar navBar = new NavBar();
    private NewTrip newTrip = new NewTrip();

    @Test
    public void shouldLoginIntoTestUserAccount() throws InterruptedException
    {
        AutomationSetup automationSetup = new AutomationSetup();
        automationSetup.executeInitialisationSettings();
        automationSetup.goToDefaultPage();

        addDetails(
                "test@mail.com",
                "qa_automation"
        );

        selectLoginButton();

        Thread.sleep(1000);

        navBar.selectNewTrips();

        Thread.sleep(1000);

        newTrip.name("Holiday to New York");
        newTrip.location("New York, USA");
        newTrip.description("Were going to New York for a few days");
        newTrip.startDate();
        newTrip.startTime();
        newTrip.endDate();
        newTrip.transport("Flight");
        newTrip.friends();
        newTrip.addItem("Passport", "Make sure you have your passport ready!");
        newTrip.addTrip();

        Thread.sleep(1000);

        navBar.selectMyTrips();

        Thread.sleep(1000);
    }


}
