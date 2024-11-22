package files;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG {

    ChromeDriver driver;

    @Test
    public void getTitle() throws InterruptedException {

        String testTitle = "Tools QA";
        Thread.sleep(2500);
        String originalTitle = driver.getTitle();
        Assert.assertEquals(originalTitle, testTitle);
    }

    @BeforeMethod
    public void beforeMethod() {

        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.out.println("Test Starting...");
        driver = new ChromeDriver();
        driver.get("https://www.toolsqa.com/");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void afterMethod() {
        driver.close();
        System.out.println("Finished Test On Chrome Browser");
    }
}
