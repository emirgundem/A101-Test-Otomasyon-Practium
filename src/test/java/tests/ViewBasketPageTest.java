package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ViewBasketPageTest {

    WebDriver driver;

    public ViewBasketPageTest(WebDriver driver) {
        this.driver = driver;

    }

    public void viewBasket() throws InterruptedException {
        driver.findElement(new By.ByCssSelector(".go-to-shop")).click();
        Thread.sleep(1000);
        WebElement confirmBasket = driver.findElement(new By.ByCssSelector(".button.green.checkout-button.block.js-checkout-button"));
        confirmBasket.click();

    }
}
