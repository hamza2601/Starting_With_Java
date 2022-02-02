package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;//need a driver for this class too

    private By usernameField = By.id("username");
    private By passwordField = By.id("password"); //using the element ids here

    private By loginButton = By.cssSelector("#login button");  //we couldn't find any feasible identity element
                                                               // so we typed #login, as that's the name associated with the foprm
                                                               // and followed by button


    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void setUsername(String username)
    {
        driver.findElement(usernameField).sendKeys(username); //type in username

    }

    public void setPassword(String Password)
    {
        driver.findElement(passwordField).sendKeys(Password); //type in password
    }

    public SecureAreaPage clickLoginButton()
    {
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }

}
