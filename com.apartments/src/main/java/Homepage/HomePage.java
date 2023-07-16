package Homepage;

import autheticationPage.signInPage;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class HomePage extends BasePage {

    @FindBy(xpath = "//div[@id='username']/button/span")
    public WebElement loggedInUsername;
    @FindBy(xpath = "//a[.='Sign In']")
    public WebElement signInLink;
    public HomePage() {
        PageFactory.initElements(driver, this);
    }



    public signInPage clickOnSignInLink(){
        safeClickOnElement(signInLink);
        return new signInPage();
    }


}
