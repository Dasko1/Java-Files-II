package files;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SelenideExampleTest {

    @BeforeAll
    public static void setup() {
        // Configure Selenide
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dasko\\Chromedriver\\chromedriver.exe");
        System.setProperty("selenide.browser", "Chrome");
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://example.com";
    }

    @Test
    public void testPageTitle() {
        // Open the webpage
        Selenide.open("/");

        // Get the page title
        String pageTitle = Selenide.title();

        // Assert the page title using AssertJ
        Assertions.assertThat(pageTitle).isEqualTo("Example Domain");
    }

    @Test
    public void testButtonVisibility() {
        // Open the webpage
        Selenide.open("/");

        // Check if a button is visible
        boolean isButtonVisible = Selenide.$("#button-id").isDisplayed();

        // Assert the visibility using AssertJ
        Assertions.assertThat(isButtonVisible).isFalse();
    }
}

