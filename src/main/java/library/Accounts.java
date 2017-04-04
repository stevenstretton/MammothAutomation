package library;

/**
 * Created by stevenstretton on 05/04/2017.
 */
public enum  Accounts {

    ACCOUNT_TIM("Tim Allen", "a@a.com", "password"),
    ACCOUNT_TEST("testFirstName testSurname", "test@mail.com", "qa_automation"),
    ACCOUNT_PJ("Pj Razaq", "p@p.com", "password"),
    ACCOUNT_DARRYL("Darryl Hall", "d@d.com", "password");

    private final String accountName, accountEmail, accountPassword;

    Accounts(String accountName, String accountEmail, String accountPassword)
    {
        this.accountName = accountName;
        this.accountEmail = accountEmail;
        this.accountPassword = accountPassword;
    }

    public final String getAccountName()
    {
        return accountName;
    }

    public final String getAccountEmail()
    {
        return accountEmail;
    }

    public final String getAccountPassword()
    {
        return accountPassword;
    }
}
