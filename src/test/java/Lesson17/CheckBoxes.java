package Lesson17;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckBoxes extends BaseTest {

    @Test(groups = "TestGroup")
    private void checkBoxes(){




        getDriver().get("http://the-internet.herokuapp.com/checkboxes");

        log("OPENING CHECKBOXES");
        WebElement secondCheckBox = getDriver().findElement(By.xpath("//input[2]"));
        System.out.println("The check box " + secondCheckBox.isSelected());

        secondCheckBox.click();

        System.out.println("The check box " + secondCheckBox.isSelected());

    }
}
