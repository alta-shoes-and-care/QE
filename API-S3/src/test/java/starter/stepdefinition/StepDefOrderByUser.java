package starter.stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.step.OrderbyUser;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class StepDefOrderByUser {
    @Steps
    OrderbyUser orderbyUser;

    @When("I want to check incoming order by User ID")
    public void IncomingOrderByUserID() {
        orderbyUser.UserOrder();
    }

    @Then("the API give response and i can see order by User ID")
    public void SeeOrderByUserID() {
        seeThatResponse("sukses mendapatkan semua order berdasarkan user id",
                response -> {
                    response.statusCode(200);

                }
        );

    }
}
