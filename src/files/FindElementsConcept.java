package files;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class FindElementsConcept {

    @Test
    public void elementsTest(){
        open("https://www.amazon.com");
        $$(By.tagName("a"));
    }
}
