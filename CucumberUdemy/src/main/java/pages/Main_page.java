package pages;

import locators.Contact_us_locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main_page {
    public WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/java/drivers/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
    }

    public void tearDown(){
        driver.quit();
    }

    public void accessURL(String url){
        driver.get(url);
    }

    protected void write_field(By typeFind, String text){
        driver.findElement(typeFind).sendKeys(text);
    }

    protected void click_button(By typeFind){
        driver.findElement(typeFind).click();
    }




}
