import PageObject.MainPage;
import PageObject.SearchPage;
import org.openqa.selenium.WebDriver;

public class Steps extends BaseTest {

    private MainPage mainPage;
    private SearchPage searchPage;

    public Steps(WebDriver driver) {
        this.mainPage = new MainPage(driver);
        this.searchPage = new SearchPage(driver);
    }

    public  Steps searchForProduct () {
        mainPage.clickSearchButton();
        mainPage.enterSearchText();
        return this;
    }

}
