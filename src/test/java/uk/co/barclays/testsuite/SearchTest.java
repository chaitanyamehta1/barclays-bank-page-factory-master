package uk.co.barclays.testsuite;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uk.co.barclays.pages.HomePage;
import uk.co.barclays.pages.SearchPage;
import uk.co.barclays.testbase.TestBase;

/**
 * Created by Chaitanya
 */
public class SearchTest extends TestBase {
    HomePage homePage;
    SearchPage searchPage;

    @BeforeMethod(groups = {"smoke","regression","sanity"})
    public void setUp() {
        homePage = new HomePage();
        searchPage = new SearchPage();
    }

    @Test(groups = {"smoke","regression"},priority = 4)
    public void verifyUserShouldNavigateToSearchFeature() {
        homePage.clickOnSearchButton();
        String expectedResult = "Search";
        String actualResult = searchPage.getWelcomeText();
        Assert.assertEquals(expectedResult, actualResult);

    }
}
