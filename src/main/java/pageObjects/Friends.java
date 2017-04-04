package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static configurations.FirefoxSettings.driver;

/**
 * Created by stevenstretton on 14/03/2017.
 */
public class Friends {

    private People people = new People();

    public void addFriend() throws InterruptedException {
        selectAddFriends();
        Thread.sleep(1000);
        people.validateImageIsDisplayed();
        people.selectAddFriends();
    }

    public void validateAndAddPJ(String name) throws InterruptedException {
        selectAddFriends();
        Thread.sleep(1000);
        people.validateFriend(name);
        people.selectPJ();
        selectBackdrop();
    }

    public boolean isUserOnList(String friendName)
    {
        WebElement checkUser = driver.findElement(By.xpath("//*[contains(text(),'" + friendName + "')]"));

        return checkUser != null;
    }


    private void selectAddFriends()
    {
        WebElement addFriend = driver.findElement(By.xpath(".//*[@id='tabpanel-t0-3']/page-friends/ion-header" +
                "/ion-navbar/ion-buttons/button"));

        addFriend.click();
    }

    private void selectBackdrop()
    {
        WebElement backdrop = driver.findElement(By.cssSelector(".show-page>ion-backdrop"));

        backdrop.click();
    }

}
