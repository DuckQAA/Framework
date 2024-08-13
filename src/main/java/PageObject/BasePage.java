package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    //WebDriver driver = new ChromeDriver();
    public static WebDriver driver;

    public WebDriverWait getWebDriverWait() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        return wait;
    }

    public void waitVisibilityOfElement(By element) {
        getWebDriverWait().until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public void initializeDriver() {
        driver = new ChromeDriver();
    }
}
