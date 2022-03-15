package starter.stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.step.AllOrders;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class StepDefAllOrders {

    @Steps
    AllOrders allOrders;

    @When("I try to check all data incoming orders")
    public void CheckAllDataIncomingOrders() {
        allOrders.IncomingOrders();

    }

    @Then("the API give response and i see all data incoming orders")
    public void AllDataIncomingOrders() {
        seeThatResponse("sukses mendapatkan semua order",
                response -> {
                    response.statusCode(200);

                }
        );
    }
}
