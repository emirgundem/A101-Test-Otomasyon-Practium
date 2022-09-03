package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://demoqa.com/text-box");
            driver.manage().window().maximize();

            WebElement nameElement = driver.findElement(By.id("userName"));
            WebElement emailElement = driver.findElement(By.id("userEmail"));
            nameElement.click();
            emailElement.click();
            nameElement.sendKeys("Emir");
            emailElement.sendKeys("emirgndem@gmail.com");


    }
}
