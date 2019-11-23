package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FishPage {

    @FindBy(xpath = "//A[text()='FI-SW-01']")
    private WebElement fishID;

    @FindBy(xpath = "//A[@href='/jpetstore/actions/Cart.action?addItemToCart=&workingItemId=EST-2'][text()='Add to Cart']")
    private WebElement addToCartSmallFish;

    @FindBy(xpath = "//A[@href='/jpetstore/actions/Order.action?newOrderForm='][text()='Proceed to Checkout']")
    private WebElement proceedToCheckout;


    private WebDriver driver;

    public FishPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnfishID() {
        fishID.click();
    }

    public void clickOnAddToCartSmallFish(){
        addToCartSmallFish.click();
    }

    public void clickOnProceedToCheckout(){
        proceedToCheckout.click();
    }



}