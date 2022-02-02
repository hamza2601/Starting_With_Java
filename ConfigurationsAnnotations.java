package TestNG;

import org.testng.annotations.*;

public class ConfigurationsAnnotations {

    @BeforeSuite
    public void beforeSuite()
    {
        //runs before a suite starts
        //setting up system property here
        System.out.println("Chrome - Set up System property");
    }
    @BeforeTest
    public void beforeTest()
    {
        //runs before all test
        System.out.println("Open Chrome");
    }
    @BeforeClass
    public void beforeClass()
    {
     //runs before a test class starts
        System.out.println("Open test application");
    }
    @BeforeMethod
    public void beforeMethod()
    {
        // runs before each @Test method
        //demo that by signing in
        System.out.println("Sign in");

    }
    @Test
    public void searchCustomer()
    {
        //@Test methods run AFTER all @Before methods have been executed
        System.out.println("Search for customer");
    }
    @Test
    public void searchProduct()
    {
        System.out.println("Search for product");
    }
    @AfterMethod
    public void afterMethod()
    {
        //runs after each @Test method
        //can use it to sign out
        System.out.println("Sign out");
    }
    @AfterClass
    public void afterClass()
    {
        //runs after all @Test methods
        System.out.println("Close test application");
    }
    @AfterTest
    public void afterTest()
    {
        //runs after all test methods
        //can use it to close browser, after @Test methods have been completed
        System.out.println("Close Chrome");
    }
    @AfterSuite
    public void AfterSuite()
    {
        System.out.println("Chrome - clean all cookies");
    }
}
