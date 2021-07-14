package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    protected WebDriver driver;

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
}
