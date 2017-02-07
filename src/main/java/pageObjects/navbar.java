package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by stevenstretton on 01/02/2017.
 */
public class Navbar {
    @FindBy(css = ".tab-button-icon.icon.icon-md.ion-md-globe")
    private WebElement navMyTrips;
    @FindBy(css = ".tab-button-icon.icon.icon-md.ion-md-notifications")
    private WebElement navNotifications;
    @FindBy(css = "#tab-t0-2")
    private WebElement navNewTrips;
    @FindBy(css = ".tab-button-icon.icon.icon-md.ion-md-contacts")
    private WebElement navFriends;
    @FindBy(css = ".tab-button-icon.icon.icon-md.ion-md-contact")
    private WebElement navAccount;

    public void selectMyTrips()
    {
        navMyTrips.click();
    }

    public void selectNotifications()
    {
        navNotifications.click();
    }

    public void selectNewTrips()
    {
        navNewTrips.click();
    }

    public void selectFriends()
    {
        navFriends.click();
    }

    public void selectAccount()
    {
        navAccount.click();
    }


}
