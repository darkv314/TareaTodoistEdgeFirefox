package pages.Todoist;

import controls.Label;
import org.openqa.selenium.By;

public class HomePage {
    public Label projectSection = new Label(By.xpath("//div[text()='Projects']"));
}
