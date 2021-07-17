package Lesson18;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ActionsExample extends BaseTest {

    @Test
    public void mouseHover() throws InterruptedException {
        getDriver().get("http://the-internet.herokuapp.com/hovers");
        Actions actions = new Actions(getDriver());
        Thread.sleep(3000);
        WebElement elementToHover = getDriver().findElement(By.xpath("//div[@class='figure'][2]"));
        actions.moveToElement(elementToHover).build().perform();
        getDriver().findElement(By.cssSelector("a[href='/users/2']")).click();
    }

    @Test
    public void dragAndDrop() {
        getDriver().get("http://way2automation.com/way2auto_jquery/droppable.php#load_box");
        getDriver().switchTo().frame(getDriver().findElement(By.xpath("//*[@class='demo-frame']")));
        Actions actions = new Actions(getDriver());
        WebElement draggable = getDriver().findElement(By.id("draggable"));
        WebElement droppable = getDriver().findElement(By.id("droppable"));
        actions.dragAndDrop(draggable, droppable).release().build().perform();
    }

    @Test
    public void homeWorkExample() throws InterruptedException {
        getDriver().get("https://demoqa.com/automation-practice-form");
        getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) getDriver();
        Thread.sleep(1000);
        javascriptExecutor.executeScript("window.scrollBy(0,document.body.scrollHeight)");

        getDriver().findElement(By.xpath("//*[@class =' css-yk16xz-control']")).click();
        getDriver().findElement(By.xpath("//div[contains(text(),'NCR')]")).click();

//        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) getDriver();
//        javascriptExecutor.executeScript("arguments[0].click();", getDriver().findElement(By.id("react-select-3-option-2")));
        System.out.println("");
    }
}
