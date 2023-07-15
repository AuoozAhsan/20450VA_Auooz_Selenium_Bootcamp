package Test_app_mbusa;

import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCompareTwoVehicles extends BasePage {
    @Test(priority = 1, groups = {"Smoke"})
    public void testCompareVehicles(){
        HomePage homePage = new HomePage();
        homePage.compareTwoVehicles();
        Assert.assertTrue(isElementVisible(homePage.featureHighlightsHeader));
    }
}
