package Test_app_apartments;

import autheticationPage.signInPage;
import base.BasePage;
import Homepage.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;
import javax.swing.*;
import java.io.File;
public class testSignIn extends BasePage {
    @Test(priority= 2, groups= {"BAT"},dataProvider = "signindataprovider")
    public void testUserSignIn(String email,String password){
        signInPage signInPage = new signInPage();
        HomePage homePage = new HomePage();
        homePage.clickOnSignInLink();

        signInPage.doSignIn(email,password);
        Assert.assertTrue(checkElementPresent(homePage.loggedInUsername));
    }

    @DataProvider(name="signindataprovider")
    public Object[][] testSignInUserDataProvider()
    {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex=new ExcelData(path);
        String data[][]=ex.readStringArrays("Signin_apartments");
        return data;

    }
}
