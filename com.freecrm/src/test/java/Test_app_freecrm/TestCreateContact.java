package Test_app_freecrm;

import createContactPage.ContactAddedPage;
import homepage.Homepage;
import loginpage.DashboardPage;
import loginpage.LoginPage;
import base.BasePage;
import createContactPage.CreateContactPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

public class TestCreateContact extends BasePage {

    @Test(priority= 2, groups= {"BAT"},dataProvider = "createContactDataProvider")
    public void testDoAddNewContact(String firstName, String lastName,String companyName,String email,
                                    String description, String streetAddress,  String city, String state,String phoneNumber){


        Homepage homePage =new Homepage();

        LoginPage loginPage= new LoginPage();
        homePage.clickOnLoginButton();
        String email1 = "sadouni.dalal@gmail.com";
        String password="AydenLiam1213";
        DashboardPage dashboardUserPage= loginPage.doSignIn(email1,password);
        CreateContactPage createNewContactPage= dashboardUserPage.doClickAddButton();

        ContactAddedPage contactsAddedPage= createNewContactPage.doAddContact(firstName,lastName,companyName,email,description,streetAddress,city,state,phoneNumber);

        Assert.assertTrue(isElementVisible(contactsAddedPage.redIcon));

    }
    @DataProvider(name="createContactDataProvider")
    public Object [][] addContactDataProvider() {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex=new ExcelData(path);
        String data[][]=ex.readStringArrays("createContact_crm1");
        return data;

    }
}
