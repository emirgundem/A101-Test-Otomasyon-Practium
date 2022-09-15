package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WithoutMemberShipPageTest {

    WebDriver driver;

    public WithoutMemberShipPageTest(WebDriver driver){
        this.driver = driver;
    }

    public void memberShipTest() throws InterruptedException {

        //Uye olmadan devam et
        WebElement userEmail = driver.findElement(new By.ByCssSelector("input[name='user_email']"));
        Thread.sleep(2000);
        userEmail.sendKeys("emirgndem@gmail.com");

        WebElement emailDevamEtButton = driver.findElement(new By.ByCssSelector("button[class='button block green']"));
        emailDevamEtButton.click();
        Thread.sleep(2000);
    }
}
