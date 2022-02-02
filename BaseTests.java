package base;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTests {
    private WebDriver driver;

    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
       // driver.manage().window().maximize(); //will launch the app and maximize it before proceeding
       // driver.manage().window().fullscreen(); //will launch the app make it fullscreen
        driver.manage().window().setSize(new Dimension(400,634)); //will launch in mobile mode
        System.out.println(driver.getTitle());
        //driver.quit(); //closes it quickly
    }

    public static void main(String args[])
    {
        BaseTests test = new BaseTests();
        test.setUp();

    }
}

