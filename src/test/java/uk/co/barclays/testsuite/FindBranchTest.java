package uk.co.barclays.testsuite;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uk.co.barclays.pages.FindBranchPage;
import uk.co.barclays.pages.HomePage;
import uk.co.barclays.testbase.TestBase;

/**
 * Created by Chaitanya
 */
public class FindBranchTest extends TestBase {
    HomePage homePage;
    FindBranchPage findBranchPage;

    @BeforeMethod(groups = {"smoke","regression","sanity"})
    public void setUp() {
        homePage = new HomePage();
        findBranchPage = new FindBranchPage();
    }

    @Test(groups = {"smoke","regression"},priority = 1)
    public void verifyUserShouldNavigateToFindABranchFeature() {
        homePage.clickOnFindBranchButton();
        String expectedResult = "Branch Finder";
        String actualResult = findBranchPage.getBranchFinderText();
        Assert.assertEquals(expectedResult, actualResult);


    }
}
