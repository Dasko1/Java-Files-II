package files;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG {

    ChromeDriver driver;

    @Test
    public void getTitle() {

        String testTitle = "Tools QA";
        String originalTitle = driver.getTitle();
        Assert.assertEquals(originalTitle, testTitle);
    }

    @BeforeTest
    public void beforeMethod() throws InterruptedException {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.out.println("Test Starting...");
        driver = new ChromeDriver();
        driver.get("https://www.toolsqa.com/");
        driver.manage().window().maximize();
        Thread.sleep(2500);
    }

    @AfterTest
    public void afterMethod() {
        driver.close();
        System.out.println("Finished Test On Chrome Browser");
    }
}
