package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import org.testng.Assert;

public class SearchPage extends BasePage {

    //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    private By productName = By.cssSelector("[class='rf-serp-productname-link']");

//    public SearchPage(WebDriver driver){
//        this.driver = driver;
//    }

    public List<WebElement> getProductNameList() {
        logger.info("получаем список");
        waitVisibilityOfElement(productName);
        List<WebElement> list_of_product = driver.findElements(productName);
        return list_of_product;
    }
    public void verifySearchResultContains(String productName) {
        logger.info("проверяем соответствие");
        //String find_iPhone = "iPhone 15"; //в тесте
        for (WebElement element : getProductNameList()) {
            String text = element.getText();
            Assert.assertTrue(text.contains(productName), "не найдено");
        }
    }
}
