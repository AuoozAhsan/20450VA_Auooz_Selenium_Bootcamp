package Test_app_streeteasy;

import homepage.HomePage;
import base.BasePage;
import marketdatapage.MarketDataPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testBlogDropdown extends BasePage {

    @Test(priority = 1, groups = "smoke")
    public void testDropDownBlog(){
        HomePage homepage = new HomePage();
        MarketDataPage marketDataPage = new MarketDataPage();
        homepage.checkForMarketHeader();
        Assert.assertTrue(isElementVisible(marketDataPage.marketDataHeader));
    }
}
