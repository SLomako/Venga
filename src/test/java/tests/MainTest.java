package tests;

import annitations.Layer;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pages.AboutPage;
import pages.DownloadPage;
import pages.HomePage;

import static com.codeborne.selenide.Condition.text;
import static io.qameta.allure.Allure.step;

@Layer("web")
@Owner("Lomako")
public class MainTest extends TestBase {

    HomePage homePage = new HomePage();
    AboutPage aboutPage = new AboutPage();
    DownloadPage downloadPage = new DownloadPage();

    @Test
    @Epic("Home Page")
    @Feature("Main Title and Subtitle Verification")
    @Story("Verify main title and subtitle text")
    @Tag("smok")
    @DisplayName("Verify main title and subtitle text")
    @Tag("major")
    void verifyMainTitleAndSubtitle() {
        step("Open Home Page", homePage::openPage);

        step("Verify main title text", () -> {
            homePage.verifyMainTitle("Get in on the future of finance");
        });

        step("Verify main subtitle text", () -> {
            homePage.verifyMainSubtitle("Discover innovative blockchain technologies, invest in crypto, and effortlessly navigate the world of Web3.");
        });
    }

    @Test
    @Epic("About Page")
    @Feature("Team Member Verification")
    @Story("Verify presence of Michael Stroev")
    @Tag("smok")
    @DisplayName("Navigate to About page and verify presence of Michael Stroev")
    @Tag("minor")
    void navigateToAboutPageAndVerifyMichaelStroev() {

        step("Open Home Page", homePage::openPage);

        step("Click on the About link", homePage::clickAboutLink);

        step("Scroll to 'Our Team' section and verify presence of Michael Stroev", () -> {
            aboutPage
                    .scrollToOurTeamSection();
            aboutPage
                    .findPersonByName("Michael Stroev").shouldHave(text("Michael Stroev"));
        });
    }

    @Test
    @Epic("Download Page")
    @Feature("Content Verification")
    @Story("Verify content on the Download page")
    @Tag("regress")
    @DisplayName("Navigate to Download page and verify content")
    @Tag("minor")
    void navigateToDownloadPageAndVerifyContent() {
        HomePage homePage = new HomePage();

        step("Open Home Page", homePage::openPage);

        step("Click on the Download link", homePage::clickDownloadLink);

        step("Verify Download Page header", () -> {
            downloadPage
                    .getHeader().shouldHave(text("APP Coming soon"));
        });

        step("Verify Download Page description", () -> {
            downloadPage
                    .getDescription().shouldHave(text("The Venga app is currently in the final stages of development and will be launched soon. Follow us on our social media channels to stay updated on the app's release."));
        });
    }

//    @Epic("About Page")
//    @Feature("Team Member Verification")
//    @Story("Verify presence of team members")
//    @ParameterizedTest
//    @ValueSource(strings = {"Michael Stroev", "Mikhael Soshchin", "Ana Carolina Oliveira (PhD)", "Barbara Ippolito"})
//    @DisplayName("Navigate to About page and verify presence of team member")
//    @Tag("minor")
//    void navigateToAboutPageAndVerifyTeamMember(String teamMemberName) {
//        step("Open Home Page", homePage::openPage);
//
//        step("Click on the About link", homePage::clickAboutLink);
//
//        step("Scroll to 'Our Team' section and verify presence of " + teamMemberName, () -> {
//            aboutPage.scrollToOurTeamSection();
//            aboutPage.findPersonByName(teamMemberName).shouldHave(text(teamMemberName));
//        });
//    }
}
