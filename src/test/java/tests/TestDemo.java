package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class TestDemo {
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

        //PaymentPage Point
        PaymentPageTest paymentTest = new PaymentPageTest(driver);
        paymentTest.paymentTestCheck();














    }
}

