package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClosePopUpPageTest {
    WebDriver driver;

    public ClosePopUpPageTest(WebDriver driver){
        this.driver = driver;
    }

    public void closePopupClick() {
        WebElement popup = driver.findElement(By.xpath("(//button[normalize-space()='Kabul Et'])[1]"));
        popup.click();
    }
}
