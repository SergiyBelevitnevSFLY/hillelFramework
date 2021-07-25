import org.testng.annotations.DataProvider;

public class NewDataProviderClass {


    @DataProvider(name = "stringsForGoogleSearch")
    public Object[][] dataProviderMethod(){
        return new Object[][] {{"First-Value", "5"},
                {"Second-Value", "6"},
                {"Hillel","689485649"},
                {"Java", "509w4095"},
                {"Selenium", "8859w48"},
                {"Appium", "ihfie"}};
    }
}
