package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.testng.annotations.Test;
import page.objects.*;

public class Angelfish extends TestBase {

    @Description("Test błędnego logowania")
    @Test
    public void asUserTryToLogInWithIncorrectLoginAndPassword() {

        LandingPage landingPage = new LandingPage();
        landingPage.clickOnEnterStoreLink();

        MainPage mainPage = new MainPage();
        mainPage.clickOnEnterFishLink();

        FishPage fishPage = new FishPage();
        fishPage.clickOnfishID();
        fishPage.clickOnAddToCartSmallFish();
        fishPage.clickOnProceedToCheckout();

//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.typeIntoUserNameField("NotExistingLogin");
//        loginPage.typeIntoPasswordField("NotProperPassword");
//        loginPage.clickOnLoginButton();
//        String warningMessage = loginPage.getWarningMessage();
//
//        assertEquals(warningMessage, "Invalid username or password. Signon failed.");
    }

}