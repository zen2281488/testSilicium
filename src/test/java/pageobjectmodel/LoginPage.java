package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(id = "user-name")
    private WebElement loginInput;
    @FindBy(id = "password")
    private WebElement passwordInput;
    @FindBy(id = "login-button")
    private WebElement loginBtn;
    @FindBy(css = "[data-test='error']")
    private WebElement exeptionHeader;

    public LoginPage(WebDriver browser) {
        PageFactory.initElements(browser, this);
    }

    public void userLogin(String login, String pass) {
        loginInput.sendKeys(login);
        passwordInput.sendKeys(pass);
        loginBtn.click();
    }

    public String LoginExeption() {
        return exeptionHeader.getText();
    }
}
