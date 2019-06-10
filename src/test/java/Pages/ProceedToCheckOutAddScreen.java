package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProceedToCheckOutAddScreen {
    @FindBy(how= How.LINK_TEXT, using = "Proceed to Checkout")
    public static WebElement PTCButton2;

    public void clickCheckout2(){PTCButton2.click();}
}
