package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MainPage extends BasePage {

    //WebDriver driver;

    private By searchButtonSelector = By.id("globalnav-menubutton-link-search");
    private By searchField = By.cssSelector(".globalnav-searchfield-input");

    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickSearchButton() {
        WebElement searchButton = driver.findElement(searchButtonSelector);
        searchButton.click();
    }

    public void enterSearchText() {
        waitVisibilityOfElement(searchField);
        WebElement searchFieldAction = driver.findElement(searchField);
        searchFieldAction.sendKeys("iphone 15");
        searchFieldAction.sendKeys(Keys.ENTER);
    }
}