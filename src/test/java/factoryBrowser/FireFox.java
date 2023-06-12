package factoryBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFox implements  IBrowser{
    @Override
    public WebDriver create() {
        System.setProperty("webdriver.gecko.driver","src/test/resources/driver/geckodriver.exe");
        WebDriver firefox = new FirefoxDriver();
        firefox.manage().window().maximize();
        firefox.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return firefox;
    }
}