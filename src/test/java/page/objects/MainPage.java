package page.objects;

import driver.manager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.waits.WaitForElement;

public class MainPage {

    @FindBy(xpath = "//*[@id=\'SidebarContent\']/a[1]/img")
    private WebElement enterFishLink;

    public MainPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void clickOnEnterFishLink() {
        WaitForElement.waitUntilElementIsClickable(enterFishLink);
        enterFishLink.click();
    }

}