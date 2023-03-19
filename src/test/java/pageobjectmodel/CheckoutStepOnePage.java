package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutStepOnePage {
    private final WebDriver browser;

    public CheckoutStepOnePage(WebDriver browser) {
        this.browser = browser;
        PageFactory.initElements(browser, this);
    }

    @FindBy(id = "first-name")
    private WebElement firstNameInput;
    @FindBy(id = "last-name")
    private WebElement lastNameInput;
    @FindBy(id = "postal-code")
    private WebElement postalCodeInput;
    @FindBy(id = "continue")
    private WebElement continueBtn;

    public CheckoutStepOnePage checkout(String testName, String testLastName, String testPostalCode) {
        firstNameInput.sendKeys(testName);
        lastNameInput.sendKeys(testLastName);
        postalCodeInput.sendKeys(testPostalCode);
        continueBtn.click();
        return this;
    }
}
