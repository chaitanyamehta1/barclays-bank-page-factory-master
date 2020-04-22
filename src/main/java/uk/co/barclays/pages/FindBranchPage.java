package uk.co.barclays.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.barclays.Utility.Utility;

/**
 * Created by Chaitanya
 */
public class FindBranchPage extends Utility {
    private static final Logger log = LogManager.getLogger(FindBranchPage.class.getName());

    @FindBy(id = "page-title")
    WebElement _branchFinderText;

    public String getBranchFinderText() {
        Reporter.log("Getting branch finder text " + _branchFinderText.toString() + "<br>");
        log.info("Getting branch finder text " + _branchFinderText.toString());
        return getTextFromElement(_branchFinderText);

    }


}
