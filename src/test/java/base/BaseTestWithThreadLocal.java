package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTestWithThreadLocal {

    private ThreadLocal<WebDriver> WEBDRIVER_CONTAINER = new ThreadLocal<>();

    @BeforeMethod(alwaysRun = true)
    public void driverSetup(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        setDriver(driver);
    }

    @Step("Allure log: {0}")
    public void log(String message){
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

        getDriver().quit();
        WEBDRIVER_CONTAINER.remove();

    }

    public WebDriver getDriver() {
        return WEBDRIVER_CONTAINER.get();
    }

    public void setDriver(WebDriver driver) {
        WEBDRIVER_CONTAINER.set(driver);
    }
}
