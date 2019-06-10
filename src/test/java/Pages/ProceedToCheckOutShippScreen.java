package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import javax.xml.ws.FaultAction;

public class ProceedToCheckOutShippScreen {
    @FindBy(how= How.ID, using ="cgv" )
    public static WebElement ShippingCheckBox;

    @FindBy(how= How.LINK_TEXT, using ="Proceed to checkout" )
    public static WebElement PTCButton3;

    public void ConfirmTermsOfService(){ShippingCheckBox.click();}
    public void clickCheckout3(){PTCButton3.click();}
}
