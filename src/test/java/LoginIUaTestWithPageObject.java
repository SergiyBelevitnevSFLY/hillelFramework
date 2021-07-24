import base.BaseTest;
import base.BaseTestWithThreadLocal;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.IUALoginPage;
import pageObjects.IUALoginPageFactory;

public class LoginIUaTestWithPageObject extends BaseTestWithThreadLocal {

    @Test
    public void successfulLogin(){
        getDriver().get("https://passport.i.ua/login/");
        IUALoginPage iuaLoginPage = new IUALoginPage(getDriver());
        iuaLoginPage.login("hillel.summer2021@i.ua", "Summer202!");
        Assert.assertTrue(false);
    }

    @Test
    public void loginInvalidCredentials(){
        getDriver().get("https://passport.i.ua/login/");
        IUALoginPage iuaLoginPage = new IUALoginPage(getDriver());
        iuaLoginPage.login("hillel.summer2021@i.ua", "Summer202");
        iuaLoginPage.verifyWrongPasswordMessageIsPresent();
    }

    @Test
    public void successfulLoginPageFactory(){
        getDriver().get("https://passport.i.ua/login/");
        IUALoginPageFactory iuaLoginPageFactory = new IUALoginPageFactory(getDriver());
        iuaLoginPageFactory.login("hillel.summer2021@i.ua", "Summer202!");
        Assert.assertTrue(iuaLoginPageFactory.isQuitButtonIsDisplayed());
    }
}
