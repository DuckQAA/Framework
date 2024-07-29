package PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class MainPage {

    WebDriver driver;

    private By searchButton = By.id("globalnav-menubutton-link-search");
    private By searchField = By.cssSelector(".globalnav-searchfield-input");

    public MainPage (WebDriver driver) {
        this.driver = driver;
    }

    public void clickSearchButton () {

    }

    public void enterSearchText () {

    }

}