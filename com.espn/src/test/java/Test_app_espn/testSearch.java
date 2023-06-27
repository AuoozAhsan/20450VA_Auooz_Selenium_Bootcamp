package Test_app_espn;

import HomePage.espnHomePage;
import HomePage.resultPage;
import base.BasePage;
import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

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
