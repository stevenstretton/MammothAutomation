package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by stevenstretton on 01/02/2017.
 */
public class Login {
    @FindBy(xpath = "html/body/ion-app/ng-component/ion-nav/page-Login/ion-content/div[2]/form/ion-list/ion-item[1]/div[1]/div/ion-input/input")
    private WebElement formEmail;
    @FindBy(xpath = "html/body/ion-app/ng-component/ion-nav/page-Login/ion-content/div[2]/form/ion-list/ion-item[2]/div[1]/div/ion-input/input")
    private WebElement formPassword;
    @FindBy(css = ".item-button.button.button-md.button-default.button-default-md.button-block.button-block-md")
    private WebElement formSignIn;
    @FindBy(css = ".button.button-md.button-outline.button-outline-md.button-block.button-block-md.button-outline-md-primary")
    private WebElement formCreateAccount;

    public void selectLoginButton()
    {
        formSignIn.click();
    }

    public void selectSignUpButton()
    {
        formCreateAccount.click();
    }

    private void enterEmailAddress(String email)
    {
        formEmail.sendKeys(email);
    }

    private void enterPassword(String password)
    {
        formPassword.sendKeys(password);
    }

    protected void addDetails(String formEmail, String formPassword)
    {
        enterEmailAddress(formEmail);
        enterPassword(formPassword);
    }
}
