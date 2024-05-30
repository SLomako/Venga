package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class DownloadPage {

    private final SelenideElement header = $(".DownloadPage_header__5_FUK");
    private final SelenideElement description = $(".DownloadPage_description__PD9z2");

    @Step("Get Download Page header")
    public SelenideElement getHeader() {
        return header;
    }

    @Step("Get Download Page description")
    public SelenideElement getDescription() {
        return description;
    }
}
