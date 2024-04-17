package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

public class Base {
    //variables
  private  WebDriver driver;
  private String URL="https://www.demoblaze.com/";
  protected HomePage homePage;

  @BeforeClass
  public void setUp(){
      driver= new ChromeDriver();
      driver.get(URL);
      homePage= new HomePage(driver);
  }

  //@AfterClass
   // public void exist(){
  //    driver.quit();
  //  }
  }

