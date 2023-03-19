package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CartPage {

    public CartPage(WebDriver browser) {
        PageFactory.initElements(browser, this);
    }

    @FindBy(id = "checkout")
    public WebElement checkoutBtn;

}