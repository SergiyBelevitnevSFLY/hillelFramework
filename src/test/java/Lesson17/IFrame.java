package Lesson17;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IFrame extends BaseTest {

    @Test(groups = {"TestGroup","Sanity"})
    public void iframe() {


        getDriver().get("http://the-internet.herokuapp.com/iframe");

        getDriver().switchTo().frame(getDriver().findElement(By.id("mce_0_ifr")));

        getDriver().findElement(By.xpath("//p[normalize-space()='Your content goes here.']")).sendKeys("some keys");

        getDriver().switchTo().defaultContent();


    }
}
