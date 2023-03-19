package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
    private final WebDriver browser;
    @FindBy(css = ".btn_small:first-of-type")
    public WebElement productAddBtn;
    @FindBy(id = "shopping_cart_container")
    public WebElement cartBtn;


    public ProductsPage(WebDriver browser) {
        this.browser = browser;
        PageFactory.initElements(browser, this);
    }

}
