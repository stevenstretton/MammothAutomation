package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static configurations.FirefoxSettings.driver;

/**
 * Created by stevenstretton on 14/03/2017.
 */
public class Account {

    public void logoutAndValidate() throws InterruptedException {
        logout();
        Thread.sleep(1000);
        validateLogout();
    }

    private void logout()
    {
        WebElement logoutApplication = driver.findElement(By.xpath(".//*[@id='tabpanel-t0-4']/page-account/ion-header" +
                "/ion-navbar/ion-buttons/button"));

        logoutApplication.click();
    }

    private boolean validateLogout()
    {
        WebElement formEmail = driver.findElement(
                By.xpath("html/body/ion-app/ng-component/ion-nav/page-login/ion-content/div[2]/form/ion-list" +
                        "/ion-item[1]/div[1]/div/ion-input/input"));

        return formEmail != null;
    }

}
