package uk.co.barclays.testsuite;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uk.co.barclays.basepage.BasePage;
import uk.co.barclays.pages.HomePage;
import uk.co.barclays.pages.LoginPage;
import uk.co.barclays.testbase.TestBase;

/**
 * Created by Chaitanya
 */
public class LoginTest extends TestBase {
    HomePage homePage ;
    LoginPage loginPage;

    @BeforeMethod(groups = {"smoke","regression","sanity"})
    public void setUp(){
        homePage = new HomePage();
        loginPage = new LoginPage();

    }@Test(groups = {"smoke","regression"},priority = 2)
    public void verifyUserShouldNavigateToLoginFeature(){
        homePage.clickOnLoginButton();
        String expectedResult = "How would you like to log in?";
        String actualResult = loginPage.getLoginText();
        Assert.assertEquals(expectedResult,actualResult);


    }

}
