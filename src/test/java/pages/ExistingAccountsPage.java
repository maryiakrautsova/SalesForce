package pages;

import io.qameta.allure.Step;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExistingAccountsPage extends BasePage {

    private static final Logger LOGGER = LogManager.getLogger(ExistingAccountsPage.class.getName());

    private By ACCOUNT_NAME_FIELD = By.xpath("//span/slot[1]/lightning-formatted-text");

    public ExistingAccountsPage(WebDriver driver) {
        super(driver);
    }


    @Step("Try to get account name.")
    public String getAccountName() {
        LOGGER.debug(String.format("Attempt to get existing account name: %s.", ACCOUNT_NAME_FIELD));
        return driver.findElement(ACCOUNT_NAME_FIELD).getText();
    }
}
