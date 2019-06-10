package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProceedToCheckOut3PM {
    @FindBy(how= How.XPATH, using = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div")
    public static WebElement PaymentMethos;

    @FindBy(how= How.XPATH, using = "//*[@id=\"cart_navigation\"]/button")
    public static WebElement ConfirmMyorder;

    public void ClickPaymentMethod(){PaymentMethos.click();}
    public void ClickConfirmOrder(){ConfirmMyorder.click();}
}
