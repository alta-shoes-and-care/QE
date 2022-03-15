package starter.stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.step.ServicesByID;

public class StepDefServicesID {
 @Steps
 ServicesByID ServicebyID;

    @When("I try to check services with ID {string}")
    public void CheckServicesWithID(String ID) {
        ServicebyID.CheckServicesID();

    }

    @Then("the API give response and i can see the data services")
    public void ResponseDataServiceID() {
        SerenityRest.restAssuredThat(response -> response.statusCode(201));
    }
}
