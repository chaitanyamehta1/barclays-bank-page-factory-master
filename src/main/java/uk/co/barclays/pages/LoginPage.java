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
public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @FindBy(id = "label-mainheading")
    WebElement _loginText;

    public String getLoginText() {
        Reporter.log("Getting Login text " + _loginText.toString() + "<br>");
        log.info("Getting Login text " + _loginText.toString());
        return getTextFromElement(_loginText);
    }


}
