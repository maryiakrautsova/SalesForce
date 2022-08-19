package pages;

import elements.DropdownList;
import elements.TextArea;
import elements.TextInput;
import io.qameta.allure.Step;
import models.NewAccountModel;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewAccountModelPage extends BasePage {

    private static final Logger LOGGER = LogManager.getLogger(NewAccountModelPage.class.getName());

    private By ACCOUNT_NAME_INPUT = By.xpath("//div[contains(@class, 'modal-body')]//span[text()='Account Name']//parent::label//following-sibling::div//input");
    private By SAVE_BUTTON = By.xpath("//div[contains(@class, 'modal-body')]//button[@title='Save']");

    public NewAccountModelPage(WebDriver driver) {
        super(driver);
    }


    @Step("Fill in new account form.")
    public NewAccountModelPage fillInAccountForm(NewAccountModel newAccount) {
        LOGGER.debug(String.format("Attempt to create a new account: %s", newAccount));
        driver.findElement(ACCOUNT_NAME_INPUT).sendKeys(newAccount.getAccountName());
        new TextInput(driver, "Phone").inputText(newAccount.getPhone());
        new DropdownList(driver, "Type").selectOptionOnList(newAccount.getType());
        new TextInput(driver, "Fax").inputText(newAccount.getFax());
        new TextInput(driver, "Website").inputText(newAccount.getWebsite());
        new DropdownList(driver, "Industry").selectOptionOnList(newAccount.getIndustry());
        new TextInput(driver, "Employees").inputText(newAccount.getEmployees());
        new TextInput(driver, "Annual Revenue").inputText(newAccount.getAnnualRevenue());
        new TextArea(driver, "Description").fillInTextAreaOne(newAccount.getDescription());
        new TextArea(driver, "Billing Street").fillInTextAreaOne(newAccount.getBillingStreet());
        new TextArea(driver, "Shipping Street").fillInTextAreaOne(newAccount.getShippingStreet());
        new TextArea(driver, "Billing City").fillInTextAreaTwo(newAccount.getBillingCity());
        new TextArea(driver, "Billing State/Province").fillInTextAreaTwo(newAccount.getBillingStateOrProvince());
        new TextArea(driver, "Shipping City").fillInTextAreaTwo(newAccount.getShippingCity());
        new TextArea(driver, "Shipping State/Province").fillInTextAreaTwo(newAccount.getShippingStateOrProvince());
        new TextArea(driver, "Billing Zip/Postal Code").fillInTextAreaTwo(newAccount.getBillingZipOrPostalCode());
        new TextArea(driver, "Billing Country").fillInTextAreaTwo(newAccount.getBillingCountry());
        new TextArea(driver, "Shipping Zip/Postal Code").fillInTextAreaTwo(newAccount.getShippingZipOrPostalCode());
        new TextArea(driver, "Shipping Country").fillInTextAreaTwo(newAccount.getShippingCountry());
        return this;
    }

    public String getGeneratedAccountName() {
        LOGGER.debug(String.format("Attempt to get input account name: %s.", ACCOUNT_NAME_INPUT));
        return driver.findElement(ACCOUNT_NAME_INPUT).getText();
    }

    public void clickSaveNewAccount() {
        LOGGER.debug(String.format("Attempt to click 'Save' button: %s.", SAVE_BUTTON));
        driver.findElement(SAVE_BUTTON).click();
    }
}
