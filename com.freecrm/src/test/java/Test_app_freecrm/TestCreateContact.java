package Test_app_freecrm;

import HomePage.Homepage;
import LoginPage.DashboardPage;
import LoginPage.LoginPage;
import base.BasePage;
import createContactPage.CreateContactPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

public class TestCreateContact extends BasePage {

    @Test(priority= 1, groups= {"BAT"},dataProvider = "logindataprovider")

    public void testLogin(String email,String pass){
        Homepage homePage = new Homepage();
        LoginPage loginPage = new LoginPage();
        DashboardPage dashboardPage = new DashboardPage();

        homePage.clickOnLoginButton();

        loginPage.doLogin(email, pass);

        Assert.assertTrue(isElementVisible(dashboardPage.userName));

    }
    @DataProvider(name="logindataprovider")
    public String[][] loginDataProvider()
    {

        String path= System.getProperty("user.dir")+"\resources\test_data.xlsx";
        ExcelData ex=new ExcelData(path);
        String data[][]=ex.readStringArrays("login_crm");
        return data;

    }
    @Test(priority= 1, groups= {"BAT"},dataProvider = "createcontactdataprovider")

    public void testCreateContact(String firstName,String lastName,String middleName, String companyName, String tagName,
                                  String emailAddress,String description, String timeZone, String streetAddress, String city, String state, String zip){
        CreateContactPage createContactPage = new CreateContactPage();
        createContactPage.createNewContact(firstName, lastName, middleName, companyName, tagName, emailAddress, description, timeZone, streetAddress, city, state, zip);

        //Assert.assertTrue(isElementVisible(dashboardPage.nameHeader));

    }
    @DataProvider(name="createcontactdataprovider")
    public String[][] createcontactDataProvider()
    {

        String path= System.getProperty("user.dir")+"\\resources\\createContactPage.xlsx";
        ExcelData ex=new ExcelData(path);
        String data[][]=ex.readStringArrays("createContactPage");
        return data;

    }
}
