package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private final WebDriver browser;
    @FindBy(id = "user-name")
    private WebElement loginInput;
    @FindBy(id = "password")
    private WebElement passwordInput;
    @FindBy(id = "login-button")
    private WebElement loginBtn;
    @FindBy(css = "[data-test='error']")
    private WebElement exeptionHeader;

    public LoginPage(WebDriver browser) {
        this.browser = browser;
        PageFactory.initElements(browser, this);
    }

    public LoginPage userLogin(String login, String pass) {
        loginInput.sendKeys(login);
        passwordInput.sendKeys(pass);
        loginBtn.click();
        return this;
    }

    public String loginExeption() {
        String text = exeptionHeader.getText();
        return text;
    }
}
