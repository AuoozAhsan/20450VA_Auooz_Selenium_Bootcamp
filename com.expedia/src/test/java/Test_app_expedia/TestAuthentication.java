package Test_app_expedia;

import authentication.LoginPage;
import base.BasePage;
import homepage.HomePage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

public class TestAuthentication extends BasePage {
    @Test(priority = 1, groups = {"BAT"}, dataProvider = "logindataprovider")

    public void testLogin(String email, String password) {
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();


        homePage.clickOnSignInLink();
        homePage.clickOnSignIButton1();
        loginPage.doSignIn(email, password);


        //Assert.assertTrue(isElementVisible(dashboardPage.nameHeader));

    }

    @DataProvider(name = "logindataprovider")
    public String[][] loginDataProvider() {

        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\test_data_expedia.xlsx";
        ExcelData ex = new ExcelData(path);
        String data[][] = ex.readStringArrays("Sign in_expedia");
        return data;

    }
}

