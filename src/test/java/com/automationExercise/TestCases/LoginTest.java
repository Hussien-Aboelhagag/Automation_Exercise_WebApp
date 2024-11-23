package com.automationExercise.TestCases;

import Pages.HomePage;
import Pages.HomePageAfterRegister;
import Pages.LoginSignUpPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{
    HomePage homePage;
    LoginSignUpPage loginPage;
    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Description("validate that user can not login with invalid data")
    public void UserLoginWithInvalidData(){
        homePage=new HomePage(driver);
        homePage.openRegisterLinkElement();
        loginPage=new LoginSignUpPage(driver);
        loginPage.loginSteps("hussie@gmail.com","12345");
        Assert.assertEquals(driver.findElement(By.xpath("//p[@style='color: red;']")).getText(),
                "Your email or password is incorrect!");
    }
    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Description("validate that user can login with valid data")
    public void UserLoginWithValidData(){
        homePage=new HomePage(driver);
        homePage.openRegisterLinkElement();
        loginPage=new LoginSignUpPage(driver);
        loginPage.loginSteps("hussien@gmail.com","123456");
        HomePageAfterRegister homePageAfterRegister=new HomePageAfterRegister(driver);
        Assert.assertEquals(homePageAfterRegister.deleteAccountBtn.getText(),
                "Delete Account");
    }
}
