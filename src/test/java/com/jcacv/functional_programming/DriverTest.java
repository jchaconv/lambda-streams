package com.jcacv.functional_programming;

import com.jcacv.functional_programming.sec02functionalinterfaces.supplier.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class DriverTest {

    private WebDriver driver;

    /*
    @BeforeTest
    @Parameters("browser")
    public void setDriver(@Optional("chrome") String browser) {
        this.driver = DriverFactory.getDriver(browser);
    }

    @Test
    public void googleTest() {
        this.driver.get("https://google.com/");
    }

    @AfterTest
    public void quitDriver() {
        this.driver.quit();
    }
    */

}
