package files;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.*;

public class GoogleTest {

    @Test
    public void searchSelenideInGoogle(){
        open("http://google.com");
        $(By.name("q")).val("selenide").pressEnter();
        $$("#ires li.g").shouldHave(size(10));
        $("#ires").find(By.linkText("selenide.org")).shouldBe(Condition.visible);
    }
}
