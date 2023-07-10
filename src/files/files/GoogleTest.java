package files;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleTest {

    @Test
    public void searchSelenideInGoogle(){
        open("http://google.com");
        $(By.name("q")).val("selenide").pressEnter();
        Selenide.sleep(1500);
        $(By.id("center_col")).shouldHave(Condition.text("Selenide: concise UI tests in Java"));
    }
}
