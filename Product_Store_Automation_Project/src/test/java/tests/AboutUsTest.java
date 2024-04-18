package tests;

import base.Base;
import org.testng.annotations.Test;
import pages.AboutUs;

public class AboutUsTest extends Base {

    @Test
    public void aboutUsTest() throws InterruptedException {
        AboutUs aboutUsPage = homePage.clickAboutUS();
        Thread.sleep(2000);
        aboutUsPage.clickvideoImage();
        Thread.sleep(1000);
        aboutUsPage.clickPlayButton();
        Thread.sleep(1000);
        aboutUsPage.clickPauseButton();
        Thread.sleep(1000);
        aboutUsPage.clickMuteVolume();
        Thread.sleep(1000);
        aboutUsPage.clickUnMuteVolume();
        Thread.sleep(1000);
        aboutUsPage.clickFullscreenButton();
        Thread.sleep(1000);
        aboutUsPage.clickMiniscreenButton();
        Thread.sleep(1000);
        aboutUsPage.clickPicInpicButton();
        Thread.sleep(1000);
        aboutUsPage.clickPicInpicButton();
        Thread.sleep(1000);
        aboutUsPage.clickCloseBtn();
    }
}
