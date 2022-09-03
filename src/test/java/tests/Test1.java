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
            nameElement.click();
            nameElement.sendKeys("Emir");

            WebElement emailElement = driver.findElement(By.id("userEmail"));
            emailElement.click();
            emailElement.sendKeys("emirgndem@gmail.com");

            WebElement currentAddress = driver.findElement(By.id("currentAddress"));
            currentAddress.click();
            currentAddress.sendKeys("Test DENEME DENEME ");

            WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
            permanentAddress.click();
            permanentAddress.sendKeys("Ankara, Türkiye");


            WebElement submitButton = driver.findElement(By.id("submit"));
            submitButton.click();

            WebElement nameText = driver.findElement(By.xpath("//div/p[@id='name']"));
            String name = nameText.getText();
            System.out.println(name);


    }
}
