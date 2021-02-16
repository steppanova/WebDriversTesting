import com.stepanova.details.PageHomeBrowser;
import com.stepanova.details.SearchForm;
import com.stepanova.details.WebDriverDemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebDriverDemoTest {
    WebDriverDemo webDriver = new WebDriverDemo();
    SearchForm searchForm;
    PageHomeBrowser page;
    String result;
    WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        page = new PageHomeBrowser(driver);
        page.initialized();
        searchForm = new SearchForm(driver);
        searchForm.setName();
        result = searchForm.findResult();
    }
    @Test
    public void findInBrowse() {
        String title = webDriver.findInBrowse(page.search);
        Assert.assertEquals(result, title);
    }
    @AfterTest
    public void afterSuite() {
        driver.quit();
    }
}
