package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import constants.Urls;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchPage {
    private SelenideElement searchInput = $(By.xpath("//input[@placeholder='Where are you going?']"));
    private SelenideElement autocompleteFirstResult = $(By.xpath("//ul[@data-testid = 'autocomplete-results']//li[1]"));
    private SelenideElement searchButton = $(By.xpath("//button[@type='submit' and span='Search']"));
    private SelenideElement firstCardTitle = $(By.xpath("//div[@data-testid = 'property-card'][1]//div[@data-testid = 'title']"));
    private SelenideElement firstCardRating = $(By.xpath("//div[@data-testid = 'property-card'][1]//div[@data-testid = 'review-score']//div"));

    public SearchPage openSearchPage() {
        open(Urls.SEARCH_PAGE_URL);
        return this;
    }

    public SearchPage enterHotelTitle(String hotelTitle) {
        searchInput.shouldBe(Condition.visible).sendKeys(hotelTitle);
        return this;
    }

    public SearchPage clickOnAutocompleteResult() {
        autocompleteFirstResult.shouldBe(Condition.visible).click();
        return this;
    }

    public SearchPage clickSearchButton() {
        searchButton.shouldBe(Condition.visible).click();
        return this;
    }

    public String getResultHotelTitle() {
        return firstCardTitle.shouldBe(Condition.visible).getText();
    }

    public String getResultRating() {
        return firstCardRating.shouldBe(Condition.visible).getText();
    }


}
