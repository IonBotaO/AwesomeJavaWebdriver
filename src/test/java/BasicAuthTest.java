import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class BasicAuthTest {
    WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\TaiVanika\\IdeaProjects\\AwesomeJavaWebdriver\\src\\test\\resources\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @BeforeMethod
    public  void openBrowser(){
        driver = new FirefoxDriver();
    }


    @Test
    public void test001() {         //true credentials
        String login = "admin";
        String password = "admin";

        openBasicAuthPage(login, password);
        assertThatAuthenticated();
    }

    @Test
    public void test002() {         //false credentials
        String login = "adminasd";
        String password = "adminasd";

        openBasicAuthPage(login, password);
        assertThatAuthenticated();
    }


    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }


    @DataProvider(name = "dataForAuthTest")
    public Object[][] dataForTest() {
        return new Object[][]{
                {"admin", "admin"},
//                {"sadnfdfs", "asdopim"},
        };
    }


    @Test(dataProvider = "dataForAuthTest")//false credentials
    public void test002WithDP(String paramValue1, String paramValue2) {         // "paramValue1"and "paramValue2"is generic name of the values  with came from data provider

        String login = paramValue1;
        String password = paramValue2;

        openBasicAuthPage(login, password);
        assertThatAuthenticated();
    }

    private void assertThatAuthenticated() {
    boolean isContantCongrats = driver.getPageSource().contains("Congrat");
        Assert.assertTrue(isContantCongrats);
    }

    private void openBasicAuthPage(String login, String password) { //this method will be pass to url

        String url = "https://" + login + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth";  // inject login and password into url. Finally url will have this \"admin\", \"admin\""

        driver.get(url);
    }
}


