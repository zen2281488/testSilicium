package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutStepTwoPage {
    private final WebDriver browser;

    public CheckoutStepTwoPage(WebDriver browser) {
        this.browser = browser;
        PageFactory.initElements(browser, this);
    }

    @FindBy(id = "finish")
    public WebElement finishBtn;

}
