package Test_app_apartments;

import Homepage.HomePage;
import autheticationPage.signUpPage;
import base.BasePage;
import org.testng.annotations.Test;

public class testSignUp extends BasePage {
    @Test(priority = 1, groups = {"smoke"})
    public void testUserSignUp() {
        signUpPage signUpPage = new signUpPage();

        HomePage homePage = new HomePage();
        String firstName="Auooz";
        String lastName="Ahsan";
        String email="auooz.akbar1996@gmail.com";
        String password="Aydin1218";
        homePage.clickOnSignUpButton();
        signUpPage.doSignUp(firstName, lastName, email, password);
        //Assert.assertTrue(checkElementPresent(homePage.loggedInUsername));
    }
}
