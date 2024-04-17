package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ContactUsPage {
    WebDriver driver;
    By contactEmail = By.id("recipient-email");
    By contactName = By.id("recipient-name");
    By messagee = By.id("message-text");
    By sendMessageBtn = By.xpath("//button[text()='Send message']");
    public ContactUsPage(WebDriver driver){
        this.driver=driver;
    }

    public void fillContactEmail(String email){
       WebElement element = driver.findElement(contactEmail);
        new WebDriverWait(driver, Duration.ofSeconds(100)). until(ExpectedConditions.visibilityOf((element)));
        element.sendKeys(email);
    }

    public void fillContactName(String name){
        WebElement element = driver.findElement(contactName);
        new WebDriverWait(driver, Duration.ofSeconds(100)). until(ExpectedConditions.visibilityOf((element)));
        element.sendKeys(name);
    }

    public void fillMessage(String message){
        WebElement element = driver.findElement(messagee);
        new WebDriverWait(driver, Duration.ofSeconds(100)). until(ExpectedConditions.visibilityOf((element)));
        element.sendKeys(message);
    }

    public void clickSendMessageButton(){
        driver.findElement(sendMessageBtn).click();
    }

    public String getAlertTxt(){
       return driver.switchTo().alert().getText();
    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
}
