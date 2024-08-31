package webdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Sleeper;

import java.sql.Time;
import java.util.Timer;

public class test {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
//        String projectPath = System.getProperty("user.dir");
//        System.out.println(projectPath + "\\browserDrivers\\chromedriver.exe");
//        C:\Users\admin\Downloads\Ht\test_VS\chromedriver-win64\chromedriver.exe
//        System.setProperty("webdriver.chrome.driver",  "C:\\Users\\admin\\Downloads\\Ht\\AUTOMATION\\02. Selenium Webdriver\\selenium-webdriver-java-testing\\browserDrivers\\chromedriver.exe");
//        System.setProperty("webdriver.chrome.driver",  "C:\\Users\\admin\\Downloads\\Ht\\test_VS\\chromedriver-win64\\chromedriver.exe");
//        System.setProperty("webdriver.gecko.driver",  "C:\\Users\\admin\\Downloads\\Ht\\AUTOMATION\\02. Selenium Webdriver\\selenium-webdriver-java-testing\\browserDrivers\\geckodriver.exe");
//        System.setProperty("webdriver.gecko.driver", "C:\\New folder\\testSelenium\\browserDrivers\\msedgedriver.exe");
//        System.setProperty("webdriver.gecko.driver", "C:\\New folder\\testSelenium\\browserDrivers\\geckodriver.exe");
//        System.setProperty("webdriver.chrome.driver", "C:\\New folder\\testSelenium\\browserDrivers\\chromedriver.exe");
        System.setProperty("webdriver.edge.driver",  "C:\\Users\\admin\\Downloads\\Ht\\test_VS\\msedgedriver.exe");
//        System.setProperty("webdriver.chrome.port", "3104");
//        System.setProperty("webdriver.chrome.driver",  "C:\\New folder\\testSelenium\\browserDrivers\\chromedriver.exe");
        // Initialize the ChromeDriver
//        ChromeOptions options = new ChromeOptions();
//        WebDriver driver = new ChromeDriver();
//        WebDriver driver = new FirefoxDriver ();
        WebDriver driver = new EdgeDriver();


        // Maximize the browser window
//        driver.manage().window().maximize();

        // Open a website
        driver.get("https://www.google.com");

        // Print the title of the page
        System.out.println("Page title is: " + driver.getTitle());

        // Close the browser
        driver.quit();
        try {
            System.out.println("999999999999999999");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("dddddddddd");
            throw new RuntimeException(e);
        }
    }
}
