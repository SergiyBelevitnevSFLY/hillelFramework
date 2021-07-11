import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.IUALoginPage;

public class LoginIUaTestWithPageObject extends BaseTest {

    @Test
    public void successfulLogin(){
        getDriver().get("https://passport.i.ua/login/");
        IUALoginPage iuaLoginPage = new IUALoginPage(getDriver());
        iuaLoginPage.login("hillel.summer2021@i.ua", "Summer202!");
        Assert.assertTrue(iuaLoginPage.isQuitButtonDisplayed());
    }

    @Test
    public void loginInvalidCredentials(){
        getDriver().get("https://passport.i.ua/login/");
        IUALoginPage iuaLoginPage = new IUALoginPage(getDriver());
        iuaLoginPage.login("hillel.summer2021@i.ua", "Summer202");
        iuaLoginPage.verifyWrongPasswordMessageIsPresent();
    }
}
