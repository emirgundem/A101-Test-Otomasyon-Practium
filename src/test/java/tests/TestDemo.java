package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://www.a101.com.tr/");

        driver.manage().window().maximize();
        Thread.sleep(3000);

        WebElement popup = driver.findElement(By.xpath("(//button[normalize-space()='Kabul Et'])[1]"));
        popup.click();

        Actions actions = new Actions(driver);
        WebElement element =  driver.findElement(By.xpath("(//a[normalize-space()='Giyim & aksesuar'])[1]"));
        actions.doubleClick(element).perform();

        driver.navigate().to("https://www.a101.com.tr/giyim-aksesuar/");
        Thread.sleep(2000);
        driver.navigate().to("https://www.a101.com.tr/giyim-aksesuar/kadin-ic-giyim/");
        Thread.sleep(1000);
        driver.navigate().to("https://www.a101.com.tr/giyim-aksesuar/dizalti-corap/");

        driver.findElement(new By.ByCssSelector("a[title='Penti Kadın 50 Denye Pantolon Çorabı Siyah'] h3[class='name']")).click();

        Thread.sleep(1000);


        WebElement sepeteEkle = driver.findElement(new By.ByCssSelector(".add-to-basket.button.green.block.with-icon.js-add-basket"));
        sepeteEkle.click();

        Thread.sleep(1000);

        driver.findElement(new By.ByCssSelector(".go-to-shop")).click();

        Thread.sleep(1000);

        WebElement sepetiOnayla = driver.findElement(new By.ByCssSelector(".button.green.checkout-button.block.js-checkout-button"));
        sepetiOnayla.click();

        WebElement uyeOlmadanDevamEt  = driver.findElement(new By.ByCssSelector("a[title='ÜYE OLMADAN DEVAM ET']"));
        uyeOlmadanDevamEt.click();


        WebElement userEmail = driver.findElement(new By.ByCssSelector("input[name='user_email']"));
        Thread.sleep(2000);
        userEmail.sendKeys("emirgndem@gmail.com");



        WebElement emailDevamEtButton = driver.findElement(new By.ByCssSelector("button[class='button block green']"));
        emailDevamEtButton.click();

        Thread.sleep(2000);

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
        adres.sendKeys("Bahçelievler cumhuriyet mahallesi no : 205  istanbul Türkiye ");

        WebElement postaKodu = driver.findElement(By.xpath("(//input[@type='text'])[10]"));
        postaKodu.sendKeys("34000");


        WebElement kaydet =  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/button[1]"));
        kaydet.click();

        WebElement radioButton = driver.findElement(By.xpath("(//div[@class='radio'])[3]"));
        radioButton.click();

        Thread.sleep(1000);

        WebElement kaydetVeDevamEtButton = driver.findElement(By.xpath("//button[normalize-space()='Kaydet ve Devam Et']"));
        kaydetVeDevamEtButton.click();

        //PaymentPoint

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

