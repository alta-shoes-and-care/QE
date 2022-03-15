package starter.stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.step.DeleteDataServices;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class StepDefDeleteServices {
    @Steps
    DeleteDataServices deleteDataServices;

    @When("I try to delete {string}")
    public void iTryToDelete(String DataService) {
        deleteDataServices.deletedata(DataService);

    }

    @Then("I can delete the data I want")
    public void iCanDeleteTheDataIWant() {
        seeThatResponse("sukses menghapus service",
                response -> {
                    response.statusCode(201);
                }
        );
    }
}
