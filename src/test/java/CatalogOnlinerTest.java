import org.junit.Assert;
import org.junit.Test;

public class CatalogOnlinerTest extends Settings {
    @Test
    public void SamsungTest() {
        page.openCatalog();
        page.openTVPage();
        page.selectBrandName();
        Assert.assertTrue(page.isNotSamsung());
    }
}