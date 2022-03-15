package starter.stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.step.UpdateReview;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.equalTo;

public class StepDefUpdateReview {

    @Steps
    UpdateReview updateReview;

    @When("I change the rating to {string} and review to {string}")
    public void iChangeTheRatingToAndReviewTo(String rating, String review) {
        updateReview.DataReviewEdited(rating,review);
    }

    @Then("rating and review updated")
    public void ratingAndReviewUpdated() {
        seeThatResponse("sukses memperbarui data review",
                response -> {
                    response.statusCode(200);

                }
        );

    }
}
