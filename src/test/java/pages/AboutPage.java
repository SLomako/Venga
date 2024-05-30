package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class AboutPage {

    private final SelenideElement ourTeamSection = $("#OurTeam");
    private final SelenideElement peopleContainer = $(".OurTeamSection_people__eHIpF");

    @Step("Scroll to 'Our Team' section")
    public void scrollToOurTeamSection() {
        ourTeamSection.scrollTo();
    }

    @Step("Find person by name: {name}")
    public SelenideElement findPersonByName(String name) {
        return peopleContainer.$x(".//div[contains(text(), '" + name + "')]");
    }
}
