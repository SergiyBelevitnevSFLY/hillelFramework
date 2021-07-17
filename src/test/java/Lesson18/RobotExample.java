package Lesson18;

import base.BaseTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class RobotExample extends BaseTest {


    @Test
    public void robotExample() throws AWTException, InterruptedException {

        getDriver().get("http://the-internet.herokuapp.com/infinite_scroll");


        Robot robot = new Robot();
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);

        }
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
    }
}
