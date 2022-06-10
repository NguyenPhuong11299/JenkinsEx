package firstPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
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
        System.setProperty("webdriver.chrome.driver", "chromedriver");//dua file chromedriver.exe vao thu muc project => k can dong nay
//
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        // set chrome as Headless
        options.setHeadless(true);
        //Hoặc này
        //options.addArguments("--headless");

        //Khởi tạo Chrome Driver với options trên
        driver = new ChromeDriver(options);

//        driver = new ChromeDriver();
    }
    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
