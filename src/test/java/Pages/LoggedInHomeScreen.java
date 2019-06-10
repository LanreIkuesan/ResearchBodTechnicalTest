package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoggedInHomeScreen {
   @FindBy(how= How.LINK_TEXT, using = "WOMEN")
    public static WebElement Women;

    @FindBy(how= How.CLASS_NAME, using = "shopping_cart")
    public static WebElement ShoppingCart;

   public void clickwomen(){Women.click();}
   public void  clickShoppingCart(){ShoppingCart.click();}
}
