package com.automationExercise.TestCases;

import Pages.CheckoutPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CheckoutTest extends TestBase{
    CheckoutPage checkoutPage;
    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Description("validate that address and username is correct in Billing")
    public void RegisteredUserCheckout(){
        //test register
        checkoutPage=new CheckoutPage(driver);
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(checkoutPage.totalPrice.getText(),"Rs. 1500");
        softAssert.assertTrue(checkoutPage.usernameInCheckout.getText().contains("hussein"));
        softAssert.assertEquals(checkoutPage.userAddressInCheckout.getText(),"NAsr City");
        softAssert.assertAll();
        checkoutPage.userCheckout("test comment");
    }
}
