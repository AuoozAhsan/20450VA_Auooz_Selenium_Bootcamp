package Test_app_espn;

import HomePage.espnHomePage;
import base.BasePage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

public class testLogin extends BasePage {

    @Test(priority = 1, groups = {"BAT"}, dataProvider = "login")
    public void testdoSignIn(String email, String password){
        espnHomePage espnHomePage = new espnHomePage();
        espnHomePage.doSignIn(email, password);
    }

    @DataProvider(name="login")
    public Object[][] testSignInUserDataProvider()
    {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex=new ExcelData(path);
        String data[][]=ex.readStringArrays("logIn");
        return data;

    }

}
