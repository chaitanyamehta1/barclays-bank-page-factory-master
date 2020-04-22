package uk.co.barclays.testsuite;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uk.co.barclays.pages.ContactUsPage;
import uk.co.barclays.pages.HomePage;
import uk.co.barclays.testbase.TestBase;

/**
 * Created by Chaitanya
 */
public class ContactUsTest extends TestBase {
    HomePage homePage;
    ContactUsPage contactUsPage;

    @BeforeMethod(groups = {"smoke","regression","sanity"})
    public void setUp() {
        homePage = new HomePage();
        contactUsPage = new ContactUsPage();
    }

    @Test(groups = {"sanity","regression"},priority = 0)
    public void verifyUserShouldNavigateToContactUsFeature() {
        homePage.clickOnContactButton();
        String expectedResult = "Contact us";
        String actualResult = contactUsPage.getContactUsText();
        Assert.assertEquals(expectedResult, actualResult);
    }
}
