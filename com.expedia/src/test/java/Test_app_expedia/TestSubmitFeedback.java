package Test_app_expedia;

import base.BasePage;
import feedbackpage.FeedBackPage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSubmitFeedback extends BasePage {
    @Test(priority = 1, groups = {"Smoke"})
    public void testSubmitFeedback() {
        HomePage homePage = new HomePage();
        FeedBackPage feedBackPage = new FeedBackPage();

        homePage.clickOnFeedBackButton();
        feedBackPage.submitAFeedBack();
        Assert.assertTrue(isElementVisible(feedBackPage.assertFeedbackHeader));
    }
}
