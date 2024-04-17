package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    private By choosenProduct= By.xpath("//*[@id='tbodyid']/div[1]/div/div/h4/a");
    By cartButton = By.id("cartur");
    By ProductStoreTxt = By.id("nava");
    By contactTxt= By.xpath("//a[text()='Contact']");
    By loginTxt = By.id("login2");

    public HomePage(WebDriver driver){

        this.driver=driver;
    }

public ProductDescription chooseItem(){
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
    wait.until(ExpectedConditions.elementToBeClickable(choosenProduct));
    driver.findElement(choosenProduct).click();
return new ProductDescription(driver);
 public Cart clickCartButton(){
        driver.findElement(cartButton).click();
        return new Cart(driver);
    }

    public String checkProductStore(){
     return driver.findElement(ProductStoreTxt).getText();
    }

    public ContactUsPage clickContact(){
        driver.findElement(contactTxt).click();
        return new ContactUsPage(driver);
    }

    public Login clickLogin(){
        driver.findElement(loginTxt).click();
        return new Login(driver);
    }
}

}
