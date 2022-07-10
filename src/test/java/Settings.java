import TVpage.TVPageObject;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Settings {
    private final static String URL_CONNECTION = "https://www.onliner.by/";
    TVPageObject page;
    private WebDriver driver;

    @Before
    public void openConnection() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_CONNECTION);
        page = new TVPageObject(driver);
    }

    @After
    public void closeConnection() {
        driver.quit();
    }
}