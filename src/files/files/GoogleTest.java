package files;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleTest {

    @BeforeAll
    public static void setup() {
        // Configure Selenide
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dasko\\Chromedriver\\chromedriver.exe");
        System.setProperty("selenide.browser", "Chrome");
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://www.google.com";
    }


    @Test
    public void searchSelenideInGoogle(){
        open("/");
        $(By.name("q")).val("selenide").pressEnter();
        Selenide.sleep(1500);
        $(By.id("center_col")).shouldHave(Condition.text("Selenide: concise UI tests in Java"));
    }
}
