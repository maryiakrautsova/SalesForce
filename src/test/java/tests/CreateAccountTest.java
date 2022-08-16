package tests;

import models.NewAccountModel;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountsPage;
import pages.ExistingAccountsPage;
import pages.LoginPage;
import pages.NewAccountModelPage;
import testdata.PrepareNewAccountData;

public class CreateAccountTest extends BaseTest {

    private static final Logger LOGGER = LogManager.getLogger(CreateAccountTest.class.getName());

    @Test
    public void createAccountTest() {
        LoginPage loginPage = new LoginPage(driver);
        LOGGER.info(String.format("Page %s is initialized.", LoginPage.class.getName()));
        LOGGER.info(String.format("Open %s page.", LoginPage.class.getName()));
        LOGGER.info("Attempt to log in into the system.");
        loginPage.loginToSalesforce();
        AccountsPage accountsPage = new AccountsPage(driver);
        LOGGER.info(String.format("Page %s is initialized.", AccountsPage.class.getName()));

        LOGGER.info(String.format("Attempt to get prepared account data."));
        NewAccountModel accountData = PrepareNewAccountData.getValidData();

        LOGGER.info(String.format("Open %s page.", AccountsPage.class.getName()));
        LOGGER.info("Proceed with opening page to create a new account and opening an account model.");
        NewAccountModelPage newAccountModelPage = accountsPage.
                openAccountsPage().
                openNewAccountModel();

        LOGGER.info(String.format("Account form on %s is filled in.", AccountsPage.class.getName()));
        newAccountModelPage.fillInAccountForm(accountData);
        String filledInAccountName = accountData.getAccountName();
        LOGGER.info(String.format("Attempt to get created account name: %s.", filledInAccountName));
        newAccountModelPage.clickSaveNewAccount();

        ExistingAccountsPage existingAccountsPage = new ExistingAccountsPage(driver);
        LOGGER.info(String.format("Page %s is initialized.", ExistingAccountsPage.class.getName()));
        String actualAccountName = existingAccountsPage.getAccountName();
        LOGGER.info(String.format("Attempt to get account name: %s.", actualAccountName));
        LOGGER.info("Check whether existing account name equals to account name from account form.");
        Assert.assertEquals(actualAccountName, filledInAccountName);
    }
}
