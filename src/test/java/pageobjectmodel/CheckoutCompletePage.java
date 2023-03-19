package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutCompletePage {
    @FindBy(css = "h2.complete-header")
    private WebElement completeHeader;

    public CheckoutCompletePage(WebDriver browser) {
        PageFactory.initElements(browser, this);
    }

    public String completeHeaderText() {
        return completeHeader.getText();
    }

}