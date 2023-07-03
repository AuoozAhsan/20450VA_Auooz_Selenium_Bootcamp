package homepage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class resultPage extends BasePage {
    public resultPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@aria-label='Top Results']")
    public WebElement TopResult;
}
