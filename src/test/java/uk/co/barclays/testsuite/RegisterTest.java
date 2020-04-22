package uk.co.barclays.testsuite;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uk.co.barclays.pages.HomePage;
import uk.co.barclays.pages.RegisterPage;
import uk.co.barclays.testbase.TestBase;

/**
 * Created by Chaitanya
 */
public class RegisterTest extends TestBase {
    HomePage homePage;
    RegisterPage registerPage;


    @BeforeMethod(groups = {"smoke","regression","sanity"})
    public void setUp() {
       homePage = new HomePage();
       registerPage = new RegisterPage();

    }

    @Test(groups = {"smoke","regression"},priority = 3)
    public void verifyUserShouldNavigateToRegisterPage() {
        homePage.clickOnRegisterButton();
        String expectedResult = "Register for Online Banking";
        String actualResult = registerPage.getRegisterText();
        Assert.assertEquals(expectedResult, actualResult);


    }
}
