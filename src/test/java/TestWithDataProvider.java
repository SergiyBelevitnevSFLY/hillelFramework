import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestWithDataProvider extends BaseTest {


    @Parameters("stringsForGoogleSearch")
    @Test(dataProvider = "stringsForGoogleSearch", dataProviderClass = NewDataProviderClass.class)
    public void dataProviderTest(String query, String secondValue) throws InterruptedException {
        By searchInput = By.xpath("//input[@title='Search']");
        getDriver().get("http://google.com");
        getDriver().findElement(searchInput).sendKeys(query);

        getDriver().findElement(searchInput).submit();
        Thread.sleep(1000);

        System.out.println("****Second value : " + secondValue);

    }



}
