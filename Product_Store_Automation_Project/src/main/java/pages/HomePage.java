package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    WebDriver driver;
    By cartButton = By.id("cartur");
    By ProductStoreTxt = By.id("nava");
    By contactTxt= By.xpath("//a[text()='Contact']");
    By loginTxt = By.id("login2");
    By signUpTxt = By.id("signin2");
    By aboutUs= By.xpath("//a[text()='About us']");



    public HomePage(WebDriver driver){

        this.driver=driver;
    }

public ProductDescription chooseItem(By choosenProduct) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    wait.until(ExpectedConditions.elementToBeClickable(choosenProduct));
    driver.findElement(choosenProduct).click();
    return new ProductDescription(driver);
}
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
    public AboutUs clickAboutUS(){
        driver.findElement(aboutUs).click();
        return new AboutUs(driver);
    }
    public SignUp clickSignUp(){
        driver.findElement(signUpTxt).click();
        return new SignUp(driver);
    }
}

