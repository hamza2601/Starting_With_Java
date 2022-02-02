package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class elementLocation {
    private WebDriver driver;
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        //findElement only returns one value
        //lets try multiple values now
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size()); //The o/p in the console shows that 46 elements with the tag a exist

        WebElement inputLinks = driver.findElement(By.linkText("Inputs")); //returns single element --> through by object
        inputLinks.click(); //performing action on element

        //if I search for an element that doesn't exist on the page, I'll get a NoSuchElement exception
        //sometimes we've specified the locator incorrectly





    }
    public void exercise()
    {
        //test exercise
        //click on shifting content --> click on example 1 --> print how many menu elements appear
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        WebElement link1 = driver.findElement(By.linkText("Shifting Content"));
        link1.click(); //first step completed
        WebElement Link2 = driver.findElement(By.linkText("Example 1: Menu Element"));
        Link2.click(); //second step completed here
        List<WebElement> menuItems = driver.findElements(By.tagName("li"));
        System.out.println(menuItems.size());



    }
    public static  void main (String args [])
    {
        elementLocation test = new elementLocation();
        test.setUp();
        test.exercise(); //o/p in console is 5

    }


}
