package page.objects;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.waits.WaitForElement;




public class LoginPage {

    private Logger logger = LogManager.getRootLogger();

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
        logger.info("Send keys to usernameField");
    }

    public void typeIntoPasswordField(String password) {
        WaitForElement.waitUntilElementsVisible(passwordField);
        passwordField.clear();
        passwordField.sendKeys(password);
        logger.info("Send keys to passwordField");
    }

    public void clickOnLoginButton() {
        WaitForElement.waitUntilElementIsClickable(signOnButton);
        signOnButton.click();
        logger.info("Click on signOnButton");
    }

    public String getWarningMessage() {
        WaitForElement.waitUntilElementsVisible(messageLabel);
        String warningText = messageLabel.getText();
        logger.info("Get warning text", warningText);
        return warningText;
    }

    public void clickOnFishImageButton() {
        WaitForElement.waitUntilElementIsClickable(btnFishImage);
        btnFishImage.click();
        logger.info("Click on btnFishImage");
    }
}