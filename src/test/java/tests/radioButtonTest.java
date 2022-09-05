package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButtonTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();

        WebElement yesRadiobuttonElement = driver.findElement(By.className("custom-control-label"));
        boolean checkRadioButtonElement =  yesRadiobuttonElement.isEnabled();

        if (checkRadioButtonElement) {
            yesRadiobuttonElement.click();
            System.out.println("Clicked yesRadioButton Element");
        }

        WebElement output = driver.findElement(By.className("mt-3"));
        System.out.println(output.getText());

    }
}
