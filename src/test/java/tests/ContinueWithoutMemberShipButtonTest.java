package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContinueWithoutMemberShipButtonTest {
    WebDriver driver;

    public ContinueWithoutMemberShipButtonTest(WebDriver driver){
        this.driver = driver;
    }
    public void continueWithoutMemberShipButtonTestClick() {
        WebElement uyeOlmadanDevamEt  = driver.findElement(new By.ByCssSelector("a[title='ÜYE OLMADAN DEVAM ET']"));
        uyeOlmadanDevamEt.click();
    }
}
