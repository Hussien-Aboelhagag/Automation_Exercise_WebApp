package com.automationExercise.TestCases;

import Pages.PlaceOrderPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PlaceOrderTest extends TestBase{
    PlaceOrderPage orderPage;
    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Description("validate that user after payment have his invoice and make sure the payment is accepted")
    public void userCanDownloadInvoices(){
        orderPage=new PlaceOrderPage(driver);
        Assert.assertEquals(orderPage.PaymentMsg.getText(),"Congratulations! Your order has been confirmed!");
        orderPage.userDownloadInvoices();
    }
}
