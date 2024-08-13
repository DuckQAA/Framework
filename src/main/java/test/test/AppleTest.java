import PageObject.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class AppleTest extends BaseTest {

    WebDriver driver = new ChromeDriver();

    private String find_iPhone = "iPhone 15";

    @BeforeMethod
    public void setUp() {

            // открываем сайт эпла
            driver.get("https://www.apple.com");
    }

    @Test
    public void searchTest() {
        // ожидание унес наверх
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));


        By searchButtonSelector = By.id("globalnav-menubutton-link-search");
        WebElement searchButton = driver.findElement(searchButtonSelector);
        searchButton.click();

        //WebElement searchField = driver.findElement(By.cssSelector("[class='globalnav-searchfield-input']"));
        //searchField.sendKeys("iphone 15");

        //с ожиданием работает, видимо из за анимации
        //селекторы отдельно
        By searchField = By.cssSelector(".globalnav-searchfield-input");
        // ожидание отдельно
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchField));
        //поиск отдельно
        WebElement searchFieldAction = driver.findElement(searchField);
        //WebElement searchField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".globalnav-searchfield-input")));

        searchFieldAction.sendKeys("iphone 15");
        searchFieldAction.sendKeys(Keys.ENTER);


        List<WebElement> list_of_product;

        By productName = By.cssSelector("[class='rf-serp-productname-link']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(productName));
        list_of_product = driver.findElements(productName);

        String find_iPhone = "iPhone 15";

        for (WebElement element : list_of_product) {
            String text = element.getText();
            Assert.assertTrue(text.contains(find_iPhone),"не найдено");
//            if (text.contains(find_iPhone)) {
//                System.out.println("Бинго, нашли айфон 15");
//            } else {
//                System.out.println("не сегодня");
//            }
        }
        //driver.quit();
    }
}




