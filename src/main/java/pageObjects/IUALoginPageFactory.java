package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IUALoginPageFactory {


    private WebDriver driver;

    @FindBy(xpath = "//input[@name='login']")
    WebElement loginField;

    @FindBy(xpath = "//input[@name='pass']")
    WebElement passwordField;

    @FindBy(xpath = "//input[@value='Войти']")
    WebElement submit;

    @FindBy(xpath = "//a[text()='Выход']")
    WebElement quitButton;

    @FindBy(id = "lform_errCtrl")
    WebElement wrongPasswordMessage;

    public IUALoginPageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private void setLoginTextField(String login){
        loginField.sendKeys(login);
    }

    private void setPasswordTextField(String password){
        passwordField.sendKeys(password);
    }

    private void clickSubmit(){
        submit.click();
    }

    public boolean isQuitButtonIsDisplayed(){
        return quitButton.isDisplayed();
    }

    public void login(String login, String password){
        setLoginTextField(login);
        setPasswordTextField(password);
        clickSubmit();
    }
}
