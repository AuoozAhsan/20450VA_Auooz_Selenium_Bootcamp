package homepage;

import LoginPage.LoginPage;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BasePage {

    @FindBy(xpath = "//span[.='Log In']")
    public WebElement loginButton;

    public Homepage() {

        PageFactory.initElements(driver, this);
    }
    public LoginPage clickOnLoginButton() {

        safeClickOnElement(loginButton);
        return new LoginPage();
    }

    }


