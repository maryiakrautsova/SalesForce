package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExistingAccountsPage extends BasePage {

    private By ACCOUNT_NAME_FIELD = By.xpath("//span/slot[1]/lightning-formatted-text");

    public ExistingAccountsPage(WebDriver driver) {
        super(driver);
    }


    public String getAccountName() {
        return driver.findElement(ACCOUNT_NAME_FIELD).getText();
    }
}
