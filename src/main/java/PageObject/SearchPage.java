package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SearchPage extends BasePage {

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    public SearchPage(WebDriver driver){
        this.driver = driver;
    }
    private By productName = By.cssSelector("[class='rf-serp-productname-link']");

    public void searchProductName () {
        List<WebElement> list_of_product;
        wait.until(ExpectedConditions.visibilityOfElementLocated(productName));
        list_of_product = driver.findElements(productName);
    }
}
