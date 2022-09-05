package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceFromTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();

        WebElement nameElement = driver.findElement(By.id("firstName"));
        nameElement.click();
        nameElement.sendKeys("Emir");

        WebElement lastnameElement = driver.findElement(By.id("lastName"));
        lastnameElement.click();
        lastnameElement.sendKeys("Gundem");


        WebElement sportCheckBox = driver.findElement(By.id("hobbies-checkbox-1"));
        boolean isEnabled = sportCheckBox.isEnabled();
        System.out.println(isEnabled);

        WebElement sportCheckboxElement = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));


        try {
            sportCheckBox.click();
        }
        catch (ElementClickInterceptedException e) {
              sportCheckboxElement.click();
        }

         boolean isSelected = sportCheckBox.isSelected();
        System.out.println(isSelected);





    }
}
