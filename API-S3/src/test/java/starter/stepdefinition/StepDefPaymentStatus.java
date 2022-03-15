package starter.stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.step.PaymentStatus;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class StepDefPaymentStatus {
    @Steps
    PaymentStatus paymentStatus;

    @When("I want to check my status of payment of my order")
    public void StatusOfPayment() {
        paymentStatus.Status();
    }

    @Then("the API give response and I see the payment is success")
    public void PaymentStatus() {
        seeThatResponse("sukses menjadikan status pembayaran menjadi paid",
                response -> {
                    response.statusCode(200);

                }
        );

    }
}
