package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static configurations.FirefoxSettings.driver;

/**
 * Created by stevenstretton on 13/03/2017.
 */
public class MyTrips {

    public boolean findTripName(String name){
        return driver.getPageSource().contains(name);
    }

    public boolean findTripDescription(String description){
        return driver.getPageSource().contains(description);
    }

    public void selectViewTripInformation()
    {
        WebElement viewTripInformation = driver.findElement(By.xpath(".//*[@id='tabpanel-t0-0']/page-mytrips" +
                "/ion-content/div[2]/ion-list/ion-card[1]/ion-row/ion-col/button"));

        viewTripInformation.click();
    }
}
