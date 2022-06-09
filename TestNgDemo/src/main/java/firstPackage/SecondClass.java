package firstPackage;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SecondClass {
    private WebDriver driver;
    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.gecko.driver", "D:\\luyenTap\\chromeDriver\\geckodriver.exe");
//        driver = new FirefoxDriver();
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        driver = new FirefoxDriver(capabilities);
    }
    @Test
    public void testEasy() {
        driver.get("http://demo.guru99.com/test/guru99home/");
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Demo Guru99 Page"));
    }
//    @Before
//    public void beforeTest() {
//        System.setProperty("webdriver.gecko.driver", "D:\\luyenTap\\chromeDriver\\geckodriver.exe");
////        driver = new FirefoxDriver();
//        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//        capabilities.setCapability("marionette", true);
//        driver = new FirefoxDriver(capabilities);
//    }
    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
