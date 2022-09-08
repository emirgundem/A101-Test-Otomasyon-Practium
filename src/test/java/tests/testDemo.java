package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class testDemo {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");


        driver.switchTo().frame("frame1");
        WebElement headingElement = driver.findElement(By.id("sampleHeading"));
        String textHeading = headingElement.getText();
        System.out.println(textHeading);

        driver.switchTo().parentFrame();

        List<WebElement> elementList = driver.findElements(By.id("framesWrapper"));
        String paragraph = elementList.get(0).getText();
        System.out.println(paragraph);

        driver.switchTo().frame("frame2");
        WebElement heading2 = driver.findElement(By.id("sampleHeading"));
        String textHeading2 = heading2.getText();
        System.out.println(textHeading2);

    }

}
