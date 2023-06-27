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
    @Test(priority = 1, groups = "smoke")

    public void testDoSignIn() {

        HomePage homePage = new HomePage();

        homePage.clickOnSignInLink();

        ExcelData excelData = new ExcelData(BasePage.DATA_PATH);
        signInPage signInPage = new signInPage();
        String[][] credentials = excelData.readStringArrays("doSignIn");
        String email = credentials[0][0];
        String password = credentials[0][1];
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='username']")));
        signInPage.doSignIn(email, password);


        Assert.assertTrue(isElementVisible(homePage.userName));
    }

    @DataProvider (name="signupdataprovider")
    public Object[][] testSignupUserDataProvider()
    {

        String path= System.getProperty("user.dir")+"\\resources\\test_data.xlsx";
        ExcelData ex=new ExcelData(path);
        String data[][]=ex.readStringArrays("doSignIn");
        return data;

    }



    @Test(priority = 1, groups = "smoke", dataProvider ="testDoSignIn")

    public void testDoSignIn(String email, String password) {

        HomePage homePage = new HomePage();
        homePage.clickOnSignInLink();

        //ExcelData excelData = new ExcelData(BasePage.DATA_PATH);
        signInPage signInPage = new signInPage();

        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='username']")));
        signInPage.doSignIn(email, password);


        Assert.assertTrue(isElementVisible(homePage.userName));
    }

    @DataProvider(name = "testDoSignIn")
    public Object[][] getDoSigInDataProvider(){
        String path= System.getProperty("user.dir")+ File.separator+ "resources" + File.separator + "test_data.xlsx";;

        ExcelData excelData = new ExcelData(path);
        return excelData.readStringArrays("doSignIn");

    }

}
