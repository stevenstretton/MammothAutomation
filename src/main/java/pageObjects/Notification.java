package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static configurations.FirefoxSettings.driver;

/**
 * Created by stevenstretton on 04/04/2017.
 */
public class Notification {

    public boolean verifyNotification()
    {
        WebElement notify = driver.findElement(By.id(".icon.icon-md.ion-md-paper-plane.item-icon"));

        return notify != null;
    }

}
