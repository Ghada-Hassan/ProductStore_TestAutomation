package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignUp {
    static WebDriver driver;
    By usernameSignUp = By.id("sign-username");
    By passwordSignUp = By.id("sign-password");
    By signUpBtn = By.xpath("//button[text()='Sign up']");
    By closeBtn = By.xpath("//*[@id='signInModal']/div/div/div[3]/button[1]");

    By existIcon =By.xpath("//*[@id='signInModal']/div/div/div[1]/button/span");

    public SignUp(WebDriver driver){
        this.driver = driver;
    }
    public void fillUsernameSignUp(String username){
        WebElement element= driver.findElement(usernameSignUp);
        new WebDriverWait(driver, Duration.ofSeconds(100)). until(ExpectedConditions.visibilityOf((element)));
        element.sendKeys(username);
    }

    public void fillPasswordSignUp(String password){
        WebElement element = driver.findElement(passwordSignUp);
        new WebDriverWait(driver, Duration.ofSeconds(30)). until(ExpectedConditions.visibilityOf((element)));
        element.sendKeys(password);
    }
    public void clickSignUpButton(){
        driver.findElement(signUpBtn).click();
    }

    public void clickCloseButton(){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(closeBtn));
        driver.findElement(closeBtn).click();
    }
    public void clickCloseIcon(){

        driver.findElement(existIcon).click();
    }
    public String checkAlertTxt(){

        return driver.switchTo().alert().getText();
    }

    public void acceptAlert(){

        driver.switchTo().alert().accept();
    }
    public void clearUserName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(80));
        WebElement usernameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(usernameSignUp));
        usernameElement.clear();    }
    public void clearPassword(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(80));
        WebElement passElement = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordSignUp));
        passElement.clear();    }
    public static SignUp refresh(){
        driver.navigate().refresh();
        return null;
    }

}
