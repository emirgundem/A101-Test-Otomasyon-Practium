package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import tests.basketOption.AddToBasketPageTest;
import tests.basketOption.ViewBasketPageTest;
import tests.membership.ContinueWithoutMemberShipButtonTest;
import tests.membership.WithoutMemberShipPageTest;
import tests.payment.PaymentPageTest;

import java.util.concurrent.TimeUnit;

public class RunAllTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://www.a101.com.tr/");

        driver.manage().window().maximize();
        Thread.sleep(2000);

        //Close Popup Page Test
        ClosePopUpPageTest closePopUpPage = new ClosePopUpPageTest(driver);
        closePopUpPage.closePopupClick();


        //ClothingAccessoriesPageClickTest
        ClothingAccessoriesPageClickTest clothingAccessoriesPage = new ClothingAccessoriesPageClickTest(driver);
        clothingAccessoriesPage.clothingAccessoriesClick();

        //Navigate Page Test
        NavigatePageTest navigatePage = new NavigatePageTest(driver);
        navigatePage.navigatePageTestClick();

       //Click Product Test
        ClickProductTestPage clickProductTest = new ClickProductTestPage(driver);
        clickProductTest.clickProduct();

        //Add product to Basket
        AddToBasketPageTest addToBasketPage = new AddToBasketPageTest(driver);
        addToBasketPage.addToBasket();

        //ViewBasket
        ViewBasketPageTest viewBasketPage = new ViewBasketPageTest(driver);
        viewBasketPage.viewBasket();

       //Continue Without MemberShip Button Test
        ContinueWithoutMemberShipButtonTest continueWithoutMemberShipButton = new ContinueWithoutMemberShipButtonTest(driver);
        continueWithoutMemberShipButton.continueWithoutMemberShipButtonTestClick();

        //Continue Without MemberShip Page
        WithoutMemberShipPageTest withoutMemberShipPage = new WithoutMemberShipPageTest(driver);
        withoutMemberShipPage.memberShipTest();

        //Create New Address Page
        CreateNewAddressTest createNewAddressTest = new CreateNewAddressTest(driver);
        createNewAddressTest.createNewAddress();


        //Payment Page
        PaymentPageTest paymentTest = new PaymentPageTest(driver);
        paymentTest.paymentTestCheck();

        /*
        Garanti Pay
        GarantiPayPaymentTest garantiPayPayment = new GarantiPayPaymentTest(driver);
        garantiPayPayment.garantiPayTestCheck();
         */


        /*
        BkmExpress
        BkmExpressPaymentTest bkmExpressPayment = new BkmExpressPaymentTest(driver);
        bkmExpressPayment.bkmExpressPaymentTestCheck();
         */
    }
}

