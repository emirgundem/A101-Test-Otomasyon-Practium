package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class alertButtonTest {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/alerts");

        /*
        WebElement alertButtonElement = driver.findElement(By.id("alertButton"));
        alertButtonElement.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.alertIsPresent());
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        */

        /*
        WebElement alertButtonElementDelay = driver.findElement(By.id("timerAlertButton"));
        WebDriverWait alertButtonWait = new WebDriverWait(driver,5);
        alertButtonWait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        */

        WebElement alertButtonConfirmBox = driver.findElement(By.id("confirmButton"));
        alertButtonConfirmBox.click();


    }
}
