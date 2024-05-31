package tests;

import annitations.Manual;
import io.qameta.allure.AllureId;
import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static io.qameta.allure.Allure.step;

public class ManualTest extends TestBase {

    @Manual
    @Test
    @AllureId("32606")
    @DisplayName("Manual Test Example")
    @Epic("About Page")
    void manualTestExampleOne() {
        step("Open MainPage");
        step("Verify Main Title Text");
        step("Verify Main Subtitle Text");
        step("Navigate to About Page");
    }

    @Manual
    @Test
    @DisplayName("Manual Test Example")
    void manualTestExampleTwo() {
        step("Open MainPage", () -> {
            step("Open browser and go to the main URL");
        });
        step("Verify Main Title Text", () -> {
            step("Locate the main title element on the page");
            step("Verify the text of the main title is 'Get in on the future of finance'");
        });
        step("Verify Main Subtitle Text");
        step("Navigate to About Page", () -> {
            step("Locate the 'About' link on the main page");
            step("Click on the 'About' link");
        });
    }

    @Manual
    @Test
    @DisplayName("Manual Test Example")
    void manualTestExampleThree() {
        step("", () -> {
        });
        step("", () -> {
        });
        step("", () -> {
        });
        step("", () -> {
        });
        step("", () -> {
        });

    }

    @Test
    @AllureId("32625")
    @DisplayName("should have text APP COMING SOON The Venga app is currently in the final stages of development and will be launched soon.Follow us on our social media channels to stay updated on the apps release.")
    @Epic("DownloadPage")
    @Owner("allure8")
    void name() {
        step("open venga.com", () -> {
            homePage.openPage();
        });
        step("click download", () -> {
            homePage.clickDownloadLink();
        });
        step("check text", () -> {
            downloadPage.getHeader().shouldHave(text("APP COMING SOON"));
            downloadPage.getDescription().shouldHave(text("The Venga app is currently in the final stages of development and will be launched soon. Follow us on our social media channels to stay updated on the app's release."));
        });
    }
}
