package com.automationExercise.TestCases;

import Pages.HomePage;
import Pages.LoginSignUpPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

public class SignupLoginPage extends TestBase{
    HomePage homePage;
    LoginSignUpPage signUpPage;
    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Description("validate that user can register")
    public void testSignUpFieldSuccessfully(){
        homePage=new HomePage(driver);
        homePage.openRegisterLinkElement();
        signUpPage=new LoginSignUpPage(driver);
        signUpPage.chooseSignupButtonSteps("hussien","hussien74424@gmail.com");
    }
}
