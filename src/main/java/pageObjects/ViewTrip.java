package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static configurations.FirefoxSettings.driver;

/**
 * Created by stevenstretton on 14/03/2017.
 */
public class ViewTrip {

    public void goToMapView()
    {
        WebElement selectMapBtn = driver.findElement(By.xpath(".//*[@id='tabpanel-t0-0']/page-viewtrip" +
                "/ion-content/div[2]/ion-card/div/ion-fab/button"));

        selectMapBtn.click();
    }
}
