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
        login.logout();
    }

    @Test
    public void validatePassNotNullTest() throws InterruptedException {
        Login login = homePage.clickLogin();
        login.clearPassword();
        login.fillUsername(username);
        login.clickLoginButton();
        Assert.assertEquals(login.checkAlertTxt(),"Please fill out Username and Password.");
        login.acceptAlert();
        login.ClickCloseButton();
    }

    @Test
    public void validateNameNotNullTest()  {
        Login login;
         login = homePage.clickLogin();
        login.clearUserName();
        login.fillPassword(password);
        login.clickLoginButton();
        Assert.assertEquals(login.checkAlertTxt(),"Please fill out Username and Password.");
        login.acceptAlert();
        login.ClickCloseButton();
    }
}
