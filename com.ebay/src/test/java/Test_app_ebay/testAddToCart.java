package Test_app_ebay;

import base.BasePage;
import homepage.HomePage;
import org.testng.annotations.Test;
import searchresultpage.SearchResultPage;

public class testAddToCart extends BasePage {
    @Test(priority=1, groups={"smoke"})
    public void testAddToCart(){
        HomePage homePage = new HomePage();
        SearchResultPage searchResultPage = new SearchResultPage();
        String searchTerm = "cat food";
        homePage.doSearch(searchTerm);
        searchResultPage.doAddCart();
        //Assert.assertTrue(isElementVisible(searchResultPage.goToCheckoutButton));
    }
}
