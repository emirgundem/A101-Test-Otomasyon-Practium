package tests;

import org.openqa.selenium.WebDriver;

public class NavigatePageTest {
    WebDriver driver;

    public NavigatePageTest(WebDriver driver) {
        this.driver = driver;
    }

    public void navigatePageTestClick() throws InterruptedException {
        driver.navigate().to("https://www.a101.com.tr/giyim-aksesuar/");
        Thread.sleep(2000);
        driver.navigate().to("https://www.a101.com.tr/giyim-aksesuar/kadin-ic-giyim/");
        Thread.sleep(1000);
        driver.navigate().to("https://www.a101.com.tr/giyim-aksesuar/dizalti-corap/");
    }
}
