package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.waits.WaitForElement;

public class LandingPage {

    @FindBy(css = "#Content a")
    private WebElement enterStoreLink;

    public LandingPage() {
        PageFactory.initElements(driver.manager.DriverManager.getWebDriver(), this);
    }

    public void clickOnEnterStoreLink() {
        WaitForElement.waitUntilElementIsClickable(enterStoreLink);
        enterStoreLink.click();
    }

}