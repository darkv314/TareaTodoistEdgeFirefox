package testTodoist;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.Todoist.HomePage;
import pages.Todoist.LoginSection;
import pages.Todoist.MainPage;
import singletonSession.Session;

public class TestBase {
    protected MainPage mainPage= new MainPage();

    protected HomePage homePage = new HomePage();

    protected LoginSection loginSection = new LoginSection();
    @BeforeEach
    public void openBrowser(){
        Session.getSession().goTo("http://todoist.com/");
    }

    @AfterEach
    public void closeBrowser(){
        Session.getSession().closeBrowser();
    }

}
