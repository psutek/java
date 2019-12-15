package tests;

import driver.manager.DriverUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.TmsLink;
import org.testng.annotations.Test;
import page.objects.LoginPage;

import static navigation.ApplicationURLs.LOGIN_URL;

public class PositiveLoginTests extends TestBase {

    @TmsLink("ID-2")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    @Description("The goal of this test is to log in using proper username and password" +
            " and check if Dog Banner is displayed after")
    public void asUserLoginUsingValidLoginAndPassword() {
        DriverUtils.navigateToPage(LOGIN_URL);

        LoginPage loginPage = new LoginPage();
        loginPage
                .typeIntoUserNameField("j2ee")
                .typeIntoPasswordField("j2ee")
                .clickOnLoginButton()
                .package page.objects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import waits.WaitForElement;

import static generic.assertions.AssertWebElement.assertThat;

        public class FooterPage extends BasePage {

            @FindBy(css = "#Banner img[src*='dog']")
            private WebElement bannerAfterLoginLogo;

            @Step("Assert that element dog banner is displayed")
            public FooterPage assertThatDogBannerIsDisplayed() {
                log().info("Checking if dog banner is displayed");
                WaitForElement.waitUntilElementIsVisible(bannerAfterLoginLogo);
                assertThat(bannerAfterLoginLogo).isDisplayed();
                return this;
            }

        }assertThatDogBannerIsDisplayed();
    }

}