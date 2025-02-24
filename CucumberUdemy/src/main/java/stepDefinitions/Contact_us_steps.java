package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.Contact_us_page;

public class Contact_us_steps {

    private Contact_us_page contactUsPage;

    @Before
    public  void setup(){
        contactUsPage = new Contact_us_page();
        contactUsPage.setUp();
    }

    @After
    public void TearDown() throws InterruptedException {
        contactUsPage.tearDown();
    }

    @Given("I enter in the contact form")
    public void i_enter_in_the_contact_form() throws InterruptedException {
        contactUsPage.access_contact_url();
    }
    @When("I enter the first name")
    public void i_enter_the_first_name() throws InterruptedException {
        //driver.findElement(By.name("first_name")).sendKeys("Aitor");
        contactUsPage.enter_first_name();
    }
    @And("I enter the last name")
    public void i_enter_the_last_name(){
        contactUsPage.enter_last_name();
    }
    @And("I enter the email")
    public void i_enter_the_email() {
        contactUsPage.enter_email();
    }
    @And("I enter the comments")
    public void i_enter_the_comments() throws InterruptedException{
        contactUsPage.enter_comments();
        Thread.sleep(3000);
    }
    @And("I click on submit button")
    public void i_click_on_submit_button() {
        contactUsPage.click_button_submit();
    }
    @Then("a successful message is displayed after submiting the form")
    public void a_successful_message_is_displayed_after_submiting_the_form() {
        WebElement contactUsSubmitMessage = contactUsPage.driver.findElement(By.id("contact_reply"));
        //Assert.assertEquals(contactUsSubmitMessage.getText(), "Thank You for your Message!");
        //WebElement contactUsSubmitMessage = driver.findElement(By.xpath("//h1[normalize-space()='Thank You for your Message!']"));
        Assert.assertEquals(contactUsSubmitMessage.getText(), "Thank You for your Message!");

    }

}
