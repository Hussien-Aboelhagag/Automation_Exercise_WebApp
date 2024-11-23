package com.automationExercise.TestCases;
import Pages.HomePageAfterRegister;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SubscriptionInHomepageTest extends TestBase{
    HomePageAfterRegister homePageAfterRegisterObject;

    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("validate that user can make subscription")
    public void UserSubscriptionInHomePage(){
        homePageAfterRegisterObject=new HomePageAfterRegister(driver);
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,3000)");
        homePageAfterRegisterObject.SubscriptionSteps("hussien@gmail.com");
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(homePageAfterRegisterObject.subscriptionMsg.isDisplayed());
        softAssert.assertEquals(homePageAfterRegisterObject.subscriptionMsg.getText(),
                "You have been successfully subscribed!");
        softAssert.assertAll();
    }
}
