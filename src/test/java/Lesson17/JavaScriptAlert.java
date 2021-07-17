package Lesson17;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptAlert extends BaseTest {

    @Test
    public void javaScriptAlert() throws InterruptedException {

        getDriver().get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement jsForClickAlert = getDriver().findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']"));
        jsForClickAlert.click();

        Alert alert = getDriver().switchTo().alert();
        alert.sendKeys("some keys");

//        Thread.sleep(5000);
        alert.accept();

        getDriver().switchTo().defaultContent();

    }
}
