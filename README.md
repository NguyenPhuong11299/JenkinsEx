# JenkinsEx
link:
https://techmaster.vn/posts/35964/jenkins-tutorial-phan-1-cai-dat-jenkins-bang-docker
https://techmaster.vn/posts/35965/jenkins-tutorial-phan-2-tich-hop-jenkins-voi-github
https://viblo.asia/p/jenkins-basic-trong-automation-testing-RQqKLb9Ol7z


Selenium:
vào chrome xem đang dùng phiên bản nào => download chromedrive tương ứng
hướng dẫn: https://www.guru99.com/maven-jenkins-with-selenium-complete-tutorial.html
kết quả: cửa sổ chrome chỉ hiện ra, truy cập dc vào trang web thì sẽ tự động đóng lại 
=> chỉ xem kết quả test: Total tests run: 1, Passes: 1, Failures: 0, Skips: 0
chú ý: 
SecondClass.java:
  @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "D:\\luyenTap\\chromeDriver\\chromedriver.exe");

        driver = new ChromeDriver();
    }
 pom.xml:
 <dependencies>

        <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>7.4.0</version>
            <scope>compile</scope>
        </dependency>

        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>3.14.0</version>
        </dependency>

        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13.2</version>
            <scope>compile</scope>
        </dependency>


    </dependencies>
    
    <build>
        <pluginManagement>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugins</artifactId>
                <version>3.8.0</version>
                <configuration>
                    <source>1.7</source>
                    <target>1.7</target>
                </configuration>
        </plugin>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-surefire-plugin</artifactId>
            <version>2.22.1</version>
            <inherited>true</inherited>
            <configuration>
                <suiteXmlFiles>
                    <suiteXmlFile>testng.xml</suiteXmlFile>
                </suiteXmlFiles>
            </configuration>
        </plugin>
    </plugins>
        </pluginManagement>
    </build>
