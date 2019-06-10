package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShoppingCartScreen {
    @FindBy(how= How.ID, using = "address_delivery")
    public static WebElement DeliveryAddress;

    @FindBy(how= How.LINK_TEXT, using = "Proceed to checkout")
    public static WebElement PTCButton1;

    public void ConfirmDeliverDetails(){DeliveryAddress.getText();}
    public void ClickCheckout1(){PTCButton1.click();}
}
