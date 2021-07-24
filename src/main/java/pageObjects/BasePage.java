package pageObjects;

import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    protected WebDriver driver;

    @Step("log: {0}")
    public void log(String message){
        System.out.println(message);

//        saveScreenshotPNG();
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshotPNG() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }


    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Method for return WebElement
     * @param locator - locator to find WebElement
     * @return WebElement
     */
    public WebElement getWebElement(By locator){
        return driver.findElement(locator);
    }

    public void sendKeysToLocator(By locator, String text){
        getWebElement(locator).sendKeys(text);
    }

    public void clickByLocator(By locator){
       getWebElement(locator).click();
    }

    public void waitTextToBePresentInElement(By locator, String text){
        WebDriverWait webDriverWait = new WebDriverWait(driver, 3);
        webDriverWait.until(ExpectedConditions.textToBePresentInElementLocated(locator,
                text));
    }

    public boolean isElementDisplayed(By locator){
        return getWebElement(locator).isDisplayed();
    }

    public void dragAndDrop(By from, By to){
        Actions actions = new Actions(driver);
        actions.dragAndDrop(getWebElement(from), getWebElement(to)).release().build().perform();
    }

    public void switchToFrame(By locator){
        driver.switchTo().frame(driver.findElement(locator));
    }
}
