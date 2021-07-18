package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogType;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    private WebDriver driver;


//    @BeforeMethod(alwaysRun = true)
//    public void exceptionMock(){
//        Assert.assertTrue(false);
//    }

    @BeforeMethod (alwaysRun = true)
    public void driverSetup(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        setDriver(driver);
    }

    @Step("Allure log: {0}")
    public void allureLog(String message){

        System.out.println(message);
        saveScreenshotPNG();
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshotPNG() {
        return ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
    }

    @AfterMethod( alwaysRun = true)
    public void driverQuit(ITestResult iTestResult){
        if(iTestResult.getStatus()==ITestResult.FAILURE){
            saveScreenshotPNG();
        }
        if(driver!=null) {
            getDriver().quit();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
}
