package tests;

import annitations.Manual;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class ManualTest {

    @Manual
    @Test
    @DisplayName("Manual Test Example")
    void manualTestExample() {
        step("Open MainPage");
        step("1");
        step("2");
        step("3");
    }
}
