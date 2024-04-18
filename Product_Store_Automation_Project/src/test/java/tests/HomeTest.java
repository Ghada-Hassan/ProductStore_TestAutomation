package tests;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends Base {
    @Test
    public void validateMonitorsTest(){
        homePage.clickMonitors();
        Assert.assertEquals( homePage.checkMonitorsAppears(),"Apple monitor 24");
    }

    @Test
    public void validatePhonesTest(){
        homePage.clickPhones();
        Assert.assertEquals( homePage.checkPhonesAppears(),"Samsung galaxy s6");
    }

    @Test
    public void validateLaptopsTest(){
        homePage.clickLaptops();
        Assert.assertEquals( homePage.checkLaptopsAppears(),"Sony vaio i5");
    }
}
