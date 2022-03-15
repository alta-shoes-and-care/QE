package starter.stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.step.DeleteDataReview;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class StepDefDeleteReview {
    @Steps
    DeleteDataReview deleteDataReview;

    @When("I try to delete a review")
    public void DeleteAReview() {
        deleteDataReview.deleteReview();

    }

    @Then("I can delete the review I want")
    public void DeleteTheReview() {
        seeThatResponse("sukses menghapus review",
                response -> {
                    response.statusCode(200);
                }
        );

    }
}
