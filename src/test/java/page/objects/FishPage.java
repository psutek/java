package page.objects;

import driver.manager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.waits.WaitForElement;

public class FishPage {

    @FindBy(xpath = "//A[text()='FI-SW-01']")
    private WebElement fishID;

    @FindBy(xpath = "//A[@href='/jpetstore/actions/Cart.action?addItemToCart=&workingItemId=EST-2'][text()='Add to Cart']")
    private WebElement addToCartSmallFish;

    @FindBy(xpath = "//A[@href='/jpetstore/actions/Order.action?newOrderForm='][text()='Proceed to Checkout']")
    private WebElement proceedToCheckout;

    public FishPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void clickOnfishID() {
        WaitForElement.waitUntilElementIsClickable(fishID);
        fishID.click();
    }

    public void clickOnAddToCartSmallFish(){
        WaitForElement.waitUntilElementIsClickable(addToCartSmallFish);
        addToCartSmallFish.click();
    }

    public void clickOnProceedToCheckout()
    {
        WaitForElement.waitUntilElementIsClickable(proceedToCheckout);
        proceedToCheckout.click();
    }
}