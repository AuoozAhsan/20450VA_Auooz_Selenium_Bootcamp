package Test_app_expedia;

import base.BasePage;
import flightresultpage.FlightResultPage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearchFlight extends BasePage {
    @Test
    public void testSearchFlight(){
        HomePage homePage = new HomePage();
        FlightResultPage flightResultPage = new FlightResultPage();
        String leavingFrom = "New Orleans";
        String goingTo = "Greece";
        homePage.doFlightSearch(leavingFrom, goingTo);
        Assert.assertTrue(isElementVisible(flightResultPage.cheapestDepartingFlight));

    }
}
