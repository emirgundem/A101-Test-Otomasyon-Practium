package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToBasketPageTest {
    WebDriver driver;
    public AddToBasketPageTest(WebDriver driver){
        this.driver = driver;
    }

    public void addToBasket() throws InterruptedException {
        WebElement addBasketButton = driver.findElement(new By.ByCssSelector(".add-to-basket.button.green.block.with-icon.js-add-basket"));
        addBasketButton.click();
        Thread.sleep(1000);
    }
}
