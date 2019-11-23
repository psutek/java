package tests;

import driver.manager.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class TestBase {

    @BeforeMethod
    public void beforeTest() {
        DriverManager.getWebDriver();
        DriverUtilis.setInitialConfiguration();
        DriverUtilis.navigateToPage("http://przyklady.javastart.pl/jpetstore/");

    }

    @AfterMethod
    public void afterTest() {
        DriverManager.disposeDriver();
    }

}