package test;

import org.testng.annotations.Test;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;



public class AppleTest extends BaseTest {

    private String find_iPhone = "iPhone 15";

    @Test
    @Epic("Web interface")
    @Feature("Essential features")
    @Story("Поиск подукта")
    public void findProduct () {
        Steps.searchForProduct(find_iPhone);
        Steps.verifyProduct(find_iPhone);
    }
    
}





