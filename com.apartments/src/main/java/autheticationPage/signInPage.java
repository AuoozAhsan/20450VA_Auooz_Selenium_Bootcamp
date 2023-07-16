package autheticationPage;

import base.BasePage;
import Homepage.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class signInPage extends BasePage {
    @FindBy(xpath="//*[@id='username']")
    public WebElement emailAddressInput;

    @FindBy(xpath ="//*[@id=\"password\"]")
    public WebElement passwordInput;

    @FindBy(xpath ="//*[@id=\"loginButton\"]")
    public WebElement signInButton;

    public signInPage(){
        PageFactory.initElements(driver,this);
    }


    public void enterEmailAddress(String email){
        sendKeysToElement(emailAddressInput,email);
    }
    public void enterPassword(String password){
        sendKeysToElement(passwordInput,password);
    }
    public void clickOnSignInButton(){
        safeClickOnElement(signInButton);
    }

    public HomePage doSignIn(String email, String password){
        enterEmailAddress(email);
        enterPassword(password);
        clickOnSignInButton();
        return new HomePage();
    }
}
