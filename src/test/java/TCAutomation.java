import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TCAutomation {
    public static void main(String args[]) throws InterruptedException {
        //Define URL Browser chromeDriver
        System.setProperty("webdriver.chrome.driver","./driver/chromedriver");
        //Define Selenium WebDriver
        WebDriver webDriver = new ChromeDriver();
        //Open Demoqa.com/automation_practice
        webDriver.get("https://demoqa.com/automation-practice-form");
        Thread.sleep(3000);

        //Input "First Name = Nhung"
        webDriver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Nhung");
        Thread.sleep(3000);

        //Input "Last Name = Tran"
        webDriver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Tran");
        Thread.sleep(3000);

        //Check Placeholder = name@example.com
        //webDriver.findElement(By.xpath("//input[@contains@placeholder='name@example.com']")).sendKeys("name@example.com");

        //Input "Email = nhungtran410@gmail.com"
        webDriver.findElement(By.xpath("//input[@placeholder='name@example.com']")).sendKeys("nhungtran410@gmail.com");
        Thread.sleep(3000);


        //Note This is test testcase

        //Input "Mobile = 0978690028"
        //webDriver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("0978690028");
        //Thread.sleep(3000);

        //Input "Date of Birth = 20 Apr 1984"
        //webDriver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).sendKeys("20 Apr 1984");
        //Thread.sleep(3000);

        //Input

    }


}
