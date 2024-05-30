package tests;

import annitations.Layer;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@Layer("rest")
@Owner("Lomako")
public class ApiTest {

    @Test
    @DisplayName("Check if the home page is available")
    void checkHomePageAvailability() {
        String baseUrl = "https://venga.com/en/";
        given()
                .when()
                .get(baseUrl)
                .then()
                .log().all()
                .statusCode(200);
    }

    @Test
    @DisplayName("Check if the About page is available")
    void checkAboutPageAvailability() {
        String aboutPageUrl = "https://venga.com/en/about/";
        given()
                .when()
                .get(aboutPageUrl)
                .then()
                .log().all()
                .statusCode(200);
    }
}
