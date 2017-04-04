package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static configurations.FirefoxSettings.driver;

/**
 * Created by stevenstretton on 14/03/2017.
 */
public class Map {

    public void selectStaticButton()
    {
        WebElement staticBtn = driver.findElement(By.xpath("html/body/ion-app/ion-alert/div/div[3]/button[1]"));
        staticBtn.click();
    }

    public boolean doesMarkerExist()
    {
        WebElement mapMarker = driver.findElement(By.xpath("//*[contains(text(),'Trip Lead')]"));

        return mapMarker != null;
    }
}
