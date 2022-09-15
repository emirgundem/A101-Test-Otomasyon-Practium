package tests;

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

        WebElement yeniAdresOlustur = driver.findElement(By.xpath("//body/section/section/div/div/div/div/div/div/div/ul[2]/li[1]/a[1]"));
        yeniAdresOlustur.click();

        WebElement adresBaslıgı = driver.findElement(new By.ByCssSelector("input[placeholder='Ev adresim, iş adresim vb.']"));
        adresBaslıgı.sendKeys("Ev");

        WebElement ad = driver.findElement(new By.ByCssSelector("input[name='first_name']"));
        ad.sendKeys("emir");

        WebElement soyad = driver.findElement(By.xpath("//body/div/div/div/form[@method='post']/div/div[2]/div[1]/label[1]/input[1]"));
        soyad.sendKeys("gündem");


        WebElement cepTelefonu = driver.findElement(By.xpath("(//input[@type='text'])[8]"));
        cepTelefonu.sendKeys("5355194056");

        Select drpİl = new Select(driver.findElement(By.name("city")));
        drpİl.selectByVisibleText("İSTANBUL");

        Thread.sleep(1000);

        Select drpİlçe = new Select(driver.findElement(By.name("township")));
        drpİlçe.selectByVisibleText("BAHÇELİEVLER");

        Thread.sleep(1000);

        Select drpMahalle = new Select(driver.findElement(By.name("district")));
        drpMahalle.selectByVisibleText("CUMHURİYET MAH");

        Thread.sleep(1000);

        WebElement adres = driver.findElement(By.name("line"));
        adres.sendKeys("Bahçelievler cumhuriyet mahallesi no : 2325  istanbul Türkiye ");

        WebElement postaKodu = driver.findElement(By.xpath("(//input[@type='text'])[10]"));
        postaKodu.sendKeys("34000");


        WebElement kaydet =  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/button[1]"));
        kaydet.click();

        WebElement radioButton = driver.findElement(By.xpath("(//div[@class='radio'])[3]"));
        radioButton.click();

        Thread.sleep(1000);

        WebElement kaydetVeDevamEtButton = driver.findElement(By.xpath("//button[normalize-space()='Kaydet ve Devam Et']"));
        kaydetVeDevamEtButton.click();
        
    }
}
