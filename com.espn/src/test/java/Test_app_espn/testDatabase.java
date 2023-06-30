package Test_app_espn;

import base.BasePage;
import org.testng.annotations.Test;
import utils.Database;

import java.sql.SQLException;

public class testDatabase extends BasePage {

    //espnHomePage espnHomePage;

    @Test(priority = 1)
    public void testDatabase() {

        Database db = new Database(DATA_PATH, DATA_PATH, DATA_PATH, DATA_PATH);

        //region ExecuteQueryReadOne
        String query = "SELECT * FROM ESPN_DATABASE.PLAYER";
        String result = null;
        try {
            result = (String) db.executeQueryReadOne(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        System.out.println(result);
    }
}
