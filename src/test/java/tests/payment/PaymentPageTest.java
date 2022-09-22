package tests.payment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PaymentPageTest {


    WebDriver driver;

    public PaymentPageTest(WebDriver driver) {
        this.driver = driver;
    }

    public void paymentTestCheck() {
        WebElement creditCardCostumerName = driver.findElement(new By.ByCssSelector("div[class='form-area js-new-creditcard-area'] input[name='name']"));
        creditCardCostumerName.sendKeys("Emircan Gündem");

        WebElement creditCardNumber = driver.findElement(new By.ByCssSelector(".js-masterpassbin-payment-card"));
        creditCardNumber.sendKeys("5355763401145068");


        Select cardExpirationDate = new Select(driver.findElement(By.xpath("(//select[@name='card_month'])[2]")));
        cardExpirationDate.selectByVisibleText("9");
        cardExpirationDate.selectByIndex(8);

        Select cardPaymentYear = new Select(driver.findElement(By.xpath("(//select[@name='card_year'])[2]")));
        cardPaymentYear.selectByVisibleText("2023");

        WebElement cardCvc = driver.findElement(new By.ByCssSelector("div[class='form-area js-new-creditcard-area'] input[name='card_cvv']"));
        cardCvc.sendKeys("520");

        //Ön Bilgilendirme ve Uzaktan satış sözleşmesi

        WebElement checkbox = driver.findElement(By.id("agrement2"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click();", checkbox );

        //Siparişi Tamamla

        WebElement orderCompleteButton = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
        orderCompleteButton.click();

    }
}
