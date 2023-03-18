package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CheckoutCompletePage {
    private final WebDriver browser;

    public CheckoutCompletePage(WebDriver browser) {
        this.browser = browser;
        PageFactory.initElements(browser, this);
    }


    public String completeHeaderText() {
        WebElement completeHeader = browser.findElement(By.cssSelector("h2.complete-header"));
        String text = completeHeader.getText();
        return text;
    }
}