package test_app_bakofamerica;

import atmLocatorPage.atmLocatorPage;
import bankOfAmericaPage.BankOfAmericaPage;
import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

public class TestAtmLocatorPage extends BasePage {
    @Test(priority = 1, groups = {"BAT"}, dataProvider = "searchatmlocatordataprovider")

    public void testSearchAtmLocator(String zip) {

        HomePage homePage = new HomePage();
        BankOfAmericaPage bankOfAmericaPage = new BankOfAmericaPage();
        atmLocatorPage atmlocatorpage = new atmLocatorPage();

        bankOfAmericaPage.clickOnAtmButton();
        atmLocatorPage.searchForAtm(zip);
        Assert.assertTrue(isElementVisible(atmLocatorPage.resultForATM));
    }


    @DataProvider(name = "searchatmlocatordataprovider")
    public String[][] atmLocatorDataProvider() {

        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex = new ExcelData(path);
        String data[][] = ex.readStringArrays("bankofamerica_zip");
        return data;

    }

    @Test(priority = 2, groups = {"BAT"}, dataProvider = "searchinvalidatmlocatordataprovider")
    public void testInvalidSearchAtmLocator(String zip) {

        HomePage homePage = new HomePage();
        BankOfAmericaPage bankOfAmericaPage = new BankOfAmericaPage();
        atmLocatorPage atmLocatorPage = new atmLocatorPage();

        bankOfAmericaPage.clickOnAtmButton();
        atmLocatorPage.searchForAtm(zip);
        Assert.assertTrue(isElementVisible(atmLocatorPage.resultForATM));
    }


    @DataProvider(name = "searchinvalidatmlocatordataprovider")
    public String[][] atmInvalidLocatorDataProvider() {

        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex = new ExcelData(path);
        String data[][] = ex.readStringArrays("invalid_zip");
        return data;
    }
}
