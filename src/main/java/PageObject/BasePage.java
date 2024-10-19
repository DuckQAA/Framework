package PageObject;

import CoreLayer.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import test.Steps;

import java.time.Duration;

public class BasePage {

    public static WebDriver driver = Browser.getDriver();

    public static final Logger logger = LoggerFactory.getLogger(BasePage.class);

    public WebDriverWait getWebDriverWait() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        return wait;
    }

    public void waitVisibilityOfElement(By element) {
        getWebDriverWait().until(ExpectedConditions.visibilityOfElementLocated(element));
    }
}
