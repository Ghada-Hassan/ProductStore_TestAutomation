package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductDescription;

 public class Base {
    //variables
    private WebDriver driver;
    private String URL = "https://www.demoblaze.com/";
    public HomePage homePage;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.get(URL);
        homePage = new HomePage(driver);
    }
    @AfterClass
     public void exit(){
        driver.quit();
    }
}
