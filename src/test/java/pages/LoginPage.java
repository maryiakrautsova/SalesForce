package pages;

import constants.Credentials;
import constants.Urls;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tests.CreateAccountTest;

public class LoginPage extends BasePage {

    private static final Logger LOGGER = LogManager.getLogger(LoginPage.class.getName());

    private By usernameInput = By.id("username");
    private By passwordInput = By.id("password");
    private By loginButton = By.id("Login");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void loginToSalesforce() {
        LOGGER.debug(String.format("Attempt to open URL: %s", Urls.SALES_FORCE_LOGIN));
        driver.get(Urls.SALES_FORCE_LOGIN);
        LOGGER.debug(String.format("Attempt to input username: %s", Credentials.USERNAME));
        driver.findElement(usernameInput).sendKeys(Credentials.USERNAME);
        LOGGER.debug(String.format("Attempt to input password: %s", Credentials.PASSWORD));
        driver.findElement(passwordInput).sendKeys(Credentials.PASSWORD);
        LOGGER.debug(String.format("Attempt to click on login button %s", loginButton));
        driver.findElement(loginButton).click();
    }
}
