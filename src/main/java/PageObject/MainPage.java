package PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class MainPage extends BasePage {

    //WebDriver driver;
//    private WebDriver driver;
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//
    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    private By searchButtonSelector = By.id("globalnav-menubutton-link-search");
    private By searchField = By.cssSelector(".globalnav-searchfield-input");

    public void clickSearchButton() {
        WebElement searchButton = driver.findElement(searchButtonSelector);
        searchButton.click();
    }

    public void enterSearchText () {
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchField));
        WebElement searchFieldAction = driver.findElement(searchField);
        searchFieldAction.sendKeys("iphone 15");
        searchFieldAction.sendKeys(Keys.ENTER);
    }







}