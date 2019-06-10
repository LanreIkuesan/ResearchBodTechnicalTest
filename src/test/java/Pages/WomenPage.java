package Pages;

import Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WomenPage extends TestBase {
    @FindBy(how= How.LINK_TEXT, using = "Dresses")
    public static WebElement Dresses;

   @FindBy(how= How.XPATH, using = "//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img")
   public static WebElement RandomProduct;







    public void ClickOnProduct(){RandomProduct.click();}
    public void clickDresses(){Dresses.click();}
}
