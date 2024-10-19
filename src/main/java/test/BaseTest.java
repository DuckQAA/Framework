package test;

import CoreLayer.Browser;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

abstract public class BaseTest {

    @BeforeTest
    public void setUp() {
        Browser.setUpBrowser();
        Browser.openBrowser("https://www.apple.com");
    }

    @AfterTest
    public void tearDown() {
        Browser.quit();
    }
}

