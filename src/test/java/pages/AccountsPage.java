package pages;

import constants.Urls;
import io.qameta.allure.Step;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountsPage extends BasePage {

    private static final Logger LOGGER = LogManager.getLogger(AccountsPage.class.getName());

    private By NEW_BUTTON = By.xpath("//ul[contains(@class, 'branding-actions')]//a[@title='New']");

    public AccountsPage(WebDriver driver) {
        super(driver);
    }


    @Step("Open Account page.")
    public AccountsPage openAccountsPage() {
        LOGGER.debug(String.format("Attempt to open URL: %s", Urls.ACCOUNT_URL));
        driver.get(Urls.SALES_FORCE_LOGIN.concat(Urls.ACCOUNT_URL));
        return this;
    }


    @Step("Open page with a new form to create a new account.")
    public NewAccountModelPage openNewAccountModel() {
        LOGGER.debug(String.format("Attempt click on 'NEW' button: %s", NEW_BUTTON));
        driver.findElement(NEW_BUTTON).click();
        return new NewAccountModelPage(driver);
    }
}
