import base.BaseTest;
import base.BaseTestWithThreadLocal;
import lesson30.FirstHillelListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageObjects.IUALoginPage;
import pageObjects.IUALoginPageFactory;
import utils.User;


//@Listeners(FirstHillelListener.class)
public class LoginIUaTestWithPageObject extends BaseTestWithThreadLocal {

    private final User correctUser = new User("hillel.summer2021@i.ua", "Summer202!");
    private final User incorrectUser = new User("hillel.summer2021@i.ua", "Summer202");

    @Test()
    public void successfulLogin(){
        System.out.println("Thread is "+Thread.currentThread().getId());
        getDriver().get("https://passport.i.ua/login/");
//        String password = System.getProperty("someHillelVariable");
        IUALoginPage iuaLoginPage = new IUALoginPage(getDriver());
        iuaLoginPage.login(correctUser);
    }

    @Test
    public void loginInvalidCredentials(){
        getDriver().get("https://passport.i.ua/login/");
        new IUALoginPage(getDriver())
                .login(incorrectUser)
                .verifyWrongPasswordMessageIsPresent();
//        Assert.assertTrue(false);
    }

    @Test
    public void successfulLoginPageFactory(){
        getDriver().get("https://passport.i.ua/login/");
        IUALoginPageFactory iuaLoginPageFactory = new IUALoginPageFactory(getDriver());
        iuaLoginPageFactory.login("hillel.summer2021@i.ua", "Summer202!");
        Assert.assertTrue(iuaLoginPageFactory.isQuitButtonIsDisplayed());
    }
}
