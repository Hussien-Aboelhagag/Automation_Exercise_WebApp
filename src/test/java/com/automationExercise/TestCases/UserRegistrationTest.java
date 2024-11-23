package com.automationExercise.TestCases;

import Pages.UserRegistrationPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

public class UserRegistrationTest extends TestBase {
    UserRegistrationPage userRegistration;
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("validate that user can register with all mandatory field")
    public void UserRegistrationSuccessfully(){
        userRegistration=new UserRegistrationPage(driver);
        userRegistration.userRegistrationSteps("123456","hussein","Ali",
                "Naser City","Singapore","Cairo","Cairo"
                ,"123456","011111122");
    }
}
