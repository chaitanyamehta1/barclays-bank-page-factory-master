package uk.co.barclays.basepage;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Chaitanya
 */
public class BasePage {
    public static WebDriver driver;

    public BasePage() {
        PageFactory.initElements(driver, this);
        PropertyConfigurator.configure(System.getProperty("user.dir") + "/src/test/java/uk/co/barclays/resources/propertiesfile/log4j.properties/");

    }
}
