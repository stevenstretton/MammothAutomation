package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static configurations.FirefoxSettings.driver;

/**
 * Created by stevenstretton on 01/02/2017.
 */
public class Navbar {

    public void selectMyTrips()
    {
        WebElement navMyTrips = driver.findElement(By.cssSelector(".tab-button-icon.icon.icon-md.ion-md-globe"));

        navMyTrips.click();
    }

    public void selectNotifications()
    {
        WebElement navNotifications = driver.findElement(By.cssSelector(".tab-button-icon.icon.icon-md" +
                ".ion-md-notifications"));

        navNotifications.click();
    }

    public void selectNewTrips()
    {
        WebElement navNewTrips = driver.findElement(By.cssSelector("#tab-t0-2"));

        navNewTrips.click();
    }

    public void selectFriends()
    {

        WebElement navFriends = driver.findElement(By.cssSelector(".tab-button-icon.icon.icon-md.ion-md-contacts"));

        navFriends.click();
    }

    public void selectAccount()
    {
        WebElement navAccount = driver.findElement(By.cssSelector(".tab-button-icon.icon.icon-md.ion-md-contact"));

        navAccount.click();
    }


}
