package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutUs {
    private WebDriver driver;
    //locators
    private By playButton = By.className("vjs-play-control vjs-control vjs-button vjs-paused");
    private By pauseButton = By.className("vjs-play-control vjs-control vjs-button vjs-playing");
    private By volumeControl = By.xpath("//input[@class='volume']");
    private By fullscreenButton = By.xpath("//button[@class='fullscreen']");
}
