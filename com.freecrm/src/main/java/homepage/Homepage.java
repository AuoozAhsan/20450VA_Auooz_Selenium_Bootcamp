package homepage;

import loginpage.DashboardPage;
import loginpage.LoginPage;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BasePage {

    public LoginPage clickOnLoginButton;

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[normalize-space()='Log In']")
    public WebElement loginButton;

    public DashboardPage clickOnLoginButton() {
        safeClickOnElement(loginButton);

        return new DashboardPage();
    }

}


