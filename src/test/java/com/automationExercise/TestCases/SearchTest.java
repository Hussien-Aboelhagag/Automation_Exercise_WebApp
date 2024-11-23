package com.automationExercise.TestCases;

import Pages.HomePageAfterRegister;
import Pages.SearchPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends TestBase{
    String productName="Sleeveless Unicorn Print Fit & Flare Net Dress - Multi";
    SearchPage searchObject;
    HomePageAfterRegister homePageAfterRegisterObject;
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("validate that user can search with full product name validate have picture and the correct price")
    public void UserCanSearchWithProduct(){
        homePageAfterRegisterObject=new HomePageAfterRegister(driver);
        homePageAfterRegisterObject.clickProductsBtn();
        searchObject=new SearchPage(driver);
        searchObject.searchWithProduct(productName);
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[1]/img"))
                .isDisplayed());
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[1]/h2")).getText(),
                "Rs. 1100");
    }
    @Test@Severity(SeverityLevel.CRITICAL)
    @Description("validate that user can search with partial product name and validate have picture and the correct price")
    public void UserCanSearchWithPartialProduct(){
        homePageAfterRegisterObject=new HomePageAfterRegister(driver);
        homePageAfterRegisterObject.clickProductsBtn();
        searchObject=new SearchPage(driver);
        searchObject.searchWithProduct("winter");
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[1]/img"))
                .isDisplayed());
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[1]/h2")).getText(),
                "Rs. 600");
    }
}
