package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;



public class MainPage extends BasePage {

    private String headerButton = "[data-globalnav-item-name='%s']";

    private By searchButtonSelector = By.id("globalnav-menubutton-link-search");
    private By searchField = By.cssSelector(".globalnav-searchfield-input");
    //селектор кнопки айфона
    //возможно стоит написать селкьло для всей панели, а "айфон" или другой раздел передавать как параметр в тест*?
    private By iphoneButtonField = By.cssSelector(String.format(headerButton, "iphone"));


    public void clickSearchButton() {
        logger.info("Клик по кнопке поиска");
        waitVisibilityOfElement(searchButtonSelector);
        WebElement searchButton = driver.findElement(searchButtonSelector);
        searchButton.click();
    }

    public void enterSearchText(String product) {
        logger.info("Вводим текст");
        waitVisibilityOfElement(searchField);
        WebElement searchFieldAction = driver.findElement(searchField);
        searchFieldAction.sendKeys(product);
        searchFieldAction.sendKeys(Keys.ENTER);
    }

    public void clickIPhoneButton () {
        logger.info("Кликаем на раздел с айфоном в шапке");
        waitVisibilityOfElement(iphoneButtonField);
        WebElement iphoneButtonFieldAction = driver.findElement(iphoneButtonField);
        iphoneButtonFieldAction.click();
    }
}