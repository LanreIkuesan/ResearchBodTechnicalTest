package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderConfirmationPage {
    @FindBy(how= How.CLASS_NAME, using = "page-heading")
    public static WebElement orderconfirmation;


    public void VerifyConfirmation(){orderconfirmation.isDisplayed();}
}
