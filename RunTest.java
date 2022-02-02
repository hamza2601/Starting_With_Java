package TestNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RunTest {
    @BeforeTest
    void setup()
    {
        System.out.println("This is setup");
    }
    @Test
    void login()
    {
        System.out.println("You are logged in");
    }


}
