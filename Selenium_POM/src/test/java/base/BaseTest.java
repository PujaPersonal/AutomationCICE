
//*** The BaseTest class handles the setup and teardown processes common to all tests.***//

package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import utils.WebDriverManager;
import utils.ConfigReader;

public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public void setup() {
        // Initialize the WebDriver using WebDriverManager
        driver = WebDriverManager.initializeDriver();
        driver.get(ConfigReader.getURL());
    }

    @AfterClass
    public void tearDown() {
        // Quit the WebDriver if it's not null
        if (driver != null) {
            driver.quit();
        }
    }
}
