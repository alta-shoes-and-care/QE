package starter.stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.step.CancelOrder;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.equalTo;

public class StepDefCancelOrder {
    @Steps
    CancelOrder cancelOrder;

    @When("I want cancel user order from ID {int}")
    public void CancelUserOrder(int ID) {
        cancelOrder.cancel(ID);
    }

    @Then("the API give response and status order will change to {string}")
    public void StatusOrderWillChangeTo(String status) {
        seeThatResponse("sukses mengubah status order menjadi cancel admin",
                response -> {
                    response.statusCode(200)
                            .body("status", equalTo("cancel"));
                }
        );
    }
}
