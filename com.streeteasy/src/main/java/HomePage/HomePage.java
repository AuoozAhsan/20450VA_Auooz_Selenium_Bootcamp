package HomePage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {
    @FindBy(xpath = "//a[@aria-label='Blog']")
    public WebElement blogDropdown;

    @FindBy(xpath = "//a[normalize-space()='Market Data']")
    public WebElement marketDataButton;

    @FindBy(xpath = "//a[normalize-space()='Rental Deals']")
    public WebElement rentalDealsButton;

    @FindBy(xpath = "//a[normalize-space()='Sales Deals']")
    public WebElement salesDealsButton;

    @FindBy(xpath = "//a[contains(text(),'First-Time Buyer’s Guide')]")
    public WebElement firstTimeBuyerGuideButton;

    @FindBy(xpath = "//a[@data-gtm-header-menu='Blog'][normalize-space()='Neighborhood Guides']")
    public WebElement neighborhoodGuidesButton;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void blogDropDownMenu(){
        hoverOverElement(blogDropdown);
    }

    public void MarketDataButton(){
        safeClickOnElement(marketDataButton);
    }

    public void RentalDealsButton(WebElement rentalDealsButton) {
        safeClickOnElement(rentalDealsButton);
    }

    public void SalesDealsButton(WebElement salesDealsButton) {
        safeClickOnElement(salesDealsButton);
    }

    public void FirstTimeBuyerGuideButton(WebElement firstTimeBuyerGuideButton) {
        safeClickOnElement(firstTimeBuyerGuideButton);
    }

    public void NeighborhoodGuidesButton(WebElement neighborhoodGuidesButton) {
        safeClickOnElement(neighborhoodGuidesButton);
    }

    public HomePage hoverOver(){
        blogDropDownMenu();
        return new HomePage();
    }
}
