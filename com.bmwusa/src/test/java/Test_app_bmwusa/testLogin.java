package Test_app_bmwusa;

import base.BasePage;
import homepage.HomePage;
import loginpage.LoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

public class testLogin extends BasePage {

    @Test(priority = 1, groups = {"BAT"}, dataProvider = "login")
    public void testdoLogin(String email, String password){
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        homePage.clickOnMyBMWButton();
        loginPage.doLogin(email, password);


    }

    @DataProvider(name="login")
    public Object[][] loginDataProvider()
    {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex=new ExcelData(path);
        String data[][]=ex.readStringArrays("login");
        return data;

    }
}
