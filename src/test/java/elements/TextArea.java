package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextArea {

    private static final String TEXTAREA_ONE_XPATH = "//div[contains(@class, 'modal-body')]//span[text()='%s']//parent::label//following-sibling::%s";
    private String labelText;
    private WebDriver driver;

    public TextArea(WebDriver driver, String labelText) {
        this.labelText = labelText;
        this.driver = driver;
    }

    public void fillInTextAreaOne(String message) {
        String finalXpathOne = String.format(TEXTAREA_ONE_XPATH, labelText, "textarea");
        driver.findElement(By.xpath(finalXpathOne)).sendKeys(message);
    }

    public void fillInTextAreaTwo(String message) {
        String finalXpathTwo = String.format(TEXTAREA_ONE_XPATH, labelText, "input");
        driver.findElement(By.xpath(finalXpathTwo)).sendKeys(message);
    }
}
