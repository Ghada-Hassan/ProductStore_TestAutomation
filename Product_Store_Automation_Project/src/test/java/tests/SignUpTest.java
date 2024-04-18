package tests;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignUp;

public class SignUpTest extends Base {

    @Test
    public void testSignUpSuccessfully() throws InterruptedException {
        SignUp signUpPage = homePage.clickSignUp();
        int rand=(int)(Math.random()*500);
        String username = "saharrhamdy"+rand;
        String password = "Sahar2";
        signUpPage.clearUserName();
        signUpPage.clearPassword();
        signUpPage.fillUsernameSignUp(username);
        signUpPage.fillPasswordSignUp(password);
        signUpPage.clickSignUpButton();
        Thread.sleep(2000);
        Assert.assertEquals(signUpPage.checkAlertTxt(), "Sign up successful.");
        signUpPage.acceptAlert();

    }

    @Test
    public void testUserNameAleardyExists() throws InterruptedException {
        SignUp signUpPage= SignUp.refresh();
         signUpPage = homePage.clickSignUp();
        signUpPage.clearUserName();
        signUpPage.clearPassword();
        String username = "saharrhamdy";
        String password = "Sahar2";
        signUpPage.fillUsernameSignUp(username);
        signUpPage.fillPasswordSignUp(password);
        signUpPage.clickSignUpButton();
        Thread.sleep(2000);
        Assert.assertEquals(signUpPage.checkAlertTxt(), "This user already exist.");
        signUpPage.acceptAlert();
        Thread.sleep(2000);
        signUpPage.clickCloseButton();
    }

    @Test
    public void testUserNameNotEmpty() throws InterruptedException {
        SignUp signUpPage = homePage.clickSignUp();
        signUpPage.clearUserName();
        signUpPage.clearPassword();
        String password = "Sahar2";
        signUpPage.fillPasswordSignUp(password);
        signUpPage.clickSignUpButton();
        Thread.sleep(2000);
        Assert.assertEquals(signUpPage.checkAlertTxt(), "Please fill out Username and Password.");
        signUpPage.acceptAlert();
        Thread.sleep(2000);
        signUpPage.clickCloseButton();
    }

    @Test
    public void testPasswordNotEmpty() throws InterruptedException {
        SignUp signUpPage = homePage.clickSignUp();
        signUpPage.clearUserName();
        signUpPage.clearPassword();
        String username = "sahar";
        signUpPage.fillUsernameSignUp(username);
        signUpPage.clickSignUpButton();
        Thread.sleep(2000);
        Assert.assertEquals(signUpPage.checkAlertTxt(), "Please fill out Username and Password.");
        signUpPage.acceptAlert();
        Thread.sleep(2000);
        signUpPage.clickCloseIcon();
    }
    @Test
    public void testInputdNotEmpty() throws InterruptedException {
        SignUp signUpPage = homePage.clickSignUp();
        signUpPage.clearUserName();
        signUpPage.clearPassword();
        String username = "";
        String password = "";
        signUpPage.fillUsernameSignUp(username);
        signUpPage.fillPasswordSignUp(password);
        signUpPage.clickSignUpButton();
        Thread.sleep(2000);
        Assert.assertEquals(signUpPage.checkAlertTxt(), "Please fill out Username and Password.");
        signUpPage.acceptAlert();
        Thread.sleep(2000);
        signUpPage.clickCloseIcon();
    }

}