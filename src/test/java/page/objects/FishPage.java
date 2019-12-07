package page.objects;

import driver.manager.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.waits.WaitForElement;

public class FishPage {

    private Logger logger = LogManager.getRootLogger();

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
        logger.info("Clicked on Enter fishID");
    }

    public void clickOnAddToCartSmallFish(){
        WaitForElement.waitUntilElementIsClickable(addToCartSmallFish);
        addToCartSmallFish.click();
        logger.info("Clicked on Enter addToCartSmallFish");
    }

    public void clickOnProceedToCheckout()
    {
        WaitForElement.waitUntilElementIsClickable(proceedToCheckout);
        proceedToCheckout.click();
        logger.info("Clicked on Enter proceedToCheckout");
    }
}