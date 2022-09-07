package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadFileButtonTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/upload-download");


        WebElement uploadButtonElement = driver.findElement(By.id("uploadFile"));
        uploadButtonElement.sendKeys("C:/Users/Lenovo/Desktop/selenium.png");


    }
}
