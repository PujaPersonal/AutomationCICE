
//***The LoginTest class executes the login test by leveraging the base test class and the login page object.***//

package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.ConfigReader;

public class LoginTest extends BaseTest {

    @Test

    public void testLogin(){
        // Instantiate the LoginPage

        LoginPage loginPage = new LoginPage(driver);
        // Use the ConfigReader to get credentials

        String username = ConfigReader.getUsername();
        String password = ConfigReader.getPassword();

        // Perform the login operation

        loginPage.login(username, password);
        // Add assertions to verify login success

    }
}
