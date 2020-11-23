import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseDemoQA {

    public static void main(String args[]) throws InterruptedException{
        //Define URL of ChromeDriver
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
        // Chi khai bao sai ten ah.... webdriver ma chi ghi la webdrive.....
        //Define Selenium WebDriver
        WebDriver webDriver = new ChromeDriver();
        //Open DemoQA_Login page at Chrome Browser
        webDriver.get("https://demoqa.com/login");
        Thread.sleep(2000);

        //Find By "New User" button
        webDriver.findElement(By.xpath("//button[@id='newUser']")).click();
        Thread.sleep(3000);


        //Input "FirstName = Nhung"into "Firstname" field
        webDriver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Nhung");
        Thread.sleep(3000);

        //Input "LastName = Tran" into "Last Name" field
        webDriver.findElement(By.xpath("//Input[@id='lastname']")).sendKeys("Tran");
        Thread.sleep(3000);

        //Input "UserName=SeleniumUser" into "UserName" field
        webDriver.findElement(By.xpath("//Input[@id='userName']")).sendKeys("SeleniumUser");
        Thread.sleep(3000);

        //Input "PassWord = 12345678" into "Password" field
        webDriver.findElement(By.xpath("//Input[@id='password']")).sendKeys("12345678");
        Thread.sleep(3000);

        //Find By "Register" button
        webDriver.findElement(By.xpath("//button[@id='register']")).click();
        Thread.sleep(3000);

        //Find By "Back to Login" button
        webDriver.findElement(By.xpath("//button[@id='gotologin']")).click();
        Thread.sleep(3000);

        //Close Browser
        //webDriver.quit();
    }
}
