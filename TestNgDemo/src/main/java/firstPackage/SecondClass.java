package firstPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SecondClass {
    private WebDriver driver;
    @Test
    public void testEasy() {
        driver.get("http://demo.guru99.com/test/guru99home/");//truy cap trang web nay
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Demo Guru99 Page"));//dieu kien de xem test dung hay sai, neu k phai trang nay thi result = fail
    }
    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");//dua file chromedriver.exe vao thu muc project => k can dong nay

        driver = new ChromeDriver();
    }
    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
