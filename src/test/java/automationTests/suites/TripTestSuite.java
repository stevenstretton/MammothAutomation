package automationTests.suites;

import automationTests.trip.ShouldCreateAndVerifyANewTrip;
import automationTests.trip.ShouldVerifyMapAndLocationAreDisplayed;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by stevenstretton on 14/03/2017.
 */

@RunWith(Suite.class)

@Suite.SuiteClasses({
        ShouldCreateAndVerifyANewTrip.class,
        ShouldVerifyMapAndLocationAreDisplayed.class
})
public class TripTestSuite {

}
