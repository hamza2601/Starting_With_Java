package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    private WebDriver driver;
    private By statusAlert = By.id("flash"); //so what we did here, is that we wanted to verify that message
                                             // in the green bar on the top, so we used it's element id, i.e. flash


    public SecureAreaPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public String getAlertText()
    {
       return driver.findElement(statusAlert).getText(); //returns the text in that banner

    }
}
