package tests.shipping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateNewAddressTest {

    WebDriver driver;

    public CreateNewAddressTest(WebDriver driver){
        this.driver = driver;
    }

    public void createNewAddress() throws InterruptedException {

        WebElement createNewAddress = driver.findElement(By.xpath("//body/section/section/div/div/div/div/div/div/div/ul[2]/li[1]/a[1]"));
        createNewAddress.click();

        WebElement addressTitle = driver.findElement(new By.ByCssSelector("input[placeholder='Ev adresim, iş adresim vb.']"));
        addressTitle.sendKeys("Ev");

        WebElement ad = driver.findElement(new By.ByCssSelector("input[name='first_name']"));
        ad.sendKeys("emir");

        WebElement lastName = driver.findElement(By.xpath("//body/div/div/div/form[@method='post']/div/div[2]/div[1]/label[1]/input[1]"));
        lastName.sendKeys("gündem");


        WebElement phoneNumber = driver.findElement(By.xpath("(//input[@type='text'])[8]"));
        phoneNumber.sendKeys("5355194056");

        Select city = new Select(driver.findElement(By.name("city")));
        city.selectByVisibleText("İSTANBUL");

        Thread.sleep(1000);

        Select township = new Select(driver.findElement(By.name("township")));
        township.selectByVisibleText("BAHÇELİEVLER");

        Thread.sleep(1000);

        Select district = new Select(driver.findElement(By.name("district")));
        district.selectByVisibleText("CUMHURİYET MAH");

        Thread.sleep(1000);

        WebElement address = driver.findElement(By.name("line"));
        address.sendKeys("Bahçelievler cumhuriyet mahallesi no : 1400 istanbul Türkiye ");

        //WebElement postCode = driver.findElement(By.xpath("(//input[@type='text'])[10]"));
        //postCode.sendKeys("34000");

        WebElement save =  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/button[1]"));
        save.click();

        WebElement radioButton = driver.findElement(By.xpath("(//div[@class='radio'])[3]"));
        radioButton.click();

        Thread.sleep(1000);

        WebElement saveAndContinueButton = driver.findElement(By.xpath("//button[normalize-space()='Kaydet ve Devam Et']"));
        saveAndContinueButton.click();

    }
}
