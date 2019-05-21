import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearch {

    WebDriver driver;


    @Test
    public void test001() {


        System.setProperty("webdriver.gecko.driver", "C:\\Users\\TaiVanika\\IdeaProjects\\AwesomeJavaWebdriver\\src\\test\\resources\\drivers\\geckodriver.exe"); //copy path from geckodriver.exe and put it hire

        driver = new FirefoxDriver();
        // create step for testing
        openMainPage();
        typeQuery();
        submitSearch();
        waitForResults();
        assertResultPage();
    }



    private void waitForResults() {
        By resultStatsElement = By.id("resultStats");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(resultStatsElement));

    }

    // TODO: add more meaningful assertion (добавить более значимое утверждение)
    private void assertResultPage() {
        WebElement resultStatsElements = driver.findElement(By.id("resultStats"));
        boolean isElementDisplayed = resultStatsElements.isDisplayed();
        boolean expectedResult = true;
        Assert.assertEquals(isElementDisplayed, expectedResult);

        //когда запускаем код, показывает ошибку на 28-й линии, бы делает дебагинг и после чего жмём "Resume Program" она проходит нормально. Оно хотела найти информацию на сайте слишком рано, пока программа не дошла до него.


    }

    private void submitSearch() {
        WebElement searchInput = driver.findElement(By.cssSelector("html body#gsr.hp.vasq.big div#viewport.ctr-p div#searchform.jhp.big form#tsf.tsf.nj div div.A8SBwf div.RNNXgb div.SDkEP div.a4bIc input.gLFyf.gsfi")); //submit search google
        searchInput.submit();
    }

    private void typeQuery() {
        WebElement searchInput = driver.findElement(By.cssSelector("html body#gsr.hp.vasq.big div#viewport.ctr-p div#searchform.jhp.big form#tsf.tsf.nj div div.A8SBwf div.RNNXgb div.SDkEP div.a4bIc input.gLFyf.gsfi")); //insert Путь к CSS from google search (google.com)
        searchInput.sendKeys("portnov computer school"); //introduce search key
    }

    private void openMainPage() {
        String url = "https://google.com";

        driver.get(url);

    }
}


// 1:33 - продебагили вход и ввод текста на google.com