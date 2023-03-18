package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CartPage {
    private final WebDriver browser;

    public CartPage(WebDriver browser) {
        this.browser = browser;
        PageFactory.initElements(browser, this);
    }

    @FindBy(id = "checkout")
    public WebElement checkoutBtn;

}