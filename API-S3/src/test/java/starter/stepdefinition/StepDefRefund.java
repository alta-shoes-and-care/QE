package starter.stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.step.PaymentRefund;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.hasItem;

public class StepDefRefund {
    @Steps
    PaymentRefund paymentRefund;

    @When("I want to do refund from user id {int}")
    public void RefundFromUserId(int id) {
        paymentRefund.refund(id);

    }

    @Then("the API give response and status payment will change to {string}")
    public void StatusPaymentWillChangeTo(String PaymentStatus) {
        seeThatResponse("sukses mengubah status refund menjadi true",
                response -> {
                    response.statusCode(200)
                            .body("data.has_refunded",hasItem("true"));
                }
        );
    }
}
