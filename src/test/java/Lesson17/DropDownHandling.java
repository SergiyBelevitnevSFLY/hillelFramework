package Lesson17;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pageObjects.BasePage;

public class DropDownHandling extends BaseTest {

    @Test(groups = {"TestGroup","Sanity"})
    public void dropDownTest(){

        getDriver().get("http://the-internet.herokuapp.com/dropdown");


        WebElement dropDown = getDriver().findElement(By.id("dropdown"));
        Select select = new Select(dropDown);
//        select;

        System.out.println("");
    }
}
