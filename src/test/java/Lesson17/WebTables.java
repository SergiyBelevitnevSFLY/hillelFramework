package Lesson17;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;

public class WebTables extends BaseTest {

    @Test
    public void webTables() {
        getDriver().get("http://the-internet.herokuapp.com/tables");
        List<WebElement> tableHeaders = getDriver().findElements(By.xpath("//table[1]//th/span"));
        List<String> headerNames = tableHeaders.stream().map(webElement -> webElement.getText()).collect(Collectors.toList());
        int emailIndex = 0;

        allureLog("Handling web table");
        for (int i = 0; i < headerNames.size(); i++) {
            if (headerNames.get(i).equals("Email")) {
                emailIndex = i;
            }
        }

        headerNames.forEach(System.out::println);
        System.out.println("Email index " + emailIndex);
        String emailsXpath = String.format("//table[1]/tbody/tr/td[%s]", emailIndex + 1);

        List<String> emailsValues = getDriver().findElements(By.xpath(emailsXpath)).stream().map(WebElement::getText).collect(Collectors.toList());

        System.out.println("The first email is " + emailsValues.get(0));
        emailsValues.forEach(System.out::println);

    }
}
