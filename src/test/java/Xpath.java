import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Xpath {

// ПРОВЕРКА КОДА НА EVALUATE!!!
// Чтобы начать проверять код на Evaluate, нужно поставить точку дебага на той строке уоторую хотим проверить,
// нажать дебаг, откроеться окно в браузере, после чего перейти на сайт http://52.9.182.211:3001/v1/log-in
// нажать Evaluate, ввести driver.findElement(By.xpath("//input[@name='restaurant_id']")).sendKeys("sdfgs"); (Мжно ввести другой код)
// и посмотреть что получиться


    WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\TaiVanika\\IdeaProjects\\AwesomeJavaWebdriver\\src\\test\\resources\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @Test
    public void test001() {
        String xpath1 = "";
        //WebElement element = driver.findElement(By.xpath(xpath1));

        String absXpath = "html/body/div[1]/div[2]/div[2]/div[1]/form/div[1]/div/div[1]/div/div/input[1]";

        String relativeXpath = "//form/div[1]/div/div[1]/div/div/input[1]";
        String xpath2 = "//input[@name='restaurant_id']";               //((FirefoxDriver) driver).findElementByXPath("//input[@name='restaurant_id']").sendKeys("asdf");
        String xpath3 = "//input[@name='restaurant_id'][@type='text']";
        String xpath4 = "//input[@name='restaurant_id' and @type='text']";
        String xpath5 = "//input[@name='restaurant_id' or @type='text']";
        String xpath6 = "//input[contains(@name,'taurant')]";
        String xpath7 = "//input[starts-with(@name,'rest')]";
        String xpath8 = "//*[text()='Log In']";                        // Use Log In in ve site http://52.9.182.211:3001/v1/log-in
        String xpath9 = "(//input[@type='text'])[last()]";             // Когда у нас есть несколько трибутов "type = text" => ""((FirefoxDriver) driver).findElementByXPath("(//input[@type='text'])[last()-1]").sendKeys("12346")
        String xpath10 = "(//input[@type='text'])[position()=2]";      // Когда у нас есть несколько трибутов "type = text" =>((FirefoxDriver) driver).findElementByXPath("(//input[@type='text'])[position()=2]").sendKeys("12346")
        String xpath11 = "//input[@type='text'])[2]";
        String xpath12 = "//*[@id='FirstName']/following::input[@type='text']";
        String xpath13 = "//*[@id='LastName']//preceding::input[@type='text']";


    }
}
//
//    WebDriver driver;
//
//    //TODO: run this test in DEBUGGER
//    @BeforeSuite
//    public void beforeSuite() {
//
//
//        System.setProperty("webdriver.gecko.driver", "C:\\Users\\TaiVanika\\IdeaProjects\\AwesomeJavaWebdriver\\src\\test\\resources\\drivers\\geckodriver.exe"); //copy path from geckodriver.exe and put it hire
//
//        driver = new FirefoxDriver();
//    }

//
//    @Test
//    public void test001() {
//        String xpath1 = "";
//        //WebElement element = driver.findElement(By.xpath(xpath1));
//
//        String adsXpath =  "html/body/div[1]/div[2]/div[2]/div[1]/form/div[1]/div/div[1]/div/div/input[1]"; //absolute Xpath
//
//
//        String relativeXpath = "//form/div[1]/div/div[1]/div/div/input[1]";
//        String xpath2 = "//input[@name='restaurant_id']";
//        String xpath3 = "//input[@name='restaurant_id'][@type='text']";
//        String xpath4 = "//input[@name='restaurant_id' and @type='text']";
//        String xpath5 = "//input[@name='restaurant_id' or @type='text']";
//        String xpath6 = "//input[contains(@name,'taurant')]";
//        String xpath7 = "//input[starts-with(@name,'rest')]";
//        String xpath8 = "//*[text()='Log In']";
//        String xpath9 = "(//input[@type='text'])[last()]";
//        String xpath10 = "(//input[@type='text'])[position()=2]";
//        String xpath11 = "//input[@type='text'])[2]";
//        String xpath12 = "//*[@id='FirstName']/following::input[@type='text']";
//        String xpath13 = "//*[@id='LastName']//preceding::input[@type='text']";
//
//        // TODO: copy hire slide Single Slash and go to 30 minute
//    }
//}
