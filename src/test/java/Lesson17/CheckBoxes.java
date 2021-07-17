package Lesson17;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckBoxes extends BaseTest {

    @Test
    private void checkBoxes(){



        getDriver().get("http://the-internet.herokuapp.com/checkboxes");

        WebElement secondCheckBox = getDriver().findElement(By.xpath("//input[2]"));
        System.out.println("The check box " + secondCheckBox.isSelected());

        secondCheckBox.click();

        System.out.println("The check box " + secondCheckBox.isSelected());

    }
}
