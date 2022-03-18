package starter.stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.step.OrderStatus;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;


public class StepDefAcceptOrder {
    @Steps
    OrderStatus orderStatus;

    @When("I want to accept the Order with User_ID {int}")
    public void AcceptTheOrderWithUser_ID(int User_ID) {
        orderStatus.Status_Order();
    }


    @Then("the API give response and The Order Changed tobe Status {string}")
    public void TheOrderChangedTobeStatus(String Status) {
//        restAssuredThat(response ->
//        {
//        response.statusCode(200);
//                        response.body("status", equalTo("pending"));
//        };
//        )

        seeThatResponse("sukses mengubah status order menjadi accepted",
                response -> {
                    response.statusCode(200);
                    response.equals("accepted");

        }
        );
    }
}
