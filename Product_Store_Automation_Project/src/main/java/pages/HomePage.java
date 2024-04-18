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
    By phoneCat = By.linkText("Phones");
    By laptopsCat = By.linkText("Laptops");
    By monitorCat = By.linkText("Monitors");
    By phonename = By.linkText("Samsung galaxy s6");
    By laptopName = By.linkText("Sony vaio i5");
    By monitorName = By.linkText("Apple monitor 24");




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
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100)); // Wait for up to 10 seconds
        WebElement loginElement = wait.until(ExpectedConditions.elementToBeClickable(loginTxt));
        loginElement.click();
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
    public void navigateToHomePage() {
        driver.get("https://www.demoblaze.com/");
    }
    public void clickPhones(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement phoneCategoryElement = wait.until(ExpectedConditions.elementToBeClickable(phoneCat));
        phoneCategoryElement.click();
    }
    public void clickLaptops(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement lapTopCategoryElement = wait.until(ExpectedConditions.elementToBeClickable(laptopsCat));
        lapTopCategoryElement.click();
    }
    public void clickMonitors(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement monitorCategoryElement = wait.until(ExpectedConditions.elementToBeClickable(monitorCat));
        monitorCategoryElement.click();
    }

    public String checkPhonesAppears(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement phoneElement = wait.until(ExpectedConditions.visibilityOfElementLocated(phonename));
        return phoneElement.getText();
    }

    public String checkLaptopsAppears(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement lapElement = wait.until(ExpectedConditions.visibilityOfElementLocated(laptopName));
        return lapElement.getText();
    }
    public String checkMonitorsAppears(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement monitorElement = wait.until(ExpectedConditions.visibilityOfElementLocated(monitorName));
        return monitorElement.getText();


    }
}



