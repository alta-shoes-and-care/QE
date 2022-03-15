package starter.stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.step.AllpaymentMethod;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class StepDefAllPaymentMethod {
    @Steps
    AllpaymentMethod allPaymentMethod;

    @When("I try to check all list  at Payment Method")
    public void iTryToCheckAllListAtPaymentMethod() {
        allPaymentMethod.PaymentMethod();

    }



    @Then("the API give response and i see all Payment Method on list")
    public void AllPaymentMethodOnList() {
        seeThatResponse("sukses mendapatkan semua payment method",
                response -> {
                    response.statusCode(200);

                }
        );
    }
}
