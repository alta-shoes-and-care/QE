package starter.stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.step.NewReview;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.equalTo;

public class StepDefNewReview {

    @Steps
    NewReview newReview;

    @When("I finish the order and I can do a review and give a star")
    public void ICanDoAReviewAndGiveAStar() {
        newReview.ReviewSubmitted();

    }

    @Then("the API give response and My review has been submitted")
    public void MyReviewHasBeenSubmitted() {
        seeThatResponse("sukses menambahkan review baru",
                response -> {
                    response.statusCode(201)
                            .body("service_id", equalTo(1))
                            .body("order_id", equalTo(1))
                            .body("rating", equalTo(5))
                            .body("review", equalTo("Mantul abisss"));
                }
        );
    }
}
