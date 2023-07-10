package test_app_bakofamerica;

import bankOfAmericaPage.BankOfAmericaPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLanguage extends BasePage {
    @Test(priority = 1, groups = {"BAT"})
    public void testSwitchLanguages(){
        BankOfAmericaPage bankOfAmericaPage = new BankOfAmericaPage();
        bankOfAmericaPage.clickToSwitchLanguages();
        Assert.assertTrue(isElementVisible(bankOfAmericaPage.languageButton));
    }
}
