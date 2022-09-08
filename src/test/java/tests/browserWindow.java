package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class browserWindow {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/browser-windows");


        WebElement newTabButton = driver.findElement(By.id("windowButton"));
        newTabButton.click();

        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        System.out.println(tabs.size());


        driver.switchTo().window(tabs.get(0));
        System.out.println(driver.getCurrentUrl());

        Thread.sleep(2000);
        driver.close();








    }
}
