package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login {
    WebDriver driver;
    By usernameLogin = By.id("loginusername");
    By passwordLogin = By.id("loginpassword");
    By loginBtn = By.xpath("//button[text()='Log in']");
    By closeBtn = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[1]");
    By welUser = By.id("nameofuser");
    public Login(WebDriver driver){
        this.driver = driver;
    }

    public void fillUsername(String username){
       WebElement element= driver.findElement(usernameLogin);
        new WebDriverWait(driver, Duration.ofSeconds(100)). until(ExpectedConditions.visibilityOf((element)));
        element.sendKeys(username);
    }

    public void fillPassword(String password){
        WebElement element = driver.findElement(passwordLogin);
        new WebDriverWait(driver, Duration.ofSeconds(30)). until(ExpectedConditions.visibilityOf((element)));
        element.sendKeys(password);
    }

    public void clickLoginButton(){
        driver.findElement(loginBtn).click();
    }

    public void ClickCloseButton(){
        driver.findElement(closeBtn).click();
    }

    public String checkLoggedin() throws InterruptedException {
        Thread.sleep(1000);
        WebElement element = driver.findElement(welUser);
        new WebDriverWait(driver, Duration.ofSeconds(300)). until(ExpectedConditions.visibilityOf((element)));

        return element.getText();
    }
    public String checkAlertTxt(){
        return driver.switchTo().alert().getText();
    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

}
