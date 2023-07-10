package Test_app_verizon;

import base.BasePage;
import homepage.HomePage;
import org.testng.annotations.Test;
import searchpage.SearchPage;

public class testDoSearch extends BasePage {

    @Test(priority = 1, groups = "smoke")
    public void testDoSearch(String searchTerm){
        HomePage homePage = new HomePage();
        SearchPage searchPage = new SearchPage();
        homePage.clickOnSearchButton();
        searchPage.doSearch("iphone");
    }
}
