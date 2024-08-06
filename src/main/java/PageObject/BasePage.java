package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
    //WebDriver driver = new ChromeDriver();
    public static WebDriver driver;

    public void initializeDriver() {
        driver = new ChromeDriver();
    }
}
