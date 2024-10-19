package test;

import PageObject.IPhonePage;
import PageObject.MainPage;
import PageObject.SearchPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import io.qameta.allure.testng.*;

//@Listeners({Allure.class})

public class Steps {
    // несколько методов в степ
    private static final Logger logger = LoggerFactory.getLogger(Steps.class);

    private static MainPage mainPage = new MainPage(); ;
    private static SearchPage searchPage = new SearchPage();;
    private static IPhonePage iPhonePage = new IPhonePage();


    public static void searchForProduct (String product) {
        logger.info("Ищем продукт.");
        mainPage.clickSearchButton();
        mainPage.enterSearchText(product);
    }

    public static void verifyProduct (String product) {
        logger.info("Проверка продукта.");
        searchPage.verifySearchResultContains(product);
    }

    public static void verifyToIPhonePage (String expectedUrl) {
        logger.info("проверка перехода на страницу айфона");
        mainPage.clickIPhoneButton();
        iPhonePage.checkUrl(expectedUrl);
    }

}
