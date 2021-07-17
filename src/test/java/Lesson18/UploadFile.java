package Lesson18;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadFile {

    @Test
    public void uploadFile(){


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/upload");

        WebElement uploadFileElement = driver.findElement(By.id("file-upload"));

        String filePath = System.getProperty("user.dir") + "/geckodriver";
        uploadFileElement.sendKeys(filePath);

        driver.findElement(By.id("file-submit")).click();
    }
}
