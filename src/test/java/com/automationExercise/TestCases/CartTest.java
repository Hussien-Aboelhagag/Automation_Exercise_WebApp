package com.automationExercise.TestCases;

import Pages.CartPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CartTest extends TestBase{
    CartPage cartPage;
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("validate that registered user can add products or one product to cart")
    public void registeredUserAddToCart(){
        cartPage=new CartPage(driver);
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(cartPage.priceFirstItem.getText(),"Rs. 500");
        softAssert.assertEquals(cartPage.quantityFirstItem.getText(),"3");
        softAssert.assertEquals(cartPage.totalPriceFirstItem.getText(),"Rs. 1500");
        softAssert.assertEquals(cartPage.priceSecondItem.getText(),"Rs. 400");
        softAssert.assertEquals(cartPage.quantitySecondItem.getText(),"1");
        softAssert.assertEquals(cartPage.totalPriceSecondItem.getText(),"Rs. 400");
        softAssert.assertAll();
        cartPage.userDeleteSecondItem();
        cartPage.userCheckout();
    }
}
