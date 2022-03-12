package starter.stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import starter.step.Services;



import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.equalTo;


public class StepDefServices {
    @Steps
    Services services;


    @When("I input data form with tittle {string} and description {string} and price {string} and upload {string}")
    public void InputDataForm(String tittle, String description, String price, String upload) {
        services.form(tittle, description, price, upload);
    }


//    @Then("I can add the new services")
//    public void iCanAddTheNewServices() {
//        SerenityRest.then()
//                .statusCode(201)
//        SerenityRest.restAssuredThat
//                (response -> response.statusCode(201));



//    }
@Then("the services added")
public void theServicesAdded() {
//    SerenityRest.then()
//                .statusCode(201);

    seeThatResponse("sukses menambahkan Service baru",
            response -> {
                response.statusCode(201)
                        .body("user_id", equalTo("1"));
            }
    );
}


}