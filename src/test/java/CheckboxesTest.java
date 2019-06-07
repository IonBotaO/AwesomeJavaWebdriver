import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.List;

public class CheckboxesTest {

    WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
        driver = new FirefoxDriver();

    }

    //TODO: find a different way of checking if checkbox is selected


    //TODO: add more scenarios
    @Test
    public void test001() {

       for(int i = 0; i < 10; i++) {
           test002();
           sleep();
       }
    }

    //TODO: refactor into user actions steps


    @Test
    public void test002() {
        openCheckBoxesPage();

        List<WebElement> listOfInputs = driver.findElements(By.tagName("input"));

        int listSize = listOfInputs.size();

        WebElement checkBox1 = listOfInputs.get(0);
        WebElement checkBox2 = listOfInputs.get(1);

        String attributeValue1 = checkBox1.getAttribute("checked");
        String attributeValue2 = checkBox2.getAttribute("checked");

        Assert.assertNull(attributeValue1);
        Assert.assertNotNull(attributeValue2);

        checkBox1.click();

        attributeValue1 = checkBox1.getAttribute("checked");
        Assert.assertNotNull(attributeValue1);

        String expectedAttributeValue = "true";
        Assert.assertEquals(expectedAttributeValue, attributeValue1);
    }

    private void openCheckBoxesPage() {     //open site with CheckBox
        driver.get("https://the-internet.herokuapp.com/checkboxes");
    }

    @Test   // add sleep before close window
    public void sleep() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterSuite     //close the browser
    public void afterSuite() {
        driver.close();
    }

}

// 1:10