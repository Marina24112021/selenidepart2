import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Selenide.$;

public class HoverMenuGitHubTest {
    @BeforeAll
    static void beforeall(){
        Configuration.browserSize = "1920x1080";
        Configuration.reopenBrowserOnFail = false;
        Configuration.pageLoadStrategy = "eager";
    }
    @Test
    void findTitle() {
        open("https://github.com");
        $(byText("Solutions")).hover();
        $(".border-bottom.pb-3.mb-3").$$("ul li").get(0).click();
        $("#hero-section-brand-heading").shouldHave(text("The AI-powered developer platform."));
    }
}
