package Lesson18;

import base.BaseTest;
import org.testng.annotations.Test;
import pageObjects.FirstPageObject;

import java.util.concurrent.TimeUnit;

public class FirstTestWithPageObject extends BaseTest {

    FirstPageObject firstPageObject;

    @Test
    public void firstTestWithPageObject(){
        getDriver().get("http://way2automation.com/way2auto_jquery/droppable.php#load_box");
        getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        firstPageObject = new FirstPageObject(getDriver());
        firstPageObject.dragAndDropInTestApp();
    }
}
