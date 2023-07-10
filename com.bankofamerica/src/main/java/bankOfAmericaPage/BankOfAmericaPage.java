package bankOfAmericaPage;

import atmLocatorPage.atmLocatorPage;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankOfAmericaPage extends BasePage {
    public BankOfAmericaPage(){
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = "//div[@class='logo-container']//img[@alt='Bank of America Logo']")
    public WebElement BankOfAmericaLogo;

    @FindBy(xpath = "//a[@id='finCenterLocator']")
    public WebElement atmButton;

    @FindBy(xpath="//a[@id='NAV_EN_ES']")
    public WebElement languageButton;


    public atmLocatorPage clickOnAtmButton() {
        safeClickOnElement(atmButton);

        return new atmLocatorPage();

    }

    public void clickOnSpanishButton(){
        safeClickOnElement(languageButton);
    }
    public void clickOnEnglishButton(){
        safeClickOnElement(languageButton);
    }
    public void clickToSwitchLanguages(){
        clickOnSpanishButton();
        clickOnEnglishButton();
    }
}
