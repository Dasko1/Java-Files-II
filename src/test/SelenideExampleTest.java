import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.junit.jupiter.api.BeforeAll;


public class SelenideExampleTest {

    @BeforeMethod
    public static void setup() {
        // Configure Selenide
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");
        //System.setProperty("selenide.browser", "Chrome");
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

    @AfterMethod
    public void afterMethod(){
        Selenide.closeWindow();
    }

}

