package starter.stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.step.AllDataUser;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.equalTo;

public class StepDefGetAllUser {
    @Steps
    AllDataUser allDataUser;

    @When("I want to check {string}")
    public void iWantToCheck(String UserList) {
        allDataUser.ListofUsers();
    }



    @Then("the API give response and i view all data User")
    public void ViewAllDataUser() {
        seeThatResponse("sukses mendapatkan semua user",
                response -> {
                    response.statusCode(201);

                }
        );
    }



}
