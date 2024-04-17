package tests;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Login;

public class LoginTest extends Base {
    String username="ghada";
    String password="ghada";
    @Test
    public void loginSuccessfullyTest() throws InterruptedException {
        Login login = homePage.clickLogin();
        login.fillUsername(username);
        login.fillPassword(password);
        login.clickLoginButton();
        Assert.assertEquals(login.checkLoggedin(),"Welcome "+username);
    }

    @Test
    public void validatePassNotNullTest() throws InterruptedException {
        Login login = homePage.clickLogin();
        login.fillUsername(username);
        login.clickLoginButton();
        Assert.assertEquals(login.checkAlertTxt(),"Please fill out Username and Password.");
        login.acceptAlert();
        Thread.sleep(1000);
        login.ClickCloseButton();
    }

    @Test
    public void validateNameNotNullTest() throws InterruptedException {
        Login login = homePage.clickLogin();
        login.fillPassword(password);
        login.clickLoginButton();
        Assert.assertEquals(login.checkAlertTxt(),"Please fill out Username and Password.");
        login.acceptAlert();
        login.ClickCloseButton();
    }
}
