package test;

import org.testng.annotations.Test;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

public class PageTest extends BaseTest {

    private String expectedUrl = "/iphone/";

    @Test
    @Epic("Web interface")
    @Feature("Essential features")
    @Story("Поиск страницы")
    public void findPage () {
        Steps.verifyToIPhonePage(expectedUrl);
    }
}
