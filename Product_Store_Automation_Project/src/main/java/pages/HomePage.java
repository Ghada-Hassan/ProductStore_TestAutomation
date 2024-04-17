package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    By cartButton = By.id("cartur");
    By ProductStoreTxt = By.id("nava");
    By contactTxt= By.xpath("//a[text()='Contact']");
    By loginTxt = By.id("login2");
    public HomePage(WebDriver driver) {
        this.driver=driver;
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
}
