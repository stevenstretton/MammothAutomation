package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static configurations.FirefoxSettings.driver;

/**
 * Created by stevenstretton on 14/03/2017.
 */
public class Friends {

    private People people = new People();

    public void addFriend()
    {
        selectAddFriends();
        people.validateImageIsDisplayed();
        people.selectAddFriends();
    }

    private void selectAddFriends()
    {
        WebElement addFriend = driver.findElement(By.xpath(".//*[@id='tabpanel-t0-3']/page-friends/ion-header" +
                "/ion-navbar/ion-buttons/button"));

        addFriend.click();
    }
}
