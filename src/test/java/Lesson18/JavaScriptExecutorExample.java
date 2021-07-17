package Lesson18;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScriptExecutorExample extends BaseTest {

    @Test
    public void jsExecutor() throws InterruptedException {
        getDriver().get("http://the-internet.herokuapp.com/infinite_scroll");
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) getDriver();
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            javascriptExecutor.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        }
    }

    @Test
    public void jsClick() throws InterruptedException {
        getDriver().get("https://demoqa.com/automation-practice-form");
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) getDriver();
        WebElement bookStore = getDriver().findElement(By.xpath("//body/div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']/div[@class='row']/div[1]/div[1]/div[1]/div[6]/span[1]/div[1]/div[2]"));
//       bookStore.click();
        javascriptExecutor.executeScript("arguments[0].click();", bookStore);
        Thread.sleep(1000);
        javascriptExecutor.executeScript("arguments[0].click();", bookStore);
    }
}
