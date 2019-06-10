package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login_CreateAccPage {
    @FindBy(how= How.NAME, using = "email")
    public static WebElement email;

    @FindBy(how= How.NAME, using = "passwd")
    public static WebElement Password;

    @FindBy(how= How.NAME, using = "SubmitLogin")
    public static WebElement LoginButton;

    public void TypeLoginEmail(){email.sendKeys("lanre_iwalehin@hotmail.co.uk");}
    public void TypeLoginPassword(){Password.sendKeys("kolodo");}
    public void ClickLoginSubmit(){LoginButton.click();
}}
