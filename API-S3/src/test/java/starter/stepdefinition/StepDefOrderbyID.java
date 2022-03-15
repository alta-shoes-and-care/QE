package starter.stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.step.OrderbyID;


import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class StepDefOrderbyID {

    @Steps
    OrderbyID orderbyID;
    @When("I want to check incoming order by Order ID")
    public void IncomingOrderByOrderID() {
        orderbyID.OrderID();

    }

    @Then("the API give response and i can see order by Order ID")
    public void SeeOrderByOrderID() {
        seeThatResponse("sukses mendapatkan detail order",
                response -> {
                    response.statusCode(200);

                }
        );

    }
}
