package pages;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountsPage extends BasePage {
    private By NEW_BUTTON = By.xpath("//ul[contains(@class, 'branding-actions')]//a[@title='New']");

    public AccountsPage(WebDriver driver) {
        super(driver);
    }

    public AccountsPage openAccountsPage() {
        driver.get(Urls.SALES_FORCE_LOGIN.concat(Urls.ACCOUNT_URL));
        return this;
    }

    public NewAccountModelPage openNewAccountModel() {
        driver.findElement(NEW_BUTTON).click();
        return new NewAccountModelPage(driver);
    }
}
