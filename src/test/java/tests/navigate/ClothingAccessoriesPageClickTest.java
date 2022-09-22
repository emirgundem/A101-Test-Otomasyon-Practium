package tests.navigate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ClothingAccessoriesPageClickTest {
    WebDriver driver;

    public ClothingAccessoriesPageClickTest(WebDriver driver){
        this.driver = driver;
    }
    public void clothingAccessoriesClick() {
        Actions actions = new Actions(driver);
        WebElement clothingAccessoriesButton =  driver.findElement(By.xpath("(//a[normalize-space()='Giyim & aksesuar'])[1]"));
        actions.doubleClick(clothingAccessoriesButton).perform();
    }
}
