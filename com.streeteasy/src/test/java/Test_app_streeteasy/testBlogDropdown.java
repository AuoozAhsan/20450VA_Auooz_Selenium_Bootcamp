package Test_app_streeteasy;

import HomePage.HomePage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testBlogDropdown extends BasePage {

    HomePage HomePage;

    @Test(priority = 1, groups = "smoke")
    public void testDropDownBlog(){
        HomePage homePage = new HomePage();
       // Assert.assertTrue(isElementVisible());
    }
}
