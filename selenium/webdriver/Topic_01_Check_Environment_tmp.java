package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_01_Check_Environment_tmp {
    WebDriver driver;
    String projectPath = System.getProperty("user.dir");
    String osName = System.getProperty("os.name");

    @BeforeClass
    public void beforeClass() {
//        WebDriver driver;
//        String projectPath = System.getProperty("user.dir");
//        String osName = System.getProperty("os.name");

        if (osName.contains("Windows")) {
//            System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDrivers\\geckodriver.exe");
//            System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Downloads\\Ht\\AUTOMATION\\02. Selenium Webdriver\\selenium-webdriver-java-testing\\browserDrivers\\geckodriver.exe");
//            System.setProperty("webdriver.chrome.driver",  "C:\\Users\\admin\\Downloads\\Ht\\test_VS\\chromedriver-win64\\chromedriver.exe");
            System.setProperty("webdriver.gecko.driver",  "C:\\Users\\admin\\Downloads\\Ht\\test_VS\\geckodriver.exe");
//            System.setProperty("webdriver.edge.driver",  "C:\\Users\\admin\\Downloads\\Ht\\test_VS\\msedgedriver.exe");
        } else {
            System.setProperty("webdriver.gecko.driver", projectPath + "/browserDrivers/geckodriver");
        }


        driver = new ChromeDriver();
        driver = new FirefoxDriver();
        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
    }

    @Test
    public void TC_01_Url() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");
    }

    @Test
    public void TC_02_Logo() {
        Assert.assertTrue(driver.findElement(By.cssSelector("img.fb_logo")).isDisplayed());
    }

    @Test
    public void TC_03_Form() {
        Assert.assertTrue(driver.findElement(By.xpath("//form[@data-testid='royal_login_form']")).isDisplayed());
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}