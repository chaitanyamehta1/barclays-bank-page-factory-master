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
public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(linkText = "Log In")
    WebElement _loginLink;
    @FindBy(linkText = "Register")
    WebElement _registerLink;
    @FindBy(xpath = "//span[contains(text(),'Contact us')]")
    WebElement _contactUsLink;
    @FindBy(xpath = "//span[contains(text(),'Find a branch')]")
    WebElement _findBranchLink;
    @FindBy(xpath = "//li[@class='search']//span[contains(text(),'Search')]")
    WebElement _searchLink;

    public void clickOnLoginButton() {
        Reporter.log("Clicking on login button " + _loginLink.toString() + "<br>");
        log.info("Clicking on login button " + _loginLink.toString());
        clickOnElement(_loginLink);
    }

    public void clickOnRegisterButton() {
        Reporter.log("Clicking on Register button " + _registerLink.toString() + "<br>");
        log.info("Clicking on Register button " + _registerLink.toString());
        clickOnElement(_registerLink);
    }

    public void clickOnContactButton() {
        Reporter.log("Clicking on contact button " + _contactUsLink.toString() + "<br>");
        log.info("Clicking on contact button " + _contactUsLink.toString());
        clickOnElement(_contactUsLink);
    }

    public void clickOnFindBranchButton() {
        Reporter.log("Clicking on find branch button " + _findBranchLink.toString() + "<br>");
        log.info("Clicking on find bramch button " + _findBranchLink.toString());
        clickOnElement(_findBranchLink);
    }

    public void clickOnSearchButton() {
        Reporter.log("Clicking on search button " + _searchLink.toString() + "<br>");
        log.info("Clicking on search button " + _searchLink.toString());
        clickOnElement(_searchLink);
    }


}
