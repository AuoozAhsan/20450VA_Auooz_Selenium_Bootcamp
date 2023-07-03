package Test_app_espn;

import homepage.espnHomePage;
import homepage.resultPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testSearch extends BasePage {
    @Test(priority = 0, groups = {"BAT"})
    public void testSearch() {
        espnHomePage homePage = new espnHomePage();
        resultPage resultPage = new resultPage();
        String searchTerm = "Tom Braddy";
        homePage.searchPlayer(searchTerm);
        Assert.assertTrue(isElementVisible(resultPage.TopResult));
    }

}
