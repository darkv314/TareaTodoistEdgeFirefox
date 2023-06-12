package testTodoist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest extends TestBase {

    @Test
    public void verifyLoginSuccessfully() throws InterruptedException {
        mainPage.loginButton.click();
        loginSection.emailTxtBox.setText("vanetejerina314@gmail.com");
        loginSection.pwdTxtBox.setText("Pass12345");
        loginSection.loginButton.click();


        Assertions.assertTrue(homePage.projectSection.isControlDisplayed(),
                "ERROR!! login was not successfully, review credentials");
        Thread.sleep(5000);
    }
}
