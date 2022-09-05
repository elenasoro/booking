package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.SearchPage;

public class SearchSteps {
    SearchPage searchPage = new SearchPage();

    public SearchSteps() {
    }

    @Given("Booking search page is opened")
    public void bookingSearchPageIsOpened() {
        this.searchPage.openSearchPage();
    }

    @When("User enters hotel {string} title into the search field")
    public void userEntersHotelHiltonDubaiJumeirahTitleIntoTheSearchField(String hotelTitle) {
        this.searchPage.enterHotelTitle(hotelTitle);
    }

    @And("User clicks on Search button")
    public void userClicksOnSearchButton() {
        this.searchPage.clickOnAutocompleteResult().clickSearchButton();
    }

    @Then("Then {string} hotel is present on the page")
    public void thenHiltonDubaiJumeirahHotelIsPresentOnThePage(String hotelTitle) {
        Assert.assertEquals(this.searchPage.getResultHotelTitle(), hotelTitle, String.format("There's no hotel with title %s", hotelTitle));
    }

    @And("Hotel rating is {string}")
    public void hotelRatingIs(String rating) {
        Assert.assertEquals(this.searchPage.getResultRating(), rating, String.format("Hotel rating is not %s", rating));
    }
}
