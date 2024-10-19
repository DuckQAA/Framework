package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class IPhonePage extends BasePage {

    private By hrefField = By.cssSelector("[href='https://www.apple.com/iphone/']");

    public void checkUrl(String expectedUrl) {
        logger.info("проверяем URL");
        waitVisibilityOfElement(hrefField);
        //WebElement href = driver.findElement(hrefField);
        boolean currentUrl = driver.getCurrentUrl().endsWith(expectedUrl);
        Assert.assertTrue(currentUrl, "URL не соответсвует");
    }
}
