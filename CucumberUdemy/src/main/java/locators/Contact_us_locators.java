package locators;

import org.openqa.selenium.By;

public class Contact_us_locators {
    public static final String URL_CONTACT_US = "https://www.webdriveruniversity.com/Contact-Us/contactus.html";
    public static final By HEADER = By.name("contacme");
    public static final By FIRST_NAME = By.name("first_name");
    public static final By LAST_NAME = By.name("last_name");
    public static final By EMAIL = By.name("email");
    public static final By COMMENTS = By.name("message");
    public static final By SUBMIT_BUTTON = By.xpath("//input[@value='SUBMIT']");
    public static final By RESET_BUTTON = By.xpath("(//input[@value='RESET']");
    public static final By ERROR_ALL_FIELDS_REQUIRED = By.xpath("/html[1]/body[1]/br[1]");
    public static final By ERROR_INVALID_EMAIL = By.xpath("/html[1]/body[1]/br[2]");
}

