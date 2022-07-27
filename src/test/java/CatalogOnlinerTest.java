import TVpage.TVPageObject;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class CatalogOnlinerTest extends BaseTest {

    @Test
    public void SamsungTest() {
        TVPageObject page = new TVPageObject(driver);
        page.openCatalog().openTVPage().selectBrandName();
        Assert.assertTrue(page.isNotSamsung());
    }
}