package pageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
    private final WebDriver browser;
    @FindBy(xpath = "//button[contains(@id, 'add-to')][1]")
    public WebElement productAddBtn;
    @FindBy(id = "shopping_cart_container")
    public WebElement cartBtn;


    public ProductsPage(WebDriver browser) {
        this.browser = browser;
        PageFactory.initElements(browser, this);
    }

}
