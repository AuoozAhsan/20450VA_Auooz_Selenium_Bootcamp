package HomePage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.Database;

public class espnHomePage extends BasePage {
    public espnHomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@id='global-search-trigger']")
    public WebElement searchInput;
    @FindBy(xpath = "//input[@id='global-search-input']")
    public WebElement searchBarInput;
    @FindBy(xpath = "//input[@type='submit']")
    public WebElement searchButton;

    @FindBy(xpath = "//article[@id='sideLogin-left-rail']//button[@class='button-alt med'][normalize-space()='Log In']")
    public WebElement logInButton;


    @FindBy(xpath = "//input[@id=\"InputIdentityFlowValue\"]")
    public WebElement emailAddressTxTInput;

    @FindBy(xpath = "//button[@id='BtnSubmit']\n")
    public WebElement continueButton;

    @FindBy(xpath = "//input[@id=\"InputPassword\"]\n")
    public WebElement passwordTxtInput;

    @FindBy(xpath = "//button[@id='BtnSubmit']\n")
    public WebElement passwordSubmitButton;


    public void clickSearchInputButton(){
        safeClickOnElement(searchInput);
    }

    public void inputSearchBar(String searchTerm){
        sendKeysToElement(searchBarInput, searchTerm);
    }

    public void clickSearchButton(){
        safeClickOnElement(searchButton);
    }

    public void searchPlayer(String searchTerm){
        clickSearchInputButton();
        inputSearchBar(searchTerm);
        clickSearchButton();
    }

    public void clickLoginButton(){
        safeClickOnElement(logInButton);
    }



    public void inputEmailAddress(String email){
        driver.switchTo().frame("oneid-iframe");
        sendKeysToElement(emailAddressTxTInput, email);
    }

    public void pressContinueButton(){
        safeClickOnElement(continueButton);
    }

    public void inputPassword(String password){
        sendKeysToElement(passwordTxtInput, password);
    }

    public void pressPasswordSubmitButton(){
        safeClickOnElement(passwordSubmitButton);
    }

    public void doSignIn(String email, String password){
        clickLoginButton();
        inputEmailAddress(email);
        pressContinueButton();
        inputPassword(password);
        pressPasswordSubmitButton();
    }


}