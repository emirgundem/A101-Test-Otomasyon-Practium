package tests.navigate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClickProductTestPage {
    WebDriver driver;

    public ClickProductTestPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickProduct() throws InterruptedException {
        driver.findElement(new By.ByCssSelector("a[title='Penti Kadın 50 Denye Pantolon Çorabı Siyah'] h3[class='name']")).click();
        Thread.sleep(1000);

    }
}
