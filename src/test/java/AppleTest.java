import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import PageObject.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AppleTest {

    WebDriver driver = new ChromeDriver();

    @BeforeMethod
    public void setUp() {

            // открываем сайт эпла
            driver.get("https://www.apple.com");
    }

    @Test
    public void searchTest() {
        // клик
        WebElement searchButton = driver.findElement(By.id("globalnav-menubutton-link-search"));
        searchButton.click();

        //WebElement searchField = driver.findElement(By.cssSelector("[class='globalnav-searchfield-input']"));
        //searchField.sendKeys("iphone 15");

        //с ожиданием работает, видимо из за анимации
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement searchField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".globalnav-searchfield-input")));
        searchField.sendKeys("iphone 15");
        searchField.sendKeys(Keys.ENTER);

        WebElement searchText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='rf-serp-productname-link']")));

        String text = searchText.getText();

        String find_iPhone = "iPhone 15";
        if (text.contains(find_iPhone)) {
            System.out.println("Бинго, нашли айфон 15");
        } else {
            System.out.println("не сегодня");
        }
        //[class="rf-serp-productname-link"]

        //Thread.sleep(1000);
        //между этим и серчфилдом[id="globalnav-menubutton-link-search"] + аннотации вместо маина + теория
        //driver.quit();
    }

}




