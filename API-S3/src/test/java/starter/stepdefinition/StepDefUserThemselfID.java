package starter.stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.step.UserOwnData;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class StepDefUserThemselfID {

    @Steps
    UserOwnData userOwnData;

    @When("I try to call endpoint of mine")
    public void CallEndpointOfMine() {
        userOwnData.Owner();
    }

    @Then("the API give response and i can get result of my own data")
    public void ICanGetResultOfMyOwnData() {
        seeThatResponse("sukses mendapatkan data user",
                response -> {
                    response.statusCode(200);

                }
        );
    }
}
