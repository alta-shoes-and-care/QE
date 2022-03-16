package starter.stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.step.UserbyID;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class StepDefGetUserbyID {

    @Steps
    UserbyID userbyID;

    @When("I try to search userID from endpoint")
    public void SearchUserIDFromEndpoint() {
    }

    @Then("the API give response and i can Find The UserID")
    public void FindTheUserID() {
        seeThatResponse("sukses mendapatkan data user",
                response -> {
                    response.statusCode(200);

                }
        );
    }


}
