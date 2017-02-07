package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by stevenstretton on 01/02/2017.
 */
public class Signup {
    @FindBy(xpath = "html/body/ion-app/ng-component/ion-nav/page-register/ion-content/div[2]/form/ion-list/ion-item[1]/div[1]/div/ion-input/input")
    private WebElement formFirstname;
    @FindBy(xpath = "html/body/ion-app/ng-component/ion-nav/page-register/ion-content/div[2]/form/ion-list/ion-item[2]/div[1]/div/ion-input/input")
    private WebElement formSurname;
    @FindBy(xpath = "html/body/ion-app/ng-component/ion-nav/page-register/ion-content/div[2]/form/ion-list/ion-item[3]/div[1]/div/ion-input/input")
    private WebElement formUsername;
    @FindBy(xpath = "html/body/ion-app/ng-component/ion-nav/page-register/ion-content/div[2]/form/ion-list/ion-item[4]/div[1]/div/ion-input/input")
    private WebElement formEmail;
    @FindBy(xpath = "html/body/ion-app/ng-component/ion-nav/page-register/ion-content/div[2]/form/ion-list/ion-item[5]/div[1]/div/ion-input/input")
    private WebElement formPassword;
    @FindBy(xpath = "html/body/ion-app/ng-component/ion-nav/page-register/ion-content/div[2]/form/ion-list/ion-item[6]/div[1]/div/ion-input/input")
    private WebElement formConfirmPassword;
    @FindBy(css = ".button.button-md.button-default.button-default-md.button-block.button-block-md")
    private WebElement createAccount;

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
        createAccount.click();
    }

    private void setFormFirstname(String firstname)
    {
        formFirstname.sendKeys(firstname);
    }

    private void setFormSurname(String surname)
    {
        formSurname.sendKeys(surname);
    }

    private void setFormUsername(String username)
    {
        formUsername.sendKeys(username);
    }

    private void setFormEmail(String email)
    {
        formEmail.sendKeys(email);
    }

    private void setFormPassword(String password)
    {
        formPassword.sendKeys(password);
    }

    private void setFormConfirmPassword(String password)
    {
        formConfirmPassword.sendKeys(password);
    }



}
