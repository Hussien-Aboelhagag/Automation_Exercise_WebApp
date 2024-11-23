package com.automationExercise.TestCases;

import Pages.PaymentPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

public class PaymentTest extends TestBase{
    PaymentPage paymentPage;
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("validate that user can pay with Visa card")
    public void userEnterCard(){
        paymentPage=new PaymentPage(driver);
        paymentPage.userPayment("Hussein Ali","2020154875","373","02",
                "2028");
    }
}
