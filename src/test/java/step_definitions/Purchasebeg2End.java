package step_definitions;

import Base.TestBase;
import Pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Purchasebeg2End extends TestBase {


    @Before
    public void setup() throws IOException {
        initialize();
    }
    @Given("^I am on the application home screen$")
    public void i_am_on_the_application_home_screen() throws Throwable {
        driver.manage().deleteAllCookies();
        driver.get(CONFIG.getProperty("URL"));
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @Given("^I am successfully logged in$")
    public void i_am_successfully_logged_in() throws Throwable {
        HomeScreen page = PageFactory.initElements(driver,HomeScreen.class);
        page.ClickSignIn();

        Login_CreateAccPage Page = PageFactory.initElements(driver, Login_CreateAccPage.class);
        Page.TypeLoginEmail();
        Page.TypeLoginPassword();
        Page.ClickLoginSubmit();
    }

    @Given("^I click on women and then dresses$")
    public void i_click_on_women_and_then_dresses() throws Throwable {
        LoggedInHomeScreen page = PageFactory.initElements(driver, LoggedInHomeScreen.class);
        page.clickwomen();

        WomenPage Page = PageFactory.initElements(driver, WomenPage.class);
        Page.clickDresses();
    }


    @Given("^I add random products to cart$")
    public void i_add_random_products_to_cart() throws Throwable {
        WomenPage Page = PageFactory.initElements(driver, WomenPage.class);
        Page.ClickOnProduct();
        ProductDetailPage page = PageFactory.initElements(driver, ProductDetailPage.class);
        WebElement fr = driver.findElement(By.id("fancybox-frame1560129370733"));
        driver.switchTo().frame("iframe");

        page.AddToCart();
        page.clickaddtomywishlist();
        page.verifyAddToCartMessage();
        page.CloseCartMessageWindow();

    }

    @When("^i check that the product in Shopping cart has the correct price and my details are correct$")
    public void iCheckThatTheProductInShoppingCartHasTheCorrectPriceAndMyDetailsAreCorrect() throws Throwable {
        LoggedInHomeScreen Page = PageFactory.initElements(driver, LoggedInHomeScreen.class);
        Page.clickShoppingCart();

        String ExpectedPrice ="$50.99";
        String ActualPrice =driver.findElement(By.id("product_price_4_16_179388")).getText();
        Assert.assertEquals(ExpectedPrice, ActualPrice);
        System.out.print(ActualPrice);

        ShoppingCartScreen screen = PageFactory.initElements(driver, ShoppingCartScreen.class);
        screen.ConfirmDeliverDetails();

    }

    @When("^I go through all steps to checkout my order$")
    public void i_go_through_all_steps_to_checkout_my_order() throws Throwable {
        ShoppingCartScreen screen = PageFactory.initElements(driver, ShoppingCartScreen.class);
        screen.ClickCheckout1();

        ProceedToCheckOutAddScreen page = PageFactory.initElements(driver, ProceedToCheckOutAddScreen.class);
        page.clickCheckout2();

        ProceedToCheckOutShippScreen Page = PageFactory.initElements(driver, ProceedToCheckOutShippScreen.class);
        Page.ConfirmTermsOfService();
        Page.clickCheckout3();

        ProceedToCheckOut3PM Screen = PageFactory.initElements(driver, ProceedToCheckOut3PM.class);
        Screen.ClickPaymentMethod();
        Screen.ClickConfirmOrder();
    }


    @Then("^my order should be confirmed$")
    public void myOrderShouldBeConfirmed() throws Throwable {
        OrderConfirmationPage page = PageFactory.initElements(driver, OrderConfirmationPage.class);
        page.VerifyConfirmation();
    }
}
