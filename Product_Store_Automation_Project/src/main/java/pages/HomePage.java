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

    public HomePage(WebDriver driver){

        this.driver=driver;
    }

public ProductDescription chooseItem(){
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
    wait.until(ExpectedConditions.elementToBeClickable(choosenProduct));
    driver.findElement(choosenProduct).click();
return new ProductDescription(driver);
}
}
