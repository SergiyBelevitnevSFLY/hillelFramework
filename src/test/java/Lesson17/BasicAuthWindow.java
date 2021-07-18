package Lesson17;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicAuthWindow extends BaseTest {

    @Test
    public void basicAuthWindow(){

        allureLog("basicAuthWindow handling");

//        driver.get("http://the-internet.herokuapp.com/basic_auth");
        getDriver().get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
                        //Login:Password
        System.out.println("");
        Assert.assertTrue(false);
    }
}
