package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.User;

public class IUALoginPage extends BasePage {

    private final By loginField = By.xpath("//input[@name='login']");
    private final By passwordField = By.xpath("//input[@name='pass']");
    private final By submit = By.xpath("//input[@value='Войти']");
    private final By quitButton = By.xpath("//a[text()='Выход']");
    private final By wrongPasswordMessage = By.id("lform_errCtrl");

    public IUALoginPage(WebDriver driver) {

        super(driver);
    }

    private void setLoginFieldText(String login){
        log("Setting login " + login);
        sendKeysToLocator(loginField, login);
    }

    private void setPasswordFieldText(String password){
        log("Setting password " + password);
        sendKeysToLocator(passwordField, password);
    }

    private void clickSubmit(){
        log("Clicking submit");
        clickByLocator(submit);
    }

    public boolean isQuitButtonDisplayed(){
        return isElementDisplayed(quitButton);
    }

    public IUALoginPage login(User user){
        setLoginFieldText(user.getEmail());
        setPasswordFieldText(user.getPassword());
        clickSubmit();

        return this;
    }

    public FirstPageObject verifyWrongPasswordMessageIsPresent(){
        log("Waiting for wrong message to be present");
        waitTextToBePresentInElement(wrongPasswordMessage, "Неверный логин или пароль");
        return new FirstPageObject(driver);
    }
}
