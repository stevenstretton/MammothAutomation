package automationTests.suites;

import automationTests.account.ShouldAddAndValidateNewFriend;
import automationTests.account.ShouldCreateAndVerifyANewUserAccount;
import automationTests.account.ShouldLoginIntoTestUserAccount;
import automationTests.account.ShouldLogoutSuccessfully;
import automationTests.trip.ShouldCreateAndVerifyANewTrip;
import automationTests.trip.ShouldVerifyMapAndLocationAreDisplayed;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by stevenstretton on 14/03/2017.
 */

@RunWith(Suite.class)

@Suite.SuiteClasses({
        ShouldCreateAndVerifyANewUserAccount.class,
        ShouldLoginIntoTestUserAccount.class,
        ShouldAddAndValidateNewFriend.class,
        ShouldLogoutSuccessfully.class,
        ShouldCreateAndVerifyANewTrip.class,
        ShouldVerifyMapAndLocationAreDisplayed.class
})
public class FullRegressionTestSuite {

}
