package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HomePage {

    private final SelenideElement headerLogo = $("a[title='Home']");
    private final SelenideElement aboutLink = $("a.Nav_link__Ec6J3[href='/en/about/']");
    private final SelenideElement downloadButton = $("a.Nav_link__Ec6J3[href='/en/download-app/'] button");
    private final SelenideElement getAppButton = $("a.DownloadLink_root__008zb.TopSection_downloadLink__xuFX_ button");
    private final SelenideElement mainTitle = $(".TopSection_title__WUhsg");
    private final SelenideElement mainSubtitle = $(".TopSection_subtitle__PwQNF");

    public HomePage openPage() {
        open("");
        return this;
    }

    public HomePage clickAboutLink() {
        aboutLink.shouldBe(Condition.visible).click();
        return this;
    }

    public HomePage clickDownloadLink() {
        downloadButton.shouldBe(Condition.visible).click();
        return this;
    }

    public HomePage clickHomeLogo() {
        headerLogo.shouldBe(Condition.visible).click();
        return this;
    }

    public HomePage verifyMainTitle(String expectedTitle) {
        mainTitle.shouldBe(Condition.visible).shouldHave(Condition.text(expectedTitle));
        return this;
    }

    public HomePage verifyMainSubtitle(String expectedSubtitle) {
        mainSubtitle.shouldBe(Condition.visible).shouldHave(Condition.text(expectedSubtitle));
        return this;
    }
}
