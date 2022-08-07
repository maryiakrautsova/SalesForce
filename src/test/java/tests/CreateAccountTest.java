package tests;

import models.NewAccountModel;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountsPage;
import pages.ExistingAccountsPage;
import pages.LoginPage;
import pages.NewAccountModelPage;
import testdata.PrepareNewAccountData;

public class CreateAccountTest extends BaseTest {
    @Test
    public void createAccountTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToSalesforce();
        AccountsPage accountsPage = new AccountsPage(driver);
        NewAccountModel accountData = PrepareNewAccountData.getValidData();

        NewAccountModelPage newAccountModelPage = accountsPage.
                openAccountsPage().
                openNewAccountModel();

        newAccountModelPage.fillInAccountForm(accountData);
        String filledInAccountName = accountData.getAccountName();
        newAccountModelPage.clickSaveNewAccount();

        ExistingAccountsPage existingAccountsPage = new ExistingAccountsPage(driver);
        String actualAccountName = existingAccountsPage.getAccountName();
        Assert.assertEquals(actualAccountName, filledInAccountName);
    }
}
