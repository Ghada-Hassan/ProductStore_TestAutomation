package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class AboutUs {
     WebDriver driver;
     By playButton = By.className("vjs-play-control vjs-control vjs-button vjs-paused");
     By pauseButton = By.className("vjs-play-control vjs-control vjs-button vjs-playing");
     By muteVolume = By.className("vjs-mute-control vjs-control vjs-button vjs-vol-0");
     By unMuteVolume = By.className("vjs-mute-control vjs-control vjs-button vjs-vol-3");
     By fullscreenButton = By.xpath("//*[@id='example-video']/div[4]/button[4]");
     By miniscreenButton =By.xpath("//*[@id='example-video']/div[4]/button[4]");
     By picInpicButton =By.xpath("//*[@id='example-video']/div[4]/button[3]");
     By videoIamge= By.xpath("//*[@id='example-video']/div[1]");
     By closeBtn =By.xpath("//*[@id='videoModal']/div/div/div[3]/button");

public AboutUs(WebDriver driver) {
    this.driver = driver;
}
    public void clickvideoImage() {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(videoIamge));
        driver.findElement(videoIamge).click();
    }
public void clickPlayButton() {
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
    wait.until(ExpectedConditions.visibilityOfElementLocated(playButton));
    driver.findElement(playButton).click();
}
public void clickPauseButton() {
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
    wait.until(ExpectedConditions.visibilityOfElementLocated(pauseButton));
    driver.findElement(pauseButton).click();
}
public void clickMuteVolume() {
    driver.findElement(muteVolume).click();
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
    wait.until(ExpectedConditions.visibilityOfElementLocated(muteVolume));
}
public void clickUnMuteVolume() {
    driver.findElement(unMuteVolume).click();
}
public void clickFullscreenButton() {
    driver.findElement(fullscreenButton).click();
}
public void clickMiniscreenButton() {
    driver.findElement(miniscreenButton).click();
}
public void clickPicInpicButton() {
    driver.findElement(picInpicButton).click();
}
public void clickCloseBtn(){
    driver.findElement(closeBtn).click();
}
}
