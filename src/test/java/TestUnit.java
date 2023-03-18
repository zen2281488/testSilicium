import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjectModel.*;

import java.util.concurrent.TimeUnit;

public class TestUnit {
    public static WebDriver browser;
    public static LoginPage loginPage;
    public static CartPage cartPage;
    public static CheckoutStepOnePage checkoutStepOnePage;
    public static CheckoutStepTwoPage checkoutStepTwoPage;
    public static CheckoutCompletePage checkoutCompletePage;
    public static ProductsPage productsPage;
    public String login = LogPassData.userLogin;
    public String password = LogPassData.userPass;
    public String wrongLogin = LogPassData.wrongUserLogin;
    public String wrongPassword = LogPassData.wrongUserPass;

    @Before
    public void before() {
        System.setProperty("webdriver.chrome.driver", ".\\lib\\chromedriver.exe");
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        browser = new ChromeDriver();
        browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPage = new LoginPage(browser);
        productsPage = new ProductsPage(browser);
        cartPage = new CartPage(browser);
        checkoutStepOnePage = new CheckoutStepOnePage(browser);
        checkoutStepTwoPage = new CheckoutStepTwoPage(browser);
    }

    @Test
    public void firstTest() {
        browser.get("https://www.saucedemo.com/");
        loginPage.userLogin(login, password);
        productsPage.productAddBtn.click();
        productsPage.cartBtn.click();
        cartPage.checkoutBtn.click();
        checkoutStepOnePage.checkout("test", "test", "test");
        checkoutStepTwoPage.finishBtn.click();
        checkoutCompletePage = new CheckoutCompletePage(browser);
        Assert.assertEquals("Неправильный путь", "https://www.saucedemo.com/checkout-complete.html", browser.getCurrentUrl());
        Assert.assertEquals("Ошибка в тексте уведомления о завершенном заказе", "Thank you for your order!", checkoutCompletePage.completeHeaderText());
    }

    @Test
    public void secondTest() {
        browser.get("https://www.saucedemo.com/");
        loginPage.userLogin(wrongLogin, wrongPassword);
        Assert.assertEquals("Ошибка в тексте уведомления о завершенном заказе", "Epic sadface: Username and password do not match any user in this service", loginPage.assertLoginExept());

    }

    @After

    public void after() {
        browser.close();
    }
}