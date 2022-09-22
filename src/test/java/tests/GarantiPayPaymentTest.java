package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GarantiPayPaymentTest {
    WebDriver driver;

    public GarantiPayPaymentTest(WebDriver driver){
        this.driver = driver;
    }
    public void garantiPayTestCheck() throws InterruptedException {

        WebElement paymentOptionGarantiPay = driver.findElement(By.xpath("/html[1]/body[1]/section[1]/section[1]/div[1]/div[3]/div[1]/div[2]"));
        paymentOptionGarantiPay.click();

        WebElement garantiAgreement = driver.findElement(By.xpath("(//input[@type='checkbox'])[5]"));
        garantiAgreement.click();
        Thread.sleep(1000);

        WebElement garantiPayPaymentButton = driver.findElement(By.xpath("(//a[normalize-space()='Garanti Pay ile Öde'])[1]"));
        garantiPayPaymentButton.click();


    }
}



