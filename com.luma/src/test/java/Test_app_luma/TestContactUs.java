package Test_app_luma;

import base.BasePage;
import contactuspage.ContactUsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestContactUs extends BasePage {


    @Test(priority = 12 , groups = {"BAT"})
    public void testContactUs(){
        ContactUsPage contactUsPage= new ContactUsPage();
        String name= "Auooz";
        String email="goodbook926@gmail.com";
        String phoneNumber= "86542293";
        String comment= "Selenium is fun";
        contactUsPage.doContactUs(name,email,phoneNumber,comment);

        Assert.assertTrue(isElementVisible(contactUsPage.thankYouForContactingUsMessage));
    }
}
