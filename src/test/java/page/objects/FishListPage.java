package page.objects;

import driver.manager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.waits.WaitForElement;

public class FishListPage {

    @FindBy(css = "tr:nth-child(2) a")
    private WebElement angelfishIdLink;

    public FishListPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void clickOnAngelfishId() {
        WaitForElement.waitUntilElementIsClickable(angelfishIdLink);
        angelfishIdLink.click();
    }
}