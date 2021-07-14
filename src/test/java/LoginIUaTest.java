import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import static org.assertj.core.api.Assertions.*;
import org.testng.annotations.Test;

public class LoginIUaTest extends BaseTest {


    @Test
    public void loginIUa(){

//        assertThat("string").hasSameSizeAs("wqert");
        getDriver().get("https://passport.i.ua/login/");
        getDriver().findElement(By.xpath("//input[@name='login']")).sendKeys("hillel.summer2021@i.ua");
        getDriver().findElement(By.xpath("//input[@name='pass']")).sendKeys("Summer202!");
        getDriver().findElement(By.xpath("//input[@value='Войти']")).click();


        Assert.assertTrue(
                getDriver().findElement(By.xpath("//a[text()='Выход']")).isDisplayed()
        )
        ;
        System.out.println("");
    }

    @Test
    public void loginWithInvalidCredentials()  {

        getDriver().get("https://passport.i.ua/login/");
        getDriver().findElement(By.xpath("//input[@name='login']")).sendKeys("hillel.summer2021@i.ua");
        getDriver().findElement(By.xpath("//input[@name='pass']")).sendKeys("Summer202!2");
        getDriver().findElement(By.xpath("//input[@value='Войти']")).click();


        WebDriverWait webDriverWait = new WebDriverWait(getDriver(), 1);
        webDriverWait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("lform_errCtrl"),
                "Неверный логин или пароль"));
        System.out.println("");
    }
}
