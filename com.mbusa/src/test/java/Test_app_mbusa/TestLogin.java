package Test_app_mbusa;

import base.BasePage;
import homepage.HomePage;
import loginpage.LoginPage;
import loginpage.PasswordPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

public class TestLogin extends BasePage {
    @Test(priority = 1, groups = {"BAT"}, dataProvider = "logindataprovider")
    public void testLogin(String email, String password) {
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        PasswordPage passwordPage = new PasswordPage();

        homePage.workFlowLogin();
        loginPage.authenticateEmail(email);
        passwordPage.authenticatePassword(password);

        Assert.assertTrue(isElementVisible(homePage.usernameHeader));


    }


    @DataProvider(name = "logindataprovider")
    public String[][] loginDataProvider() {

        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex = new ExcelData(path);
        String data[][] = ex.readStringArrays("login_mercedes");
        return data;

    }
}
