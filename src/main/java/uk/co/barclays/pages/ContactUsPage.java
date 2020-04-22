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
public class ContactUsPage extends Utility {

    private static final Logger log = LogManager.getLogger(ContactUsPage.class.getName());

    @FindBy(xpath = "//h1[contains(text(),'Contact us')]")
    WebElement _contactUsText;


    public String getContactUsText() {
        Reporter.log("Getting contact us text " + _contactUsText.toString() + "<br>");
        log.info("Getting contact us text " + _contactUsText.toString());
        return getTextFromElement(_contactUsText);
    }


}
