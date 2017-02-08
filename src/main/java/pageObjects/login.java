package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static configurations.FirefoxSettings.driver;

/**
 * Created by stevenstretton on 01/02/2017.
 */
public class Login {

    public void selectLoginButton()
    {
        WebElement formSignIn = driver.findElement(By.cssSelector(".item-button.button.button-md.button-default" +
                ".button-default-md.button-block.button-block-md"));

        formSignIn.click();
    }

    public void selectSignUpButton()
    {
        WebElement formCreateAccount = driver.findElement(By.cssSelector(".button.button-md.button-outline" +
                ".button-outline-md.button-block.button-block-md.button-outline-md-primary"));

        formCreateAccount.click();
    }

    private void enterEmailAddress(String email)
    {
        WebElement formEmail = driver.findElement(By.xpath("html/body/ion-app/ng-component/ion-nav/" +
                "page-login/ion-content/div[2]/form/ion-list/ion-item[1]/div[1]/div/ion-input/input"));

        formEmail.sendKeys(email);
    }

    private void enterPassword(String password)
    {
        WebElement formPassword = driver.findElement(By.xpath("html/body/ion-app/ng-component/ion-nav/" +
                "page-login/ion-content/div[2]/form/ion-list/ion-item[2]/div[1]/div/ion-input/input"));

        formPassword.sendKeys(password);
    }

    protected void addDetails(String formEmail, String formPassword)
    {
        enterEmailAddress(formEmail);
        enterPassword(formPassword);
    }
}
