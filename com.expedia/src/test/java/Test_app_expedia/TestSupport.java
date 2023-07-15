package Test_app_expedia;

import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import supportpage.SupportPage;

public class TestSupport extends BasePage {
    @Test(priority=4,groups={"BAT"})
    public void testSupport(){
        HomePage homePage=new HomePage();
        SupportPage supportPage=homePage.clickOnSupportButton();
        supportPage.clickOnChangeBookingButton();
        Assert.assertTrue(isElementVisible(supportPage.enterBookingDetails));
    }
}
