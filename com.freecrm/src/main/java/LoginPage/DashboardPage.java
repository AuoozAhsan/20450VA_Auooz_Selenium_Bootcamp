package LoginPage;

import base.BasePage;
import createContactPage.CreateContactPage;
;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class DashboardPage extends BasePage {
    @FindBy(xpath = "//span[@class='user-display']")
    public WebElement userName;

    @FindBy(xpath = "//div[@class='ui basic button floating item dropdown']/i[@class='settings icon']")
    public WebElement settingIcon;

    @FindBy(xpath = "//span[.='Log Out']")
    public WebElement logOutButton;

    @FindBy(xpath = "//i[@class='users icon']")
    public WebElement contactsIcon;
    @FindBy(xpath ="//div[@id='main-nav']/div[3]/button[@class='ui mini basic icon button']")
    public  WebElement addContactButton;

    public DashboardPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnSettingButton(){
        safeClickOnElement(settingIcon);
    }
    public void clickOnLogOutButton(){
        safeClickOnElement(logOutButton);
    }
    public LoginPage doLogOut(){
        clickOnSettingButton();
        clickOnLogOutButton();
        return new LoginPage();
    }

    public void hoverOverContactsIcon(){
        hoverOverElement(contactsIcon);
    }
    public CreateContactPage clickOnAddContactButton(){
        safeClickOnElement(addContactButton);
        return new CreateContactPage();
    }
}
