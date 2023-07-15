package Test_app_freecrm;

import base.BasePage;
import homepage.Homepage;
import loginpage.DashboardPage;
import loginpage.LoginPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import taskpage.TaskPage;
import utils.ExcelData;

public class TestCreateTasks extends BasePage {
    @Test(priority = 1,groups={"smoke"},dataProvider = "createTaskDataProvider")
    public void testCreateTask(String title){

        Homepage homePage =new Homepage();
        LoginPage loginPage=new LoginPage();
        homePage.clickOnLoginButton();
        String email1 = "sadouni.dalal@gmail.com";
        String password="AydenLiam1213";
        DashboardPage dashboardUserPage= loginPage.doSignIn(email1,password);

        TaskPage tasksPage=dashboardUserPage.hoverClickOnTasksIcon();

        tasksPage.doAddNewTask(title);
        Assert.assertTrue(isElementVisible(tasksPage.titleOfCreatedTask));

    }

    @DataProvider(name="createTaskDataProvider")
    public Object [][] addContactDataProvider() {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex=new ExcelData(path);
        String data[][]=ex.readStringArrays("doAddTasks");
        return data;

    }
}
