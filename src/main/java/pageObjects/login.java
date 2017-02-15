package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static configurations.FirefoxSettings.driver;

/**
 * Created by stevenstretton on 20/02/2017.
 */
public class Login {
    public void selectLoginButton()
    {
        WebElement formSignIn = driver.findElement(By.xpath("html/body/ion-app/ng-component/ion-nav/page-login" +
                "/ion-content/div[2]/form/ion-list/div/button"));

        formSignIn.click();
    }

    public void selectCreateAccount()
    {
        WebElement formCreateAccount = driver.findElement(By.xpath("html/body/ion-app/ng-component/ion-nav/page-login" +
                "/ion-content/div[2]/div/button"));

        formCreateAccount.click();
    }

    private void enterEmailAddress(String email)
    {
        WebElement formEmail = driver.findElement(
                By.xpath("html/body/ion-app/ng-component/ion-nav/page-login/ion-content/div[2]/form/ion-list" +
                        "/ion-item[1]/div[1]/div/ion-input/input")
        );

        formEmail.sendKeys(email);
    }

    private void enterPassword(String password)
    {
        WebElement formPassword = driver.findElement(By.xpath("html/body/ion-app/ng-component/ion-nav/page-login" +
                "/ion-content/div[2]/form/ion-list/ion-item[2]/div[1]/div/ion-input/input"));

        formPassword.sendKeys(password);
    }

    protected void addDetails(String formEmail, String formPassword)
    {
        enterEmailAddress(formEmail);
        enterPassword(formPassword);
    }
}
