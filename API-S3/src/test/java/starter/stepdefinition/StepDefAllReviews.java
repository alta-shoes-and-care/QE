package starter.stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.step.AllReviews;

public class StepDefAllReviews {
    @Steps
    AllReviews allReviews;

    @When("I want to check all {string}")
    public void CheckAllReviews(String Reviews) {
        allReviews.ReviewsList();
    }

    @Then("the API give response and i view all data reviews")
    public void GetReviewsAll() {
        SerenityRest.restAssuredThat(response -> response.statusCode(200));
    }
}
