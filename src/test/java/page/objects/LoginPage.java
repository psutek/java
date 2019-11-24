package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.waits.WaitForElement;

public class LoginPage {

    @FindBy(name = "username")
    private WebElement usernameField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(name = "signon")
    private WebElement signOnButton;

    @FindBy(css = "#Content ul[class='messages'] li")
    private WebElement messageLabel;

    @FindBy(css = "area[alt='Fish']")
    private WebElement btnFishImage;

    public LoginPage() {
        PageFactory.initElements(driver.manager.DriverManager.getWebDriver(), this);
    }

    public void typeIntoUserNameField(String username) {
        WaitForElement.waitUntilElementsVisible(usernameField);
        usernameField.clear();
        usernameField.sendKeys(username);
    }

    public void typeIntoPasswordField(String password) {
        WaitForElement.waitUntilElementsVisible(passwordField);
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickOnLoginButton() {
        WaitForElement.waitUntilElementIsClickable(signOnButton);
        signOnButton.click();
    }

    public String getWarningMessage() {
        WaitForElement.waitUntilElementsVisible(messageLabel);
        String warningText = messageLabel.getText();
        return warningText;
    }

    public void clickOnFishImageButton() {
        WaitForElement.waitUntilElementIsClickable(btnFishImage);
        btnFishImage.click();
    }
}