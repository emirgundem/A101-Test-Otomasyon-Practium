package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickButtonTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/buttons");
        driver.manage().window().maximize();

        //Double Click
        WebElement buttonElement = driver.findElement(By.id("doubleClickBtn"));
        Actions action = new Actions(driver);
        action.doubleClick(buttonElement).perform();

        //Right Click
        WebElement rightClickElement = driver.findElement(By.id("rightClickBtn"));
        action.contextClick(rightClickElement).perform();

        WebElement rightClickButtonMessage = driver.findElement(By.id("rightClickMessage"));
        String message = rightClickButtonMessage.getText();
        System.out.println(message);

        WebElement clickDynamicButton = driver.findElement(By.xpath("//div/button[starts-with(text() , 'Click Me')]"));
        clickDynamicButton.click();













    }
}
