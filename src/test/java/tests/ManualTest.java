package tests;

import annitations.Manual;
import io.qameta.allure.AllureId;
import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
}