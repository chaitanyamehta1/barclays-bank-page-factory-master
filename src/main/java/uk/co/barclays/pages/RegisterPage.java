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
public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    @FindBy(xpath = "//h2[@class='h2 jumbo-title']")
    WebElement _registerText;

    public String getRegisterText() {
        Reporter.log("Getting register text " + _registerText.toString() + "<br>");
        log.info("Clicking register text " + _registerText.toString());
        return getTextFromElement(_registerText);
    }


}
