package tests;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContactUsPage;

public class ContactTest extends Base {
    String email ="dodo@hassan.com";
    String name = "dodo";
    String message = "hello happy summer";
    @Test
    public void fillContactFormSuccessfullyTest() throws InterruptedException {
        ContactUsPage contactUsPage = homePage.clickContact();
        contactUsPage.fillContactEmail(email);
        contactUsPage.fillContactName(name);
        contactUsPage.fillMessage(message);
        contactUsPage.clickSendMessageButton();
        Assert.assertTrue(contactUsPage.getAlertTxt().contains("Thanks for the message!!"));
        Thread.sleep(1000);
        contactUsPage.acceptAlert();
        Assert.assertTrue(homePage.checkProductStore().contains("PRODUCT STORE"));

    }

    @Test
    public void validateNameIsNull() throws InterruptedException {
        ContactUsPage contactUsPage = homePage.clickContact();
        contactUsPage.fillContactEmail(email);
        contactUsPage.fillMessage(message);
        contactUsPage.clickSendMessageButton();
        Assert.assertTrue(contactUsPage.getAlertTxt().contains("Thanks for the message!!"));
        Thread.sleep(1000);
        contactUsPage.acceptAlert();
        Assert.assertTrue(homePage.checkProductStore().contains("PRODUCT STORE"));

    }

    @Test
    public void validateEmailIsNull() throws InterruptedException {
        ContactUsPage contactUsPage = homePage.clickContact();
        contactUsPage.fillContactName(name);
        contactUsPage.fillMessage(message);
        contactUsPage.clickSendMessageButton();
        Assert.assertTrue(contactUsPage.getAlertTxt().contains("Thanks for the message!!"));
        Thread.sleep(1000);
        contactUsPage.acceptAlert();
        Assert.assertTrue(homePage.checkProductStore().contains("PRODUCT STORE"));

    }

    @Test
    public void validateMessageIsNotNull() throws InterruptedException {
        ContactUsPage contactUsPage = homePage.clickContact();
        contactUsPage.fillContactEmail(email);
        contactUsPage.fillContactName(name);
        contactUsPage.clickSendMessageButton();
        Assert.assertTrue(contactUsPage.getAlertTxt().contains("Thanks for the message!!"));
        Thread.sleep(1000);
        contactUsPage.acceptAlert();
        Assert.assertTrue(homePage.checkProductStore().contains("PRODUCT STORE"));

    }
}
