package starter.stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.step.Update;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.equalTo;


public class StepDefUpdate {
    @Steps
    Update update;

    @When("I change my name as {string}")
    public void UpdateName(String name) {
            Update.ChangeName(name);
        }

    @Then("my name changed")
    public void myNameChanged() {
//        SerenityRest.then()
//                .statusCode(200);

        seeThatResponse("sukses memperbarui data user",
        response -> {
             response.statusCode(200)
                   .body("name", equalTo("bambang_aw"));
        }
        );

//        assertThat(actualResponse).containsAllEntriesOf(expectedResponse);
    }
}
