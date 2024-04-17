package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ThankYouPage {
    WebDriver driver;
    By okBtn = By.xpath("/html/body/div[10]/div[7]/div/button");
    By thankYouTxt = By.xpath("//h2[contains(text(), 'Thank you for your purchase!')]");
    public ThankYouPage(WebDriver driver){
        this.driver= driver;
    }
    public String checkThankYou(){
       return driver.findElement(thankYouTxt).getText();
       // return driver.switchTo().alert().getText();
    }

    public HomePage clickOkBtn(){
       driver.findElement(okBtn).click();
        return new HomePage(driver);
    }
}
