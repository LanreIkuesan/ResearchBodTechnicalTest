package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductDetailPage {
    @FindBy(how= How.XPATH, using = "//*[@id=\"add_to_cart\"]")
    public static WebElement AddToCart;

    @FindBy(how= How.CLASS_NAME, using = "icon-ok")
    public static WebElement AddToCartSuccessMessage;


    @FindBy(how= How.LINK_TEXT, using = "Add to wishlist")
    public static WebElement wishlistButton;

    @FindBy(how= How.CLASS_NAME, using = "icon-ok")
    public static WebElement CloseCartMesswindow;

    public void AddToCart(){AddToCart.click();}
    public void CloseCartMessageWindow(){CloseCartMesswindow.click();}
    public void verifyAddToCartMessage(){AddToCartSuccessMessage.getText();}
    public void clickaddtomywishlist(){wishlistButton.click();}
}
