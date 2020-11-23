import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

    public static void main(String args[]) throws InterruptedException {
        //Define URL of ChromeDriver
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
        //Define Selenium WebDriver

        WebDriver webDriver = new ChromeDriver();
        //Open Chrome Browser

        webDriver.get("https://www.google.com");
        Thread.sleep(2000);
        webDriver.quit();


    }
}