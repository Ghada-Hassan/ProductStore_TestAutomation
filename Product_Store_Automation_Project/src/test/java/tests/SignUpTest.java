package tests;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignUp;

public class SignUpTest extends Base {

    @Test
    public void testsignUpSuccessfully() throws InterruptedException {
        SignUp signUpPage = homePage.clickSignUp();
        int rand=(int)(Math.random()*50);
        String username = "saharrhamdy"+rand;
        String password = "Sahar2";
        signUpPage.fillUsernameSignUp(username);
        signUpPage.fillPasswordSignUp(password);
        signUpPage.clickSignUpButton();
        Thread.sleep(2000);
        Assert.assertEquals(signUpPage.checkAlertTxt(), "Sign up successful.");
        signUpPage.acceptAlert();
    }

    @Test
    public void testUserNameAleardyExists() throws InterruptedException {
        SignUp signUpPage = homePage.clickSignUp();
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
        String username = "";
        String password = "Sahar2";
        signUpPage.fillUsernameSignUp(username);
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
        String username = "sahar";
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
    @Test
    public void testInputdNotEmpty() throws InterruptedException {
        SignUp signUpPage = homePage.clickSignUp();
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