import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ExampleTest {

    @BeforeAll
    public static void setup() {
        // Configure Selenide
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");
        System.setProperty("selenide.browser", "Chrome");
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://www.google.com";
    }

    @Test
    public void testPageTitle() {
        // Open the webpage
        Selenide.open("/");

        // Get the page title
        String pageTitle = Selenide.title();

        // Assert the page title using AssertJ
        Assertions.assertThat(pageTitle).isEqualTo("Google");
    }
}
