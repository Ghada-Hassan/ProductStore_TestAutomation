package pages;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Alert;
import java.time.Duration;

public class ProductDescription {
    private WebDriver driver;
    //locators
    private By productName= By.xpath("//*[@id='tbodyid']/h2");
    private By price =By.xpath("//*[@id='tbodyid']/h3");
    private By description =By.xpath("//*[@id='more-information']/p");
    private By image=By.cssSelector("img[src='imgs/galaxy_s6.jpg']");
    private By addToCartButton =By.xpath("//*[@id='tbodyid']/div[2]/div/a");
    public ProductDescription(WebDriver driver){
        this.driver=driver;
    }
    public String getPoductName (){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(productName));
        String findProductName= driver.findElement(productName).getText();
        return findProductName;
    }
    public String getPrice (){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(price));
        String findPrice= driver.findElement(price).getText();
        return findPrice;
    }
    public String getProductDescription (){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(description));
        String findProductDescription= driver.findElement(description).getText();
        return findProductDescription;
    }
    public String getImage (){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(image));
        String findImage= driver.findElement(image).getAttribute("src");
        return findImage;
    }
    public  void getAddToCart(){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(addToCartButton));
        WebElement ClickAddToCartButton =driver.findElement(addToCartButton);
        ClickAddToCartButton.click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
    }
}
