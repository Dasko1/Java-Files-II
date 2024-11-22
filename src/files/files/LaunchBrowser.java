package files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LaunchBrowser {

    WebDriver driver;

    @Test(priority = 1)
    public void verifyTitle() {
        driver.manage().window().maximize();
        Assert.assertEquals(driver.getTitle(), "Most Reliable App & Cross Browser Testing Platform | BrowserStack");
    }

    @Test(priority = 2)
    public void verifyGetStartedWithTestNG() {
        WebElement logo = driver.findElement(By.cssSelector("header#header-habitat a[title='BrowserStack Logo'] img"));
        String logoImg = logo.getAttribute("src");
        Assert.assertNotEquals(logoImg, "");
    }

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.out.println("Test Starting...");
        driver = new ChromeDriver();
        driver.get("https://www.browserstack.com/");
    }

    @AfterClass
    public void tearDown(){

        driver.close();
    }
}
