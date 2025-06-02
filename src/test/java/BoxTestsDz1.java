package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "";
        //Configuration.pageLoadStrategy = "eager";
        //Configuration.holdBrowserOpen = true;
        //Configuration.timeout = 5000; // default 4000
    }

    @Test
    void fillFormTest() {
        open("");
        $("").setValue("");
        $("").setValue("");
        $("").setValue("");
        $("").setValue("");
        $("").click();

        $("").$("").shouldHave(text(""));
        $("").shouldHave(text(""));
        $("").shouldHave(text(""));
        $("").shouldHave(text(""));
    }

}