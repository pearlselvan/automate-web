package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class DriverUtils {

    public static  WebDriver _driver;


    @BeforeSuite(alwaysRun = true)
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        _driver = new ChromeDriver();

    }



    public static WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        if ( _driver == null) {
            _driver = new ChromeDriver();
        } else {
            System.out.println("Driver is null");


        }
        return _driver;
    }

    @AfterSuite(alwaysRun = true)
    public void tearDown() throws Exception {
        _driver.close();
        _driver.quit();
    }
}
