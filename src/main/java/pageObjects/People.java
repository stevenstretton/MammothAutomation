package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static configurations.FirefoxSettings.driver;

/**
 * Created by stevenstretton on 14/03/2017.
 */
public class People {


    public void selectAddFriends()
    {
        WebElement addFriend = driver.findElement(By.xpath(".html/body/ion-app/ion-modal/div/page-addfriendmodal" +
                "/ion-content/div[2]/ion-list/ion-item[1]/div[1]/ion-checkbox/button"));

        addFriend.click();
    }

    public void selectPJ()
    {
        WebElement addJohnDoe = driver.findElement(By.cssSelector("ion-item:nth-child(2)"));
        addJohnDoe.click();
    }

    public boolean validateImageIsDisplayed()
    {
        WebElement image = driver.findElement(By.xpath("html/body/ion-app/ion-modal/div/page-addfriendmodal" +
                "/ion-content/div[2]/ion-list/ion-item[1]/ion-avatar/img"));

        return image != null;
    }


    public boolean validateFriend(String friendName)
    {
        WebElement friend = driver.findElement(By.xpath("//*[contains(text(),'" + friendName + "')]"));

        return friend != null;
    }

}
