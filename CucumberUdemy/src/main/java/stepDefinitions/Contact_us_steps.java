package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Contact_us_steps {

    private WebDriver driver;

    @Before
    public  void setup(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/java/drivers/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
    }

    @After
    public void TearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Given("I enter in the contact form")
    public void i_enter_in_the_contact_form() throws InterruptedException {
        driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
    }
    @When("I enter the first name")
    public void i_enter_the_first_name() throws InterruptedException {
        driver.findElement(By.name("first_name")).sendKeys("Aitor");
    }
    @And("I enter the last name")
    public void i_enter_the_last_name() {
        driver.findElement(By.name("last_name")).sendKeys("Novoa Alonso");
    }
    @And("I enter the email")
    public void i_enter_the_email() {
        driver.findElement(By.name("email")).sendKeys("aitor@aitor.com");
    }
    @And("I enter the comments")
    public void i_enter_the_comments() throws InterruptedException{
        driver.findElement(By.name("message")).sendKeys("This is my comment.");
        Thread.sleep(3000);
    }
    @And("I click on submit button")
    public void i_click_on_submit_button() {
        driver.findElement(By.xpath("//input[@value='SUBMIT']")).click();
    }
    @Then("a successful message is displayed after submiting the form")
    public void a_successful_message_is_displayed_after_submiting_the_form() {
        //WebElement contactUsSubmitMessage = driver.findElement(By.id("contact_reply"));
        //Assert.assertEquals(contactUsSubmitMessage.getText(), "Thank You for your Message!");
        WebElement contactUsSubmitMessage = driver.findElement(By.xpath("//h1[normalize-space()='Thank You for your Message!']"));
        Assert.assertEquals(contactUsSubmitMessage.getText(), "Thank You for your Message!");

    }

}
