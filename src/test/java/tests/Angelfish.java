package tests;

import org.testng.annotations.Test;
import page.objects.*;

import static org.testng.AssertJUnit.assertEquals;

public class Angelfish extends TestBase {

    @Test
    public void asUserTryToLogInWithIncorrectLoginAndPassword() {

        LandingPage landingPage = new LandingPage(driver);
        landingPage.clickOnEnterStoreLink();

        MainPage mainPage = new MainPage(driver);
        mainPage.clickOnEnterFishLink();

        FishPage fishPage = new FishPage(driver);
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