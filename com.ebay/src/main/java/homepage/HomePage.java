package homepage;

import base.BasePage;
import loginpage.LoginPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import searchresultpage.SearchResultPage;

public class HomePage extends BasePage {

    @FindBy(id = "gh-ac")
    public WebElement inputSearchBar;

    @FindBy (id = "gh-btn")
    public WebElement buttonSearchSubmit;

    @FindBy(xpath = "//span[@id='gh-ug']//a[contains(text(),'Sign in')]")
    public WebElement signInButton;

    @FindBy(xpath = "//button[@id='gh-ug']")
    public WebElement welcomeUserDropdown;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void inputSearchTerm(String searchTerm) {
        sendKeysToElement(inputSearchBar, searchTerm);
    }

    public void clickSearchSubmitButton() {
        safeClickOnElement(buttonSearchSubmit);
    }

    public SearchResultPage doSearch(String searchTerm) {
        inputSearchTerm(searchTerm);
        clickSearchSubmitButton();

        return new SearchResultPage();
    }


    public LoginPage clickOnSignInButton(){
        safeClickOnElement(signInButton);

        return new LoginPage();

    }

}
