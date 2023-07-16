package Test_app_luma;

import authenticationpage.HomePage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFilterTheResult extends BasePage {


    @Test(priority = 10, groups = {"BAT"})

    public void testCategoryResult() {
        HomePage homepage = new HomePage();
        homepage.doFilterTo();
        Assert.assertTrue(isElementVisible(homepage.categoryJacketResult));
    }
}
