package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Cart {
    WebDriver driver;
    By placeOrderButton = By.cssSelector("button.btn.btn-success");
    By nameField = By.id("name");
    By countryField = By.id("country");
    By cityField = By.id("city");
    By cardField = By.id("card");
    By monthField = By.id("month");
    By yearField = By.id("year");
    By deleteButton =By.xpath("//a[text()='Delete']");
    By addedProductsTable = By.xpath("//*[@id=\"page-wrapper\"]/div/div[1]/div");
    By purchaseBtn = By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]");
    By closeBtn = By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[1]");

    public Cart(WebDriver driver){
        this.driver=driver;
    }
    public void clickPlaceOrder(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(100)); // Wait for up to 10 seconds
        WebElement placeOrderButtonElement = wait.until(ExpectedConditions.elementToBeClickable(placeOrderButton));
        placeOrderButtonElement.click();
    }
    public void fillNameField(String name){
       WebElement element = driver.findElement(nameField);
        new WebDriverWait(driver, Duration.ofSeconds(100)). until(ExpectedConditions.visibilityOf((element)));
        element.sendKeys(name);

    }

    public void fillCountryField(String country){
        WebElement element = driver.findElement(countryField);
        new WebDriverWait(driver, Duration.ofSeconds(30)). until(ExpectedConditions.visibilityOf((element)));
        element.sendKeys(country);
    }

    public void fillCityField(String city){
        WebElement element = driver.findElement(cityField);
        new WebDriverWait(driver, Duration.ofSeconds(30)). until(ExpectedConditions.visibilityOf((element)));
        element.sendKeys(city);
    }

    public void fillCardField(String card){
        WebElement element = driver.findElement(cardField);
        new WebDriverWait(driver, Duration.ofSeconds(30)). until(ExpectedConditions.visibilityOf((element)));
        element.sendKeys(card);
    }

    public void fillYearField(String year){
        WebElement element = driver.findElement(yearField);
        new WebDriverWait(driver, Duration.ofSeconds(30)). until(ExpectedConditions.visibilityOf((element)));
        element.sendKeys(year);
    }

    public void fillMonthField(String month){
        WebElement element = driver.findElement(monthField);
        new WebDriverWait(driver, Duration.ofSeconds(30)). until(ExpectedConditions.visibilityOf((element)));
        element.sendKeys(month);
    }

    public ThankYouPage clickPurchaseButton(){

        driver.findElement(purchaseBtn).click();
        return new ThankYouPage(driver);
    }
    public void clickDeleteProduct(){
        driver.findElement(deleteButton).click();
}
    public String getProductName(){
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
    wait.until(ExpectedConditions.visibilityOfElementLocated(addedProductsTable));
    String findProductName= driver.findElement(addedProductsTable).getText();
        return findProductName;}
    public void clickCloseButton(){
        driver.findElement(closeBtn).click();
    }

    public String checkAlertTxt(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String alertText = alert.getText();
        return alertText;
    }

    public void acceptAlert(){

        driver.switchTo().alert().accept();
    }
}

