package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static configurations.FirefoxSettings.driver;

/**
 * Created by stevenstretton on 14/03/2017.
 */
public class Map {

    public boolean doesMarkerExist()
    {
        WebElement mapMarker = driver.findElement(By.xpath(".//*[@id='map']/div/div/div[1]/div[4]/div[3]/div[1]"));

        return mapMarker != null;
    }
}
