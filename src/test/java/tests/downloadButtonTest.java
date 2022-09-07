package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class downloadButtonTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/upload-download");
        driver.manage().window().maximize();


        WebElement downloadButtonClick = driver.findElement(By.id("downloadButton"));
        downloadButtonClick.click();

        String path = "C:/Users/Lenovo/Downloads";
        String fileName = "sampleFilename.jpg";
        Thread.sleep(2);
        boolean isDownloaded = isFileDownloaded(path,fileName);
        System.out.println(isDownloaded);
    }

    public static boolean isFileDownloaded(String downloadPath, String fileName) {
        File file = new File(downloadPath);
        File[] files = file.listFiles();

        for (int i = 0; i< files.length; i++){
            if (files[i].getName().equals(fileName)){
                return true;
            }
        }
        return false;
    }
}
