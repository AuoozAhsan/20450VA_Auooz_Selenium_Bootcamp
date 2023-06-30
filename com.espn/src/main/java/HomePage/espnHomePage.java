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


}