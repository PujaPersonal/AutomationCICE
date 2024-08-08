//*** The WebDriverManager class is responsible for initializing the WebDriver.
// You can extend this to support multiple browsers.***//

package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {

    // Set up ChromeDriver (you can extend this to other browsers)

    public static WebDriver initializeDriver(){

        return new ChromeDriver();
    }
}
