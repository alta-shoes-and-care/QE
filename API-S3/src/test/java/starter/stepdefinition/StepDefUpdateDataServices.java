package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.step.UpdateServices;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.equalTo;


public class StepDefUpdateDataServices {
    @Steps
    UpdateServices updateServices;

    @When("I try to update the data service title to {string} and service description to {string}")
    public void UpdateTittleandDescriptionServices(String title, String description) {
        updateServices.DataUpdate1(title,description);
    }

    @And("service ID to {int} and price to {int}")
    public void UpdateIDandPriceServices(Integer ID, Integer price) {
        updateServices.DataUpdate2(ID,price);
    }


    @Then("the data services up to date")
    public void theDataServicesUpToDate() {
        //        SerenityRest.then()
//                .statusCode(201);
        seeThatResponse("sukses memperbarui data service",
                response -> {
                    response.statusCode(201)
                            .body("ID", equalTo(5))
                            .body("title", equalTo("service_updated"))
                            .body("description", equalTo("description_updated"))
                            .body("price", equalTo(35000));
                }
        );
    }
}
