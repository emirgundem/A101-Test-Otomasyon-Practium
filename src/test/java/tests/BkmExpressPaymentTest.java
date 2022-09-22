package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BkmExpressPaymentTest {

    WebDriver driver;

    public BkmExpressPaymentTest(WebDriver driver) {
        this.driver = driver;
    }

    public void bkmExpressPaymentTestCheck() {
        WebElement bkmExpressPaymentOption = driver.findElement(By.xpath("/html[1]/body[1]/section[1]/section[1]/div[1]/div[3]/div[1]/div[3]"));
        bkmExpressPaymentOption.click();

        WebElement bkmExpressAgrement = driver.findElement(By.xpath("(//input[@id='agrementbkm'])[1]"));
        bkmExpressAgrement.click();

        WebElement payWithBkmExpressButton = driver.findElement(By.xpath("//button[@class='checkout__cargo__proceed bkm-button js-bkm-button-visible button green']"));
        payWithBkmExpressButton.click();


    }
}
