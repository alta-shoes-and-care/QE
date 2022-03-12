package starter.stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.step.AllServices;

public class StepDefAllServices {

    @Steps
    AllServices allServices;

    @When("I check all services list  at {string}")
    public void CheckAllServicesList (String database) {
        allServices.ServiceList();
    }

    @Then("the API give response and i can check the service list")
    public void APIResponse() {
        SerenityRest.restAssuredThat(response -> response.statusCode(201));
    }


}
