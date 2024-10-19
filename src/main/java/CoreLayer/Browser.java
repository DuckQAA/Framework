package CoreLayer;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser {

    private static WebDriver driver;

    private Browser() {}

    public static WebDriver getDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void setUpBrowser() {
        getDriver();
    }

    public static void openBrowser(String url) {
        driver.get(url);
    }

    public static void quit() {
        driver.quit();
    }
}
