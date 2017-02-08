package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static configurations.FirefoxSettings.driver;

/**
 * Created by stevenstretton on 01/02/2017.
 */
public class Signup {

    public void addDetails(String formFirstname, String formSurname, String formUsername,
                              String formEmail, String formPassword, String formConfirmPassword)
    {
        setFormFirstname(formFirstname);
        setFormSurname(formSurname);
        setFormUsername(formUsername);
        setFormEmail(formEmail);
        setFormPassword(formPassword);
        setFormConfirmPassword(formConfirmPassword);
    }

    public void selectCreateAccountButton()
    {
        WebElement createAccount = driver.findElement(By.cssSelector(".button.button-md.button-default" +
                ".button-default-md.button-block.button-block-md"));

        createAccount.click();
    }

    private void setFormFirstname(String firstname)
    {
        WebElement formFirstname = driver.findElement(By.xpath("html/body/ion-app/ng-component/ion-nav/page-register" +
                "/ion-content/div[2]/form/ion-list/ion-item[1]/div[1]/div/ion-input/input"));

        formFirstname.sendKeys(firstname);
    }

    private void setFormSurname(String surname)
    {
        WebElement formSurname = driver.findElement(By.xpath("html/body/ion-app/ng-component/ion-nav/page-register" +
                "/ion-content/div[2]/form/ion-list/ion-item[2]/div[1]/div/ion-input/input"));

        formSurname.sendKeys(surname);
    }

    private void setFormUsername(String username)
    {
        WebElement formUsername = driver.findElement(By.xpath("html/body/ion-app/ng-component/ion-nav/page-register" +
                "/ion-content/div[2]/form/ion-list/ion-item[3]/div[1]/div/ion-input/input"));

        formUsername.sendKeys(username);
    }

    private void setFormEmail(String email)
    {
        WebElement formEmail = driver.findElement(By.xpath("html/body/ion-app/ng-component/ion-nav/page-register" +
                "/ion-content/div[2]/form/ion-list/ion-item[4]/div[1]/div/ion-input/input"));

        formEmail.sendKeys(email);
    }

    private void setFormPassword(String password)
    {
        WebElement formPassword = driver.findElement(By.xpath("html/body/ion-app/ng-component/ion-nav/page-register" +
                "/ion-content/div[2]/form/ion-list/ion-item[5]/div[1]/div/ion-input/input"));

        formPassword.sendKeys(password);
    }

    private void setFormConfirmPassword(String password)
    {
        WebElement formConfirmPassword = driver.findElement(By.xpath("html/body/ion-app/ng-component/ion-nav/" +
                "page-register/ion-content/div[2]/form/ion-list/ion-item[6]/div[1]/div/ion-input/input"));

        formConfirmPassword.sendKeys(password);
    }



}
